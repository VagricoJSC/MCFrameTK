package mcframe.serverMSLA.MSLAL5020;

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
 * ブロック"PoSendIf_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoSendIf_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Last approval status type 前回承認状況区分.<p>
	 *
	 */
	public static final String $bef_aprv_sts_typ = "bef_aprv_sts_typ";
	/**
	 * Execution service after caller approval 呼出元承認後実行サービス.<p>
	 *
	 */
	public static final String $is_src_aprvaf_srv_flg = "is_src_aprvaf_srv_flg";


	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta bef_aprv_sts_typ_META = createCommonMeta($bef_aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta is_src_aprvaf_srv_flg_META = createCommonMeta($is_src_aprvaf_srv_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PoSendIf_Upd01_DtlR> constMetas = new ConstMetaList<PoSendIf_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			po_no_META,
			data_crud_typ_META,
			bef_aprv_sts_typ_META,
			is_src_aprvaf_srv_flg_META
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
	protected PoSendIf_Upd01_DtlR_MC_A(ConstMetaList<? extends PoSendIf_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSendIf_Upd01_DtlR clone() {
		return (PoSendIf_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSendIf_Upd01_DtlR createInstance() {
		return (PoSendIf_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSendIf_Upd01_DtlR getValues(String... names) {
		return (PoSendIf_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 0, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 0, $po_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Last approval status type 前回承認状況区分.<p>
	 *
	 */
	public String bef_aprv_sts_typ() {
		return getConstString(offset + 2, $bef_aprv_sts_typ);
	}

	/**
	 * Last approval status type 前回承認状況区分.<p>
	 *
	 */
	public void bef_aprv_sts_typ(String value) {
		setConstString(offset + 2, $bef_aprv_sts_typ, value);
	}


	/**
	 * Execution service after caller approval 呼出元承認後実行サービス.<p>
	 *
	 */
	public boolean is_src_aprvaf_srv_flg() {
		return getConstBoolean(offset + 3, $is_src_aprvaf_srv_flg);
	}

	/**
	 * Execution service after caller approval 呼出元承認後実行サービス.<p>
	 *
	 */
	public void is_src_aprvaf_srv_flg(boolean value) {
		setConstBoolean(offset + 3, $is_src_aprvaf_srv_flg, value);
	}


	public String getString(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($bef_aprv_sts_typ.equalsIgnoreCase(name)) {
			return bef_aprv_sts_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($is_src_aprvaf_srv_flg.equalsIgnoreCase(name)) {
			return is_src_aprvaf_srv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($bef_aprv_sts_typ.equalsIgnoreCase(name)) {
			return bef_aprv_sts_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($is_src_aprvaf_srv_flg.equalsIgnoreCase(name)) {
			return is_src_aprvaf_srv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($bef_aprv_sts_typ.equalsIgnoreCase(name)) {
			bef_aprv_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($is_src_aprvaf_srv_flg.equalsIgnoreCase(name)) {
			is_src_aprvaf_srv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($bef_aprv_sts_typ.equalsIgnoreCase(name)) {
			bef_aprv_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($is_src_aprvaf_srv_flg.equalsIgnoreCase(name)) {
			is_src_aprvaf_srv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

