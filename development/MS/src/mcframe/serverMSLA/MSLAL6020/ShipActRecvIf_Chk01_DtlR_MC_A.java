package mcframe.serverMSLA.MSLAL6020;

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
 * ブロック"ShipActRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipActRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $sa = "sa";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_d_no = "ship_act_d_no";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Version control 版管理.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public static final String $uplnd_flg = "uplnd_flg";
	/**
	 * Transaction Pattern type (Master) 取引パタン区分（マスタ）.<p>
	 *
	 */
	public static final String $mst_trd_ptn_typ = "mst_trd_ptn_typ";
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	/**
	 * Receiving point identification name (Master) 送付先識別名（マスタ）.<p>
	 *
	 */
	public static final String $mst_ship_to_id_nm = "mst_ship_to_id_nm";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination identification name (master) 納品先識別名（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_id_nm = "mst_dlv_id_nm";
	/**
	 * Invoice No. (Details) インボイスＮＯ（明細）.<p>
	 *
	 */
	public static final String $dtl_iv_no = "dtl_iv_no";
	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_dtl_peg_no = "hdr_dtl_peg_no";

	public static final String $data_lno = $sa + ".data_lno";
	public static final String $data_no = $sa + ".data_no";
	public static final String $data_crud_typ = $sa + ".data_crud_typ";
	public static final String $ext_sys_cd = $sa + ".ext_sys_cd";
	public static final String $exe_sts_typ = $sa + ".exe_sts_typ";
	public static final String $ext_data_no = $sa + ".ext_data_no";
	public static final String $ext_data_lno = $sa + ".ext_data_lno";
	public static final String $data_make_dt = $sa + ".data_make_dt";
	public static final String $imp_flg = $sa + ".imp_flg";
	public static final String $ship_inst_no = $sa + ".ship_inst_no";
	public static final String $ship_fr_lg_grp_cd = $sa + ".ship_fr_lg_grp_cd";
	public static final String $site_co_cd = $sa + ".site_co_cd";
	public static final String $trd_cd = $sa + ".trd_cd";
	public static final String $trd_ptn_typ = $sa + ".trd_ptn_typ";
	public static final String $ship_tm = $sa + ".ship_tm";
	public static final String $dlv_tm = $sa + ".dlv_tm";
	public static final String $cst_cd = $sa + ".cst_cd";
	public static final String $ship_to_id_typ = $sa + ".ship_to_id_typ";
	public static final String $ship_to_id_cd = $sa + ".ship_to_id_cd";
	public static final String $ship_to_id_nm = $sa + ".ship_to_id_nm";
	public static final String $ship_to_zip_cd = $sa + ".ship_to_zip_cd";
	public static final String $ship_to_addr1 = $sa + ".ship_to_addr1";
	public static final String $ship_to_addr2 = $sa + ".ship_to_addr2";
	public static final String $ship_to_addr3 = $sa + ".ship_to_addr3";
	public static final String $ship_to_addr4 = $sa + ".ship_to_addr4";
	public static final String $ship_to_cntct_dpt = $sa + ".ship_to_cntct_dpt";
	public static final String $ship_to_cntct_psn = $sa + ".ship_to_cntct_psn";
	public static final String $ship_to_tel = $sa + ".ship_to_tel";
	public static final String $ship_to_fax = $sa + ".ship_to_fax";
	public static final String $dlv_id_typ = $sa + ".dlv_id_typ";
	public static final String $dlv_id_cd = $sa + ".dlv_id_cd";
	public static final String $dlv_id_nm = $sa + ".dlv_id_nm";
	public static final String $dlv_str_ln_cd = $sa + ".dlv_str_ln_cd";
	public static final String $dlv_zip_cd = $sa + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $sa + ".dlv_addr1";
	public static final String $dlv_addr2 = $sa + ".dlv_addr2";
	public static final String $dlv_addr3 = $sa + ".dlv_addr3";
	public static final String $dlv_addr4 = $sa + ".dlv_addr4";
	public static final String $dlv_cntct_dpt = $sa + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $sa + ".dlv_cntct_psn";
	public static final String $dlv_tel = $sa + ".dlv_tel";
	public static final String $dlv_fax = $sa + ".dlv_fax";
	public static final String $pri_prnt_typ = $sa + ".pri_prnt_typ";
	public static final String $rqst_dpt_cd = $sa + ".rqst_dpt_cd";
	public static final String $rqst_usr_cd = $sa + ".rqst_usr_cd";
	public static final String $ship_dpt_cd = $sa + ".ship_dpt_cd";
	public static final String $ship_usr_cd = $sa + ".ship_usr_cd";
	public static final String $ship_inst_d_no = $sa + ".ship_inst_d_no";
	public static final String $ship_alloc_sts_no = $sa + ".ship_alloc_sts_no";
	public static final String $iv_no = $sa + ".iv_no";
	public static final String $iv_d_no = $sa + ".iv_d_no";
	public static final String $dlv_slip_no = $sa + ".dlv_slip_no";
	public static final String $dlv_slip_d_no = $sa + ".dlv_slip_d_no";
	public static final String $ext_ship_act_no = $sa + ".ext_ship_act_no";
	public static final String $ship_loc_cd = $sa + ".ship_loc_cd";
	public static final String $ship_str_ln_cd = $sa + ".ship_str_ln_cd";
	public static final String $itm_cd = $sa + ".itm_cd";
	public static final String $itm_sub1 = $sa + ".itm_sub1";
	public static final String $itm_sub2 = $sa + ".itm_sub2";
	public static final String $itm_sub3 = $sa + ".itm_sub3";
	public static final String $if_itm_nm = $sa + ".if_itm_nm";
	public static final String $lot_no = $sa + ".lot_no";
	public static final String $sublot_no = $sa + ".sublot_no";
	public static final String $sno1 = $sa + ".sno1";
	public static final String $sno2 = $sa + ".sno2";
	public static final String $sno3 = $sa + ".sno3";
	public static final String $sno4 = $sa + ".sno4";
	public static final String $ent_unit_qty = $sa + ".ent_unit_qty";
	public static final String $ent_unit_cd = $sa + ".ent_unit_cd";
	public static final String $abort_flg = $sa + ".abort_flg";
	public static final String $cst_itm_cd = $sa + ".cst_itm_cd";
	public static final String $cst_itm_nm = $sa + ".cst_itm_nm";
	public static final String $stk_arrv_bp_cd = $sa + ".stk_arrv_bp_cd";
	public static final String $gd_cd = $sa + ".gd_cd";
	public static final String $quality_typ = $sa + ".quality_typ";
	public static final String $stk_id_typ = $sa + ".stk_id_typ";
	public static final String $stk_bp_cd = $sa + ".stk_bp_cd";
	public static final String $rsn_cd = $sa + ".rsn_cd";
	public static final String $bd_dpt_cd = $sa + ".bd_dpt_cd";
	public static final String $cst_po_no = $sa + ".cst_po_no";
	public static final String $cst_po_d_no = $sa + ".cst_po_d_no";
	public static final String $cst_dlv_inst_no = $sa + ".cst_dlv_inst_no";
	public static final String $cst_dlv_inst_d_no = $sa + ".cst_dlv_inst_d_no";
	public static final String $base_dlv_slip_no = $sa + ".base_dlv_slip_no";
	public static final String $base_prov_act_no = $sa + ".base_prov_act_no";
	public static final String $base_ac_dt = $sa + ".base_ac_dt";
	public static final String $trd_rmrks = $sa + ".trd_rmrks";
	public static final String $trd_d_rmrks = $sa + ".trd_d_rmrks";
	public static final String $arr_cnt_rmrks = $sa + ".arr_cnt_rmrks";
	public static final String $intr_d_rmrks = $sa + ".intr_d_rmrks";

	public static final MCMeta sa_META = createInnerRowMeta($sa, mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R.class);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_d_no_META = createCommonMeta($ship_act_d_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta uplnd_flg_META = createCommonMeta($uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_trd_ptn_typ_META = createCommonMeta($mst_trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_ship_to_id_nm_META = createCommonMeta($mst_ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_dlv_id_nm_META = createCommonMeta($mst_dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dtl_iv_no_META = createCommonMeta($dtl_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta hdr_dtl_peg_no_META = createCommonMeta($hdr_dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<ShipActRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<ShipActRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sa_META,
			ship_pr_no_META,
			ship_act_no_META,
			ship_act_d_no_META,
			pri_prnt_flg_META,
			ver_flg_META,
			ver_no_META,
			skip_chk_ship_flg_META,
			err_flg_META,
			peg_no_META,
			uplnd_flg_META,
			mst_trd_ptn_typ_META,
			ship_to_sundry_flg_META,
			mst_ship_to_id_nm_META,
			dlv_sundry_flg_META,
			mst_dlv_id_nm_META,
			dtl_iv_no_META,
			hdr_dtl_peg_no_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"data_crud_typ",
				"ext_sys_cd",
				"exe_sts_typ",
				"ext_data_no",
				"ext_data_lno",
				"data_make_dt",
				"imp_flg",
				"ship_inst_no",
				"ship_fr_lg_grp_cd",
				"site_co_cd",
				"trd_cd",
				"trd_ptn_typ",
				"ship_tm",
				"dlv_tm",
				"cst_cd",
				"ship_to_id_typ",
				"ship_to_id_cd",
				"ship_to_id_nm",
				"ship_to_zip_cd",
				"ship_to_addr1",
				"ship_to_addr2",
				"ship_to_addr3",
				"ship_to_addr4",
				"ship_to_cntct_dpt",
				"ship_to_cntct_psn",
				"ship_to_tel",
				"ship_to_fax",
				"dlv_id_typ",
				"dlv_id_cd",
				"dlv_id_nm",
				"dlv_str_ln_cd",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_tel",
				"dlv_fax",
				"pri_prnt_typ",
				"rqst_dpt_cd",
				"rqst_usr_cd",
				"ship_dpt_cd",
				"ship_usr_cd",
				"ship_inst_d_no",
				"ship_alloc_sts_no",
				"iv_no",
				"iv_d_no",
				"dlv_slip_no",
				"dlv_slip_d_no",
				"ext_ship_act_no",
				"ship_loc_cd",
				"ship_str_ln_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"if_itm_nm",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"ent_unit_qty",
				"ent_unit_cd",
				"abort_flg",
				"cst_itm_cd",
				"cst_itm_nm",
				"stk_arrv_bp_cd",
				"gd_cd",
				"quality_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"rsn_cd",
				"bd_dpt_cd",
				"cst_po_no",
				"cst_po_d_no",
				"cst_dlv_inst_no",
				"cst_dlv_inst_d_no",
				"base_dlv_slip_no",
				"base_prov_act_no",
				"base_ac_dt",
				"trd_rmrks",
				"trd_d_rmrks",
				"arr_cnt_rmrks",
				"intr_d_rmrks"
			},
			{
				$data_lno,
				$data_no,
				$data_crud_typ,
				$ext_sys_cd,
				$exe_sts_typ,
				$ext_data_no,
				$ext_data_lno,
				$data_make_dt,
				$imp_flg,
				$ship_inst_no,
				$ship_fr_lg_grp_cd,
				$site_co_cd,
				$trd_cd,
				$trd_ptn_typ,
				$ship_tm,
				$dlv_tm,
				$cst_cd,
				$ship_to_id_typ,
				$ship_to_id_cd,
				$ship_to_id_nm,
				$ship_to_zip_cd,
				$ship_to_addr1,
				$ship_to_addr2,
				$ship_to_addr3,
				$ship_to_addr4,
				$ship_to_cntct_dpt,
				$ship_to_cntct_psn,
				$ship_to_tel,
				$ship_to_fax,
				$dlv_id_typ,
				$dlv_id_cd,
				$dlv_id_nm,
				$dlv_str_ln_cd,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_tel,
				$dlv_fax,
				$pri_prnt_typ,
				$rqst_dpt_cd,
				$rqst_usr_cd,
				$ship_dpt_cd,
				$ship_usr_cd,
				$ship_inst_d_no,
				$ship_alloc_sts_no,
				$iv_no,
				$iv_d_no,
				$dlv_slip_no,
				$dlv_slip_d_no,
				$ext_ship_act_no,
				$ship_loc_cd,
				$ship_str_ln_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$if_itm_nm,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$ent_unit_qty,
				$ent_unit_cd,
				$abort_flg,
				$cst_itm_cd,
				$cst_itm_nm,
				$stk_arrv_bp_cd,
				$gd_cd,
				$quality_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$rsn_cd,
				$bd_dpt_cd,
				$cst_po_no,
				$cst_po_d_no,
				$cst_dlv_inst_no,
				$cst_dlv_inst_d_no,
				$base_dlv_slip_no,
				$base_prov_act_no,
				$base_ac_dt,
				$trd_rmrks,
				$trd_d_rmrks,
				$arr_cnt_rmrks,
				$intr_d_rmrks
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$sa + ".ship_fr_lg_grp_cd", "E"}	// sa.ship_fr_lg_grp_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$sa + ".trd_cd", "MA.MAUAL0010.Trd"},	// sa.trd_cd
				{$sa + ".ship_to_id_cd", "MS.MSUAL0060.ShipToId"},	// sa.ship_to_id_cd
				{$sa + ".dlv_id_cd", "MS.MSUAL0060.DlvId"},	// sa.dlv_id_cd
				{$sa + ".ship_loc_cd", "MA.MAUAL0010.Loc"}	// sa.ship_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$sa + ".trd_cd", "mst_trd_ptn_typ"},	// sa.trd_cd
				{$sa + ".ship_to_id_cd", "ship_to_sundry_flg;mst_ship_to_id_nm"},	// sa.ship_to_id_cd
				{$sa + ".dlv_id_cd", "dlv_sundry_flg;mst_dlv_id_nm"}	// sa.dlv_id_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$sa + ".trd_cd", "trd_ptn_typ"},	// sa.trd_cd
				{$sa + ".ship_to_id_cd", "ship_to_sundry_flg;ship_to_id_nm"},	// sa.ship_to_id_cd
				{$sa + ".dlv_id_cd", "dlv_sundry_flg;dlv_id_nm"}	// sa.dlv_id_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sa + ".ship_to_id_cd", "ship_to_id_typ;ship_tm"},	// sa.ship_to_id_cd
				{$sa + ".dlv_id_cd", "dlv_id_typ;ship_tm"}	// sa.dlv_id_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sa + ".ship_to_id_cd", "ship_to_id_typ;base_dt"},	// sa.ship_to_id_cd
				{$sa + ".dlv_id_cd", "dlv_id_typ;base_dt"}	// sa.dlv_id_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$sa + ".ship_str_ln_cd", "E"},	// sa.ship_str_ln_cd
				{$sa + ".lot_no", "E"},	// sa.lot_no
				{$sa + ".sublot_no", "E"},	// sa.sublot_no
				{$sa + ".sno1", "E"},	// sa.sno1
				{$sa + ".sno2", "E"},	// sa.sno2
				{$sa + ".sno3", "E"},	// sa.sno3
				{$sa + ".sno4", "E"}	// sa.sno4
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
	protected ShipActRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends ShipActRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipActRecvIf_Chk01_DtlR clone() {
		return (ShipActRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipActRecvIf_Chk01_DtlR createInstance() {
		return (ShipActRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipActRecvIf_Chk01_DtlR getValues(String... names) {
		return (ShipActRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R sa(){
		return (mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R) getConstInnerRow(offset + 0, $sa);
	}
	
	public void sa(mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R row){
		setConstInnerRow(offset + 0, $sa, row);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 1, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 1, $ship_pr_no, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 2, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 2, $ship_act_no, value);
	}


	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return getConstString(offset + 3, $ship_act_d_no);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		setConstString(offset + 3, $ship_act_d_no, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 4, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $pri_prnt_flg, value);
	}


	/**
	 * Version control 版管理.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 5, $ver_flg);
	}

	/**
	 * Version control 版管理.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 5, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 6, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 6, $ver_no, value);
	}


	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 7, $skip_chk_ship_flg);
	}

	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 7, $skip_chk_ship_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 8, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 8, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 9, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 9, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 9, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 9, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 9, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 9, $peg_no, value);
	}


	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return getConstBoolean(offset + 10, $uplnd_flg);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		setConstBoolean(offset + 10, $uplnd_flg, value);
	}


	/**
	 * Transaction Pattern type (Master) 取引パタン区分（マスタ）.<p>
	 *
	 */
	public String mst_trd_ptn_typ() {
		return getConstString(offset + 11, $mst_trd_ptn_typ);
	}

	/**
	 * Transaction Pattern type (Master) 取引パタン区分（マスタ）.<p>
	 *
	 */
	public void mst_trd_ptn_typ(String value) {
		setConstString(offset + 11, $mst_trd_ptn_typ, value);
	}


	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 12, $ship_to_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 12, $ship_to_sundry_flg, value);
	}


	/**
	 * Receiving point identification name (Master) 送付先識別名（マスタ）.<p>
	 *
	 */
	public String mst_ship_to_id_nm() {
		return getConstString(offset + 13, $mst_ship_to_id_nm);
	}

	/**
	 * Receiving point identification name (Master) 送付先識別名（マスタ）.<p>
	 *
	 */
	public void mst_ship_to_id_nm(String value) {
		setConstString(offset + 13, $mst_ship_to_id_nm, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 14, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 14, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination identification name (master) 納品先識別名（マスタ）.<p>
	 *
	 */
	public String mst_dlv_id_nm() {
		return getConstString(offset + 15, $mst_dlv_id_nm);
	}

	/**
	 * Delivery destination identification name (master) 納品先識別名（マスタ）.<p>
	 *
	 */
	public void mst_dlv_id_nm(String value) {
		setConstString(offset + 15, $mst_dlv_id_nm, value);
	}


	/**
	 * Invoice No. (Details) インボイスＮＯ（明細）.<p>
	 *
	 */
	public String dtl_iv_no() {
		return getConstString(offset + 16, $dtl_iv_no);
	}

	/**
	 * Invoice No. (Details) インボイスＮＯ（明細）.<p>
	 *
	 */
	public void dtl_iv_no(String value) {
		setConstString(offset + 16, $dtl_iv_no, value);
	}


	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg_no() {
		return getConstNumber(offset + 17, $hdr_dtl_peg_no);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 17, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(int value) {
		setConstNumber(offset + 17, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(long value) {
		setConstNumber(offset + 17, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(float value) {
		setConstNumber(offset + 17, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(double value) {
		setConstNumber(offset + 17, $hdr_dtl_peg_no, value);
	}


	public String getString(String name) {
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($mst_trd_ptn_typ.equalsIgnoreCase(name)) {
			return mst_trd_ptn_typ();
		}
		if ($mst_ship_to_id_nm.equalsIgnoreCase(name)) {
			return mst_ship_to_id_nm();
		}
		if ($mst_dlv_id_nm.equalsIgnoreCase(name)) {
			return mst_dlv_id_nm();
		}
		if ($dtl_iv_no.equalsIgnoreCase(name)) {
			return dtl_iv_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($mst_trd_ptn_typ.equalsIgnoreCase(name)) {
			return mst_trd_ptn_typ();
		}
		if ($mst_ship_to_id_nm.equalsIgnoreCase(name)) {
			return mst_ship_to_id_nm();
		}
		if ($mst_dlv_id_nm.equalsIgnoreCase(name)) {
			return mst_dlv_id_nm();
		}
		if ($dtl_iv_no.equalsIgnoreCase(name)) {
			return dtl_iv_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($mst_trd_ptn_typ.equalsIgnoreCase(name)) {
			mst_trd_ptn_typ(value);
			return;
		}
		if ($mst_ship_to_id_nm.equalsIgnoreCase(name)) {
			mst_ship_to_id_nm(value);
			return;
		}
		if ($mst_dlv_id_nm.equalsIgnoreCase(name)) {
			mst_dlv_id_nm(value);
			return;
		}
		if ($dtl_iv_no.equalsIgnoreCase(name)) {
			dtl_iv_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($mst_trd_ptn_typ.equalsIgnoreCase(name)) {
			mst_trd_ptn_typ(value);
			return;
		}
		if ($mst_ship_to_id_nm.equalsIgnoreCase(name)) {
			mst_ship_to_id_nm(value);
			return;
		}
		if ($mst_dlv_id_nm.equalsIgnoreCase(name)) {
			mst_dlv_id_nm(value);
			return;
		}
		if ($dtl_iv_no.equalsIgnoreCase(name)) {
			dtl_iv_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sa.equalsIgnoreCase(name)) {
			return sa();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sa.equalsIgnoreCase(name)) {
			sa(
				((MCContainerMeta) sa_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return sa().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		sa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		sa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		sa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		sa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		sa().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return sa().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		sa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		sa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		sa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		sa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		sa().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return sa().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		sa().data_crud_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return sa().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		sa().ext_sys_cd(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return sa().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		sa().exe_sts_typ(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return sa().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		sa().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return sa().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		sa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		sa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		sa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		sa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		sa().ext_data_lno(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return sa().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		sa().data_make_dt(value);
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public boolean imp_flg() {
		return sa().imp_flg();
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		sa().imp_flg(value);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return sa().ship_inst_no();
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		sa().ship_inst_no(value);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return sa().ship_fr_lg_grp_cd();
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		sa().ship_fr_lg_grp_cd(value);
	}

	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public String site_co_cd() {
		return sa().site_co_cd();
	}

	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public void site_co_cd(String value) {
		sa().site_co_cd(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return sa().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		sa().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return sa().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		sa().trd_ptn_typ(value);
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public MCDate ship_tm() {
		return sa().ship_tm();
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		sa().ship_tm(value);
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public MCDate dlv_tm() {
		return sa().dlv_tm();
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public void dlv_tm(MCDate value) {
		sa().dlv_tm(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return sa().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		sa().cst_cd(value);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return sa().ship_to_id_typ();
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		sa().ship_to_id_typ(value);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return sa().ship_to_id_cd();
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		sa().ship_to_id_cd(value);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return sa().ship_to_id_nm();
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		sa().ship_to_id_nm(value);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return sa().ship_to_zip_cd();
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		sa().ship_to_zip_cd(value);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return sa().ship_to_addr1();
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		sa().ship_to_addr1(value);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return sa().ship_to_addr2();
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		sa().ship_to_addr2(value);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return sa().ship_to_addr3();
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		sa().ship_to_addr3(value);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return sa().ship_to_addr4();
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		sa().ship_to_addr4(value);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return sa().ship_to_cntct_dpt();
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		sa().ship_to_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return sa().ship_to_cntct_psn();
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		sa().ship_to_cntct_psn(value);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return sa().ship_to_tel();
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		sa().ship_to_tel(value);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return sa().ship_to_fax();
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		sa().ship_to_fax(value);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return sa().dlv_id_typ();
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		sa().dlv_id_typ(value);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return sa().dlv_id_cd();
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		sa().dlv_id_cd(value);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return sa().dlv_id_nm();
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		sa().dlv_id_nm(value);
	}

	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public String dlv_str_ln_cd() {
		return sa().dlv_str_ln_cd();
	}

	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public void dlv_str_ln_cd(String value) {
		sa().dlv_str_ln_cd(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return sa().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		sa().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return sa().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		sa().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return sa().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		sa().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return sa().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		sa().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return sa().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		sa().dlv_addr4(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return sa().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		sa().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return sa().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		sa().dlv_cntct_psn(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return sa().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		sa().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return sa().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		sa().dlv_fax(value);
	}

	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public String pri_prnt_typ() {
		return sa().pri_prnt_typ();
	}

	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public void pri_prnt_typ(String value) {
		sa().pri_prnt_typ(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return sa().rqst_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		sa().rqst_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return sa().rqst_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		sa().rqst_usr_cd(value);
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public String ship_dpt_cd() {
		return sa().ship_dpt_cd();
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public void ship_dpt_cd(String value) {
		sa().ship_dpt_cd(value);
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public String ship_usr_cd() {
		return sa().ship_usr_cd();
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public void ship_usr_cd(String value) {
		sa().ship_usr_cd(value);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return sa().ship_inst_d_no();
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		sa().ship_inst_d_no(value);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return sa().ship_alloc_sts_no();
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		sa().ship_alloc_sts_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return sa().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		sa().iv_no(value);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return sa().iv_d_no();
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		sa().iv_d_no(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return sa().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		sa().dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return sa().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		sa().dlv_slip_d_no(value);
	}

	/**
	 * External shipping result No. 外部出荷実績ＮＯ.<p>
	 *
	 */
	public String ext_ship_act_no() {
		return sa().ext_ship_act_no();
	}

	/**
	 * External shipping result No. 外部出荷実績ＮＯ.<p>
	 *
	 */
	public void ext_ship_act_no(String value) {
		sa().ext_ship_act_no(value);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return sa().ship_loc_cd();
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		sa().ship_loc_cd(value);
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return sa().ship_str_ln_cd();
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		sa().ship_str_ln_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return sa().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		sa().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return sa().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		sa().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return sa().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		sa().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return sa().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		sa().itm_sub3(value);
	}

	/**
	 * IF item name ＩＦ品名.<p>
	 *
	 */
	public String if_itm_nm() {
		return sa().if_itm_nm();
	}

	/**
	 * IF item name ＩＦ品名.<p>
	 *
	 */
	public void if_itm_nm(String value) {
		sa().if_itm_nm(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return sa().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		sa().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return sa().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		sa().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return sa().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		sa().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return sa().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		sa().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return sa().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		sa().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return sa().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		sa().sno4(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public MCNumber ent_unit_qty() {
		return sa().ent_unit_qty();
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(MCNumber value) {
		sa().ent_unit_qty(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(int value) {
		sa().ent_unit_qty(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(long value) {
		sa().ent_unit_qty(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(float value) {
		sa().ent_unit_qty(value);
	}

	/**
	 * Input unit qty. 入力単位数量.<p>
	 *
	 */
	public void ent_unit_qty(double value) {
		sa().ent_unit_qty(value);
	}

	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public String ent_unit_cd() {
		return sa().ent_unit_cd();
	}

	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public void ent_unit_cd(String value) {
		sa().ent_unit_cd(value);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return sa().abort_flg();
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		sa().abort_flg(value);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return sa().cst_itm_cd();
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		sa().cst_itm_cd(value);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return sa().cst_itm_nm();
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		sa().cst_itm_nm(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return sa().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		sa().stk_arrv_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return sa().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		sa().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return sa().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		sa().quality_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return sa().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		sa().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return sa().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		sa().stk_bp_cd(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return sa().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		sa().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return sa().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		sa().bd_dpt_cd(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return sa().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		sa().cst_po_no(value);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return sa().cst_po_d_no();
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		sa().cst_po_d_no(value);
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_no() {
		return sa().cst_dlv_inst_no();
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_no(String value) {
		sa().cst_dlv_inst_no(value);
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_d_no() {
		return sa().cst_dlv_inst_d_no();
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_d_no(String value) {
		sa().cst_dlv_inst_d_no(value);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return sa().base_dlv_slip_no();
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		sa().base_dlv_slip_no(value);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return sa().base_prov_act_no();
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		sa().base_prov_act_no(value);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return sa().base_ac_dt();
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		sa().base_ac_dt(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return sa().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		sa().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return sa().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		sa().trd_d_rmrks(value);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return sa().arr_cnt_rmrks();
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		sa().arr_cnt_rmrks(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return sa().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		sa().intr_d_rmrks(value);
	}

}

