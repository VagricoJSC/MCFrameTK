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
abstract class MAC_IF_COL_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "IF_COL_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_IF_COL_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "if_col_typ";

	public static final String $NAME = "if_col_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** ＩＦ項目区分：部門
	 */
	public static final MAC_IF_COL_TYP DPT = create("DPT", "DPT");

	/** ＩＦ項目区分：取引先
	 */
	public static final MAC_IF_COL_TYP BP = create("BP", "BP");

	/** ＩＦ項目区分：品目
	 */
	public static final MAC_IF_COL_TYP ITM = create("ITM", "ITM");

	/** ＩＦ項目区分：単位
	 */
	public static final MAC_IF_COL_TYP UNIT = create("UNIT", "UNIT");

	/** ＩＦ項目区分：国
	 */
	public static final MAC_IF_COL_TYP CNTRY = create("CNTRY", "CNTRY");

	/** ＩＦ項目区分：通貨
	 */
	public static final MAC_IF_COL_TYP CUR = create("CUR", "CUR");

	/** ＩＦ項目区分：税
	 */
	public static final MAC_IF_COL_TYP TAX = create("TAX", "TAX");

	/** ＩＦ項目区分：担当者
	 */
	public static final MAC_IF_COL_TYP USR = create("USR", "USR");

	/** ＩＦ項目区分：会社
	 */
	public static final MAC_IF_COL_TYP CO = create("CO", "CO");

	/** ＩＦ項目区分：工場・物流倉庫
	 */
	public static final MAC_IF_COL_TYP SITE = create("SITE", "SITE");

	/** ＩＦ項目区分：業務理由
	 */
	public static final MAC_IF_COL_TYP BIZ_RSN = create("BIZ_RSN", "BIZ_RSN");

	/** ＩＦ項目区分：取引条件１
	 */
	public static final MAC_IF_COL_TYP TTERM1 = create("TTERM1", "TTERM1");

	/** ＩＦ項目区分：取引条件２
	 */
	public static final MAC_IF_COL_TYP TTERM2 = create("TTERM2", "TTERM2");

	/** ＩＦ項目区分：取引条件３
	 */
	public static final MAC_IF_COL_TYP TTERM3 = create("TTERM3", "TTERM3");

	/** ＩＦ項目区分：港
	 */
	public static final MAC_IF_COL_TYP PORT = create("PORT", "PORT");

	/** ＩＦ項目区分：輸送方法
	 */
	public static final MAC_IF_COL_TYP TRNSPT = create("TRNSPT", "TRNSPT");

	/** ＩＦ項目区分：案件ＮＯ
	 */
	public static final MAC_IF_COL_TYP WRK_NO = create("WRK_NO", "WRK_NO");

	/** ＩＦ項目区分：物流グループ
	 */
	public static final MAC_IF_COL_TYP LG_GRP = create("LG_GRP", "LG_GRP");

	/** ＩＦ項目区分：出荷作業
	 */
	public static final MAC_IF_COL_TYP SHIP_WK = create("SHIP_WK", "SHIP_WK");

	/** ＩＦ項目区分：出荷条件
	 */
	public static final MAC_IF_COL_TYP SHIP_TERM = create("SHIP_TERM", "SHIP_TERM");

	/** ＩＦ項目区分：送付先識別
	 */
	public static final MAC_IF_COL_TYP SHIP_TO_ID = create("SHIP_TO_ID", "SHIP_TO_ID");

	/** ＩＦ項目区分：棚・ライン
	 */
	public static final MAC_IF_COL_TYP STR_LN = create("STR_LN", "STR_LN");

	/** ＩＦ項目区分：格付
	 */
	public static final MAC_IF_COL_TYP GD = create("GD", "GD");

	/** ＩＦ項目区分：取引
	 */
	public static final MAC_IF_COL_TYP TRD = create("TRD", "TRD");

	/** ＩＦ項目区分：工程
	 */
	public static final MAC_IF_COL_TYP OPER = create("OPER", "OPER");

	/** ＩＦ項目区分：工数管理
	 */
	public static final MAC_IF_COL_TYP WK_COST = create("WK_COST", "WK_COST");

	/** ＩＦ項目区分：工数理由
	 */
	public static final MAC_IF_COL_TYP WK_RSN = create("WK_RSN", "WK_RSN");

	/** ＩＦ項目区分：勤務種類
	 */
	public static final MAC_IF_COL_TYP WK_DAY = create("WK_DAY", "WK_DAY");

	/** ＩＦ項目区分：ワーキンググループ
	 */
	public static final MAC_IF_COL_TYP WG = create("WG", "WG");

	/** ＩＦ項目区分：代替グループ
	 */
	public static final MAC_IF_COL_TYP ALT_GRP = create("ALT_GRP", "ALT_GRP");

	/** ＩＦ項目区分：倉庫事業者
	 */
	public static final MAC_IF_COL_TYP SITE_CO = create("SITE_CO", "SITE_CO");

	/** ＩＦ項目区分：品群
	 */
	public static final MAC_IF_COL_TYP CTG = create("CTG", "CTG");

	/** ＩＦ項目区分：入金方法
	 */
	public static final MAC_IF_COL_TYP RCV_MTD = create("RCV_MTD", "RCV_MTD");

	/** ＩＦ項目区分：銀行
	 */
	public static final MAC_IF_COL_TYP BANK = create("BANK", "BANK");

	/** ＩＦ項目区分：口座
	 */
	public static final MAC_IF_COL_TYP BANK_AC = create("BANK_AC", "BANK_AC");

	/** ＩＦ項目区分：手形理由
	 */
	public static final MAC_IF_COL_TYP NOTE_RSN = create("NOTE_RSN", "NOTE_RSN");

	/** ＩＦ項目区分：支店
	 */
	public static final MAC_IF_COL_TYP BRANCH = create("BRANCH", "BRANCH");

	/** ＩＦ項目区分：注文書表示
	 */
	public static final MAC_IF_COL_TYP PO_PRINT = create("PO_PRINT", "PO_PRINT");

	/** ＩＦ項目区分：訂正理由
	 */
	public static final MAC_IF_COL_TYP CRCT_RSN = create("CRCT_RSN", "CRCT_RSN");

	/** ＩＦ項目区分：勘定科目
	 */
	public static final MAC_IF_COL_TYP AC = create("AC", "AC");

	/** ＩＦ項目区分：補助勘定科目
	 */
	public static final MAC_IF_COL_TYP SUB_AC = create("SUB_AC", "SUB_AC");

	/** ＩＦ項目区分：集計０
	 */
	public static final MAC_IF_COL_TYP SUM0 = create("SUM0", "SUM0");

	/** ＩＦ項目区分：集計１
	 */
	public static final MAC_IF_COL_TYP SUM1 = create("SUM1", "SUM1");

	/** ＩＦ項目区分：集計２
	 */
	public static final MAC_IF_COL_TYP SUM2 = create("SUM2", "SUM2");

	/** ＩＦ項目区分：集計３
	 */
	public static final MAC_IF_COL_TYP SUM3 = create("SUM3", "SUM3");

	/** ＩＦ項目区分：集計４
	 */
	public static final MAC_IF_COL_TYP SUM4 = create("SUM4", "SUM4");

	/** ＩＦ項目区分：集計５
	 */
	public static final MAC_IF_COL_TYP SUM5 = create("SUM5", "SUM5");

	/** ＩＦ項目区分：プロジェクト
	 */
	public static final MAC_IF_COL_TYP PROJ = create("PROJ", "PROJ");

	/** ＩＦ項目区分：決済方法
	 */
	public static final MAC_IF_COL_TYP STTL_MTD = create("STTL_MTD", "STTL_MTD");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IF_COL_TYP create() {
		return new MAC_IF_COL_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_IF_COL_TYP get(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		if (type == null) {
			throw MAC_IF_COL_TYP.invalidValue(value);
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
	public static MAC_IF_COL_TYP getNE(String value) {
		for (MAC_IF_COL_TYP me : MAC_IF_COL_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IF_COL_TYP create(String value, String xmlKey) {
		MAC_IF_COL_TYP me = MAC_IF_COL_TYP.create();
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
		MAC_IF_COL_TYP me = MAC_IF_COL_TYP.getNE(value);
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
		MAC_IF_COL_TYP me = MAC_IF_COL_TYP.getNE(value);
		if (me == null) {
			throw MAC_IF_COL_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_IF_COL_TYP me = MAC_IF_COL_TYP.getNE(value);
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
	public static MAC_IF_COL_TYP[] array() {
		if (array == null) {
			array = new MAC_IF_COL_TYP[] {
					MAC_IF_COL_TYP.DPT, MAC_IF_COL_TYP.BP, MAC_IF_COL_TYP.ITM, MAC_IF_COL_TYP.UNIT, MAC_IF_COL_TYP.CNTRY, 
					 MAC_IF_COL_TYP.CUR, MAC_IF_COL_TYP.TAX, MAC_IF_COL_TYP.USR, MAC_IF_COL_TYP.CO, MAC_IF_COL_TYP.SITE, MAC_IF_COL_TYP.BIZ_RSN, 
					 MAC_IF_COL_TYP.TTERM1, MAC_IF_COL_TYP.TTERM2, MAC_IF_COL_TYP.TTERM3, MAC_IF_COL_TYP.PORT, MAC_IF_COL_TYP.TRNSPT, MAC_IF_COL_TYP.WRK_NO, 
					 MAC_IF_COL_TYP.LG_GRP, MAC_IF_COL_TYP.SHIP_WK, MAC_IF_COL_TYP.SHIP_TERM, MAC_IF_COL_TYP.SHIP_TO_ID, MAC_IF_COL_TYP.STR_LN, MAC_IF_COL_TYP.GD, 
					 MAC_IF_COL_TYP.TRD, MAC_IF_COL_TYP.OPER, MAC_IF_COL_TYP.WK_COST, MAC_IF_COL_TYP.WK_RSN, MAC_IF_COL_TYP.WK_DAY, MAC_IF_COL_TYP.WG, 
					 MAC_IF_COL_TYP.ALT_GRP, MAC_IF_COL_TYP.SITE_CO, MAC_IF_COL_TYP.CTG, MAC_IF_COL_TYP.RCV_MTD, MAC_IF_COL_TYP.BANK, MAC_IF_COL_TYP.BANK_AC, 
					 MAC_IF_COL_TYP.NOTE_RSN, MAC_IF_COL_TYP.BRANCH, MAC_IF_COL_TYP.PO_PRINT, MAC_IF_COL_TYP.CRCT_RSN, MAC_IF_COL_TYP.AC, MAC_IF_COL_TYP.SUB_AC, 
					 MAC_IF_COL_TYP.SUM0, MAC_IF_COL_TYP.SUM1, MAC_IF_COL_TYP.SUM2, MAC_IF_COL_TYP.SUM3, MAC_IF_COL_TYP.SUM4, MAC_IF_COL_TYP.SUM5, 
					 MAC_IF_COL_TYP.PROJ, MAC_IF_COL_TYP.STTL_MTD
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
		for (MAC_IF_COL_TYP me : MAC_IF_COL_TYP.array()) {
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
		for (MAC_IF_COL_TYP me : MAC_IF_COL_TYP.array()) {
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
		for (MAC_IF_COL_TYP me : MAC_IF_COL_TYP.array()) {
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
			if(MAC_IF_COL_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_IF_COL_TYP me = MAC_IF_COL_TYP.get(MAC_IF_COL_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_IF_COL_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_IF_COL_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_IF_COL_TYP.list();
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
		for (MAC_IF_COL_TYP me : MAC_IF_COL_TYP.array()) {
			if(MAC_IF_COL_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_IF_COL_TYP.subList(cols, vals);
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
		for (MAC_IF_COL_TYP me : MAC_IF_COL_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_IF_COL_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_IF_COL_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_IF_COL_TYP", col);}
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
	protected boolean isSame(MAC_IF_COL_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * ＩＦ項目区分：部門かどうか
	 * @param value 定数値
	 * @return 定数値が部門の値の場合true
	 */
	public static boolean isDPT(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.DPT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：部門かどうか
	 * @param type 属性値
	 * @return 属性値が部門の値の場合true
	 */
	public static boolean isDPT(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.DPT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引先かどうか
	 * @param value 定数値
	 * @return 定数値が取引先の値の場合true
	 */
	public static boolean isBP(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.BP.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引先かどうか
	 * @param type 属性値
	 * @return 属性値が取引先の値の場合true
	 */
	public static boolean isBP(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.BP.isSame(type);
	}

	/**
	 * ＩＦ項目区分：品目かどうか
	 * @param value 定数値
	 * @return 定数値が品目の値の場合true
	 */
	public static boolean isITM(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.ITM.isSame(type);
	}

	/**
	 * ＩＦ項目区分：品目かどうか
	 * @param type 属性値
	 * @return 属性値が品目の値の場合true
	 */
	public static boolean isITM(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.ITM.isSame(type);
	}

	/**
	 * ＩＦ項目区分：単位かどうか
	 * @param value 定数値
	 * @return 定数値が単位の値の場合true
	 */
	public static boolean isUNIT(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.UNIT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：単位かどうか
	 * @param type 属性値
	 * @return 属性値が単位の値の場合true
	 */
	public static boolean isUNIT(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.UNIT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：国かどうか
	 * @param value 定数値
	 * @return 定数値が国の値の場合true
	 */
	public static boolean isCNTRY(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.CNTRY.isSame(type);
	}

	/**
	 * ＩＦ項目区分：国かどうか
	 * @param type 属性値
	 * @return 属性値が国の値の場合true
	 */
	public static boolean isCNTRY(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.CNTRY.isSame(type);
	}

	/**
	 * ＩＦ項目区分：通貨かどうか
	 * @param value 定数値
	 * @return 定数値が通貨の値の場合true
	 */
	public static boolean isCUR(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.CUR.isSame(type);
	}

	/**
	 * ＩＦ項目区分：通貨かどうか
	 * @param type 属性値
	 * @return 属性値が通貨の値の場合true
	 */
	public static boolean isCUR(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.CUR.isSame(type);
	}

	/**
	 * ＩＦ項目区分：税かどうか
	 * @param value 定数値
	 * @return 定数値が税の値の場合true
	 */
	public static boolean isTAX(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.TAX.isSame(type);
	}

	/**
	 * ＩＦ項目区分：税かどうか
	 * @param type 属性値
	 * @return 属性値が税の値の場合true
	 */
	public static boolean isTAX(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.TAX.isSame(type);
	}

	/**
	 * ＩＦ項目区分：担当者かどうか
	 * @param value 定数値
	 * @return 定数値が担当者の値の場合true
	 */
	public static boolean isUSR(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.USR.isSame(type);
	}

	/**
	 * ＩＦ項目区分：担当者かどうか
	 * @param type 属性値
	 * @return 属性値が担当者の値の場合true
	 */
	public static boolean isUSR(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.USR.isSame(type);
	}

	/**
	 * ＩＦ項目区分：会社かどうか
	 * @param value 定数値
	 * @return 定数値が会社の値の場合true
	 */
	public static boolean isCO(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.CO.isSame(type);
	}

	/**
	 * ＩＦ項目区分：会社かどうか
	 * @param type 属性値
	 * @return 属性値が会社の値の場合true
	 */
	public static boolean isCO(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.CO.isSame(type);
	}

	/**
	 * ＩＦ項目区分：工場・物流倉庫かどうか
	 * @param value 定数値
	 * @return 定数値が工場・物流倉庫の値の場合true
	 */
	public static boolean isSITE(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SITE.isSame(type);
	}

	/**
	 * ＩＦ項目区分：工場・物流倉庫かどうか
	 * @param type 属性値
	 * @return 属性値が工場・物流倉庫の値の場合true
	 */
	public static boolean isSITE(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SITE.isSame(type);
	}

	/**
	 * ＩＦ項目区分：業務理由かどうか
	 * @param value 定数値
	 * @return 定数値が業務理由の値の場合true
	 */
	public static boolean isBIZ_RSN(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.BIZ_RSN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：業務理由かどうか
	 * @param type 属性値
	 * @return 属性値が業務理由の値の場合true
	 */
	public static boolean isBIZ_RSN(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.BIZ_RSN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引条件１かどうか
	 * @param value 定数値
	 * @return 定数値が取引条件１の値の場合true
	 */
	public static boolean isTTERM1(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.TTERM1.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引条件１かどうか
	 * @param type 属性値
	 * @return 属性値が取引条件１の値の場合true
	 */
	public static boolean isTTERM1(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.TTERM1.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引条件２かどうか
	 * @param value 定数値
	 * @return 定数値が取引条件２の値の場合true
	 */
	public static boolean isTTERM2(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.TTERM2.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引条件２かどうか
	 * @param type 属性値
	 * @return 属性値が取引条件２の値の場合true
	 */
	public static boolean isTTERM2(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.TTERM2.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引条件３かどうか
	 * @param value 定数値
	 * @return 定数値が取引条件３の値の場合true
	 */
	public static boolean isTTERM3(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.TTERM3.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引条件３かどうか
	 * @param type 属性値
	 * @return 属性値が取引条件３の値の場合true
	 */
	public static boolean isTTERM3(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.TTERM3.isSame(type);
	}

	/**
	 * ＩＦ項目区分：港かどうか
	 * @param value 定数値
	 * @return 定数値が港の値の場合true
	 */
	public static boolean isPORT(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.PORT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：港かどうか
	 * @param type 属性値
	 * @return 属性値が港の値の場合true
	 */
	public static boolean isPORT(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.PORT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：輸送方法かどうか
	 * @param value 定数値
	 * @return 定数値が輸送方法の値の場合true
	 */
	public static boolean isTRNSPT(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.TRNSPT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：輸送方法かどうか
	 * @param type 属性値
	 * @return 属性値が輸送方法の値の場合true
	 */
	public static boolean isTRNSPT(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.TRNSPT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：案件ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が案件ＮＯの値の場合true
	 */
	public static boolean isWRK_NO(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.WRK_NO.isSame(type);
	}

	/**
	 * ＩＦ項目区分：案件ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が案件ＮＯの値の場合true
	 */
	public static boolean isWRK_NO(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.WRK_NO.isSame(type);
	}

	/**
	 * ＩＦ項目区分：物流グループかどうか
	 * @param value 定数値
	 * @return 定数値が物流グループの値の場合true
	 */
	public static boolean isLG_GRP(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.LG_GRP.isSame(type);
	}

	/**
	 * ＩＦ項目区分：物流グループかどうか
	 * @param type 属性値
	 * @return 属性値が物流グループの値の場合true
	 */
	public static boolean isLG_GRP(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.LG_GRP.isSame(type);
	}

	/**
	 * ＩＦ項目区分：出荷作業かどうか
	 * @param value 定数値
	 * @return 定数値が出荷作業の値の場合true
	 */
	public static boolean isSHIP_WK(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SHIP_WK.isSame(type);
	}

	/**
	 * ＩＦ項目区分：出荷作業かどうか
	 * @param type 属性値
	 * @return 属性値が出荷作業の値の場合true
	 */
	public static boolean isSHIP_WK(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SHIP_WK.isSame(type);
	}

	/**
	 * ＩＦ項目区分：出荷条件かどうか
	 * @param value 定数値
	 * @return 定数値が出荷条件の値の場合true
	 */
	public static boolean isSHIP_TERM(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SHIP_TERM.isSame(type);
	}

	/**
	 * ＩＦ項目区分：出荷条件かどうか
	 * @param type 属性値
	 * @return 属性値が出荷条件の値の場合true
	 */
	public static boolean isSHIP_TERM(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SHIP_TERM.isSame(type);
	}

	/**
	 * ＩＦ項目区分：送付先識別かどうか
	 * @param value 定数値
	 * @return 定数値が送付先識別の値の場合true
	 */
	public static boolean isSHIP_TO_ID(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SHIP_TO_ID.isSame(type);
	}

	/**
	 * ＩＦ項目区分：送付先識別かどうか
	 * @param type 属性値
	 * @return 属性値が送付先識別の値の場合true
	 */
	public static boolean isSHIP_TO_ID(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SHIP_TO_ID.isSame(type);
	}

	/**
	 * ＩＦ項目区分：棚・ラインかどうか
	 * @param value 定数値
	 * @return 定数値が棚・ラインの値の場合true
	 */
	public static boolean isSTR_LN(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.STR_LN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：棚・ラインかどうか
	 * @param type 属性値
	 * @return 属性値が棚・ラインの値の場合true
	 */
	public static boolean isSTR_LN(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.STR_LN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：格付かどうか
	 * @param value 定数値
	 * @return 定数値が格付の値の場合true
	 */
	public static boolean isGD(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.GD.isSame(type);
	}

	/**
	 * ＩＦ項目区分：格付かどうか
	 * @param type 属性値
	 * @return 属性値が格付の値の場合true
	 */
	public static boolean isGD(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.GD.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引かどうか
	 * @param value 定数値
	 * @return 定数値が取引の値の場合true
	 */
	public static boolean isTRD(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.TRD.isSame(type);
	}

	/**
	 * ＩＦ項目区分：取引かどうか
	 * @param type 属性値
	 * @return 属性値が取引の値の場合true
	 */
	public static boolean isTRD(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.TRD.isSame(type);
	}

	/**
	 * ＩＦ項目区分：工程かどうか
	 * @param value 定数値
	 * @return 定数値が工程の値の場合true
	 */
	public static boolean isOPER(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.OPER.isSame(type);
	}

	/**
	 * ＩＦ項目区分：工程かどうか
	 * @param type 属性値
	 * @return 属性値が工程の値の場合true
	 */
	public static boolean isOPER(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.OPER.isSame(type);
	}

	/**
	 * ＩＦ項目区分：工数管理かどうか
	 * @param value 定数値
	 * @return 定数値が工数管理の値の場合true
	 */
	public static boolean isWK_COST(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.WK_COST.isSame(type);
	}

	/**
	 * ＩＦ項目区分：工数管理かどうか
	 * @param type 属性値
	 * @return 属性値が工数管理の値の場合true
	 */
	public static boolean isWK_COST(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.WK_COST.isSame(type);
	}

	/**
	 * ＩＦ項目区分：工数理由かどうか
	 * @param value 定数値
	 * @return 定数値が工数理由の値の場合true
	 */
	public static boolean isWK_RSN(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.WK_RSN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：工数理由かどうか
	 * @param type 属性値
	 * @return 属性値が工数理由の値の場合true
	 */
	public static boolean isWK_RSN(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.WK_RSN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：勤務種類かどうか
	 * @param value 定数値
	 * @return 定数値が勤務種類の値の場合true
	 */
	public static boolean isWK_DAY(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.WK_DAY.isSame(type);
	}

	/**
	 * ＩＦ項目区分：勤務種類かどうか
	 * @param type 属性値
	 * @return 属性値が勤務種類の値の場合true
	 */
	public static boolean isWK_DAY(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.WK_DAY.isSame(type);
	}

	/**
	 * ＩＦ項目区分：ワーキンググループかどうか
	 * @param value 定数値
	 * @return 定数値がワーキンググループの値の場合true
	 */
	public static boolean isWG(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.WG.isSame(type);
	}

	/**
	 * ＩＦ項目区分：ワーキンググループかどうか
	 * @param type 属性値
	 * @return 属性値がワーキンググループの値の場合true
	 */
	public static boolean isWG(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.WG.isSame(type);
	}

	/**
	 * ＩＦ項目区分：代替グループかどうか
	 * @param value 定数値
	 * @return 定数値が代替グループの値の場合true
	 */
	public static boolean isALT_GRP(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.ALT_GRP.isSame(type);
	}

	/**
	 * ＩＦ項目区分：代替グループかどうか
	 * @param type 属性値
	 * @return 属性値が代替グループの値の場合true
	 */
	public static boolean isALT_GRP(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.ALT_GRP.isSame(type);
	}

	/**
	 * ＩＦ項目区分：倉庫事業者かどうか
	 * @param value 定数値
	 * @return 定数値が倉庫事業者の値の場合true
	 */
	public static boolean isSITE_CO(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SITE_CO.isSame(type);
	}

	/**
	 * ＩＦ項目区分：倉庫事業者かどうか
	 * @param type 属性値
	 * @return 属性値が倉庫事業者の値の場合true
	 */
	public static boolean isSITE_CO(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SITE_CO.isSame(type);
	}

	/**
	 * ＩＦ項目区分：品群かどうか
	 * @param value 定数値
	 * @return 定数値が品群の値の場合true
	 */
	public static boolean isCTG(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.CTG.isSame(type);
	}

	/**
	 * ＩＦ項目区分：品群かどうか
	 * @param type 属性値
	 * @return 属性値が品群の値の場合true
	 */
	public static boolean isCTG(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.CTG.isSame(type);
	}

	/**
	 * ＩＦ項目区分：入金方法かどうか
	 * @param value 定数値
	 * @return 定数値が入金方法の値の場合true
	 */
	public static boolean isRCV_MTD(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.RCV_MTD.isSame(type);
	}

	/**
	 * ＩＦ項目区分：入金方法かどうか
	 * @param type 属性値
	 * @return 属性値が入金方法の値の場合true
	 */
	public static boolean isRCV_MTD(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.RCV_MTD.isSame(type);
	}

	/**
	 * ＩＦ項目区分：銀行かどうか
	 * @param value 定数値
	 * @return 定数値が銀行の値の場合true
	 */
	public static boolean isBANK(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.BANK.isSame(type);
	}

	/**
	 * ＩＦ項目区分：銀行かどうか
	 * @param type 属性値
	 * @return 属性値が銀行の値の場合true
	 */
	public static boolean isBANK(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.BANK.isSame(type);
	}

	/**
	 * ＩＦ項目区分：口座かどうか
	 * @param value 定数値
	 * @return 定数値が口座の値の場合true
	 */
	public static boolean isBANK_AC(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.BANK_AC.isSame(type);
	}

	/**
	 * ＩＦ項目区分：口座かどうか
	 * @param type 属性値
	 * @return 属性値が口座の値の場合true
	 */
	public static boolean isBANK_AC(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.BANK_AC.isSame(type);
	}

	/**
	 * ＩＦ項目区分：手形理由かどうか
	 * @param value 定数値
	 * @return 定数値が手形理由の値の場合true
	 */
	public static boolean isNOTE_RSN(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.NOTE_RSN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：手形理由かどうか
	 * @param type 属性値
	 * @return 属性値が手形理由の値の場合true
	 */
	public static boolean isNOTE_RSN(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.NOTE_RSN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：支店かどうか
	 * @param value 定数値
	 * @return 定数値が支店の値の場合true
	 */
	public static boolean isBRANCH(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.BRANCH.isSame(type);
	}

	/**
	 * ＩＦ項目区分：支店かどうか
	 * @param type 属性値
	 * @return 属性値が支店の値の場合true
	 */
	public static boolean isBRANCH(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.BRANCH.isSame(type);
	}

	/**
	 * ＩＦ項目区分：注文書表示かどうか
	 * @param value 定数値
	 * @return 定数値が注文書表示の値の場合true
	 */
	public static boolean isPO_PRINT(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.PO_PRINT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：注文書表示かどうか
	 * @param type 属性値
	 * @return 属性値が注文書表示の値の場合true
	 */
	public static boolean isPO_PRINT(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.PO_PRINT.isSame(type);
	}

	/**
	 * ＩＦ項目区分：訂正理由かどうか
	 * @param value 定数値
	 * @return 定数値が訂正理由の値の場合true
	 */
	public static boolean isCRCT_RSN(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.CRCT_RSN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：訂正理由かどうか
	 * @param type 属性値
	 * @return 属性値が訂正理由の値の場合true
	 */
	public static boolean isCRCT_RSN(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.CRCT_RSN.isSame(type);
	}

	/**
	 * ＩＦ項目区分：勘定科目かどうか
	 * @param value 定数値
	 * @return 定数値が勘定科目の値の場合true
	 */
	public static boolean isAC(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.AC.isSame(type);
	}

	/**
	 * ＩＦ項目区分：勘定科目かどうか
	 * @param type 属性値
	 * @return 属性値が勘定科目の値の場合true
	 */
	public static boolean isAC(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.AC.isSame(type);
	}

	/**
	 * ＩＦ項目区分：補助勘定科目かどうか
	 * @param value 定数値
	 * @return 定数値が補助勘定科目の値の場合true
	 */
	public static boolean isSUB_AC(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SUB_AC.isSame(type);
	}

	/**
	 * ＩＦ項目区分：補助勘定科目かどうか
	 * @param type 属性値
	 * @return 属性値が補助勘定科目の値の場合true
	 */
	public static boolean isSUB_AC(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SUB_AC.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計０かどうか
	 * @param value 定数値
	 * @return 定数値が集計０の値の場合true
	 */
	public static boolean isSUM0(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SUM0.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計０かどうか
	 * @param type 属性値
	 * @return 属性値が集計０の値の場合true
	 */
	public static boolean isSUM0(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SUM0.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計１かどうか
	 * @param value 定数値
	 * @return 定数値が集計１の値の場合true
	 */
	public static boolean isSUM1(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SUM1.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計１かどうか
	 * @param type 属性値
	 * @return 属性値が集計１の値の場合true
	 */
	public static boolean isSUM1(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SUM1.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計２かどうか
	 * @param value 定数値
	 * @return 定数値が集計２の値の場合true
	 */
	public static boolean isSUM2(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SUM2.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計２かどうか
	 * @param type 属性値
	 * @return 属性値が集計２の値の場合true
	 */
	public static boolean isSUM2(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SUM2.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計３かどうか
	 * @param value 定数値
	 * @return 定数値が集計３の値の場合true
	 */
	public static boolean isSUM3(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SUM3.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計３かどうか
	 * @param type 属性値
	 * @return 属性値が集計３の値の場合true
	 */
	public static boolean isSUM3(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SUM3.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計４かどうか
	 * @param value 定数値
	 * @return 定数値が集計４の値の場合true
	 */
	public static boolean isSUM4(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SUM4.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計４かどうか
	 * @param type 属性値
	 * @return 属性値が集計４の値の場合true
	 */
	public static boolean isSUM4(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SUM4.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計５かどうか
	 * @param value 定数値
	 * @return 定数値が集計５の値の場合true
	 */
	public static boolean isSUM5(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.SUM5.isSame(type);
	}

	/**
	 * ＩＦ項目区分：集計５かどうか
	 * @param type 属性値
	 * @return 属性値が集計５の値の場合true
	 */
	public static boolean isSUM5(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.SUM5.isSame(type);
	}

	/**
	 * ＩＦ項目区分：プロジェクトかどうか
	 * @param value 定数値
	 * @return 定数値がプロジェクトの値の場合true
	 */
	public static boolean isPROJ(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.PROJ.isSame(type);
	}

	/**
	 * ＩＦ項目区分：プロジェクトかどうか
	 * @param type 属性値
	 * @return 属性値がプロジェクトの値の場合true
	 */
	public static boolean isPROJ(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.PROJ.isSame(type);
	}

	/**
	 * ＩＦ項目区分：決済方法かどうか
	 * @param value 定数値
	 * @return 定数値が決済方法の値の場合true
	 */
	public static boolean isSTTL_MTD(String value) {
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
		return MAC_IF_COL_TYP.STTL_MTD.isSame(type);
	}

	/**
	 * ＩＦ項目区分：決済方法かどうか
	 * @param type 属性値
	 * @return 属性値が決済方法の値の場合true
	 */
	public static boolean isSTTL_MTD(MAC_IF_COL_TYP type) {
		return MAC_IF_COL_TYP.STTL_MTD.isSame(type);
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
			MAC_IF_COL_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.get(value);
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
			MAC_IF_COL_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
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
			MAC_IF_COL_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.get(value);
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
			MAC_IF_COL_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
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
			MAC_IF_COL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.get(value);
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
			MAC_IF_COL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
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
			MAC_IF_COL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.get(value);
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
			MAC_IF_COL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_IF_COL_TYP type = MAC_IF_COL_TYP.getNE(value);
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
