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
abstract class MAC_BP_IS_SRCH_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "BP_IS_SRCH_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_BP_IS_SRCH_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "bp_is_srch_typ";

	public static final String $NAME = "bp_is_srch_typ_nm";

	public static final String $IS_PANEL = "is_panel";

	public static final String $PRNT_TYP_COL = "prnt_typ_col";

	/*
	 * 定数の定義です。
	 */
	/** 取引先入力補助検索区分：全取引先
	 */
	public static final MAC_BP_IS_SRCH_TYP COMM = create("0", "COMM", true, null);

	/** 取引先入力補助検索区分：得意先
	 */
	public static final MAC_BP_IS_SRCH_TYP CST = create("1", "CST", true, "cst_prnt_typ");

	/** 取引先入力補助検索区分：売掛先
	 */
	public static final MAC_BP_IS_SRCH_TYP ACST = create("2", "ACST", true, "acst_prnt_typ");

	/** 取引先入力補助検索区分：請求先
	 */
	public static final MAC_BP_IS_SRCH_TYP BCST = create("3", "BCST", true, "bcst_prnt_typ");

	/** 取引先入力補助検索区分：入金先
	 */
	public static final MAC_BP_IS_SRCH_TYP RCST = create("4", "RCST", true, "rcst_prnt_typ");

	/** 取引先入力補助検索区分：発注先
	 */
	public static final MAC_BP_IS_SRCH_TYP SPPL = create("5", "SPPL", true, "sppl_prnt_typ");

	/** 取引先入力補助検索区分：買掛先
	 */
	public static final MAC_BP_IS_SRCH_TYP ASPPL = create("6", "ASPPL", true, "asppl_prnt_typ");

	/** 取引先入力補助検索区分：支払予定管理先
	 */
	public static final MAC_BP_IS_SRCH_TYP BSPPL = create("7", "BSPPL", true, "bsppl_prnt_typ");

	/** 取引先入力補助検索区分：支払先
	 */
	public static final MAC_BP_IS_SRCH_TYP PSPPL = create("8", "PSPPL", true, "psppl_prnt_typ");

	/** 取引先入力補助検索区分：与信管理先
	 */
	public static final MAC_BP_IS_SRCH_TYP CRED = create("9", "CRED", true, null);

	/** 取引先入力補助検索区分：納品先
	 */
	public static final MAC_BP_IS_SRCH_TYP DLV = create("10", "DLV", true, "dlv_prnt_typ");

	/** 取引先入力補助検索区分：メーカ
	 */
	public static final MAC_BP_IS_SRCH_TYP MAKER = create("11", "MAKER", true, null);

	/** 取引先入力補助検索区分：仕向先
	 */
	public static final MAC_BP_IS_SRCH_TYP DEST = create("12", "DEST", true, null);

	/** 取引先入力補助検索区分：得意先または発注先
	 */
	public static final MAC_BP_IS_SRCH_TYP CST_SPPL = create("13", "CST_SPPL", true, null);

	/** 取引先入力補助検索区分：得意先（得意先諸口を含まない）
	 */
	public static final MAC_BP_IS_SRCH_TYP CST_NOT_SUNDRY = create("14", "CST_NOT_SUNDRY", true, null);

	/** 取引先入力補助検索区分：配送先
	 */
	public static final MAC_BP_IS_SRCH_TYP TDLV = create("15", "TDLV", true, null);

	/** 取引先入力補助検索区分：有償支給先
	 */
	public static final MAC_BP_IS_SRCH_TYP ONR_PRSPPL = create("16", "ONR_PRSPPL", true, null);

	/** 取引先入力補助検索区分：得意先（納品先対応）
	 */
	public static final MAC_BP_IS_SRCH_TYP CST_BY_DLV = create("17", "CST_BY_DLV", false, null);

	/** 取引先入力補助検索区分：納品先（得意先対応）
	 */
	public static final MAC_BP_IS_SRCH_TYP DLV_BY_CST = create("18", "DLV_BY_CST", false, null);

	/** 取引先入力補助検索区分：請求先（入金先対応）
	 */
	public static final MAC_BP_IS_SRCH_TYP BCST_BY_RCST = create("19", "BCST_BY_RCST", false, null);

	/** 取引先入力補助検索区分：納品先のみ
	 */
	public static final MAC_BP_IS_SRCH_TYP DLV_ONLY = create("20", "DLV_ONLY", true, null);

	/** 取引先入力補助検索区分：メーカのみ
	 */
	public static final MAC_BP_IS_SRCH_TYP MAKER_ONLY = create("21", "MAKER_ONLY", true, null);

	/** 取引先入力補助検索区分：仕向先のみ
	 */
	public static final MAC_BP_IS_SRCH_TYP DEST_ONLY = create("22", "DEST_ONLY", true, null);

	/** 取引先入力補助検索区分：納品先または発注先
	 */
	public static final MAC_BP_IS_SRCH_TYP DLV_SPPL = create("23", "DLV_SPPL", true, null);

	/** 取引先入力補助検索区分：購買内示
	 */
	public static final MAC_BP_IS_SRCH_TYP PURC_FRCST = create("24", "PURC_FRCST", true, null);

	/** 取引先入力補助検索区分：請求先または入金先
	 */
	public static final MAC_BP_IS_SRCH_TYP BCST_RCST = create("25", "BCST_RCST", true, null);

	/** 取引先入力補助検索区分：得意先または納品先または発注先
	 */
	public static final MAC_BP_IS_SRCH_TYP CST_DLV_SPPL = create("26", "CST_DLV_SPPL", true, null);

	/** 取引先入力補助検索区分：インボイス取引対象外発注先
	 */
	public static final MAC_BP_IS_SRCH_TYP NOT_SPPL_IV = create("27", "NOT_SPPL_IV", true, null);

	/** 取引先入力補助検索区分：発注先_購買
	 */
	public static final MAC_BP_IS_SRCH_TYP SPPL_PURC = create("28", "SPPL_PURC", true, null);

	/** 取引先入力補助検索区分：支払予定管理先または支払先
	 */
	public static final MAC_BP_IS_SRCH_TYP BSPPL_PSPPL = create("29", "BSPPL_PSPPL", true, null);

	/** 取引先入力補助検索区分：債務相殺先
	 */
	public static final MAC_BP_IS_SRCH_TYP AP_SETOFF = create("30", "AP_SETOFF", true, null);

	/** 取引先入力補助検索区分：得意先または発注先または請求先または支払予定管理先
	 */
	public static final MAC_BP_IS_SRCH_TYP CST_SPPL_BILL_BSPPL = create("31", "CST_SPPL_BILL_BSPPL", true, null);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_BP_IS_SRCH_TYP create() {
		return new MAC_BP_IS_SRCH_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_BP_IS_SRCH_TYP get(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		if (type == null) {
			throw MAC_BP_IS_SRCH_TYP.invalidValue(value);
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
	public static MAC_BP_IS_SRCH_TYP getNE(String value) {
		for (MAC_BP_IS_SRCH_TYP me : MAC_BP_IS_SRCH_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_BP_IS_SRCH_TYP create(String value, String xmlKey, boolean attr1, String attr2) {
		MAC_BP_IS_SRCH_TYP me = MAC_BP_IS_SRCH_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_PANEL, attr1);
		me.constR.addStringColumn($PRNT_TYP_COL, attr2);
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
	 * is_panelの値を返します。
	 * @return is_panelの値
	 */
	public boolean is_panel() {
		return constR.getBooleanNE($IS_PANEL);
	}

	/** 
	 * valueに対応する定数のis_panelの値を返します。
	 * @param value 定数値
	 * @return is_panelの値
	 */
	public static boolean is_panel(String value) {
		MAC_BP_IS_SRCH_TYP me = MAC_BP_IS_SRCH_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_panel();
	}

	/** 
	 * prnt_typ_colの値を返します。
	 * @return prnt_typ_colの値
	 */
	public String prnt_typ_col() {
		return constR.getStringNE($PRNT_TYP_COL);
	}

	/** 
	 * valueに対応する定数のprnt_typ_colの値を返します。
	 * @param value 定数値
	 * @return prnt_typ_colの値
	 */
	public static String prnt_typ_col(String value) {
		MAC_BP_IS_SRCH_TYP me = MAC_BP_IS_SRCH_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.prnt_typ_col();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_BP_IS_SRCH_TYP me = MAC_BP_IS_SRCH_TYP.getNE(value);
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
		MAC_BP_IS_SRCH_TYP me = MAC_BP_IS_SRCH_TYP.getNE(value);
		if (me == null) {
			throw MAC_BP_IS_SRCH_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_BP_IS_SRCH_TYP me = MAC_BP_IS_SRCH_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_panel(), prnt_typ_col());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_BP_IS_SRCH_TYP[] array() {
		if (array == null) {
			array = new MAC_BP_IS_SRCH_TYP[] {
					MAC_BP_IS_SRCH_TYP.COMM, MAC_BP_IS_SRCH_TYP.CST, MAC_BP_IS_SRCH_TYP.ACST, MAC_BP_IS_SRCH_TYP.BCST, MAC_BP_IS_SRCH_TYP.RCST, 
					 MAC_BP_IS_SRCH_TYP.SPPL, MAC_BP_IS_SRCH_TYP.ASPPL, MAC_BP_IS_SRCH_TYP.BSPPL, MAC_BP_IS_SRCH_TYP.PSPPL, MAC_BP_IS_SRCH_TYP.CRED, MAC_BP_IS_SRCH_TYP.DLV, 
					 MAC_BP_IS_SRCH_TYP.MAKER, MAC_BP_IS_SRCH_TYP.DEST, MAC_BP_IS_SRCH_TYP.CST_SPPL, MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY, MAC_BP_IS_SRCH_TYP.TDLV, MAC_BP_IS_SRCH_TYP.ONR_PRSPPL, 
					 MAC_BP_IS_SRCH_TYP.CST_BY_DLV, MAC_BP_IS_SRCH_TYP.DLV_BY_CST, MAC_BP_IS_SRCH_TYP.BCST_BY_RCST, MAC_BP_IS_SRCH_TYP.DLV_ONLY, MAC_BP_IS_SRCH_TYP.MAKER_ONLY, MAC_BP_IS_SRCH_TYP.DEST_ONLY, 
					 MAC_BP_IS_SRCH_TYP.DLV_SPPL, MAC_BP_IS_SRCH_TYP.PURC_FRCST, MAC_BP_IS_SRCH_TYP.BCST_RCST, MAC_BP_IS_SRCH_TYP.CST_DLV_SPPL, MAC_BP_IS_SRCH_TYP.NOT_SPPL_IV, MAC_BP_IS_SRCH_TYP.SPPL_PURC, 
					 MAC_BP_IS_SRCH_TYP.BSPPL_PSPPL, MAC_BP_IS_SRCH_TYP.AP_SETOFF, MAC_BP_IS_SRCH_TYP.CST_SPPL_BILL_BSPPL
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
		for (MAC_BP_IS_SRCH_TYP me : MAC_BP_IS_SRCH_TYP.array()) {
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
		for (MAC_BP_IS_SRCH_TYP me : MAC_BP_IS_SRCH_TYP.array()) {
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
		for (MAC_BP_IS_SRCH_TYP me : MAC_BP_IS_SRCH_TYP.array()) {
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
			if(MAC_BP_IS_SRCH_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_BP_IS_SRCH_TYP me = MAC_BP_IS_SRCH_TYP.get(MAC_BP_IS_SRCH_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_BP_IS_SRCH_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_BP_IS_SRCH_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_BP_IS_SRCH_TYP.list();
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
		for (MAC_BP_IS_SRCH_TYP me : MAC_BP_IS_SRCH_TYP.array()) {
			if(MAC_BP_IS_SRCH_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_BP_IS_SRCH_TYP.subList(cols, vals);
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
		for (MAC_BP_IS_SRCH_TYP me : MAC_BP_IS_SRCH_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_BP_IS_SRCH_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_BP_IS_SRCH_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_BP_IS_SRCH_TYP", col);}
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
	protected boolean isSame(MAC_BP_IS_SRCH_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 取引先入力補助検索区分：全取引先かどうか
	 * @param value 定数値
	 * @return 定数値が全取引先の値の場合true
	 */
	public static boolean isCOMM(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.COMM.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：全取引先かどうか
	 * @param type 属性値
	 * @return 属性値が全取引先の値の場合true
	 */
	public static boolean isCOMM(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.COMM.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先かどうか
	 * @param value 定数値
	 * @return 定数値が得意先の値の場合true
	 */
	public static boolean isCST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.CST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先かどうか
	 * @param type 属性値
	 * @return 属性値が得意先の値の場合true
	 */
	public static boolean isCST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.CST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：売掛先かどうか
	 * @param value 定数値
	 * @return 定数値が売掛先の値の場合true
	 */
	public static boolean isACST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.ACST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：売掛先かどうか
	 * @param type 属性値
	 * @return 属性値が売掛先の値の場合true
	 */
	public static boolean isACST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.ACST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：請求先かどうか
	 * @param value 定数値
	 * @return 定数値が請求先の値の場合true
	 */
	public static boolean isBCST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.BCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：請求先かどうか
	 * @param type 属性値
	 * @return 属性値が請求先の値の場合true
	 */
	public static boolean isBCST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.BCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：入金先かどうか
	 * @param value 定数値
	 * @return 定数値が入金先の値の場合true
	 */
	public static boolean isRCST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.RCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：入金先かどうか
	 * @param type 属性値
	 * @return 属性値が入金先の値の場合true
	 */
	public static boolean isRCST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.RCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：発注先かどうか
	 * @param value 定数値
	 * @return 定数値が発注先の値の場合true
	 */
	public static boolean isSPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.SPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：発注先かどうか
	 * @param type 属性値
	 * @return 属性値が発注先の値の場合true
	 */
	public static boolean isSPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.SPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：買掛先かどうか
	 * @param value 定数値
	 * @return 定数値が買掛先の値の場合true
	 */
	public static boolean isASPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.ASPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：買掛先かどうか
	 * @param type 属性値
	 * @return 属性値が買掛先の値の場合true
	 */
	public static boolean isASPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.ASPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：支払予定管理先かどうか
	 * @param value 定数値
	 * @return 定数値が支払予定管理先の値の場合true
	 */
	public static boolean isBSPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.BSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：支払予定管理先かどうか
	 * @param type 属性値
	 * @return 属性値が支払予定管理先の値の場合true
	 */
	public static boolean isBSPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.BSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：支払先かどうか
	 * @param value 定数値
	 * @return 定数値が支払先の値の場合true
	 */
	public static boolean isPSPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.PSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：支払先かどうか
	 * @param type 属性値
	 * @return 属性値が支払先の値の場合true
	 */
	public static boolean isPSPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.PSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：与信管理先かどうか
	 * @param value 定数値
	 * @return 定数値が与信管理先の値の場合true
	 */
	public static boolean isCRED(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.CRED.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：与信管理先かどうか
	 * @param type 属性値
	 * @return 属性値が与信管理先の値の場合true
	 */
	public static boolean isCRED(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.CRED.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：納品先かどうか
	 * @param value 定数値
	 * @return 定数値が納品先の値の場合true
	 */
	public static boolean isDLV(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.DLV.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：納品先かどうか
	 * @param type 属性値
	 * @return 属性値が納品先の値の場合true
	 */
	public static boolean isDLV(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.DLV.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：メーカかどうか
	 * @param value 定数値
	 * @return 定数値がメーカの値の場合true
	 */
	public static boolean isMAKER(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.MAKER.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：メーカかどうか
	 * @param type 属性値
	 * @return 属性値がメーカの値の場合true
	 */
	public static boolean isMAKER(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.MAKER.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：仕向先かどうか
	 * @param value 定数値
	 * @return 定数値が仕向先の値の場合true
	 */
	public static boolean isDEST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.DEST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：仕向先かどうか
	 * @param type 属性値
	 * @return 属性値が仕向先の値の場合true
	 */
	public static boolean isDEST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.DEST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先または発注先かどうか
	 * @param value 定数値
	 * @return 定数値が得意先または発注先の値の場合true
	 */
	public static boolean isCST_SPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.CST_SPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先または発注先かどうか
	 * @param type 属性値
	 * @return 属性値が得意先または発注先の値の場合true
	 */
	public static boolean isCST_SPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.CST_SPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先（得意先諸口を含まない）かどうか
	 * @param value 定数値
	 * @return 定数値が得意先（得意先諸口を含まない）の値の場合true
	 */
	public static boolean isCST_NOT_SUNDRY(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先（得意先諸口を含まない）かどうか
	 * @param type 属性値
	 * @return 属性値が得意先（得意先諸口を含まない）の値の場合true
	 */
	public static boolean isCST_NOT_SUNDRY(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：配送先かどうか
	 * @param value 定数値
	 * @return 定数値が配送先の値の場合true
	 */
	public static boolean isTDLV(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.TDLV.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：配送先かどうか
	 * @param type 属性値
	 * @return 属性値が配送先の値の場合true
	 */
	public static boolean isTDLV(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.TDLV.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：有償支給先かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給先の値の場合true
	 */
	public static boolean isONR_PRSPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.ONR_PRSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：有償支給先かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給先の値の場合true
	 */
	public static boolean isONR_PRSPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.ONR_PRSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先（納品先対応）かどうか
	 * @param value 定数値
	 * @return 定数値が得意先（納品先対応）の値の場合true
	 */
	public static boolean isCST_BY_DLV(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.CST_BY_DLV.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先（納品先対応）かどうか
	 * @param type 属性値
	 * @return 属性値が得意先（納品先対応）の値の場合true
	 */
	public static boolean isCST_BY_DLV(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.CST_BY_DLV.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：納品先（得意先対応）かどうか
	 * @param value 定数値
	 * @return 定数値が納品先（得意先対応）の値の場合true
	 */
	public static boolean isDLV_BY_CST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.DLV_BY_CST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：納品先（得意先対応）かどうか
	 * @param type 属性値
	 * @return 属性値が納品先（得意先対応）の値の場合true
	 */
	public static boolean isDLV_BY_CST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.DLV_BY_CST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：請求先（入金先対応）かどうか
	 * @param value 定数値
	 * @return 定数値が請求先（入金先対応）の値の場合true
	 */
	public static boolean isBCST_BY_RCST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.BCST_BY_RCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：請求先（入金先対応）かどうか
	 * @param type 属性値
	 * @return 属性値が請求先（入金先対応）の値の場合true
	 */
	public static boolean isBCST_BY_RCST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.BCST_BY_RCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：納品先のみかどうか
	 * @param value 定数値
	 * @return 定数値が納品先のみの値の場合true
	 */
	public static boolean isDLV_ONLY(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.DLV_ONLY.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：納品先のみかどうか
	 * @param type 属性値
	 * @return 属性値が納品先のみの値の場合true
	 */
	public static boolean isDLV_ONLY(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.DLV_ONLY.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：メーカのみかどうか
	 * @param value 定数値
	 * @return 定数値がメーカのみの値の場合true
	 */
	public static boolean isMAKER_ONLY(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.MAKER_ONLY.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：メーカのみかどうか
	 * @param type 属性値
	 * @return 属性値がメーカのみの値の場合true
	 */
	public static boolean isMAKER_ONLY(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.MAKER_ONLY.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：仕向先のみかどうか
	 * @param value 定数値
	 * @return 定数値が仕向先のみの値の場合true
	 */
	public static boolean isDEST_ONLY(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.DEST_ONLY.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：仕向先のみかどうか
	 * @param type 属性値
	 * @return 属性値が仕向先のみの値の場合true
	 */
	public static boolean isDEST_ONLY(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.DEST_ONLY.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：納品先または発注先かどうか
	 * @param value 定数値
	 * @return 定数値が納品先または発注先の値の場合true
	 */
	public static boolean isDLV_SPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.DLV_SPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：納品先または発注先かどうか
	 * @param type 属性値
	 * @return 属性値が納品先または発注先の値の場合true
	 */
	public static boolean isDLV_SPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.DLV_SPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：購買内示かどうか
	 * @param value 定数値
	 * @return 定数値が購買内示の値の場合true
	 */
	public static boolean isPURC_FRCST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.PURC_FRCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：購買内示かどうか
	 * @param type 属性値
	 * @return 属性値が購買内示の値の場合true
	 */
	public static boolean isPURC_FRCST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.PURC_FRCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：請求先または入金先かどうか
	 * @param value 定数値
	 * @return 定数値が請求先または入金先の値の場合true
	 */
	public static boolean isBCST_RCST(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.BCST_RCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：請求先または入金先かどうか
	 * @param type 属性値
	 * @return 属性値が請求先または入金先の値の場合true
	 */
	public static boolean isBCST_RCST(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.BCST_RCST.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先または納品先または発注先かどうか
	 * @param value 定数値
	 * @return 定数値が得意先または納品先または発注先の値の場合true
	 */
	public static boolean isCST_DLV_SPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.CST_DLV_SPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先または納品先または発注先かどうか
	 * @param type 属性値
	 * @return 属性値が得意先または納品先または発注先の値の場合true
	 */
	public static boolean isCST_DLV_SPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.CST_DLV_SPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：インボイス取引対象外発注先かどうか
	 * @param value 定数値
	 * @return 定数値がインボイス取引対象外発注先の値の場合true
	 */
	public static boolean isNOT_SPPL_IV(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.NOT_SPPL_IV.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：インボイス取引対象外発注先かどうか
	 * @param type 属性値
	 * @return 属性値がインボイス取引対象外発注先の値の場合true
	 */
	public static boolean isNOT_SPPL_IV(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.NOT_SPPL_IV.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：発注先_購買かどうか
	 * @param value 定数値
	 * @return 定数値が発注先_購買の値の場合true
	 */
	public static boolean isSPPL_PURC(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.SPPL_PURC.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：発注先_購買かどうか
	 * @param type 属性値
	 * @return 属性値が発注先_購買の値の場合true
	 */
	public static boolean isSPPL_PURC(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.SPPL_PURC.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：支払予定管理先または支払先かどうか
	 * @param value 定数値
	 * @return 定数値が支払予定管理先または支払先の値の場合true
	 */
	public static boolean isBSPPL_PSPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.BSPPL_PSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：支払予定管理先または支払先かどうか
	 * @param type 属性値
	 * @return 属性値が支払予定管理先または支払先の値の場合true
	 */
	public static boolean isBSPPL_PSPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.BSPPL_PSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：債務相殺先かどうか
	 * @param value 定数値
	 * @return 定数値が債務相殺先の値の場合true
	 */
	public static boolean isAP_SETOFF(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.AP_SETOFF.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：債務相殺先かどうか
	 * @param type 属性値
	 * @return 属性値が債務相殺先の値の場合true
	 */
	public static boolean isAP_SETOFF(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.AP_SETOFF.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先または発注先または請求先または支払予定管理先かどうか
	 * @param value 定数値
	 * @return 定数値が得意先または発注先または請求先または支払予定管理先の値の場合true
	 */
	public static boolean isCST_SPPL_BILL_BSPPL(String value) {
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
		return MAC_BP_IS_SRCH_TYP.CST_SPPL_BILL_BSPPL.isSame(type);
	}

	/**
	 * 取引先入力補助検索区分：得意先または発注先または請求先または支払予定管理先かどうか
	 * @param type 属性値
	 * @return 属性値が得意先または発注先または請求先または支払予定管理先の値の場合true
	 */
	public static boolean isCST_SPPL_BILL_BSPPL(MAC_BP_IS_SRCH_TYP type) {
		return MAC_BP_IS_SRCH_TYP.CST_SPPL_BILL_BSPPL.isSame(type);
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
			MAC_BP_IS_SRCH_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.get(value);
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
			MAC_BP_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
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
			MAC_BP_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.get(value);
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
			MAC_BP_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
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
			MAC_BP_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.get(value);
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
			MAC_BP_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
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
			MAC_BP_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.get(value);
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
			MAC_BP_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_BP_IS_SRCH_TYP type = MAC_BP_IS_SRCH_TYP.getNE(value);
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
