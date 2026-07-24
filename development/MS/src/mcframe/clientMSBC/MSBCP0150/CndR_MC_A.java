package mcframe.clientMSBC.MSBCP0150;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View;INT,Execute; UPD,登録・訂正する;DEL,取り消す;REF,参照する;INT,実行する;.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $sim_usr_cd = "sim_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $sim_usr_nm = "sim_usr_nm";
	/**
	 * MRP run date FROM ＭＲＰ実行日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $mrp_proc_dt_from = "mrp_proc_dt_from";
	/**
	 * MRP run date TO ＭＲＰ実行日ＴＯ.<p>
	 *
	 */
	public static final String $mrp_proc_dt_to = "mrp_proc_dt_to";
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public static final String $sim_mrp_typ = "sim_mrp_typ";
	/**
	 * Simulation MRP type name シミュレーションＭＲＰ区分名.<p>
	 *
	 */
	public static final String $sim_mrp_typ_nm = "sim_mrp_typ_nm";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $sim_mrp_intr_rmrks = "sim_mrp_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sim_mrp_sub_char1 = "sim_mrp_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sim_mrp_sub_char2 = "sim_mrp_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sim_mrp_sub_char3 = "sim_mrp_sub_char3";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sim_usr_cd_META = createCommonMeta($sim_usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta sim_usr_nm_META = createCommonMeta($sim_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta mrp_proc_dt_from_META = createCommonMeta($mrp_proc_dt_from, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_proc_dt_to_META = createCommonMeta($mrp_proc_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta sim_mrp_typ_META = createCommonMeta($sim_mrp_typ, mcframe.commonMS.meta.MS_META.SIM_MRP_TYP);
	public static final MCMeta sim_mrp_typ_nm_META = createCommonMeta($sim_mrp_typ_nm, mcframe.commonMS.meta.MS_META.SIM_MRP_TYP_NM);
	public static final MCMeta sim_mrp_intr_rmrks_META = createCommonMeta($sim_mrp_intr_rmrks, mcframe.commonMS.meta.MS_META.SIM_MRP_INTR_RMRKS);
	public static final MCMeta sim_mrp_sub_char1_META = createCommonMeta($sim_mrp_sub_char1, mcframe.commonMS.meta.MS_META.SIM_MRP_SUB_CHAR1);
	public static final MCMeta sim_mrp_sub_char2_META = createCommonMeta($sim_mrp_sub_char2, mcframe.commonMS.meta.MS_META.SIM_MRP_SUB_CHAR2);
	public static final MCMeta sim_mrp_sub_char3_META = createCommonMeta($sim_mrp_sub_char3, mcframe.commonMS.meta.MS_META.SIM_MRP_SUB_CHAR3);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			wg_cd_META,
			wg_nm_META,
			sim_usr_cd_META,
			sim_usr_nm_META,
			mrp_proc_dt_from_META,
			mrp_proc_dt_to_META,
			sim_mrp_no_META,
			sim_mrp_typ_META,
			sim_mrp_typ_nm_META,
			sim_mrp_intr_rmrks_META,
			sim_mrp_sub_char1_META,
			sim_mrp_sub_char2_META,
			sim_mrp_sub_char3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$sim_usr_cd, "usr_nm"}	// sim_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
			}
		))
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View;INT,Execute; UPD,登録・訂正する;DEL,取り消す;REF,参照する;INT,実行する;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View;INT,Execute; UPD,登録・訂正する;DEL,取り消す;REF,参照する;INT,実行する;.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 2, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 2, $wg_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String sim_usr_cd() {
		return getConstString(offset + 3, $sim_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void sim_usr_cd(String value) {
		setConstString(offset + 3, $sim_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String sim_usr_nm() {
		return getConstString(offset + 4, $sim_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void sim_usr_nm(String value) {
		setConstString(offset + 4, $sim_usr_nm, value);
	}


	/**
	 * MRP run date FROM ＭＲＰ実行日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mrp_proc_dt_from() {
		return getConstDate(offset + 5, $mrp_proc_dt_from);
	}

	/**
	 * MRP run date FROM ＭＲＰ実行日ＦＲＯＭ.<p>
	 *
	 */
	public void mrp_proc_dt_from(MCDate value) {
		setConstDate(offset + 5, $mrp_proc_dt_from, value);
	}


	/**
	 * MRP run date TO ＭＲＰ実行日ＴＯ.<p>
	 *
	 */
	public MCDate mrp_proc_dt_to() {
		return getConstDate(offset + 6, $mrp_proc_dt_to);
	}

	/**
	 * MRP run date TO ＭＲＰ実行日ＴＯ.<p>
	 *
	 */
	public void mrp_proc_dt_to(MCDate value) {
		setConstDate(offset + 6, $mrp_proc_dt_to, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 7, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 7, $sim_mrp_no, value);
	}


	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public String sim_mrp_typ() {
		return getConstString(offset + 8, $sim_mrp_typ);
	}

	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public void sim_mrp_typ(String value) {
		setConstString(offset + 8, $sim_mrp_typ, value);
	}


	/**
	 * Simulation MRP type name シミュレーションＭＲＰ区分名.<p>
	 *
	 */
	public String sim_mrp_typ_nm() {
		return getConstString(offset + 9, $sim_mrp_typ_nm);
	}

	/**
	 * Simulation MRP type name シミュレーションＭＲＰ区分名.<p>
	 *
	 */
	public void sim_mrp_typ_nm(String value) {
		setConstString(offset + 9, $sim_mrp_typ_nm, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String sim_mrp_intr_rmrks() {
		return getConstString(offset + 10, $sim_mrp_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void sim_mrp_intr_rmrks(String value) {
		setConstString(offset + 10, $sim_mrp_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sim_mrp_sub_char1() {
		return getConstString(offset + 11, $sim_mrp_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sim_mrp_sub_char1(String value) {
		setConstString(offset + 11, $sim_mrp_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sim_mrp_sub_char2() {
		return getConstString(offset + 12, $sim_mrp_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sim_mrp_sub_char2(String value) {
		setConstString(offset + 12, $sim_mrp_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sim_mrp_sub_char3() {
		return getConstString(offset + 13, $sim_mrp_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sim_mrp_sub_char3(String value) {
		setConstString(offset + 13, $sim_mrp_sub_char3, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			return sim_usr_cd();
		}
		if ($sim_usr_nm.equalsIgnoreCase(name)) {
			return sim_usr_nm();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			return sim_mrp_typ();
		}
		if ($sim_mrp_typ_nm.equalsIgnoreCase(name)) {
			return sim_mrp_typ_nm();
		}
		if ($sim_mrp_intr_rmrks.equalsIgnoreCase(name)) {
			return sim_mrp_intr_rmrks();
		}
		if ($sim_mrp_sub_char1.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char1();
		}
		if ($sim_mrp_sub_char2.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char2();
		}
		if ($sim_mrp_sub_char3.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($mrp_proc_dt_from.equalsIgnoreCase(name)) {
			return mrp_proc_dt_from();
		}
		if ($mrp_proc_dt_to.equalsIgnoreCase(name)) {
			return mrp_proc_dt_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			return sim_usr_cd();
		}
		if ($sim_usr_nm.equalsIgnoreCase(name)) {
			return sim_usr_nm();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			return sim_mrp_typ();
		}
		if ($sim_mrp_typ_nm.equalsIgnoreCase(name)) {
			return sim_mrp_typ_nm();
		}
		if ($sim_mrp_intr_rmrks.equalsIgnoreCase(name)) {
			return sim_mrp_intr_rmrks();
		}
		if ($sim_mrp_sub_char1.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char1();
		}
		if ($sim_mrp_sub_char2.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char2();
		}
		if ($sim_mrp_sub_char3.equalsIgnoreCase(name)) {
			return sim_mrp_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mrp_proc_dt_from.equalsIgnoreCase(name)) {
			return mrp_proc_dt_from();
		}
		if ($mrp_proc_dt_to.equalsIgnoreCase(name)) {
			return mrp_proc_dt_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			sim_usr_cd(value);
			return;
		}
		if ($sim_usr_nm.equalsIgnoreCase(name)) {
			sim_usr_nm(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			sim_mrp_typ(value);
			return;
		}
		if ($sim_mrp_typ_nm.equalsIgnoreCase(name)) {
			sim_mrp_typ_nm(value);
			return;
		}
		if ($sim_mrp_intr_rmrks.equalsIgnoreCase(name)) {
			sim_mrp_intr_rmrks(value);
			return;
		}
		if ($sim_mrp_sub_char1.equalsIgnoreCase(name)) {
			sim_mrp_sub_char1(value);
			return;
		}
		if ($sim_mrp_sub_char2.equalsIgnoreCase(name)) {
			sim_mrp_sub_char2(value);
			return;
		}
		if ($sim_mrp_sub_char3.equalsIgnoreCase(name)) {
			sim_mrp_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mrp_proc_dt_from.equalsIgnoreCase(name)) {
			mrp_proc_dt_from(value);
			return;
		}
		if ($mrp_proc_dt_to.equalsIgnoreCase(name)) {
			mrp_proc_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sim_usr_cd.equalsIgnoreCase(name)) {
			sim_usr_cd(value);
			return;
		}
		if ($sim_usr_nm.equalsIgnoreCase(name)) {
			sim_usr_nm(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			sim_mrp_typ(value);
			return;
		}
		if ($sim_mrp_typ_nm.equalsIgnoreCase(name)) {
			sim_mrp_typ_nm(value);
			return;
		}
		if ($sim_mrp_intr_rmrks.equalsIgnoreCase(name)) {
			sim_mrp_intr_rmrks(value);
			return;
		}
		if ($sim_mrp_sub_char1.equalsIgnoreCase(name)) {
			sim_mrp_sub_char1(value);
			return;
		}
		if ($sim_mrp_sub_char2.equalsIgnoreCase(name)) {
			sim_mrp_sub_char2(value);
			return;
		}
		if ($sim_mrp_sub_char3.equalsIgnoreCase(name)) {
			sim_mrp_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mrp_proc_dt_from.equalsIgnoreCase(name)) {
			mrp_proc_dt_from(value);
			return;
		}
		if ($mrp_proc_dt_to.equalsIgnoreCase(name)) {
			mrp_proc_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

