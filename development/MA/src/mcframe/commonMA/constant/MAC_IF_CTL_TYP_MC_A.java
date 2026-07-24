package mcframe.commonMA.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonMA.constant.MCAppConst;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.MCAppException;
//settingSheetのCUSTOM_IMPORT_LISTの文字列を出力
import mcframe.commonFS.constant.FSC_MODULE_ID;

@SuppressWarnings("all")
abstract class MAC_IF_CTL_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "IF_CTL_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_IF_CTL_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "if_ctl_typ";

	public static final String $NAME = "if_ctl_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** ＩＦ制御区分：送受信ファイルの保存先となるアプリケーションサーバローカルのディレクトリを設定する。
・送信処理：作成したファイルの出力先
・受信処理：受信したファイルの保存先
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}
LOCAL_DIRのデータが登録されていない場合は、例）に記載の内容と同等に扱う。
LOCAL_DIRのデータを登録する場合は、ディレクトリの設定が必要。
	 */
	public static final MAC_IF_CTL_TYP LOCAL_DIR = create("LOCAL_DIR", "LOCAL_DIR");

	/** ＩＦ制御区分：ファイルの送信先ディレクトリを設定する。
送信区分がコピーの場合は、ローカルからアクセス可能なWindowsファイル共有形式で設定する。
送信区分がＦＴＰ、ＳＦＴＰの場合は、ＦＴＰ、ＳＦＴＰサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。
	 */
	public static final MAC_IF_CTL_TYP SEND_RMT_DIR = create("SEND_RMT_DIR", "SEND_RMT_DIR");

	/** ＩＦ制御区分：ファイル受信の監視対象となるＦＴＰ、SFTPサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。
	 */
	public static final MAC_IF_CTL_TYP RECV_RMT_DIR = create("RECV_RMT_DIR", "RECV_RMT_DIR");

	/** ＩＦ制御区分：送信時に出力されるファイル名を設定する。
設定するファイル名には、以下のプレースホルダを設定することもできる。
利用可能なプレースホルダ）
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
・{USER}：ユーザＩＤ
・{DATA_NO}：データＮＯ
・{yyyyMMddHHmmssSSS}：年月日時分秒ミリ秒※
・{yyMMddHHmmss}：年月日時分秒※
・{yyyyMM}：年月※
※日付はJavaの日付フォーマット（SimpleDateFormat）が指定可能
省略時は「{yyyyMMddHHmmssSSS}.dat」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP FILE_NM = create("FILE_NM", "FILE_NM");

	/** ＩＦ制御区分：ファイル形式を設定する。
・1：CSV形式（カンマ区切り）
・2：TSV形式（タブ区切り）
・3：固定長形式
・上記以外：「1」と同等
省略時は「1」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP FILE_TYPE = create("FILE_TYPE", "FILE_TYPE");

	/** ＩＦ制御区分：ファイルの１行目を見出し行として扱うかどうかを設定する。
・true：扱う
・上記以外：扱わない
省略時は「上記以外」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP FILE_USE_HEADING = create("FILE_USE_HEADING", "FILE_USE_HEADING");

	/** ＩＦ制御区分：CSV形式、TSV形式の場合、ファイルの文字セットを設定する。
固定長形式の場合、項目の文字セットを設定する。
省略時は「UTF-8」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP FILE_CHARSET = create("FILE_CHARSET", "FILE_CHARSET");

	/** ＩＦ制御区分：BOM（Byte Order Mark）の付加するかどうかを設定する。
・true：付加する
・上記以外：付加しない
省略時は「上記以外」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP FILE_BOM = create("FILE_BOM", "FILE_BOM");

	/** ＩＦ制御区分：送信ファイルを作成する単位を設定する。
・1：ＩＦ処理区分＋外部システムＣＤ単位でまとめる
・2：ＩＦ処理区分＋外部システムＣＤ＋データＮＯ単位でまとめる
・上記以外：「1」と同等
省略時は「1」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP SEND_FILE_GRP = create("SEND_FILE_GRP", "SEND_FILE_GRP");

	/** ＩＦ制御区分：文字列項目をダブルクォートで囲むかどうかを設定する。
・true：囲む
・上記以外：囲まない
省略時は「true」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP FILE_DBL_QUART = create("FILE_DBL_QUART", "FILE_DBL_QUART");

	/** ＩＦ制御区分：ＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。
	 */
	public static final MAC_IF_CTL_TYP FTP_HOST = create("FTP_HOST", "FTP_HOST");

	/** ＩＦ制御区分：ＦＴＰの送受信で使用するポート番号を設定する。
省略時は「21」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP FTP_PORT = create("FTP_PORT", "FTP_PORT");

	/** ＩＦ制御区分：ＦＴＰユーザを設定する。
	 */
	public static final MAC_IF_CTL_TYP FTP_USER = create("FTP_USER", "FTP_USER");

	/** ＩＦ制御区分：ＦＴＰユーザのパスワードを設定する。
	 */
	public static final MAC_IF_CTL_TYP FTP_PASS = create("FTP_PASS", "FTP_PASS");

	/** ＩＦ制御区分：ＦＴＰのモードを設定する。
・1：アクティブモード
・2：パッシブモード
・上記以外：「2」と同等
省略時は「2」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP FTP_MODE = create("FTP_MODE", "FTP_MODE");

	/** ＩＦ制御区分：ＦＴＰサーバのオプションを設定する。
オプションはKey=Valueで設定する。
複数指定する場合は、Key=Value, Key=Value .... とカンマで区切って設定する。
	 */
	public static final MAC_IF_CTL_TYP FTP_OPTS = create("FTP_OPTS", "FTP_OPTS");

	/** ＩＦ制御区分：ファイルが転送中かどうか識別できるようにするための転送ファイルのロック方式を設定する。
・1：リネーム方式（転送完了後、FILE_NMの設定に従ったファイル名に変更）
・2：ステータス方式（転送完了後、転送完了を示すステータスファイルを作成）
省略時は「1」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP TRANSFER_LOCK_TYP = create("TRANSFER_LOCK_TYP", "TRANSFER_LOCK_TYP");

	/** ＩＦ制御区分：転送方式がステータス方式の時に扱うステータスファイルの接尾辞を設定する。
省略時は「.end」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP STS_FILE_SUFFIX = create("STS_FILE_SUFFIX", "STS_FILE_SUFFIX");

	/** ＩＦ制御区分：ファイル送信方法を設定する。
・1：ファイルコピー
・2：FTP
・3：SFTP
省略時および上記以外の値の場合は、ファイル転送しない。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。
	 */
	public static final MAC_IF_CTL_TYP SEND_TYP = create("SEND_TYP", "SEND_TYP");

	/** ＩＦ制御区分：ファイル受信方法を設定する。
・0：対象外
・2：FTP
・3：SFTP
省略時は「2：FTP」とみなす。上記以外の値の場合は、「0：対象外」とみなす。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。
	 */
	public static final MAC_IF_CTL_TYP RECV_TYP = create("RECV_TYP", "RECV_TYP");

	/** ＩＦ制御区分：FTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。
	 */
	public static final MAC_IF_CTL_TYP FTP_RTRY_CNT = create("FTP_RTRY_CNT", "FTP_RTRY_CNT");

	/** ＩＦ制御区分：FTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。
	 */
	public static final MAC_IF_CTL_TYP FTP_WAIT_SEC = create("FTP_WAIT_SEC", "FTP_WAIT_SEC");

	/** ＩＦ制御区分：Web API にアクセスするためのURLを設定する。
	 */
	public static final MAC_IF_CTL_TYP WEB_URL = create("WEB_URL", "WEB_URL");

	/** ＩＦ制御区分：Web APIで使用されるrequestメソッドの[リクエストのID]を設定する。[リクエストのID]ごとにタイムアウトなどを設定できる。
	 */
	public static final MAC_IF_CTL_TYP WEB_REQ_ID = create("WEB_REQ_ID", "WEB_REQ_ID");

	/** ＩＦ制御区分：Web APIで送信する日付型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSSZ"が適用される。
	 */
	public static final MAC_IF_CTL_TYP DATE_FORMAT = create("DATE_FORMAT", "DATE_FORMAT");

	/** ＩＦ制御区分：Web APIで送信するタイムスタンプ型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSS-0700"が適用される。
	 */
	public static final MAC_IF_CTL_TYP TIME_STAMP_FORMAT = create("TIME_STAMP_FORMAT", "TIME_STAMP_FORMAT");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR1 = create("EXT_SYS_STR1", "EXT_SYS_STR1");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR2 = create("EXT_SYS_STR2", "EXT_SYS_STR2");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR3 = create("EXT_SYS_STR3", "EXT_SYS_STR3");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR4 = create("EXT_SYS_STR4", "EXT_SYS_STR4");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR5 = create("EXT_SYS_STR5", "EXT_SYS_STR5");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR6 = create("EXT_SYS_STR6", "EXT_SYS_STR6");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR7 = create("EXT_SYS_STR7", "EXT_SYS_STR7");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR8 = create("EXT_SYS_STR8", "EXT_SYS_STR8");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR9 = create("EXT_SYS_STR9", "EXT_SYS_STR9");

	/** ＩＦ制御区分：外部システムへ接続するための文字列を設定する。
	 */
	public static final MAC_IF_CTL_TYP EXT_SYS_STR10 = create("EXT_SYS_STR10", "EXT_SYS_STR10");

	/** ＩＦ制御区分：コマンドファイルのパスを設定する。
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}\cmd.exe
	 */
	public static final MAC_IF_CTL_TYP CMD_PATH = create("CMD_PATH", "CMD_PATH");

	/** ＩＦ制御区分：コマンドの標準エラーの文字セットを設定する。
省略時は「UTF-8」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP CMD_CHARSET = create("CMD_CHARSET", "CMD_CHARSET");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG01 = create("CMD_ARG01", "CMD_ARG01");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG02 = create("CMD_ARG02", "CMD_ARG02");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG03 = create("CMD_ARG03", "CMD_ARG03");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG04 = create("CMD_ARG04", "CMD_ARG04");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG05 = create("CMD_ARG05", "CMD_ARG05");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG06 = create("CMD_ARG06", "CMD_ARG06");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG07 = create("CMD_ARG07", "CMD_ARG07");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG08 = create("CMD_ARG08", "CMD_ARG08");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG09 = create("CMD_ARG09", "CMD_ARG09");

	/** ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。
	 */
	public static final MAC_IF_CTL_TYP CMD_ARG10 = create("CMD_ARG10", "CMD_ARG10");

	/** ＩＦ制御区分：CSV形式、TSV形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。
ファイルの１行目を見出し行として扱う場合、本指定は無効となる。
	 */
	public static final MAC_IF_CTL_TYP FILE_CSV_FMT_PATH = create("FILE_CSV_FMT_PATH", "FILE_CSV_FMT_PATH");

	/** ＩＦ制御区分：固定長形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。
	 */
	public static final MAC_IF_CTL_TYP FILE_FIX_FMT_PATH = create("FILE_FIX_FMT_PATH", "FILE_FIX_FMT_PATH");

	/** ＩＦ制御区分：固定長形式のフォーマットに共通の設定をする場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。
	 */
	public static final MAC_IF_CTL_TYP FILE_FIX_SETTING_PATH = create("FILE_FIX_SETTING_PATH", "FILE_FIX_SETTING_PATH");

	/** ＩＦ制御区分：SＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。
	 */
	public static final MAC_IF_CTL_TYP SFTP_HOST = create("SFTP_HOST", "SFTP_HOST");

	/** ＩＦ制御区分：SＦＴＰの送受信で使用するポート番号を設定する。
省略時は「22」と同等に扱う。
	 */
	public static final MAC_IF_CTL_TYP SFTP_PORT = create("SFTP_PORT", "SFTP_PORT");

	/** ＩＦ制御区分：SＦＴＰユーザを設定する。
	 */
	public static final MAC_IF_CTL_TYP SFTP_USER = create("SFTP_USER", "SFTP_USER");

	/** ＩＦ制御区分：SＦＴＰユーザのパスワード（パスワード認証方式）／パスフレーズ（公開鍵認証方式）を設定する。
公開鍵認証方式の場合、未設定にもできる。
	 */
	public static final MAC_IF_CTL_TYP SFTP_PASS = create("SFTP_PASS", "SFTP_PASS");

	/** ＩＦ制御区分：秘密鍵のファイルパスを指定する。
指定がある場合、公開鍵認証方式とする。指定がない場合、パスワード認証方式とする。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。
	 */
	public static final MAC_IF_CTL_TYP SFTP_KEY_FILE_PATH = create("SFTP_KEY_FILE_PATH", "SFTP_KEY_FILE_PATH");

	/** ＩＦ制御区分：SFTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。
	 */
	public static final MAC_IF_CTL_TYP SFTP_RTRY_CNT = create("SFTP_RTRY_CNT", "SFTP_RTRY_CNT");

	/** ＩＦ制御区分：SFTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。
	 */
	public static final MAC_IF_CTL_TYP SFTP_WAIT_SEC = create("SFTP_WAIT_SEC", "SFTP_WAIT_SEC");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IF_CTL_TYP create() {
		return new MAC_IF_CTL_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_IF_CTL_TYP get(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		if (type == null) {
			throw MAC_IF_CTL_TYP.invalidValue(value);
		}
		return type;
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * valueが定数グループに属している場合は、valueと一致した定数インスタンスを返します。
	 * 定数グループに属していない場合はnullを返します。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 */
	public static MAC_IF_CTL_TYP getNE(String value) {
		for (MAC_IF_CTL_TYP me : MAC_IF_CTL_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IF_CTL_TYP create(String value, String xmlKey) {
		MAC_IF_CTL_TYP me = MAC_IF_CTL_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		return me;
	}

	/*
	 * 各フィールドのgetterです。
	 */
	@Override
	protected String moduleID() {
		return moduleID;
	}

	@Override
	protected String typeID() {
		return typeID;
	}

	/**
	 * DB保存する場合などに使用するプリミティブな値を取得します。
	 * ロジックが保持している値が定数と同値であるかどうかを判断する場合には、
	 * <pre>  [定数クラス].is[定数名]([値を保持している変数])</pre>。
	 * を使用してください。
	 * <pre>  [定数クラス].[定数名].value.equals([値を保持している変数])</pre>
	 * という実装は推奨しません。
	 * @return 定数値
	 */
	public String value() {
		return constR.getString($VALUE);
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_IF_CTL_TYP me = MAC_IF_CTL_TYP.getNE(value);
		if (me != null) {
			return true;
		}
		else {
			return false;
		}
	}

	/** 
	 * 指定されたvalueが定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 値
	 */
	public static void containsEx(String value) {
		MAC_IF_CTL_TYP me = MAC_IF_CTL_TYP.getNE(value);
		if (me == null) {
			throw MAC_IF_CTL_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_IF_CTL_TYP me = MAC_IF_CTL_TYP.getNE(value);
		if (me == null) {
			if (binds == null) {
				throw new MCAppException(msgid, value);
			}else{
				throw new MCAppException(msgid, binds);
			}
		}
	}


	/*
	 * toStringメソッドのオーバーライドです。
	 */
	public String toString() {
		return createStringPath(value(), name());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_IF_CTL_TYP[] array() {
		if (array == null) {
			array = new MAC_IF_CTL_TYP[] {
					MAC_IF_CTL_TYP.LOCAL_DIR, MAC_IF_CTL_TYP.SEND_RMT_DIR, MAC_IF_CTL_TYP.RECV_RMT_DIR, MAC_IF_CTL_TYP.FILE_NM, MAC_IF_CTL_TYP.FILE_TYPE, 
					 MAC_IF_CTL_TYP.FILE_USE_HEADING, MAC_IF_CTL_TYP.FILE_CHARSET, MAC_IF_CTL_TYP.FILE_BOM, MAC_IF_CTL_TYP.SEND_FILE_GRP, MAC_IF_CTL_TYP.FILE_DBL_QUART, MAC_IF_CTL_TYP.FTP_HOST, 
					 MAC_IF_CTL_TYP.FTP_PORT, MAC_IF_CTL_TYP.FTP_USER, MAC_IF_CTL_TYP.FTP_PASS, MAC_IF_CTL_TYP.FTP_MODE, MAC_IF_CTL_TYP.FTP_OPTS, MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP, 
					 MAC_IF_CTL_TYP.STS_FILE_SUFFIX, MAC_IF_CTL_TYP.SEND_TYP, MAC_IF_CTL_TYP.RECV_TYP, MAC_IF_CTL_TYP.FTP_RTRY_CNT, MAC_IF_CTL_TYP.FTP_WAIT_SEC, MAC_IF_CTL_TYP.WEB_URL, 
					 MAC_IF_CTL_TYP.WEB_REQ_ID, MAC_IF_CTL_TYP.DATE_FORMAT, MAC_IF_CTL_TYP.TIME_STAMP_FORMAT, MAC_IF_CTL_TYP.EXT_SYS_STR1, MAC_IF_CTL_TYP.EXT_SYS_STR2, MAC_IF_CTL_TYP.EXT_SYS_STR3, 
					 MAC_IF_CTL_TYP.EXT_SYS_STR4, MAC_IF_CTL_TYP.EXT_SYS_STR5, MAC_IF_CTL_TYP.EXT_SYS_STR6, MAC_IF_CTL_TYP.EXT_SYS_STR7, MAC_IF_CTL_TYP.EXT_SYS_STR8, MAC_IF_CTL_TYP.EXT_SYS_STR9, 
					 MAC_IF_CTL_TYP.EXT_SYS_STR10, MAC_IF_CTL_TYP.CMD_PATH, MAC_IF_CTL_TYP.CMD_CHARSET, MAC_IF_CTL_TYP.CMD_ARG01, MAC_IF_CTL_TYP.CMD_ARG02, MAC_IF_CTL_TYP.CMD_ARG03, 
					 MAC_IF_CTL_TYP.CMD_ARG04, MAC_IF_CTL_TYP.CMD_ARG05, MAC_IF_CTL_TYP.CMD_ARG06, MAC_IF_CTL_TYP.CMD_ARG07, MAC_IF_CTL_TYP.CMD_ARG08, MAC_IF_CTL_TYP.CMD_ARG09, 
					 MAC_IF_CTL_TYP.CMD_ARG10, MAC_IF_CTL_TYP.FILE_CSV_FMT_PATH, MAC_IF_CTL_TYP.FILE_FIX_FMT_PATH, MAC_IF_CTL_TYP.FILE_FIX_SETTING_PATH, MAC_IF_CTL_TYP.SFTP_HOST, MAC_IF_CTL_TYP.SFTP_PORT, 
					 MAC_IF_CTL_TYP.SFTP_USER, MAC_IF_CTL_TYP.SFTP_PASS, MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH, MAC_IF_CTL_TYP.SFTP_RTRY_CNT, MAC_IF_CTL_TYP.SFTP_WAIT_SEC
			};
		}
		return array;
	}

	/**
	 * 定数の値と名称のListを返します。
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list() {
		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MAC_IF_CTL_TYP me : MAC_IF_CTL_TYP.array()) {
			MCRow r = MCRow.create();
			r.addStringColumn($VALUE, me.value());
			r.addStringColumn($NAME, me.name());
			list.add(r);
		}
		return list;
	}

	/**
	 * キーに対応する値を取得します。
	 * @return 値
	 */
	protected static String value(String key) {
		for (MAC_IF_CTL_TYP me : MAC_IF_CTL_TYP.array()) {
			if(me.key().equals(key)){
				return me.value();
			}
		}
		return null;
	}

	/**
	 * キーの配列を取得します。
	 * @return キーの配列
	 */
	protected static List<String> getKeys() {
		List<String> keys = new ArrayList<String>();
		for (MAC_IF_CTL_TYP me : MAC_IF_CTL_TYP.array()) {
			keys.add(me.key());
		}
		return keys;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(MCRow row) {
		Map<String, Boolean> kl = new HashMap<String, Boolean>();
		for(String s : row.getColumnPathArray()){
			if(MAC_IF_CTL_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_IF_CTL_TYP me = MAC_IF_CTL_TYP.get(MAC_IF_CTL_TYP.value(e.getKey()));
				MCRow r = list.createRow();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_IF_CTL_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_IF_CTL_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_IF_CTL_TYP.list();
			}
			return list;
		}
	/**
	 * 指定されたカラムの値が一致する範囲の値と名称のListを返します。<p>
	 * 引数 cols と引数 vals の要素数が異なる場合は、小さい方の要素数を比較するカラム数とします。
	 * 定数の保持するconstR に 存在しないカラムを指定した場合、例外をthrowします。
	 * @param cols カラム名の配列
	 * @param vals 値の配列
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(String[] cols, Comparable<?>[] vals) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MAC_IF_CTL_TYP me : MAC_IF_CTL_TYP.array()) {
			if(MAC_IF_CTL_TYP.isSameVals(me, cols, vals)){
				MCRow r = MCRow.create();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 指定されたカラムの値が一致する範囲の値と名称のListを返します。<p>
	 * 引数colValMapの、キーを定数カラム、値を定数カラムに対応する値、とみなし、それに一致する定数のリストを返します。
	 * @param colValMap キーにカラム名、値に定数カラムに対応する値を持つマップ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(Map<String, Comparable<?>> colValMap) {
		MCList<MCRow> list;
		if(colValMap != null && 0 < colValMap.size()){
			int s = colValMap.size();
			String[] cols = new String[s];
			Comparable<?>[] vals =new Comparable<?>[s];
			int i = 0;
			for(Map.Entry<String, Comparable<?>> e : colValMap.entrySet()){
				cols[i] = e.getKey();
				vals[i] = e.getValue();
				i =+ 1;
			}
			list = MAC_IF_CTL_TYP.subList(cols, vals);
		}
		else{
			list = MCList.create(MCRow.class);
		}
		return list;
	}

	/**
	 * 指定されたカラムの値がひとつも一致しない範囲の値と名称のListを返します。<p>
	 * 定数インスタンスの保持するconstR に存在しないカラムを指定した場合、例外をthrowします。
	 * @param col カラム名
	 * @param vals 値の配列
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> exptSubList(String col, Comparable<?>[] vals) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		String[] cols = {col};
		Comparable<?>[] val = new Comparable<?>[1];
		for (MAC_IF_CTL_TYP me : MAC_IF_CTL_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_IF_CTL_TYP.isSameVals(me, cols, val)){
					f = false;
					break;
				}
			}
			if(f){
				MCRow r = MCRow.create();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 定数の保持するconstR のカラム(引数 cols)の値が、引数 valsと一致する場合、trueを返します。<p>
	 * 引数 keys と引数 vals の要素数が異なる場合は、小さい方の要素数を比較するカラム数とします。
	 * 定数の保持するconstR に 存在しないカラムを指定した場合、例外をthrowします。
	 * @param me 定数インスタンス
	 * @param cols カラム名の配列
	 * @param vals 値の配列
	 */
	protected static boolean isSameVals(MAC_IF_CTL_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_IF_CTL_TYP", col);}
			Comparable<?> rVal = me.constR.getValue(col);
			if(!isSame(rVal, val)){
				f = false;
				break;
			}
		}
		return f;
	}

	/**
	 * デフォルトの比較メソッド
	 * staticオブジェクト同士の比較なので、==演算子を使用している。
	 * @param type 定数インスタンス
	 * @return 一致していればtrue
	 */
	protected boolean isSame(MAC_IF_CTL_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * ＩＦ制御区分：送受信ファイルの保存先となるアプリケーションサーバローカルのディレクトリを設定する。
・送信処理：作成したファイルの出力先
・受信処理：受信したファイルの保存先
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}
LOCAL_DIRのデータが登録されていない場合は、例）に記載の内容と同等に扱う。
LOCAL_DIRのデータを登録する場合は、ディレクトリの設定が必要。かどうか
	 * @param value 定数値
	 * @return 定数値が送受信ファイルの保存先となるアプリケーションサーバローカルのディレクトリを設定する。
・送信処理：作成したファイルの出力先
・受信処理：受信したファイルの保存先
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}
LOCAL_DIRのデータが登録されていない場合は、例）に記載の内容と同等に扱う。
LOCAL_DIRのデータを登録する場合は、ディレクトリの設定が必要。の値の場合true
	 */
	public static boolean isLOCAL_DIR(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.LOCAL_DIR.isSame(type);
	}

	/**
	 * ＩＦ制御区分：送受信ファイルの保存先となるアプリケーションサーバローカルのディレクトリを設定する。
・送信処理：作成したファイルの出力先
・受信処理：受信したファイルの保存先
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}
LOCAL_DIRのデータが登録されていない場合は、例）に記載の内容と同等に扱う。
LOCAL_DIRのデータを登録する場合は、ディレクトリの設定が必要。かどうか
	 * @param type 属性値
	 * @return 属性値が送受信ファイルの保存先となるアプリケーションサーバローカルのディレクトリを設定する。
・送信処理：作成したファイルの出力先
・受信処理：受信したファイルの保存先
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}
LOCAL_DIRのデータが登録されていない場合は、例）に記載の内容と同等に扱う。
LOCAL_DIRのデータを登録する場合は、ディレクトリの設定が必要。の値の場合true
	 */
	public static boolean isLOCAL_DIR(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.LOCAL_DIR.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイルの送信先ディレクトリを設定する。
送信区分がコピーの場合は、ローカルからアクセス可能なWindowsファイル共有形式で設定する。
送信区分がＦＴＰ、ＳＦＴＰの場合は、ＦＴＰ、ＳＦＴＰサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。かどうか
	 * @param value 定数値
	 * @return 定数値がファイルの送信先ディレクトリを設定する。
送信区分がコピーの場合は、ローカルからアクセス可能なWindowsファイル共有形式で設定する。
送信区分がＦＴＰ、ＳＦＴＰの場合は、ＦＴＰ、ＳＦＴＰサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。の値の場合true
	 */
	public static boolean isSEND_RMT_DIR(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SEND_RMT_DIR.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイルの送信先ディレクトリを設定する。
送信区分がコピーの場合は、ローカルからアクセス可能なWindowsファイル共有形式で設定する。
送信区分がＦＴＰ、ＳＦＴＰの場合は、ＦＴＰ、ＳＦＴＰサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。かどうか
	 * @param type 属性値
	 * @return 属性値がファイルの送信先ディレクトリを設定する。
送信区分がコピーの場合は、ローカルからアクセス可能なWindowsファイル共有形式で設定する。
送信区分がＦＴＰ、ＳＦＴＰの場合は、ＦＴＰ、ＳＦＴＰサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。の値の場合true
	 */
	public static boolean isSEND_RMT_DIR(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SEND_RMT_DIR.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイル受信の監視対象となるＦＴＰ、SFTPサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。かどうか
	 * @param value 定数値
	 * @return 定数値がファイル受信の監視対象となるＦＴＰ、SFTPサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。の値の場合true
	 */
	public static boolean isRECV_RMT_DIR(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.RECV_RMT_DIR.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイル受信の監視対象となるＦＴＰ、SFTPサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。かどうか
	 * @param type 属性値
	 * @return 属性値がファイル受信の監視対象となるＦＴＰ、SFTPサーバ上のディレクトリを設定する。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。の値の場合true
	 */
	public static boolean isRECV_RMT_DIR(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.RECV_RMT_DIR.isSame(type);
	}

	/**
	 * ＩＦ制御区分：送信時に出力されるファイル名を設定する。
設定するファイル名には、以下のプレースホルダを設定することもできる。
利用可能なプレースホルダ）
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
・{USER}：ユーザＩＤ
・{DATA_NO}：データＮＯ
・{yyyyMMddHHmmssSSS}：年月日時分秒ミリ秒※
・{yyMMddHHmmss}：年月日時分秒※
・{yyyyMM}：年月※
※日付はJavaの日付フォーマット（SimpleDateFormat）が指定可能
省略時は「{yyyyMMddHHmmssSSS}.dat」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値が送信時に出力されるファイル名を設定する。
設定するファイル名には、以下のプレースホルダを設定することもできる。
利用可能なプレースホルダ）
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
・{USER}：ユーザＩＤ
・{DATA_NO}：データＮＯ
・{yyyyMMddHHmmssSSS}：年月日時分秒ミリ秒※
・{yyMMddHHmmss}：年月日時分秒※
・{yyyyMM}：年月※
※日付はJavaの日付フォーマット（SimpleDateFormat）が指定可能
省略時は「{yyyyMMddHHmmssSSS}.dat」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_NM(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_NM.isSame(type);
	}

	/**
	 * ＩＦ制御区分：送信時に出力されるファイル名を設定する。
設定するファイル名には、以下のプレースホルダを設定することもできる。
利用可能なプレースホルダ）
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
・{USER}：ユーザＩＤ
・{DATA_NO}：データＮＯ
・{yyyyMMddHHmmssSSS}：年月日時分秒ミリ秒※
・{yyMMddHHmmss}：年月日時分秒※
・{yyyyMM}：年月※
※日付はJavaの日付フォーマット（SimpleDateFormat）が指定可能
省略時は「{yyyyMMddHHmmssSSS}.dat」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値が送信時に出力されるファイル名を設定する。
設定するファイル名には、以下のプレースホルダを設定することもできる。
利用可能なプレースホルダ）
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
・{USER}：ユーザＩＤ
・{DATA_NO}：データＮＯ
・{yyyyMMddHHmmssSSS}：年月日時分秒ミリ秒※
・{yyMMddHHmmss}：年月日時分秒※
・{yyyyMM}：年月※
※日付はJavaの日付フォーマット（SimpleDateFormat）が指定可能
省略時は「{yyyyMMddHHmmssSSS}.dat」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_NM(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_NM.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイル形式を設定する。
・1：CSV形式（カンマ区切り）
・2：TSV形式（タブ区切り）
・3：固定長形式
・上記以外：「1」と同等
省略時は「1」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がファイル形式を設定する。
・1：CSV形式（カンマ区切り）
・2：TSV形式（タブ区切り）
・3：固定長形式
・上記以外：「1」と同等
省略時は「1」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_TYPE(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_TYPE.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイル形式を設定する。
・1：CSV形式（カンマ区切り）
・2：TSV形式（タブ区切り）
・3：固定長形式
・上記以外：「1」と同等
省略時は「1」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がファイル形式を設定する。
・1：CSV形式（カンマ区切り）
・2：TSV形式（タブ区切り）
・3：固定長形式
・上記以外：「1」と同等
省略時は「1」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_TYPE(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_TYPE.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイルの１行目を見出し行として扱うかどうかを設定する。
・true：扱う
・上記以外：扱わない
省略時は「上記以外」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がファイルの１行目を見出し行として扱うかどうかを設定する。
・true：扱う
・上記以外：扱わない
省略時は「上記以外」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_USE_HEADING(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_USE_HEADING.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイルの１行目を見出し行として扱うかどうかを設定する。
・true：扱う
・上記以外：扱わない
省略時は「上記以外」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がファイルの１行目を見出し行として扱うかどうかを設定する。
・true：扱う
・上記以外：扱わない
省略時は「上記以外」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_USE_HEADING(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_USE_HEADING.isSame(type);
	}

	/**
	 * ＩＦ制御区分：CSV形式、TSV形式の場合、ファイルの文字セットを設定する。
固定長形式の場合、項目の文字セットを設定する。
省略時は「UTF-8」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がCSV形式、TSV形式の場合、ファイルの文字セットを設定する。
固定長形式の場合、項目の文字セットを設定する。
省略時は「UTF-8」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_CHARSET(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_CHARSET.isSame(type);
	}

	/**
	 * ＩＦ制御区分：CSV形式、TSV形式の場合、ファイルの文字セットを設定する。
固定長形式の場合、項目の文字セットを設定する。
省略時は「UTF-8」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がCSV形式、TSV形式の場合、ファイルの文字セットを設定する。
固定長形式の場合、項目の文字セットを設定する。
省略時は「UTF-8」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_CHARSET(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_CHARSET.isSame(type);
	}

	/**
	 * ＩＦ制御区分：BOM（Byte Order Mark）の付加するかどうかを設定する。
・true：付加する
・上記以外：付加しない
省略時は「上記以外」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がBOM（Byte Order Mark）の付加するかどうかを設定する。
・true：付加する
・上記以外：付加しない
省略時は「上記以外」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_BOM(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_BOM.isSame(type);
	}

	/**
	 * ＩＦ制御区分：BOM（Byte Order Mark）の付加するかどうかを設定する。
・true：付加する
・上記以外：付加しない
省略時は「上記以外」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がBOM（Byte Order Mark）の付加するかどうかを設定する。
・true：付加する
・上記以外：付加しない
省略時は「上記以外」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_BOM(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_BOM.isSame(type);
	}

	/**
	 * ＩＦ制御区分：送信ファイルを作成する単位を設定する。
・1：ＩＦ処理区分＋外部システムＣＤ単位でまとめる
・2：ＩＦ処理区分＋外部システムＣＤ＋データＮＯ単位でまとめる
・上記以外：「1」と同等
省略時は「1」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値が送信ファイルを作成する単位を設定する。
・1：ＩＦ処理区分＋外部システムＣＤ単位でまとめる
・2：ＩＦ処理区分＋外部システムＣＤ＋データＮＯ単位でまとめる
・上記以外：「1」と同等
省略時は「1」と同等に扱う。の値の場合true
	 */
	public static boolean isSEND_FILE_GRP(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SEND_FILE_GRP.isSame(type);
	}

	/**
	 * ＩＦ制御区分：送信ファイルを作成する単位を設定する。
・1：ＩＦ処理区分＋外部システムＣＤ単位でまとめる
・2：ＩＦ処理区分＋外部システムＣＤ＋データＮＯ単位でまとめる
・上記以外：「1」と同等
省略時は「1」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値が送信ファイルを作成する単位を設定する。
・1：ＩＦ処理区分＋外部システムＣＤ単位でまとめる
・2：ＩＦ処理区分＋外部システムＣＤ＋データＮＯ単位でまとめる
・上記以外：「1」と同等
省略時は「1」と同等に扱う。の値の場合true
	 */
	public static boolean isSEND_FILE_GRP(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SEND_FILE_GRP.isSame(type);
	}

	/**
	 * ＩＦ制御区分：文字列項目をダブルクォートで囲むかどうかを設定する。
・true：囲む
・上記以外：囲まない
省略時は「true」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値が文字列項目をダブルクォートで囲むかどうかを設定する。
・true：囲む
・上記以外：囲まない
省略時は「true」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_DBL_QUART(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_DBL_QUART.isSame(type);
	}

	/**
	 * ＩＦ制御区分：文字列項目をダブルクォートで囲むかどうかを設定する。
・true：囲む
・上記以外：囲まない
省略時は「true」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値が文字列項目をダブルクォートで囲むかどうかを設定する。
・true：囲む
・上記以外：囲まない
省略時は「true」と同等に扱う。の値の場合true
	 */
	public static boolean isFILE_DBL_QUART(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_DBL_QUART.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。の値の場合true
	 */
	public static boolean isFTP_HOST(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FTP_HOST.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。の値の場合true
	 */
	public static boolean isFTP_HOST(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FTP_HOST.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰの送受信で使用するポート番号を設定する。
省略時は「21」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がＦＴＰの送受信で使用するポート番号を設定する。
省略時は「21」と同等に扱う。の値の場合true
	 */
	public static boolean isFTP_PORT(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FTP_PORT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰの送受信で使用するポート番号を設定する。
省略時は「21」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がＦＴＰの送受信で使用するポート番号を設定する。
省略時は「21」と同等に扱う。の値の場合true
	 */
	public static boolean isFTP_PORT(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FTP_PORT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰユーザを設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がＦＴＰユーザを設定する。の値の場合true
	 */
	public static boolean isFTP_USER(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FTP_USER.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰユーザを設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がＦＴＰユーザを設定する。の値の場合true
	 */
	public static boolean isFTP_USER(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FTP_USER.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰユーザのパスワードを設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がＦＴＰユーザのパスワードを設定する。の値の場合true
	 */
	public static boolean isFTP_PASS(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FTP_PASS.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰユーザのパスワードを設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がＦＴＰユーザのパスワードを設定する。の値の場合true
	 */
	public static boolean isFTP_PASS(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FTP_PASS.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰのモードを設定する。
・1：アクティブモード
・2：パッシブモード
・上記以外：「2」と同等
省略時は「2」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がＦＴＰのモードを設定する。
・1：アクティブモード
・2：パッシブモード
・上記以外：「2」と同等
省略時は「2」と同等に扱う。の値の場合true
	 */
	public static boolean isFTP_MODE(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FTP_MODE.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰのモードを設定する。
・1：アクティブモード
・2：パッシブモード
・上記以外：「2」と同等
省略時は「2」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がＦＴＰのモードを設定する。
・1：アクティブモード
・2：パッシブモード
・上記以外：「2」と同等
省略時は「2」と同等に扱う。の値の場合true
	 */
	public static boolean isFTP_MODE(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FTP_MODE.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰサーバのオプションを設定する。
オプションはKey=Valueで設定する。
複数指定する場合は、Key=Value, Key=Value .... とカンマで区切って設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がＦＴＰサーバのオプションを設定する。
オプションはKey=Valueで設定する。
複数指定する場合は、Key=Value, Key=Value .... とカンマで区切って設定する。の値の場合true
	 */
	public static boolean isFTP_OPTS(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FTP_OPTS.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ＦＴＰサーバのオプションを設定する。
オプションはKey=Valueで設定する。
複数指定する場合は、Key=Value, Key=Value .... とカンマで区切って設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がＦＴＰサーバのオプションを設定する。
オプションはKey=Valueで設定する。
複数指定する場合は、Key=Value, Key=Value .... とカンマで区切って設定する。の値の場合true
	 */
	public static boolean isFTP_OPTS(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FTP_OPTS.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイルが転送中かどうか識別できるようにするための転送ファイルのロック方式を設定する。
・1：リネーム方式（転送完了後、FILE_NMの設定に従ったファイル名に変更）
・2：ステータス方式（転送完了後、転送完了を示すステータスファイルを作成）
省略時は「1」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がファイルが転送中かどうか識別できるようにするための転送ファイルのロック方式を設定する。
・1：リネーム方式（転送完了後、FILE_NMの設定に従ったファイル名に変更）
・2：ステータス方式（転送完了後、転送完了を示すステータスファイルを作成）
省略時は「1」と同等に扱う。の値の場合true
	 */
	public static boolean isTRANSFER_LOCK_TYP(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイルが転送中かどうか識別できるようにするための転送ファイルのロック方式を設定する。
・1：リネーム方式（転送完了後、FILE_NMの設定に従ったファイル名に変更）
・2：ステータス方式（転送完了後、転送完了を示すステータスファイルを作成）
省略時は「1」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がファイルが転送中かどうか識別できるようにするための転送ファイルのロック方式を設定する。
・1：リネーム方式（転送完了後、FILE_NMの設定に従ったファイル名に変更）
・2：ステータス方式（転送完了後、転送完了を示すステータスファイルを作成）
省略時は「1」と同等に扱う。の値の場合true
	 */
	public static boolean isTRANSFER_LOCK_TYP(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP.isSame(type);
	}

	/**
	 * ＩＦ制御区分：転送方式がステータス方式の時に扱うステータスファイルの接尾辞を設定する。
省略時は「.end」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値が転送方式がステータス方式の時に扱うステータスファイルの接尾辞を設定する。
省略時は「.end」と同等に扱う。の値の場合true
	 */
	public static boolean isSTS_FILE_SUFFIX(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.STS_FILE_SUFFIX.isSame(type);
	}

	/**
	 * ＩＦ制御区分：転送方式がステータス方式の時に扱うステータスファイルの接尾辞を設定する。
省略時は「.end」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値が転送方式がステータス方式の時に扱うステータスファイルの接尾辞を設定する。
省略時は「.end」と同等に扱う。の値の場合true
	 */
	public static boolean isSTS_FILE_SUFFIX(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.STS_FILE_SUFFIX.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイル送信方法を設定する。
・1：ファイルコピー
・2：FTP
・3：SFTP
省略時および上記以外の値の場合は、ファイル転送しない。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。かどうか
	 * @param value 定数値
	 * @return 定数値がファイル送信方法を設定する。
・1：ファイルコピー
・2：FTP
・3：SFTP
省略時および上記以外の値の場合は、ファイル転送しない。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。の値の場合true
	 */
	public static boolean isSEND_TYP(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SEND_TYP.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイル送信方法を設定する。
・1：ファイルコピー
・2：FTP
・3：SFTP
省略時および上記以外の値の場合は、ファイル転送しない。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。かどうか
	 * @param type 属性値
	 * @return 属性値がファイル送信方法を設定する。
・1：ファイルコピー
・2：FTP
・3：SFTP
省略時および上記以外の値の場合は、ファイル転送しない。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。の値の場合true
	 */
	public static boolean isSEND_TYP(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SEND_TYP.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイル受信方法を設定する。
・0：対象外
・2：FTP
・3：SFTP
省略時は「2：FTP」とみなす。上記以外の値の場合は、「0：対象外」とみなす。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。かどうか
	 * @param value 定数値
	 * @return 定数値がファイル受信方法を設定する。
・0：対象外
・2：FTP
・3：SFTP
省略時は「2：FTP」とみなす。上記以外の値の場合は、「0：対象外」とみなす。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。の値の場合true
	 */
	public static boolean isRECV_TYP(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.RECV_TYP.isSame(type);
	}

	/**
	 * ＩＦ制御区分：ファイル受信方法を設定する。
・0：対象外
・2：FTP
・3：SFTP
省略時は「2：FTP」とみなす。上記以外の値の場合は、「0：対象外」とみなす。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。かどうか
	 * @param type 属性値
	 * @return 属性値がファイル受信方法を設定する。
・0：対象外
・2：FTP
・3：SFTP
省略時は「2：FTP」とみなす。上記以外の値の場合は、「0：対象外」とみなす。
また、外部システム区分が「6：ＥＤＩ（ＭＣＦ）」の場合は本指定は無効となる。の値の場合true
	 */
	public static boolean isRECV_TYP(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.RECV_TYP.isSame(type);
	}

	/**
	 * ＩＦ制御区分：FTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がFTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。の値の場合true
	 */
	public static boolean isFTP_RTRY_CNT(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FTP_RTRY_CNT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：FTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がFTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。の値の場合true
	 */
	public static boolean isFTP_RTRY_CNT(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FTP_RTRY_CNT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：FTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がFTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。の値の場合true
	 */
	public static boolean isFTP_WAIT_SEC(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FTP_WAIT_SEC.isSame(type);
	}

	/**
	 * ＩＦ制御区分：FTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がFTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。の値の場合true
	 */
	public static boolean isFTP_WAIT_SEC(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FTP_WAIT_SEC.isSame(type);
	}

	/**
	 * ＩＦ制御区分：Web API にアクセスするためのURLを設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がWeb API にアクセスするためのURLを設定する。の値の場合true
	 */
	public static boolean isWEB_URL(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.WEB_URL.isSame(type);
	}

	/**
	 * ＩＦ制御区分：Web API にアクセスするためのURLを設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がWeb API にアクセスするためのURLを設定する。の値の場合true
	 */
	public static boolean isWEB_URL(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.WEB_URL.isSame(type);
	}

	/**
	 * ＩＦ制御区分：Web APIで使用されるrequestメソッドの[リクエストのID]を設定する。[リクエストのID]ごとにタイムアウトなどを設定できる。かどうか
	 * @param value 定数値
	 * @return 定数値がWeb APIで使用されるrequestメソッドの[リクエストのID]を設定する。[リクエストのID]ごとにタイムアウトなどを設定できる。の値の場合true
	 */
	public static boolean isWEB_REQ_ID(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.WEB_REQ_ID.isSame(type);
	}

	/**
	 * ＩＦ制御区分：Web APIで使用されるrequestメソッドの[リクエストのID]を設定する。[リクエストのID]ごとにタイムアウトなどを設定できる。かどうか
	 * @param type 属性値
	 * @return 属性値がWeb APIで使用されるrequestメソッドの[リクエストのID]を設定する。[リクエストのID]ごとにタイムアウトなどを設定できる。の値の場合true
	 */
	public static boolean isWEB_REQ_ID(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.WEB_REQ_ID.isSame(type);
	}

	/**
	 * ＩＦ制御区分：Web APIで送信する日付型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSSZ"が適用される。かどうか
	 * @param value 定数値
	 * @return 定数値がWeb APIで送信する日付型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSSZ"が適用される。の値の場合true
	 */
	public static boolean isDATE_FORMAT(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.DATE_FORMAT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：Web APIで送信する日付型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSSZ"が適用される。かどうか
	 * @param type 属性値
	 * @return 属性値がWeb APIで送信する日付型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSSZ"が適用される。の値の場合true
	 */
	public static boolean isDATE_FORMAT(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.DATE_FORMAT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：Web APIで送信するタイムスタンプ型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSS-0700"が適用される。かどうか
	 * @param value 定数値
	 * @return 定数値がWeb APIで送信するタイムスタンプ型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSS-0700"が適用される。の値の場合true
	 */
	public static boolean isTIME_STAMP_FORMAT(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.TIME_STAMP_FORMAT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：Web APIで送信するタイムスタンプ型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSS-0700"が適用される。かどうか
	 * @param type 属性値
	 * @return 属性値がWeb APIで送信するタイムスタンプ型項目のフォーマットを設定する。
例）yyyy-MM-dd'T'HH:mm:ss.SSS-0700
設定しない場合は、"yyyy-MM-dd'T'HH:mm:ss.SSS-0700"が適用される。の値の場合true
	 */
	public static boolean isTIME_STAMP_FORMAT(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.TIME_STAMP_FORMAT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR1(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR1.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR1(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR1.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR2(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR2.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR2(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR2.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR3(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR3.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR3(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR3.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR4(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR4.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR4(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR4.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR5(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR5.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR5(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR5.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR6(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR6.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR6(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR6.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR7(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR7.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR7(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR7.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR8(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR8.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR8(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR8.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR9(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR9.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR9(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR9.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR10(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.EXT_SYS_STR10.isSame(type);
	}

	/**
	 * ＩＦ制御区分：外部システムへ接続するための文字列を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値が外部システムへ接続するための文字列を設定する。の値の場合true
	 */
	public static boolean isEXT_SYS_STR10(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.EXT_SYS_STR10.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドファイルのパスを設定する。
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}\cmd.exeかどうか
	 * @param value 定数値
	 * @return 定数値がコマンドファイルのパスを設定する。
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}\cmd.exeの値の場合true
	 */
	public static boolean isCMD_PATH(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドファイルのパスを設定する。
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}\cmd.exeかどうか
	 * @param type 属性値
	 * @return 属性値がコマンドファイルのパスを設定する。
ディレクトリの設定においては、以下のプレースホルダを利用できる。
・{MCF_HOME}：MCF_HOMEディレクトリ
・{CO_CD}：会社ＣＤ
・{EXT_SYS_CD}：外部システムCＤ
・{IF_PROC_TYP}：ＩＦ処理区分
例）
{MCF_HOME}\esb\{CO_CD}\{EXT_SYS_CD}\{IF_PROC_TYP}\cmd.exeの値の場合true
	 */
	public static boolean isCMD_PATH(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドの標準エラーの文字セットを設定する。
省略時は「UTF-8」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドの標準エラーの文字セットを設定する。
省略時は「UTF-8」と同等に扱う。の値の場合true
	 */
	public static boolean isCMD_CHARSET(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_CHARSET.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドの標準エラーの文字セットを設定する。
省略時は「UTF-8」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドの標準エラーの文字セットを設定する。
省略時は「UTF-8」と同等に扱う。の値の場合true
	 */
	public static boolean isCMD_CHARSET(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_CHARSET.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG01(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG01.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG01(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG01.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG02(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG02.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG02(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG02.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG03(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG03.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG03(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG03.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG04(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG04.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG04(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG04.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG05(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG05.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG05(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG05.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG06(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG06.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG06(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG06.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG07(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG07.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG07(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG07.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG08(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG08.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG08(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG08.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG09(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG09.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG09(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG09.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param value 定数値
	 * @return 定数値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG10(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.CMD_ARG10.isSame(type);
	}

	/**
	 * ＩＦ制御区分：コマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。かどうか
	 * @param type 属性値
	 * @return 属性値がコマンドに渡す引数を設定する。
CMD_ARG01～10の順序で渡される。の値の場合true
	 */
	public static boolean isCMD_ARG10(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.CMD_ARG10.isSame(type);
	}

	/**
	 * ＩＦ制御区分：CSV形式、TSV形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。
ファイルの１行目を見出し行として扱う場合、本指定は無効となる。かどうか
	 * @param value 定数値
	 * @return 定数値がCSV形式、TSV形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。
ファイルの１行目を見出し行として扱う場合、本指定は無効となる。の値の場合true
	 */
	public static boolean isFILE_CSV_FMT_PATH(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_CSV_FMT_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：CSV形式、TSV形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。
ファイルの１行目を見出し行として扱う場合、本指定は無効となる。かどうか
	 * @param type 属性値
	 * @return 属性値がCSV形式、TSV形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。
ファイルの１行目を見出し行として扱う場合、本指定は無効となる。の値の場合true
	 */
	public static boolean isFILE_CSV_FMT_PATH(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_CSV_FMT_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：固定長形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。かどうか
	 * @param value 定数値
	 * @return 定数値が固定長形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。の値の場合true
	 */
	public static boolean isFILE_FIX_FMT_PATH(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_FIX_FMT_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：固定長形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。かどうか
	 * @param type 属性値
	 * @return 属性値が固定長形式のフォーマットを指定する場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。の値の場合true
	 */
	public static boolean isFILE_FIX_FMT_PATH(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_FIX_FMT_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：固定長形式のフォーマットに共通の設定をする場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。かどうか
	 * @param value 定数値
	 * @return 定数値が固定長形式のフォーマットに共通の設定をする場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。の値の場合true
	 */
	public static boolean isFILE_FIX_SETTING_PATH(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.FILE_FIX_SETTING_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：固定長形式のフォーマットに共通の設定をする場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。かどうか
	 * @param type 属性値
	 * @return 属性値が固定長形式のフォーマットに共通の設定をする場合に設定する。フォーマットファイルの文字セットは「UTF-8（BOMなし）」である。の値の場合true
	 */
	public static boolean isFILE_FIX_SETTING_PATH(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.FILE_FIX_SETTING_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がSＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。の値の場合true
	 */
	public static boolean isSFTP_HOST(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SFTP_HOST.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がSＦＴＰサーバのホスト（ホスト名 or IPアドレス）を設定する。の値の場合true
	 */
	public static boolean isSFTP_HOST(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SFTP_HOST.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SＦＴＰの送受信で使用するポート番号を設定する。
省略時は「22」と同等に扱う。かどうか
	 * @param value 定数値
	 * @return 定数値がSＦＴＰの送受信で使用するポート番号を設定する。
省略時は「22」と同等に扱う。の値の場合true
	 */
	public static boolean isSFTP_PORT(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SFTP_PORT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SＦＴＰの送受信で使用するポート番号を設定する。
省略時は「22」と同等に扱う。かどうか
	 * @param type 属性値
	 * @return 属性値がSＦＴＰの送受信で使用するポート番号を設定する。
省略時は「22」と同等に扱う。の値の場合true
	 */
	public static boolean isSFTP_PORT(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SFTP_PORT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SＦＴＰユーザを設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がSＦＴＰユーザを設定する。の値の場合true
	 */
	public static boolean isSFTP_USER(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SFTP_USER.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SＦＴＰユーザを設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がSＦＴＰユーザを設定する。の値の場合true
	 */
	public static boolean isSFTP_USER(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SFTP_USER.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SＦＴＰユーザのパスワード（パスワード認証方式）／パスフレーズ（公開鍵認証方式）を設定する。
公開鍵認証方式の場合、未設定にもできる。かどうか
	 * @param value 定数値
	 * @return 定数値がSＦＴＰユーザのパスワード（パスワード認証方式）／パスフレーズ（公開鍵認証方式）を設定する。
公開鍵認証方式の場合、未設定にもできる。の値の場合true
	 */
	public static boolean isSFTP_PASS(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SFTP_PASS.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SＦＴＰユーザのパスワード（パスワード認証方式）／パスフレーズ（公開鍵認証方式）を設定する。
公開鍵認証方式の場合、未設定にもできる。かどうか
	 * @param type 属性値
	 * @return 属性値がSＦＴＰユーザのパスワード（パスワード認証方式）／パスフレーズ（公開鍵認証方式）を設定する。
公開鍵認証方式の場合、未設定にもできる。の値の場合true
	 */
	public static boolean isSFTP_PASS(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SFTP_PASS.isSame(type);
	}

	/**
	 * ＩＦ制御区分：秘密鍵のファイルパスを指定する。
指定がある場合、公開鍵認証方式とする。指定がない場合、パスワード認証方式とする。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。かどうか
	 * @param value 定数値
	 * @return 定数値が秘密鍵のファイルパスを指定する。
指定がある場合、公開鍵認証方式とする。指定がない場合、パスワード認証方式とする。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。の値の場合true
	 */
	public static boolean isSFTP_KEY_FILE_PATH(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：秘密鍵のファイルパスを指定する。
指定がある場合、公開鍵認証方式とする。指定がない場合、パスワード認証方式とする。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。かどうか
	 * @param type 属性値
	 * @return 属性値が秘密鍵のファイルパスを指定する。
指定がある場合、公開鍵認証方式とする。指定がない場合、パスワード認証方式とする。
LOCAL_DIRと同様にプレースホルダを設定することもできる。
利用可能なプレースホルダはLOCAL_DIRの概要を参照。の値の場合true
	 */
	public static boolean isSFTP_KEY_FILE_PATH(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SFTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がSFTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。の値の場合true
	 */
	public static boolean isSFTP_RTRY_CNT(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SFTP_RTRY_CNT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SFTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がSFTPサーバへのアクセスに失敗した場合にリトライする上限回数（デフォルトは3回）を設定する。の値の場合true
	 */
	public static boolean isSFTP_RTRY_CNT(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SFTP_RTRY_CNT.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SFTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。かどうか
	 * @param value 定数値
	 * @return 定数値がSFTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。の値の場合true
	 */
	public static boolean isSFTP_WAIT_SEC(String value) {
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		return MAC_IF_CTL_TYP.SFTP_WAIT_SEC.isSame(type);
	}

	/**
	 * ＩＦ制御区分：SFTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。かどうか
	 * @param type 属性値
	 * @return 属性値がSFTPサーバへのアクセスに失敗した場合にリトライするまでの待ち時間（デフォルトは5秒）を設定する。の値の場合true
	 */
	public static boolean isSFTP_WAIT_SEC(MAC_IF_CTL_TYP type) {
		return MAC_IF_CTL_TYP.SFTP_WAIT_SEC.isSame(type);
	}

	/**
	 * 定数グループの名称を返します。
	 */
	public static String getGrpName() {
		return getGrpName(moduleID, typeID);
	}

	/**
	 * 定数グループの名称を返します。
	 * @param lc ロケール
	 */
	public static String getGrpName(Locale lcl) {
		return getGrpName(lcl, moduleID, typeID);
	}

	/**
	 * 定数グループの備考を返します。
	 */
	public static String getGrpRmrks() {
		return getGrpRmrks(moduleID, typeID);
	}

	/**
	 * 定数グループの備考を返します。
	 * @param lc ロケール
	 */
	public static String getGrpRmrks(Locale lcl) {
		return getGrpRmrks(lcl, moduleID, typeID);
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn) {
		for (MCRow r : list) {
			MAC_IF_CTL_TYP.putName(r, valueColumn, nameColumn);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn) {
		String value = row.getString(valueColumn);
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.get(value);
		row.setString(nameColumn, type.name());
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn) {
		for (MCRow r : list) {
			MAC_IF_CTL_TYP.putNameNE(r, valueColumn, nameColumn);
		}
	}

	/**
	 * 対象となるRowコンテナ(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn) {
		String value = row.getString(valueColumn);
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name());
		}
		else {
			row.setString(nameColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn , Locale lcl) {
		for (MCRow r : list) {
			MAC_IF_CTL_TYP.putName(r, valueColumn, nameColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。
	 * @param  <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.get(value);
		row.setString(nameColumn, type.name(lcl));
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_IF_CTL_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name(lcl));
		}
		else {
			row.setString(nameColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn) {
		for (MCRow r : list) {
			MAC_IF_CTL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, String rmrksColumn) {
		String value = row.getString(valueColumn);
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.get(value);
		row.setString(nameColumn, type.name());
		row.setString(rmrksColumn, type.rmrks());
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn) {
		for (MCRow r : list) {
			MAC_IF_CTL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
		}
	}

	/**
	 * 対象となるRowコンテナ(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, String rmrksColumn) {
		String value = row.getString(valueColumn);
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name());
			row.setString(rmrksColumn, type.rmrks());
		}
		else {
			row.setString(nameColumn, null);
			row.setString(rmrksColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_IF_CTL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。
	 * @param  <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.get(value);
		row.setString(nameColumn, type.name(lcl));
		row.setString(rmrksColumn, type.rmrks(lcl));
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_IF_CTL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_IF_CTL_TYP type = MAC_IF_CTL_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name(lcl));
			row.setString(rmrksColumn, type.rmrks(lcl));
		}
		else {
			row.setString(nameColumn, null);
			row.setString(rmrksColumn, null);
		}
	}

}
