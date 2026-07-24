/**
 * FrameManager mini
 * ver. 2.06
 */

// FileSystemObject
var fs = new ActiveXObject("Scripting.FileSystemObject");

// WScript
var wshell = new ActiveXObject("WScript.Shell");

// Excel拡張子判定正規表現
var regexp_xls = /[.]xlsx$|[.]xls$/;


// fminディレクトリ
var cmddir = null;

// デフォルトINIファイル
var inifile = null;

// INIファイル
var ini = new INI();

// ログファイル
var log = "fmin.log";


// リスト表示テーブル
var list = null;


/**
 * 初期化します。
 * @param cmd htmlファイルパス
 * @param table リスト表示テーブル
 */
function init(cmd, combo, table) {
	cmd = cmd.replace(/^[/]+/, "");
	cmddir = fs.GetParentFolderName(cmd);
	inifile = fs.BuildPath(cmddir, "fmin.ini");
	list = table;

	// デフォルトINIファイルロード
	ini.load(inifile);

	// プロジェクトコンボ作成
	createPJCombo(combo);

	// リストテーブル作成
	selectPJ(combo);

	// カレントディレクトリ変更
	var fmhome = ini.INIT$fmhome;
	if (fmhome != null && fmhome.length > 0) {
		wshell.CurrentDirectory = fmhome;
	}

	// パス追加 for DLL
	var path = getPath();
	var wenv = wshell.Environment("PROCESS");
	var orgpath = wenv("PATH");
	var path = path + ";" + orgpath;
	wenv("PATH") = path;
}

/**
 * 指定されたIDのエントリを自動生成します。
 * 実行結果はリストテーブルのステータスカラムで確認できます。
 * 引数 id が null の場合イベントのソースオブジェクトからIDを取得します。
 * @param id エントリID
 */
function build(id) {
	if (id == null) {
		var elm = event.srcElement;
		if (elm == null) {
			// ターゲット不明
			return;
		}
		id = elm.id;
	}

	var type     = "ENTRY_" + id + "$type";
	var xls      = "ENTRY_" + id + "$xls";
	var srcout   = "ENTRY_" + id + "$srcout";
	var resrcout = "ENTRY_" + id + "$resrcout";
	var plsqlout = "ENTRY_" + id + "$plsqlout";	// MetaBuilder
	var regexp   = "ENTRY_" + id + "$regexp";	// WebServiceBuilder,MobileServiceBuilder
	var setting  = "ENTRY_" + id + "$setting";	// DB Builder 702
	var json     = "ENTRY_" + id + "$json";	// DB Builder 702

	var status = document.getElementById(getStatusElementID(id));

	if (fs.FileExists(log)) {
		fs.DeleteFile(log);
	}

	status.innerText = "CSV OUT";
	var ret = 0;
	switch (ini[type]) {
	case "DB702":
		break;
	case "DBC":
		ret = execDBCCSVOut(ini[xls]);
		break;
	default:
		ret = execCSVOut(ini[type], ini[xls]);
		break;
	}
	if (ret == 0) {
		status.innerText = "SRC OUT";
		switch (ini[type]) {
		case "DB702":
			ret = execDB702Out(ini[type], ini[srcout], ini[setting], ini[json]);
			break;
		case "DBC":
			ret = execSrcOut(ini[type], ini[srcout], null, ini[plsqlout]);
			break;
		case "W":
		case "SD":
			ret = execWSSrcOut(ini[type], ini[srcout], ini[resrcout]);
			break;
		default:
			ret = execSrcOut(ini[type], ini[srcout], ini[resrcout], ini[plsqlout]);
			break;
		}
	}

	if (execerr(ret)) {
		status.innerText = "ERROR!";
	} else if (execwarn(ret)) {
		status.innerText = "WARNING!";
	} else {
		status.innerText = "SUCCESS!";
	}

	var last = document.getElementById(getLastElementID(id));
	last.innerText = new Date().toLocaleString();
}

/**
 * 選択されたプロジェクトでエントリリストを生します。
 * 引数 combo が null の場合イベントのソースオブジェクトを使用します。
 * @param combo エントリリストのコンボ
 */
function selectPJ(combo) {
	combo =	(combo == null) ? event.srcElement : combo;
	var index = combo.selectedIndex;
	var value = combo.options[index].value;

	// デフォルトINIファイルロード
	// TODO miyake とりあえず作り直す戦法
	ini = new INI();
	ini.load(inifile);

	// プロジェクトINIファイルロード
	var pjfile = ini["LIST$" + value];
	if (pjfile != null) {
		pjfile = fs.BuildPath(cmddir, pjfile);
		if (fs.FileExists(pjfile)) {
			ini.load(pjfile);
		} else {
			wshell.Popup("プロジェクトINIファイルが見つかりません。\n" + pjfile, 0, "Command Warning", 48 + 0);
		}
	}

	// 設定方式で切替
	if (ini["INIT$type"] == "OLD") {
		createEntryList(list);
	}
	else {
		createEntryList2(list);
	}
}



/**
 * プロジェクト選択コンボを生成します。
 * @param combo コンボ
 */
function createPJCombo(combo) {
	var keys = ini.findKeys(/^LIST\$.+$/);
	var len = keys.length;
	for (var i = 0; i < len; i++) {
		var key = keys[i].replace(/^LIST\$/, "");
		var opt = document.createElement("OPTION");
		opt.value = key;
		opt.text = key;
		if (i == 0) {
			opt.defaultSelected = true;
		}
		combo.add(opt);
	}
	// 2013/10/22 IE11対応 引数未指定にしておくとeventオブジェクトが第１引数になることへの対応
	combo.onchange = function () {
		selectPJ(combo);
	}
}

//=============================================================================

/**
 * エントリリストを生成します。
 * INIファイルに列挙された定義から生成します。
 * @param table リストを生成するテーブル(TBODY)
 */
function createEntryList(table) {
	var size = table.rows.length;
	for (var i = size - 1; i >= 0; i--) {
		table.deleteRow(i);
	}

	var ids = new Object();
	var keys = ini.findKeys(/^ENTRY_/);
	for (var i = 0; i < keys.length; i++) {
		var key = keys[i].replace(/^ENTRY_|[$].+$/g, "");
		key = key.replace(/[$].+$/g, "");
		ids[key] = key;
	}

	var cell;
	var elm;
	var idx = 0;
	for (id in ids) {
		insertTableRow(table, id,
						ini["ENTRY_" + id + "$title"],
						ini["ENTRY_" + id + "$type"]);
	}
}

//=============================================================================

/**
 * エントリリストを生成します。
 * INIファイルに定義されたファイルやディレクトリから生成します。
 * @param table リストを生成するテーブル(TBODY)
 */
function createEntryList2(table) {
	var size = table.rows.length;
	for (var i = size - 1; i >= 0; i--) {
		table.deleteRow(i);
	}

	var PRE = "ENV";

	var resrcout = ini[PRE + "$resrcout"];
	var wsdlout = ini[PRE + "$wsdlout"];

	// DBコンテナ
	fileEntry(table, "DBContainer", "DB Container", "DBC", ini[PRE + "$dbxls"], ini[PRE + "$dbsrcout"], resrcout);

	// サーバ
	folderEntry(table, "L", ini[PRE + "$svxlsdir"], ini[PRE + "$svsrcout"], resrcout, ini[PRE + "$svfilter"]);

	// クライアント
	folderEntry(table, "P", ini[PRE + "$clxlsdir"], ini[PRE + "$clsrcout"], resrcout, ini[PRE + "$clfilter"]);

	// WEBサービス
	folderEntry(table, "W", ini[PRE + "$svxlsdir"], ini[PRE + "$svsrcout"], wsdlout, ini[PRE + "$svfilter"]);

	// モバイル
	folderEntry(table, "SD", ini[PRE + "$svxlsdir"], ini[PRE + "$svsrcout"], wsdlout, ini[PRE + "$svfilter"]);
}

/**
 * 指定されたファイルからエントリを追加します。
 * @param table エントリを追加するテーブル(TBODY)
 * @param id エントリ識別ID
 * @param title 表示タイトル
 * @param type 自動生成対象種別
 * @param xls 定義書
 * @param srcout ソース出力先
 * @param resrcout リソース出力先
 * @param plsqlout PL/SQLソース出力先
 * @param regexp Webサービス出力対象絞り込み正規表現
 */
function fileEntry(table, id, title, type, xls, srcout, resrcout, plsqlout, regexp) {
	if (!xls) {
		return;
	}
	insertTableRow(table, id, title, type);
	addINIParam(id, type, xls, srcout, resrcout, plsqlout, regexp);
}

// 旧WebserviceBuilder
///**
// * WEBサービス用のエントリを追加します。
// * @param table エントリを追加するテーブル(TBODY)
// * @param type 自動生成対象種別
// * @param regexp 対象抽出用正規表現リスト
// * @param srcout ソース出力先
// * @param resrcout リソース出力先
// */
//function wsEntry(table, type, regexp, srcout, resrcout) {
//	if (!regexp) {
//		// WEBサービス不要
//		return;
//	}
//
//	var regs = regexp.split(",");
//
//	for (idx in regs) {
//		var ws = regs[idx];
//
//		insertTableRow(table, ws, ws, type);
//		addINIParam(ws, type, null, srcout, resrcout, null, ws);
//	}
//}

/**
 * 指定されたディレクトリからエントリを追加します。
 * @param table エントリを追加するテーブル(TBODY)
 * @param type 自動生成対象種別
 * @param xlsdir 定義書配置先
 * @param srcout ソース出力先
 * @param resrcout リソース出力先
 * @param filter 追加するファイル名のフィルタ(正規表現)
 */
function folderEntry(table, type, xlsdir, srcout, resrcout, filter) {
	if (!xlsdir) {
		return;
	}

	var regexp;
	if (filter) {
		regexp = new RegExp(filter);
	}

	var dirs = xlsdir.split("\\*\\");
	var files = searchFolders("", 0, dirs);
	for (idx in files) {
		var file = files[idx];
		var name = file.Name;
		if (regexp) {
			if (regexp.exec(name) == null) {
				continue;
			}
		}
		var extpos = name.search(regexp_xls);
		if (extpos >= 0) {
			name = name.substring(0, extpos);
		}
		var seppos = name.indexOf("_");
		var id = name.substring(0, ((seppos < 0) ? name.length : seppos)) + "@" + type;
		var title = (seppos < 0) ? " " : name.substring(seppos + 1, name.length);		

		insertTableRow(table, id, title, type);
		addINIParam(id, type, file.Path, srcout, resrcout);
	}
}

/**
 * 指定されたフォルダにあるファイルを配列で返します。
 * フォルダパスにワイルドカードが含まれている場合、
 * 全てのサブフォルダを考慮してファイルを検索します。
 * @param current 現在のディレクトリ
 * @param pos ワイルドカードの次を指すdirsのインデックス
 * @param dirs フォルダパスをワイルドカードで分割した配列
 * @return ファイルの配列
 */
function searchFolders(current, pos, dirs) {
	var arr = new Array();
	var path = fs.BuildPath(current, dirs[pos]);
	pos++;

	if (fs.FolderExists(path)) {
		var folder = fs.GetFolder(path);
		if (pos == dirs.length) {
			// ファイル検索
			var tmp = searchFiles(folder);
			arr = arr.concat(tmp);
		}
		else {
			// サブディレクトリ検索
			var subs = new Enumerator(folder.SubFolders);
			for (; !subs.atEnd(); subs.moveNext()) {
				var folder = subs.item();
				var tmp = searchFolders(folder.Path, pos, dirs);
				arr = arr.concat(tmp);
			}
		}
	}
	return arr;
}

/**
 * 指定されたフォルダにあるファイルを配列で返します。
 * @param フォルダ
 * @return ファイルの配列
 */
function searchFiles(folder) {
	var arr = new Array();
	var files = new Enumerator(folder.Files);
	for (; !files.atEnd(); files.moveNext()) {
		var file = files.item();
		var name = file.Name;
		var extpos = name.search(regexp_xls);
		if (extpos > 0) {	// 0 は拡張子のみなので除外
			// 一覧に追加
			arr[arr.length] = file;
		}
	}
	return arr;
}

/**
 * INIにエントリを追加します。
 * @param id エントリ識別ID
 * @param type 自動生成対象種別
 * @param path 定義書のファイルパス
 * @param srcout ソース出力先
 * @param resrcout リソース出力先
 * @param plsqlout PL/SQLソース出力先
 * @param regexp Webサービス出力対象絞り込み正規表現
 */
function addINIParam(id, type, path, srcout, resrcout, plsqlout, regexp) {
	ini["ENTRY_" + id + "$type"] = type;
	ini["ENTRY_" + id + "$xls"] = path;
	ini["ENTRY_" + id + "$srcout"] = srcout;

	if (resrcout)	ini["ENTRY_" + id + "$resrcout"] = resrcout;
	if (plsqlout)	ini["ENTRY_" + id + "$plsqlout"] = plsqlout;
	if (regexp)		ini["ENTRY_" + id + "$regexp"] = regexp;
}

/**
 * テーブルにエントリを追加します。
 * @param table エントリを追加するテーブル(TBODY)
 * @param id エントリ識別ID
 * @param title 表示タイトル
 * @param type 自動生成対象種別
 */
function insertTableRow(table, id, title, type) {
	var row = table.insertRow();
	row.className = (table.rows.length % 2 > 0) ? "odd" : "even";

	// チェックボックス
	cell = row.insertCell();
	cell.id = "TD_CHECK";
	elm = document.createElement("INPUT");
	elm.type = "checkbox";
	cell.appendChild(elm);

	// タイプ
	cell = row.insertCell();
	cell.id = "TD_TYPE";
	elm = document.createElement("SPAN");
	switch (type) {
	case "DBC":
		type = "DBC";
		break;
	case "M":
		type = "Meta";
		break;
	case "L":
		type = "Logic";
		break;
	case "P":
		type = "Screen";
		break;
	case "R":
		type = "Report";
		break;
	case "W":
		type = "WebService";
		break;
	case "SD":
		type = "Mobile";
		break;
	case "X":
		break;
	}
	elm.innerText = type;
	cell.appendChild(elm);

	// ID
	cell = row.insertCell();
	cell.id = "TD_ID";
	elm = document.createElement("SPAN");
	elm.innerText = id;
	cell.appendChild(elm);

	// 見出し
	cell = row.insertCell();
	cell.id = "TD_TITLE";
	cell.className = "title";
	elm = document.createElement("SPAN");
	elm.innerText = title;
	cell.appendChild(elm);

	// 単体実行ボタン
	cell = row.insertCell();
	cell.id = "TD_SINGLE";
	elm = document.createElement("INPUT");
	elm.type = "button";
	elm.id = id;
	elm.value = "Start";
	elm.onclick = function () { build(id); }	// 2013/10/22 IE11対応 引数を指定
	cell.appendChild(elm);

	// 処理結果
	cell = row.insertCell();
	cell.id = "TD_STATUS";
	elm = document.createElement("SPAN");
	elm.id = getStatusElementID(id);
	elm.innerText = " ";
	cell.appendChild(elm);

	// 実行時刻
	cell = row.insertCell();
	cell.id = "TD_LAST";
	elm = document.createElement("SPAN");
	elm.id = getLastElementID(id);
	elm.innerText = " ";
	cell.appendChild(elm);
}

//=============================================================================

/**
 * ステータスカラムのエレメントIDを生成します。
 * @param id エントリID
 * @return エレメントID
 */
function getStatusElementID(id) {
	return id + "_STATUS";
}

/**
 * 実行時刻カラムのエレメントIDを生成します。
 * @param id エントリID
 * @return エレメントID
 */
function getLastElementID(id) {
	return id + "_LAST";
}

/**
 * CSV出力を実行します。
 * @param type 実装仕様書種別
 * @param xls 実装仕様書ファイルパス
 * @return コマンドの終了コード
 */
function execCSVOut(type, xls) {
	var cmd = getJavaCmd();
	var cp = getClassPath();
	var vmopt = getVMOption();
	var builder = ini.BUILDER$CSV;
	var csvdir = ini.INIT$csvout;

	makeDir(csvdir);
	fs.DeleteFile(fs.BuildPath(csvdir, "*"), true);

	if (type == "W" || type == "SD") {
		type = "L";
	}

	cmd = addDQ(cmd)
			 + " -classpath " + addDQ(cp)
			 + " " + vmopt
			 + " -DSPEC_CODE=" + type
			 + " " + builder
			 + " " + addDQ(csvdir)
			 + " " + addDQ(xls);
	return execCmd(cmd);
}

/**
 * DBコンテナ用CSV出力を実行します。
 * @param xls 実装仕様書ファイルパス
 * @return コマンドの終了コード
 */
function execDBCCSVOut(xls) {
	var cmd = ini.DBCCSV$cmd;
	var script = ini.DBCCSV$script;
	var csvdir = ini.INIT$csvout;
	var current = ini.DBCCSV$scriptcur;
	if (current == null || current.length <= 0) {
		current = wshell.CurrentDirectory;
	}
	var dbb = ini.DBCCSV$dbb;

	makeDir(csvdir);
	fs.DeleteFile(fs.BuildPath(csvdir, "*"), true);

	cmd = addDQ(cmd)
			 + " " + addDQ(script)
			 + " " + addDQ(current)
			 + " " + addDQ(xls)
			 + " " + addDQ(csvdir)
			 + " " + addDQ(dbb);
	return execCmd(cmd);
}

/**
 * ソース出力を実行します。
 * @param type 実装仕様書種別
 * @param srcdir ソース出力パス
 * @param resrcdir リソース出力パス（null時はsrcdirと同じ）
 * @param plsqldir PL/SQL出力パス（null時は無視）
 * @return コマンドの終了コード
 */
function execSrcOut(type, srcdir, resrcdir, plsqldir) {
	var cmd = getJavaCmd();
	var cp = getClassPath();
	var vmopt = getVMOption();
	var builder = ini["BUILDER$" + type];
	var csvdir = ini.INIT$csvout;

	makeDir(srcdir);
	if (resrcdir != null) {
		makeDir(resrcdir);
	}
	if (plsqldir != null) {
		makeDir(plsqldir);
	}

	cmd = addDQ(cmd)
			  + " -classpath " + addDQ(cp)
			  + " " + vmopt
			  + " " + builder
			  + " " + addDQ(srcdir);
	if (resrcdir != null) {
		cmd = cmd + " " + addDQ(resrcdir);
	}
	if (plsqldir != null) {
		cmd = cmd + " " + addDQ(plsqldir);
	}
	cmd = cmd + " " + addDQ(csvdir);
	return execCmd(cmd);
}

/**
 * Webサービスソース出力を実行します。
 * @param type 実装仕様書種別
 * @param srcdir ソース出力パス
 * @param regexp 出力対象オペレーションを抽出する正規表現
 * @return コマンドの終了コード
 */
//function execWSSrcOut(type, srcdir, regexp) {
function execWSSrcOut(type, srcdir, wsdldir) {
	var cmd = getJavaCmd();
	var cp = getClassPath();
	var vmopt = getVMOption();
	var builder = ini["BUILDER$" + type];
	var csvdir = ini.INIT$csvout;

	makeDir(srcdir);

// 2012/10/29 WS/SDBuilder ファイル対応
//	cmd = addDQ(cmd)
//			  + " -classpath " + addDQ(cp)
//			  + " " + vmopt
//			  + " " + builder
//			  + " " + addDQ(srcdir);
//	if (regexp != null) {
//		cmd = cmd + " " + regexp;
//	}
	cmd = addDQ(cmd)
			  + " -classpath " + addDQ(cp)
			  + " " + vmopt
			  + " " + builder
			  + " -spec"
			  + " " + addDQ(srcdir)
			  + " " + addDQ(wsdldir)
			  + " " + addDQ(csvdir);
	return execCmd(cmd);
}

/**
 * 702用DB定義出力を実行します。
 * @param type 実装仕様書種別
 * @param srcdir 定義出力パス
 * @param setting 設定情報
 * @param json DB設計書情報
 * @return コマンドの終了コード
 */
function execDB702Out(type, srcdir, setting, json) {
	var cmd = getJavaCmd();
	var cp = getClassPath();
	var vmopt = getVMOption();
	var builder = ini["BUILDER$" + type];

	makeDir(srcdir);

	cmd = addDQ(cmd)
			  + " -classpath " + addDQ(cp)
			  + " " + vmopt
			  + " " + builder
			  + " " + addDQ(setting)
			  + " " + addDQ(json)
			  + " " + addDQ(srcdir);
	return execCmd(cmd);
}

/**
 * 外部コマンドを実行します。
 * 終了コードが"0"以外(=異常終了)時は実行内容、標準出力等をダイアログに
 * 表示します。
 * @param cmd コマンドライン
 * @return 終了コード
 */
function execCmd(cmd) {
//alert("Run Command:" + cmd);
	// 開始ログ
	var ts = fs.OpenTextFile(log, 8, true);	// 8 -> ForAppending
	//2013/10/22 IE11対応 toLocaleString()で詰まってしまった(ここだけ？)
	//ts.WriteLine("##### " + new Date().toLocaleString() + " #####");
	ts.WriteLine("##### " + new Date().toString() + " #####");
	ts.WriteLine("command:\n" + cmd + "\n\n");
	ts.Close();

	// コマンド実行
	var stdout = "";
	var stderr = "";
	var exe = wshell.Exec(cmd);
	while (exe.Status == 0) {
		if (!exe.StdOut.AtEndOfStream) {
			stdout += exe.StdOut.ReadAll();
		}
		if (!exe.StdErr.AtEndOfStream) {
			stderr += exe.StdErr.ReadAll();
		}
	}
	var ret = exe.ExitCode;
	var msg =
			"exit code:" + ret + "\n\n" +
			"stdout:\n" + stdout + "\n\n" +
			"stderr:\n" + stderr + "\n\n" +
// 2013/10/22 コマンドのログは先に出す
//			"command:\n" + cmd + "\n\n" +
			"current:\n" + wshell.CurrentDirectory + "\n\n" +
			"path:\n" + wshell.Environment("PROCESS")("PATH");
//alert("Run Exit:" + msg);
	if (execerr(ret)) {
		wshell.Popup(msg, 0, "Command Error", 16 + 0);
	} else if (execwarn(ret)) {
		wshell.Popup("ソースは出力されましたが警告があります。", 0, "Command Warning", 48 + 0);
	}

	// 終了ログ
	var ts = fs.OpenTextFile(log, 8, true);	// 8 -> ForAppending
	ts.WriteLine(msg);
	ts.Close();

	return ret;
}

/**
 * 終了コードを解析し、エラー発生時に true を返します。
 * @param ret 終了コード
 * @return エラーが発生していない場合 false
 */
function execerr(ret) {
	// 最下位1ビットが"1"のときエラー
	return ((ret & 1) > 0);
}

/**
 * 終了コードを解析し、警告発生時に true を返します。
 * @param ret 終了コード
 * @return 警告が発生していない場合 false
 */
function execwarn(ret) {
	// 2ビット目が"1"のとき警告
	return (((ret >> 1) & 1) > 0);
}

/**
 * Javaコマンドを返します。
 * INIファイルに[INIT]javahomeの指定がある場合はその中にあるjavaw.exeになります。
 * 指定がない場合はOSが最初に見つけたjavaw.exeになります。
 * @return Javaコマンド
 */
function getJavaCmd() {
	var java = ini.INIT$javahome;
	if (java != null && java.length > 0) {
		java = fs.BuildPath(java, "bin\\javaw.exe");
	} else {
		java = "javaw.exe";
	}
	return java;
}

/**
 * VMオプションを返します。
 * INIファイルの[VMOPT]のエントリを" "で結合した文字列を返します。
 * @return VMオプション
 */
function getVMOption() {
	var vmopt = "";
	var keys = ini.findKeys(/^VMOPT\$.+$/);
	for (var i = 0; i < keys.length; i++) {
		vmopt += keys[i].replace(/^VMOPT\$/, "");
		var vmval = ini[keys[i]];
		if (vmval != null && vmval.length > 0) {
			vmopt += ini.SEP_KEY;
			vmopt += vmval;
		}
		vmopt += " ";
	}
	return vmopt;
}

/**
 * クラスパスを返します。
 * INIファイルの[CLASSPATH]のエントリを";"で結合した文字列を返します。
 * @return クラスパス
 */
function getClassPath() {
	var cp = "";
	var keys = ini.findKeys(/^CLASSPATH\$.+$/);
	for (var i = 0; i < keys.length; i++) {
		cp += keys[i].replace(/^CLASSPATH\$/, "");
		cp += ";";
	}
	return cp;
}

/**
 * 環境変数への追加パスを返します。
 * INIファイルの[PATH]のエントリを";"で結合した文字列を返します。
 * @return パス
 */
function getPath() {
	var p = "";
	var keys = ini.findKeys(/^PATH\$.+$/);
	for (var i = 0; i < keys.length; i++) {
		p += keys[i].replace(/^PATH\$/, "");
		p += ";";
	}
	return p;
}

/**
 * 指定された文字列を二重引用符で括ります。
 * @param path 括る文字列
 * @return 括った文字列
 */
function addDQ(path) {
	return "\"" + path + "\"";
}

/**
 * 指定されたディレクトリを作成します。
 * パス区切り文字で繋がれたパスの場合、中間の存在しないディレクトリも作成します。
 * @param path 作成するディレクトリ
 */
function makeDir(path) {
	if (!fs.FolderExists(path)) {
		var parent = fs.GetParentFolderName(path);
		makeDir(parent)
		fs.CreateFolder(path)
	}
}

/**
 * 文字列の前後の空白(相当)を取り除きます。
 * @param str 文字列
 * @return 取り除いた文字列
 */
function trim(str) {
	return str.replace(/^[\s]+|[\s]+$/g, "");
}



/**
 * INIファイル管理クラス。
 */
function INI() {
	this.SEP_SEC = "$";
	this.SEP_KEY = "=";
	this.COMMENT = "#";

	/**
	 * INIファイルを読み込みます。
	 * 自身に以下の書式で属性を追加します。
	 *   [セクション]$[キー]
	 * @param file INIファイル名
	 */
	this.load = function (file) {
		var READ = 1;
		var WRITE = 2;

		var sec;
		var rec;
		var key;
		var val;

		var inifs = new ActiveXObject("Scripting.FileSystemObject");
		var inits = inifs.OpenTextFile(file, READ);
		while (!inits.AtEndOfStream) {
			var line = inits.ReadLine();
			line = trim(line);
			var linelen = line.length;
			if (linelen <= 0) {
				// 空行はスキップ
			} else if (line.charAt(0) == this.COMMENT) {
				// コメントはスキップ
			} else if (line.charAt(0) == "[" && line.charAt(linelen - 1) == "]") {
				// セクション
				sec = line.substr(1, linelen - 2);
			} else {
				// キー＆バリュー
				rec = line.split(this.SEP_KEY);
				switch (rec.length) {
				case 0:		// 空行
					break;
				case 1:		// 値なし
					key = rec[0];
					val = "";
					break;
				default:	// 値あり
					key = rec[0];
					val = rec[1];
					for (var i = 2; i < rec.length; i++) {
						val = val + this.SEP_KEY + rec[i];
					}
					val = val.replace(/^["]|["]$/g, "");
				}
				var inikey = sec + this.SEP_SEC + key;
				this[inikey] = val;
			}
		}
		inits.Close();
	}

	/**
	 * 指定された正規表現に一致するキーを抽出します。
	 * @param regex 正規表現
	 * @return 抽出したキーの配列
	 */
	this.findKeys = function (regex) {
		var keys = new Array();
		var idx = 0;
		for (key in this) {
			if (key.match(regex) != null) {
				keys[idx] = key;
				idx++;
			}
		}
		return keys;
	}

}
