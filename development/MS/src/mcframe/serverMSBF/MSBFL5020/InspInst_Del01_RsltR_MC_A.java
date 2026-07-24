package mcframe.serverMSBF.MSBFL5020;

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
 * ブロック"InspInst_Del01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspInst_Del01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public static final String $lims_flg = "lims_flg";
	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public static final String $insp_sts_typ_nm = "insp_sts_typ_nm";
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.INSP_INST_APRV_RSN);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_sts_typ_nm_META = createCommonMeta($insp_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_STS_TYP_NM);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);

	protected static final ConstMetaList<InspInst_Del01_RsltR> constMetas = new ConstMetaList<InspInst_Del01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			insp_no_META,
			aprv_rsn_META,
			lims_flg_META,
			insp_sts_typ_META,
			insp_sts_typ_nm_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META
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
	protected InspInst_Del01_RsltR_MC_A(ConstMetaList<? extends InspInst_Del01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Del01_RsltR clone() {
		return (InspInst_Del01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Del01_RsltR createInstance() {
		return (InspInst_Del01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Del01_RsltR getValues(String... names) {
		return (InspInst_Del01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 1, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 1, $insp_no, value);
	}


	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 2, $aprv_rsn);
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 2, $aprv_rsn, value);
	}


	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 3, $lims_flg);
	}

	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 3, $lims_flg, value);
	}


	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 4, $insp_sts_typ);
	}

	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 4, $insp_sts_typ, value);
	}


	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public String insp_sts_typ_nm() {
		return getConstString(offset + 5, $insp_sts_typ_nm);
	}

	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public void insp_sts_typ_nm(String value) {
		setConstString(offset + 5, $insp_sts_typ_nm, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 6, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 6, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 7, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 7, $insp_aprv_sts_typ_nm, value);
	}


	public String getString(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_sts_typ_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_sts_typ_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_sts_typ_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_sts_typ_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

