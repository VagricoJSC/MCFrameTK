package mcframe.serverMAUC.MAUCL5010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"PushNtc_Upd01_Wk2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PushNtc_Upd01_Wk2R_MC_A extends MCConstRow {

	/**
	 * Push notifications No. プッシュ通知ＮＯ.<p>
	 *
	 */
	public static final String $push_ntc_no = "push_ntc_no";
	/**
	 * Column sequence カラム順序.<p>
	 *
	 */
	public static final String $column_seq = "column_seq";
	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public static final String $client_typ = "client_typ";
	/**
	 * Column path カラムパス.<p>
	 *
	 */
	public static final String $column_path = "column_path";


	public static final MCMeta push_ntc_no_META = createCommonMeta($push_ntc_no, mcframe.commonMA.meta.MA_META.PUSH_NTC_NO);
	public static final MCMeta column_seq_META = createCommonMeta($column_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta client_typ_META = createCommonMeta($client_typ, mcframe.commonMA.meta.MA_META.CLIENT_TYP);
	public static final MCMeta column_path_META = createCommonMeta($column_path, mcframe.commonMA.meta.MA_META.IC_STR);

	protected static final ConstMetaList<PushNtc_Upd01_Wk2R> constMetas = new ConstMetaList<PushNtc_Upd01_Wk2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			push_ntc_no_META,
			column_seq_META,
			client_typ_META,
			column_path_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected PushNtc_Upd01_Wk2R_MC_A(ConstMetaList<? extends PushNtc_Upd01_Wk2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Wk2R clone() {
		return (PushNtc_Upd01_Wk2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Wk2R createInstance() {
		return (PushNtc_Upd01_Wk2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Wk2R getValues(String... names) {
		return (PushNtc_Upd01_Wk2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Push notifications No. プッシュ通知ＮＯ.<p>
	 *
	 */
	public String push_ntc_no() {
		return getConstString(offset + 0, $push_ntc_no);
	}

	/**
	 * Push notifications No. プッシュ通知ＮＯ.<p>
	 *
	 */
	public void push_ntc_no(String value) {
		setConstString(offset + 0, $push_ntc_no, value);
	}


	/**
	 * Column sequence カラム順序.<p>
	 *
	 */
	public MCNumber column_seq() {
		return getConstNumber(offset + 1, $column_seq);
	}

	/**
	 * Column sequence カラム順序.<p>
	 *
	 */
	public void column_seq(MCNumber value) {
		setConstNumber(offset + 1, $column_seq, value);
	}

	/**
	 * Column sequence カラム順序.<p>
	 *
	 */
	public void column_seq(int value) {
		setConstNumber(offset + 1, $column_seq, value);
	}

	/**
	 * Column sequence カラム順序.<p>
	 *
	 */
	public void column_seq(long value) {
		setConstNumber(offset + 1, $column_seq, value);
	}

	/**
	 * Column sequence カラム順序.<p>
	 *
	 */
	public void column_seq(float value) {
		setConstNumber(offset + 1, $column_seq, value);
	}

	/**
	 * Column sequence カラム順序.<p>
	 *
	 */
	public void column_seq(double value) {
		setConstNumber(offset + 1, $column_seq, value);
	}


	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public String client_typ() {
		return getConstString(offset + 2, $client_typ);
	}

	/**
	 * Client type クライアント区分.<p>
	 *
	 */
	public void client_typ(String value) {
		setConstString(offset + 2, $client_typ, value);
	}


	/**
	 * Column path カラムパス.<p>
	 *
	 */
	public String column_path() {
		return getConstString(offset + 3, $column_path);
	}

	/**
	 * Column path カラムパス.<p>
	 *
	 */
	public void column_path(String value) {
		setConstString(offset + 3, $column_path, value);
	}


	public String getString(String name) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			return push_ntc_no();
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			return client_typ();
		}
		if ($column_path.equalsIgnoreCase(name)) {
			return column_path();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($column_seq.equalsIgnoreCase(name)) {
			return column_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			return push_ntc_no();
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			return client_typ();
		}
		if ($column_path.equalsIgnoreCase(name)) {
			return column_path();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($column_seq.equalsIgnoreCase(name)) {
			return column_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			push_ntc_no(value);
			return;
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			client_typ(value);
			return;
		}
		if ($column_path.equalsIgnoreCase(name)) {
			column_path(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			push_ntc_no(value);
			return;
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			client_typ(value);
			return;
		}
		if ($column_path.equalsIgnoreCase(name)) {
			column_path(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

