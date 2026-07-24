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
abstract class MAC_EXT_MASTER_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "EXT_MASTER_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_EXT_MASTER_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "ext_master_typ";

	public static final String $NAME = "ext_master_typ_nm";

	public static final String $IS_RECV = "is_recv";

	/*
	 * 定数の定義です。
	 */
	/** 外部マスタ連携区分：得意先
	 */
	public static final MAC_EXT_MASTER_TYP CST_BP = create("001", "CST_BP", false);

	/** 外部マスタ連携区分：納品先
	 */
	public static final MAC_EXT_MASTER_TYP DLV_BP = create("002", "DLV_BP", false);

	/** 外部マスタ連携区分：仕向先
	 */
	public static final MAC_EXT_MASTER_TYP DEST_BP = create("003", "DEST_BP", false);

	/** 外部マスタ連携区分：発注先
	 */
	public static final MAC_EXT_MASTER_TYP SPPL_BP = create("004", "SPPL_BP", false);

	/** 外部マスタ連携区分：商品
	 */
	public static final MAC_EXT_MASTER_TYP GOODS_ITM = create("010", "GOODS_ITM", false);

	/** 外部マスタ連携区分：製品
	 */
	public static final MAC_EXT_MASTER_TYP PROD_ITM = create("011", "PROD_ITM", false);

	/** 外部マスタ連携区分：中間品
	 */
	public static final MAC_EXT_MASTER_TYP WIP_ITM = create("012", "WIP_ITM", false);

	/** 外部マスタ連携区分：部品
	 */
	public static final MAC_EXT_MASTER_TYP PARTS_ITM = create("013", "PARTS_ITM", false);

	/** 外部マスタ連携区分：資材
	 */
	public static final MAC_EXT_MASTER_TYP MATE_ITM = create("014", "MATE_ITM", false);

	/** 外部マスタ連携区分：原料
	 */
	public static final MAC_EXT_MASTER_TYP RAWMATE_ITM = create("015", "RAWMATE_ITM", false);

	/** 外部マスタ連携区分：品目（その他）
	 */
	public static final MAC_EXT_MASTER_TYP OTHER_ITM = create("019", "OTHER_ITM", false);

	/** 外部マスタ連携区分：品目禁止
	 */
	public static final MAC_EXT_MASTER_TYP ITM_STOP = create("021", "ITM_STOP", false);

	/** 外部マスタ連携区分：取引先禁止
	 */
	public static final MAC_EXT_MASTER_TYP BP_STOP = create("022", "BP_STOP", false);

	/** 外部マスタ連携区分：輸出規制
	 */
	public static final MAC_EXT_MASTER_TYP EX_CTRL = create("023", "EX_CTRL", false);

	/** 外部マスタ連携区分：購買単価
	 */
	public static final MAC_EXT_MASTER_TYP PURC_UPRI = create("024", "PURC_UPRI", true);

	/** 外部マスタ連携区分：加工単価
	 */
	public static final MAC_EXT_MASTER_TYP PROC_UPRI = create("025", "PROC_UPRI", true);

	/** 外部マスタ連携区分：取引先
	 */
	public static final MAC_EXT_MASTER_TYP BP = create("026", "BP", true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_EXT_MASTER_TYP create() {
		return new MAC_EXT_MASTER_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_EXT_MASTER_TYP get(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		if (type == null) {
			throw MAC_EXT_MASTER_TYP.invalidValue(value);
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
	public static MAC_EXT_MASTER_TYP getNE(String value) {
		for (MAC_EXT_MASTER_TYP me : MAC_EXT_MASTER_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_EXT_MASTER_TYP create(String value, String xmlKey, boolean attr1) {
		MAC_EXT_MASTER_TYP me = MAC_EXT_MASTER_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_RECV, attr1);
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
	 * is_recvの値を返します。
	 * @return is_recvの値
	 */
	public boolean is_recv() {
		return constR.getBooleanNE($IS_RECV);
	}

	/** 
	 * valueに対応する定数のis_recvの値を返します。
	 * @param value 定数値
	 * @return is_recvの値
	 */
	public static boolean is_recv(String value) {
		MAC_EXT_MASTER_TYP me = MAC_EXT_MASTER_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_recv();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_EXT_MASTER_TYP me = MAC_EXT_MASTER_TYP.getNE(value);
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
		MAC_EXT_MASTER_TYP me = MAC_EXT_MASTER_TYP.getNE(value);
		if (me == null) {
			throw MAC_EXT_MASTER_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_EXT_MASTER_TYP me = MAC_EXT_MASTER_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_recv());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_EXT_MASTER_TYP[] array() {
		if (array == null) {
			array = new MAC_EXT_MASTER_TYP[] {
					MAC_EXT_MASTER_TYP.CST_BP, MAC_EXT_MASTER_TYP.DLV_BP, MAC_EXT_MASTER_TYP.DEST_BP, MAC_EXT_MASTER_TYP.SPPL_BP, MAC_EXT_MASTER_TYP.GOODS_ITM, 
					 MAC_EXT_MASTER_TYP.PROD_ITM, MAC_EXT_MASTER_TYP.WIP_ITM, MAC_EXT_MASTER_TYP.PARTS_ITM, MAC_EXT_MASTER_TYP.MATE_ITM, MAC_EXT_MASTER_TYP.RAWMATE_ITM, MAC_EXT_MASTER_TYP.OTHER_ITM, 
					 MAC_EXT_MASTER_TYP.ITM_STOP, MAC_EXT_MASTER_TYP.BP_STOP, MAC_EXT_MASTER_TYP.EX_CTRL, MAC_EXT_MASTER_TYP.PURC_UPRI, MAC_EXT_MASTER_TYP.PROC_UPRI, MAC_EXT_MASTER_TYP.BP
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
		for (MAC_EXT_MASTER_TYP me : MAC_EXT_MASTER_TYP.array()) {
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
		for (MAC_EXT_MASTER_TYP me : MAC_EXT_MASTER_TYP.array()) {
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
		for (MAC_EXT_MASTER_TYP me : MAC_EXT_MASTER_TYP.array()) {
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
			if(MAC_EXT_MASTER_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_EXT_MASTER_TYP me = MAC_EXT_MASTER_TYP.get(MAC_EXT_MASTER_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_EXT_MASTER_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_EXT_MASTER_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_EXT_MASTER_TYP.list();
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
		for (MAC_EXT_MASTER_TYP me : MAC_EXT_MASTER_TYP.array()) {
			if(MAC_EXT_MASTER_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_EXT_MASTER_TYP.subList(cols, vals);
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
		for (MAC_EXT_MASTER_TYP me : MAC_EXT_MASTER_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_EXT_MASTER_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_EXT_MASTER_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_EXT_MASTER_TYP", col);}
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
	protected boolean isSame(MAC_EXT_MASTER_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 外部マスタ連携区分：得意先かどうか
	 * @param value 定数値
	 * @return 定数値が得意先の値の場合true
	 */
	public static boolean isCST_BP(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.CST_BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：得意先かどうか
	 * @param type 属性値
	 * @return 属性値が得意先の値の場合true
	 */
	public static boolean isCST_BP(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.CST_BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：納品先かどうか
	 * @param value 定数値
	 * @return 定数値が納品先の値の場合true
	 */
	public static boolean isDLV_BP(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.DLV_BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：納品先かどうか
	 * @param type 属性値
	 * @return 属性値が納品先の値の場合true
	 */
	public static boolean isDLV_BP(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.DLV_BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：仕向先かどうか
	 * @param value 定数値
	 * @return 定数値が仕向先の値の場合true
	 */
	public static boolean isDEST_BP(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.DEST_BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：仕向先かどうか
	 * @param type 属性値
	 * @return 属性値が仕向先の値の場合true
	 */
	public static boolean isDEST_BP(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.DEST_BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：発注先かどうか
	 * @param value 定数値
	 * @return 定数値が発注先の値の場合true
	 */
	public static boolean isSPPL_BP(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.SPPL_BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：発注先かどうか
	 * @param type 属性値
	 * @return 属性値が発注先の値の場合true
	 */
	public static boolean isSPPL_BP(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.SPPL_BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：商品かどうか
	 * @param value 定数値
	 * @return 定数値が商品の値の場合true
	 */
	public static boolean isGOODS_ITM(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.GOODS_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：商品かどうか
	 * @param type 属性値
	 * @return 属性値が商品の値の場合true
	 */
	public static boolean isGOODS_ITM(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.GOODS_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：製品かどうか
	 * @param value 定数値
	 * @return 定数値が製品の値の場合true
	 */
	public static boolean isPROD_ITM(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.PROD_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：製品かどうか
	 * @param type 属性値
	 * @return 属性値が製品の値の場合true
	 */
	public static boolean isPROD_ITM(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.PROD_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：中間品かどうか
	 * @param value 定数値
	 * @return 定数値が中間品の値の場合true
	 */
	public static boolean isWIP_ITM(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.WIP_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：中間品かどうか
	 * @param type 属性値
	 * @return 属性値が中間品の値の場合true
	 */
	public static boolean isWIP_ITM(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.WIP_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：部品かどうか
	 * @param value 定数値
	 * @return 定数値が部品の値の場合true
	 */
	public static boolean isPARTS_ITM(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.PARTS_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：部品かどうか
	 * @param type 属性値
	 * @return 属性値が部品の値の場合true
	 */
	public static boolean isPARTS_ITM(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.PARTS_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：資材かどうか
	 * @param value 定数値
	 * @return 定数値が資材の値の場合true
	 */
	public static boolean isMATE_ITM(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.MATE_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：資材かどうか
	 * @param type 属性値
	 * @return 属性値が資材の値の場合true
	 */
	public static boolean isMATE_ITM(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.MATE_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：原料かどうか
	 * @param value 定数値
	 * @return 定数値が原料の値の場合true
	 */
	public static boolean isRAWMATE_ITM(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.RAWMATE_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：原料かどうか
	 * @param type 属性値
	 * @return 属性値が原料の値の場合true
	 */
	public static boolean isRAWMATE_ITM(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.RAWMATE_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：品目（その他）かどうか
	 * @param value 定数値
	 * @return 定数値が品目（その他）の値の場合true
	 */
	public static boolean isOTHER_ITM(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.OTHER_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：品目（その他）かどうか
	 * @param type 属性値
	 * @return 属性値が品目（その他）の値の場合true
	 */
	public static boolean isOTHER_ITM(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.OTHER_ITM.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：品目禁止かどうか
	 * @param value 定数値
	 * @return 定数値が品目禁止の値の場合true
	 */
	public static boolean isITM_STOP(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.ITM_STOP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：品目禁止かどうか
	 * @param type 属性値
	 * @return 属性値が品目禁止の値の場合true
	 */
	public static boolean isITM_STOP(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.ITM_STOP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：取引先禁止かどうか
	 * @param value 定数値
	 * @return 定数値が取引先禁止の値の場合true
	 */
	public static boolean isBP_STOP(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.BP_STOP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：取引先禁止かどうか
	 * @param type 属性値
	 * @return 属性値が取引先禁止の値の場合true
	 */
	public static boolean isBP_STOP(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.BP_STOP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：輸出規制かどうか
	 * @param value 定数値
	 * @return 定数値が輸出規制の値の場合true
	 */
	public static boolean isEX_CTRL(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.EX_CTRL.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：輸出規制かどうか
	 * @param type 属性値
	 * @return 属性値が輸出規制の値の場合true
	 */
	public static boolean isEX_CTRL(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.EX_CTRL.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：購買単価かどうか
	 * @param value 定数値
	 * @return 定数値が購買単価の値の場合true
	 */
	public static boolean isPURC_UPRI(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.PURC_UPRI.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：購買単価かどうか
	 * @param type 属性値
	 * @return 属性値が購買単価の値の場合true
	 */
	public static boolean isPURC_UPRI(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.PURC_UPRI.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：加工単価かどうか
	 * @param value 定数値
	 * @return 定数値が加工単価の値の場合true
	 */
	public static boolean isPROC_UPRI(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.PROC_UPRI.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：加工単価かどうか
	 * @param type 属性値
	 * @return 属性値が加工単価の値の場合true
	 */
	public static boolean isPROC_UPRI(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.PROC_UPRI.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：取引先かどうか
	 * @param value 定数値
	 * @return 定数値が取引先の値の場合true
	 */
	public static boolean isBP(String value) {
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
		return MAC_EXT_MASTER_TYP.BP.isSame(type);
	}

	/**
	 * 外部マスタ連携区分：取引先かどうか
	 * @param type 属性値
	 * @return 属性値が取引先の値の場合true
	 */
	public static boolean isBP(MAC_EXT_MASTER_TYP type) {
		return MAC_EXT_MASTER_TYP.BP.isSame(type);
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
			MAC_EXT_MASTER_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.get(value);
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
			MAC_EXT_MASTER_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
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
			MAC_EXT_MASTER_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.get(value);
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
			MAC_EXT_MASTER_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
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
			MAC_EXT_MASTER_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.get(value);
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
			MAC_EXT_MASTER_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
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
			MAC_EXT_MASTER_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.get(value);
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
			MAC_EXT_MASTER_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_EXT_MASTER_TYP type = MAC_EXT_MASTER_TYP.getNE(value);
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
