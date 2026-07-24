package mcframe.commonMSBE.MSBER0120;

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
 * ブロック"ShipAdvHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipAdvHdrR_MC_A extends MCConstRow {

	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  取引ＣＤ(データ).<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引パタン区分(データ).<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 *  伝票状況.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 *  伝票状況区分(データ).<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 *  調整伝票FLG.<p>
	 *
	 */
	public static final String $adjst_slip_flg = "adjst_slip_flg";
	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 *  出荷日.<p>
	 *
	 */
	public static final String $ship_dt = "ship_dt";
	/**
	 *  出荷元.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 *  指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 *  指図担当者名.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	/**
	 *  出荷部門ＣＤ.<p>
	 *
	 */
	public static final String $ship_dpt_cd = "ship_dpt_cd";
	/**
	 *  出荷部門名.<p>
	 *
	 */
	public static final String $ship_dpt_nm = "ship_dpt_nm";
	/**
	 *  出荷担当者ＣＤ.<p>
	 *
	 */
	public static final String $ship_usr_cd = "ship_usr_cd";
	/**
	 *  出荷担当者名.<p>
	 *
	 */
	public static final String $ship_usr_nm = "ship_usr_nm";
	/**
	 *  貴社注文Ｎｏ(ラベル).<p>
	 *
	 */
	public static final String $cst_po_no_lbl = "cst_po_no_lbl";
	/**
	 *  貴社注文Ｎｏ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 *  送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 *  送付先.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	/**
	 *  送付先別名１.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm1 = "ship_to_id_alt_nm1";
	/**
	 *  送付先別名２.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm2 = "ship_to_id_alt_nm2";
	/**
	 *  送付先別名３.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm3 = "ship_to_id_alt_nm3";
	/**
	 *  送付先別名４.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm4 = "ship_to_id_alt_nm4";
	/**
	 *  送付先ＣＤ(データ).<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 *  送付先郵便番号.<p>
	 *
	 */
	public static final String $ship_to_zip_cd = "ship_to_zip_cd";
	/**
	 *  送付先住所１.<p>
	 *
	 */
	public static final String $ship_to_addr1 = "ship_to_addr1";
	/**
	 *  送付先住所２.<p>
	 *
	 */
	public static final String $ship_to_addr2 = "ship_to_addr2";
	/**
	 *  送付先住所３.<p>
	 *
	 */
	public static final String $ship_to_addr3 = "ship_to_addr3";
	/**
	 *  送付先住所４.<p>
	 *
	 */
	public static final String $ship_to_addr4 = "ship_to_addr4";
	/**
	 *  送付先住所１－４（データ）.<p>
	 *
	 */
	public static final String $ship_to_addr = "ship_to_addr";
	/**
	 *  送付先ＴＥＬ.<p>
	 *
	 */
	public static final String $ship_to_tel = "ship_to_tel";
	/**
	 *  送付先ＦＡＸ.<p>
	 *
	 */
	public static final String $ship_to_fax = "ship_to_fax";
	/**
	 *  送付先部署.<p>
	 *
	 */
	public static final String $ship_to_cntct_dpt = "ship_to_cntct_dpt";
	/**
	 *  送付先担当者.<p>
	 *
	 */
	public static final String $ship_to_cntct_psn = "ship_to_cntct_psn";
	/**
	 *  送付先担当者敬称.<p>
	 *
	 */
	public static final String $ship_to_cntct_psn_title = "ship_to_cntct_psn_title";
	/**
	 *  送付先国名.<p>
	 *
	 */
	public static final String $ship_to_cntry_nm = "ship_to_cntry_nm";
	/**
	 *  自社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 *  住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 *  住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 *  住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 *  住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 *  住所１－４（データ）.<p>
	 *
	 */
	public static final String $addr = "addr";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 *  部門(データ).<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 *  担当者.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 *  担当者(データ).<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 *  国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 *  取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";


	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta adjst_slip_flg_META = createCommonMeta($adjst_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ship_dt_META = createCommonMeta($ship_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ship_dpt_cd_META = createCommonMeta($ship_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ship_dpt_nm_META = createCommonMeta($ship_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ship_usr_cd_META = createCommonMeta($ship_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ship_usr_nm_META = createCommonMeta($ship_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta cst_po_no_lbl_META = createStringMeta($cst_po_no_lbl);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_id_alt_nm1_META = createCommonMeta($ship_to_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta ship_to_id_alt_nm2_META = createCommonMeta($ship_to_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta ship_to_id_alt_nm3_META = createCommonMeta($ship_to_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta ship_to_id_alt_nm4_META = createCommonMeta($ship_to_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_zip_cd_META = createCommonMeta($ship_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ship_to_addr1_META = createCommonMeta($ship_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr2_META = createCommonMeta($ship_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr3_META = createCommonMeta($ship_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr4_META = createCommonMeta($ship_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr_META = createStringMeta($ship_to_addr);
	public static final MCMeta ship_to_tel_META = createCommonMeta($ship_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_fax_META = createCommonMeta($ship_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_cntct_dpt_META = createCommonMeta($ship_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta ship_to_cntct_psn_META = createCommonMeta($ship_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ship_to_cntct_psn_title_META = createCommonMeta($ship_to_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta ship_to_cntry_nm_META = createCommonMeta($ship_to_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta addr_META = createStringMeta($addr);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR3);

	protected static final ConstMetaList<ShipAdvHdrR> constMetas = new ConstMetaList<ShipAdvHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prnt_tm_META,
			trd_nm_META,
			trd_cd_META,
			trd_ptn_typ_META,
			slip_sts_typ_nm_META,
			slip_sts_typ_META,
			adjst_slip_flg_META,
			dlv_slip_no_META,
			dlv_slip_rev_META,
			ship_dt_META,
			lg_grp_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			ship_dpt_cd_META,
			ship_dpt_nm_META,
			ship_usr_cd_META,
			ship_usr_nm_META,
			cst_po_no_lbl_META,
			cst_po_no_META,
			ship_to_id_typ_META,
			ship_to_id_nm_META,
			ship_to_id_alt_nm1_META,
			ship_to_id_alt_nm2_META,
			ship_to_id_alt_nm3_META,
			ship_to_id_alt_nm4_META,
			ship_to_id_cd_META,
			ship_to_zip_cd_META,
			ship_to_addr1_META,
			ship_to_addr2_META,
			ship_to_addr3_META,
			ship_to_addr4_META,
			ship_to_addr_META,
			ship_to_tel_META,
			ship_to_fax_META,
			ship_to_cntct_dpt_META,
			ship_to_cntct_psn_META,
			ship_to_cntct_psn_title_META,
			ship_to_cntry_nm_META,
			co_nm_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			addr_META,
			tel_META,
			fax_META,
			dpt_nm_META,
			dpt_cd_META,
			usr_nm_META,
			usr_cd_META,
			cntry_nm_META,
			trd_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected ShipAdvHdrR_MC_A(ConstMetaList<? extends ShipAdvHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAdvHdrR clone() {
		return (ShipAdvHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAdvHdrR createInstance() {
		return (ShipAdvHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAdvHdrR getValues(String... names) {
		return (ShipAdvHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 0, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 0, $prnt_tm, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 1, $trd_nm);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 1, $trd_nm, value);
	}


	/**
	 *  取引ＣＤ(データ).<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 2, $trd_cd);
	}

	/**
	 *  取引ＣＤ(データ).<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 2, $trd_cd, value);
	}


	/**
	 *  取引パタン区分(データ).<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 3, $trd_ptn_typ);
	}

	/**
	 *  取引パタン区分(データ).<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 3, $trd_ptn_typ, value);
	}


	/**
	 *  伝票状況.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 4, $slip_sts_typ_nm);
	}

	/**
	 *  伝票状況.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 4, $slip_sts_typ_nm, value);
	}


	/**
	 *  伝票状況区分(データ).<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 5, $slip_sts_typ);
	}

	/**
	 *  伝票状況区分(データ).<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 5, $slip_sts_typ, value);
	}


	/**
	 *  調整伝票FLG.<p>
	 *
	 */
	public boolean adjst_slip_flg() {
		return getConstBoolean(offset + 6, $adjst_slip_flg);
	}

	/**
	 *  調整伝票FLG.<p>
	 *
	 */
	public void adjst_slip_flg(boolean value) {
		setConstBoolean(offset + 6, $adjst_slip_flg, value);
	}


	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 7, $dlv_slip_no);
	}

	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 7, $dlv_slip_no, value);
	}


	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 8, $dlv_slip_rev);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}


	/**
	 *  出荷日.<p>
	 *
	 */
	public MCDate ship_dt() {
		return getConstDate(offset + 9, $ship_dt);
	}

	/**
	 *  出荷日.<p>
	 *
	 */
	public void ship_dt(MCDate value) {
		setConstDate(offset + 9, $ship_dt, value);
	}


	/**
	 *  出荷元.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 10, $lg_grp_nm);
	}

	/**
	 *  出荷元.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 10, $lg_grp_nm, value);
	}


	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 11, $inst_dpt_cd);
	}

	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 11, $inst_dpt_cd, value);
	}


	/**
	 *  指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 12, $inst_dpt_nm);
	}

	/**
	 *  指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 12, $inst_dpt_nm, value);
	}


	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 13, $inst_usr_cd);
	}

	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 13, $inst_usr_cd, value);
	}


	/**
	 *  指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 14, $inst_usr_nm);
	}

	/**
	 *  指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 14, $inst_usr_nm, value);
	}


	/**
	 *  出荷部門ＣＤ.<p>
	 *
	 */
	public String ship_dpt_cd() {
		return getConstString(offset + 15, $ship_dpt_cd);
	}

	/**
	 *  出荷部門ＣＤ.<p>
	 *
	 */
	public void ship_dpt_cd(String value) {
		setConstString(offset + 15, $ship_dpt_cd, value);
	}


	/**
	 *  出荷部門名.<p>
	 *
	 */
	public String ship_dpt_nm() {
		return getConstString(offset + 16, $ship_dpt_nm);
	}

	/**
	 *  出荷部門名.<p>
	 *
	 */
	public void ship_dpt_nm(String value) {
		setConstString(offset + 16, $ship_dpt_nm, value);
	}


	/**
	 *  出荷担当者ＣＤ.<p>
	 *
	 */
	public String ship_usr_cd() {
		return getConstString(offset + 17, $ship_usr_cd);
	}

	/**
	 *  出荷担当者ＣＤ.<p>
	 *
	 */
	public void ship_usr_cd(String value) {
		setConstString(offset + 17, $ship_usr_cd, value);
	}


	/**
	 *  出荷担当者名.<p>
	 *
	 */
	public String ship_usr_nm() {
		return getConstString(offset + 18, $ship_usr_nm);
	}

	/**
	 *  出荷担当者名.<p>
	 *
	 */
	public void ship_usr_nm(String value) {
		setConstString(offset + 18, $ship_usr_nm, value);
	}


	/**
	 *  貴社注文Ｎｏ(ラベル).<p>
	 *
	 */
	public String cst_po_no_lbl() {
		return getConstString(offset + 19, $cst_po_no_lbl);
	}

	/**
	 *  貴社注文Ｎｏ(ラベル).<p>
	 *
	 */
	public void cst_po_no_lbl(String value) {
		setConstString(offset + 19, $cst_po_no_lbl, value);
	}


	/**
	 *  貴社注文Ｎｏ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 20, $cst_po_no);
	}

	/**
	 *  貴社注文Ｎｏ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 20, $cst_po_no, value);
	}


	/**
	 *  送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 21, $ship_to_id_typ);
	}

	/**
	 *  送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 21, $ship_to_id_typ, value);
	}


	/**
	 *  送付先.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 22, $ship_to_id_nm);
	}

	/**
	 *  送付先.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 22, $ship_to_id_nm, value);
	}


	/**
	 *  送付先別名１.<p>
	 *
	 */
	public String ship_to_id_alt_nm1() {
		return getConstString(offset + 23, $ship_to_id_alt_nm1);
	}

	/**
	 *  送付先別名１.<p>
	 *
	 */
	public void ship_to_id_alt_nm1(String value) {
		setConstString(offset + 23, $ship_to_id_alt_nm1, value);
	}


	/**
	 *  送付先別名２.<p>
	 *
	 */
	public String ship_to_id_alt_nm2() {
		return getConstString(offset + 24, $ship_to_id_alt_nm2);
	}

	/**
	 *  送付先別名２.<p>
	 *
	 */
	public void ship_to_id_alt_nm2(String value) {
		setConstString(offset + 24, $ship_to_id_alt_nm2, value);
	}


	/**
	 *  送付先別名３.<p>
	 *
	 */
	public String ship_to_id_alt_nm3() {
		return getConstString(offset + 25, $ship_to_id_alt_nm3);
	}

	/**
	 *  送付先別名３.<p>
	 *
	 */
	public void ship_to_id_alt_nm3(String value) {
		setConstString(offset + 25, $ship_to_id_alt_nm3, value);
	}


	/**
	 *  送付先別名４.<p>
	 *
	 */
	public String ship_to_id_alt_nm4() {
		return getConstString(offset + 26, $ship_to_id_alt_nm4);
	}

	/**
	 *  送付先別名４.<p>
	 *
	 */
	public void ship_to_id_alt_nm4(String value) {
		setConstString(offset + 26, $ship_to_id_alt_nm4, value);
	}


	/**
	 *  送付先ＣＤ(データ).<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 27, $ship_to_id_cd);
	}

	/**
	 *  送付先ＣＤ(データ).<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 27, $ship_to_id_cd, value);
	}


	/**
	 *  送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return getConstString(offset + 28, $ship_to_zip_cd);
	}

	/**
	 *  送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		setConstString(offset + 28, $ship_to_zip_cd, value);
	}


	/**
	 *  送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return getConstString(offset + 29, $ship_to_addr1);
	}

	/**
	 *  送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		setConstString(offset + 29, $ship_to_addr1, value);
	}


	/**
	 *  送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return getConstString(offset + 30, $ship_to_addr2);
	}

	/**
	 *  送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		setConstString(offset + 30, $ship_to_addr2, value);
	}


	/**
	 *  送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return getConstString(offset + 31, $ship_to_addr3);
	}

	/**
	 *  送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		setConstString(offset + 31, $ship_to_addr3, value);
	}


	/**
	 *  送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return getConstString(offset + 32, $ship_to_addr4);
	}

	/**
	 *  送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		setConstString(offset + 32, $ship_to_addr4, value);
	}


	/**
	 *  送付先住所１－４（データ）.<p>
	 *
	 */
	public String ship_to_addr() {
		return getConstString(offset + 33, $ship_to_addr);
	}

	/**
	 *  送付先住所１－４（データ）.<p>
	 *
	 */
	public void ship_to_addr(String value) {
		setConstString(offset + 33, $ship_to_addr, value);
	}


	/**
	 *  送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return getConstString(offset + 34, $ship_to_tel);
	}

	/**
	 *  送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		setConstString(offset + 34, $ship_to_tel, value);
	}


	/**
	 *  送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return getConstString(offset + 35, $ship_to_fax);
	}

	/**
	 *  送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		setConstString(offset + 35, $ship_to_fax, value);
	}


	/**
	 *  送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return getConstString(offset + 36, $ship_to_cntct_dpt);
	}

	/**
	 *  送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		setConstString(offset + 36, $ship_to_cntct_dpt, value);
	}


	/**
	 *  送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return getConstString(offset + 37, $ship_to_cntct_psn);
	}

	/**
	 *  送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		setConstString(offset + 37, $ship_to_cntct_psn, value);
	}


	/**
	 *  送付先担当者敬称.<p>
	 *
	 */
	public String ship_to_cntct_psn_title() {
		return getConstString(offset + 38, $ship_to_cntct_psn_title);
	}

	/**
	 *  送付先担当者敬称.<p>
	 *
	 */
	public void ship_to_cntct_psn_title(String value) {
		setConstString(offset + 38, $ship_to_cntct_psn_title, value);
	}


	/**
	 *  送付先国名.<p>
	 *
	 */
	public String ship_to_cntry_nm() {
		return getConstString(offset + 39, $ship_to_cntry_nm);
	}

	/**
	 *  送付先国名.<p>
	 *
	 */
	public void ship_to_cntry_nm(String value) {
		setConstString(offset + 39, $ship_to_cntry_nm, value);
	}


	/**
	 *  自社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 40, $co_nm);
	}

	/**
	 *  自社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 40, $co_nm, value);
	}


	/**
	 *  郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 41, $zip_cd);
	}

	/**
	 *  郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 41, $zip_cd, value);
	}


	/**
	 *  住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 42, $addr1);
	}

	/**
	 *  住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 42, $addr1, value);
	}


	/**
	 *  住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 43, $addr2);
	}

	/**
	 *  住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 43, $addr2, value);
	}


	/**
	 *  住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 44, $addr3);
	}

	/**
	 *  住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 44, $addr3, value);
	}


	/**
	 *  住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 45, $addr4);
	}

	/**
	 *  住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 45, $addr4, value);
	}


	/**
	 *  住所１－４（データ）.<p>
	 *
	 */
	public String addr() {
		return getConstString(offset + 46, $addr);
	}

	/**
	 *  住所１－４（データ）.<p>
	 *
	 */
	public void addr(String value) {
		setConstString(offset + 46, $addr, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 47, $tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 47, $tel, value);
	}


	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 48, $fax);
	}

	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 48, $fax, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 49, $dpt_nm);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 49, $dpt_nm, value);
	}


	/**
	 *  部門(データ).<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 50, $dpt_cd);
	}

	/**
	 *  部門(データ).<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 50, $dpt_cd, value);
	}


	/**
	 *  担当者.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 51, $usr_nm);
	}

	/**
	 *  担当者.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 51, $usr_nm, value);
	}


	/**
	 *  担当者(データ).<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 52, $usr_cd);
	}

	/**
	 *  担当者(データ).<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 52, $usr_cd, value);
	}


	/**
	 *  国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 53, $cntry_nm);
	}

	/**
	 *  国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 53, $cntry_nm, value);
	}


	/**
	 *  取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 54, $trd_rmrks);
	}

	/**
	 *  取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 54, $trd_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 55, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 55, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 56, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 56, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 57, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 57, $sub_char3, value);
	}


	public String getString(String name) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($ship_dpt_cd.equalsIgnoreCase(name)) {
			return ship_dpt_cd();
		}
		if ($ship_dpt_nm.equalsIgnoreCase(name)) {
			return ship_dpt_nm();
		}
		if ($ship_usr_cd.equalsIgnoreCase(name)) {
			return ship_usr_cd();
		}
		if ($ship_usr_nm.equalsIgnoreCase(name)) {
			return ship_usr_nm();
		}
		if ($cst_po_no_lbl.equalsIgnoreCase(name)) {
			return cst_po_no_lbl();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm1();
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm2();
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm3();
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm4();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_addr.equalsIgnoreCase(name)) {
			return ship_to_addr();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_cntct_psn_title.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn_title();
		}
		if ($ship_to_cntry_nm.equalsIgnoreCase(name)) {
			return ship_to_cntry_nm();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($addr.equalsIgnoreCase(name)) {
			return addr();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			return ship_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($adjst_slip_flg.equalsIgnoreCase(name)) {
			return adjst_slip_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($ship_dpt_cd.equalsIgnoreCase(name)) {
			return ship_dpt_cd();
		}
		if ($ship_dpt_nm.equalsIgnoreCase(name)) {
			return ship_dpt_nm();
		}
		if ($ship_usr_cd.equalsIgnoreCase(name)) {
			return ship_usr_cd();
		}
		if ($ship_usr_nm.equalsIgnoreCase(name)) {
			return ship_usr_nm();
		}
		if ($cst_po_no_lbl.equalsIgnoreCase(name)) {
			return cst_po_no_lbl();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm1();
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm2();
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm3();
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm4();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_addr.equalsIgnoreCase(name)) {
			return ship_to_addr();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_cntct_psn_title.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn_title();
		}
		if ($ship_to_cntry_nm.equalsIgnoreCase(name)) {
			return ship_to_cntry_nm();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($addr.equalsIgnoreCase(name)) {
			return addr();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			return ship_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($adjst_slip_flg.equalsIgnoreCase(name)) {
			return adjst_slip_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($ship_dpt_cd.equalsIgnoreCase(name)) {
			ship_dpt_cd(value);
			return;
		}
		if ($ship_dpt_nm.equalsIgnoreCase(name)) {
			ship_dpt_nm(value);
			return;
		}
		if ($ship_usr_cd.equalsIgnoreCase(name)) {
			ship_usr_cd(value);
			return;
		}
		if ($ship_usr_nm.equalsIgnoreCase(name)) {
			ship_usr_nm(value);
			return;
		}
		if ($cst_po_no_lbl.equalsIgnoreCase(name)) {
			cst_po_no_lbl(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm1(value);
			return;
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm2(value);
			return;
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm3(value);
			return;
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm4(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_addr.equalsIgnoreCase(name)) {
			ship_to_addr(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_cntct_psn_title.equalsIgnoreCase(name)) {
			ship_to_cntct_psn_title(value);
			return;
		}
		if ($ship_to_cntry_nm.equalsIgnoreCase(name)) {
			ship_to_cntry_nm(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($addr.equalsIgnoreCase(name)) {
			addr(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			ship_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($adjst_slip_flg.equalsIgnoreCase(name)) {
			adjst_slip_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($ship_dpt_cd.equalsIgnoreCase(name)) {
			ship_dpt_cd(value);
			return;
		}
		if ($ship_dpt_nm.equalsIgnoreCase(name)) {
			ship_dpt_nm(value);
			return;
		}
		if ($ship_usr_cd.equalsIgnoreCase(name)) {
			ship_usr_cd(value);
			return;
		}
		if ($ship_usr_nm.equalsIgnoreCase(name)) {
			ship_usr_nm(value);
			return;
		}
		if ($cst_po_no_lbl.equalsIgnoreCase(name)) {
			cst_po_no_lbl(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm1(value);
			return;
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm2(value);
			return;
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm3(value);
			return;
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm4(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_addr.equalsIgnoreCase(name)) {
			ship_to_addr(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_cntct_psn_title.equalsIgnoreCase(name)) {
			ship_to_cntct_psn_title(value);
			return;
		}
		if ($ship_to_cntry_nm.equalsIgnoreCase(name)) {
			ship_to_cntry_nm(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($addr.equalsIgnoreCase(name)) {
			addr(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			ship_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($adjst_slip_flg.equalsIgnoreCase(name)) {
			adjst_slip_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

