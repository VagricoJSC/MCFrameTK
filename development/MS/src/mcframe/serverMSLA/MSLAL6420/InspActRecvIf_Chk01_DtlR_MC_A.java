package mcframe.serverMSLA.MSLAL6420;

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
 * ブロック"InspActRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspActRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $insp_if = "insp_if";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";

	public static final String $data_lno = $insp_if + ".data_lno";
	public static final String $data_no = $insp_if + ".data_no";
	public static final String $ext_sys_cd = $insp_if + ".ext_sys_cd";
	public static final String $ext_data_no = $insp_if + ".ext_data_no";
	public static final String $ext_data_lno = $insp_if + ".ext_data_lno";
	public static final String $data_crud_typ = $insp_if + ".data_crud_typ";
	public static final String $exe_sts_typ = $insp_if + ".exe_sts_typ";
	public static final String $insp_no = $insp_if + ".insp_no";
	public static final String $st_act_tm = $insp_if + ".st_act_tm";
	public static final String $end_act_tm = $insp_if + ".end_act_tm";
	public static final String $act_usr_cd = $insp_if + ".act_usr_cd";
	public static final String $act_dpt_cd = $insp_if + ".act_dpt_cd";
	public static final String $smpl_quality_typ = $insp_if + ".smpl_quality_typ";
	public static final String $smpl_gd_cd = $insp_if + ".smpl_gd_cd";
	public static final String $smpl_dfct_rsn_cd = $insp_if + ".smpl_dfct_rsn_cd";
	public static final String $act_cont_fctr = $insp_if + ".act_cont_fctr";
	public static final String $vld_dt_upd_flg = $insp_if + ".vld_dt_upd_flg";
	public static final String $lmt_dt_frm = $insp_if + ".lmt_dt_frm";
	public static final String $vld_dt = $insp_if + ".vld_dt";
	public static final String $lmt_dt = $insp_if + ".lmt_dt";
	public static final String $intr_rmrks = $insp_if + ".intr_rmrks";
	public static final String $lot_rmrks = $insp_if + ".lot_rmrks";
	public static final String $imp_only_judg = $insp_if + ".imp_only_judg";
	public static final String $insp_judg_rslt_typ = $insp_if + ".insp_judg_rslt_typ";
	public static final String $judg_dt = $insp_if + ".judg_dt";
	public static final String $judg_usr_cd = $insp_if + ".judg_usr_cd";
	public static final String $judg_dpt_cd = $insp_if + ".judg_dpt_cd";
	public static final String $judg_rsn = $insp_if + ".judg_rsn";
	public static final String $ext_insp_act_no = $insp_if + ".ext_insp_act_no";
	public static final String $insp_schd_no = $insp_if + ".insp_schd_no";
	public static final String $stk_loc_cd = $insp_if + ".stk_loc_cd";
	public static final String $stk_str_ln_cd = $insp_if + ".stk_str_ln_cd";
	public static final String $ttl_quality_typ = $insp_if + ".ttl_quality_typ";
	public static final String $ttl_gd_cd = $insp_if + ".ttl_gd_cd";
	public static final String $ttl_dfct_rsn_cd = $insp_if + ".ttl_dfct_rsn_cd";
	public static final String $ttl_act_tm = $insp_if + ".ttl_act_tm";
	public static final String $base_flg = $insp_if + ".base_flg";
	public static final String $pack_unit_qty = $insp_if + ".pack_unit_qty";
	public static final String $pack_unit_cd = $insp_if + ".pack_unit_cd";
	public static final String $ttl_pack_xfr_pack_unit_qty = $insp_if + ".ttl_pack_xfr_pack_unit_qty";
	public static final String $ttl_pack_xfr_pack_unit_cd = $insp_if + ".ttl_pack_xfr_pack_unit_cd";
	public static final String $ttl_intr_rmrks = $insp_if + ".ttl_intr_rmrks";
	public static final String $ext_insp_act_d_no = $insp_if + ".ext_insp_act_d_no";
	public static final String $so_qty = $insp_if + ".so_qty";
	public static final String $smpl_qty = $insp_if + ".smpl_qty";
	public static final String $smpl_pack_xfr_pack_unit_qty = $insp_if + ".smpl_pack_xfr_pack_unit_qty";
	public static final String $smpl_pack_xfr_pack_unit_cd = $insp_if + ".smpl_pack_xfr_pack_unit_cd";
	public static final String $smpl_act_tm = $insp_if + ".smpl_act_tm";
	public static final String $bd_dpt_cd = $insp_if + ".bd_dpt_cd";
	public static final String $trd_rmrks = $insp_if + ".trd_rmrks";
	public static final String $smpl_intr_rmrks = $insp_if + ".smpl_intr_rmrks";
	public static final String $ext_insp_smpl_act_no = $insp_if + ".ext_insp_smpl_act_no";
	public static final String $sub_char1 = $insp_if + ".sub_char1";
	public static final String $sub_char2 = $insp_if + ".sub_char2";
	public static final String $sub_char3 = $insp_if + ".sub_char3";
	public static final String $sub_char4 = $insp_if + ".sub_char4";
	public static final String $sub_char5 = $insp_if + ".sub_char5";
	public static final String $sub_char6 = $insp_if + ".sub_char6";
	public static final String $sub_char7 = $insp_if + ".sub_char7";
	public static final String $sub_char8 = $insp_if + ".sub_char8";
	public static final String $sub_char9 = $insp_if + ".sub_char9";
	public static final String $sub_char10 = $insp_if + ".sub_char10";
	public static final String $sub_char11 = $insp_if + ".sub_char11";
	public static final String $sub_char12 = $insp_if + ".sub_char12";
	public static final String $sub_char13 = $insp_if + ".sub_char13";
	public static final String $sub_char14 = $insp_if + ".sub_char14";
	public static final String $sub_char15 = $insp_if + ".sub_char15";
	public static final String $sub_char16 = $insp_if + ".sub_char16";
	public static final String $sub_char17 = $insp_if + ".sub_char17";
	public static final String $sub_char18 = $insp_if + ".sub_char18";
	public static final String $sub_char19 = $insp_if + ".sub_char19";
	public static final String $sub_char20 = $insp_if + ".sub_char20";
	public static final String $sub_char21 = $insp_if + ".sub_char21";
	public static final String $sub_char22 = $insp_if + ".sub_char22";
	public static final String $sub_char23 = $insp_if + ".sub_char23";
	public static final String $sub_char24 = $insp_if + ".sub_char24";
	public static final String $sub_char25 = $insp_if + ".sub_char25";
	public static final String $sub_char26 = $insp_if + ".sub_char26";
	public static final String $sub_char27 = $insp_if + ".sub_char27";
	public static final String $sub_char28 = $insp_if + ".sub_char28";
	public static final String $sub_char29 = $insp_if + ".sub_char29";
	public static final String $sub_char30 = $insp_if + ".sub_char30";
	public static final String $sub_num1 = $insp_if + ".sub_num1";
	public static final String $sub_num2 = $insp_if + ".sub_num2";
	public static final String $sub_num3 = $insp_if + ".sub_num3";
	public static final String $sub_num4 = $insp_if + ".sub_num4";
	public static final String $sub_num5 = $insp_if + ".sub_num5";
	public static final String $sub_dt1 = $insp_if + ".sub_dt1";
	public static final String $sub_dt2 = $insp_if + ".sub_dt2";
	public static final String $sub_dt3 = $insp_if + ".sub_dt3";
	public static final String $sub_dt4 = $insp_if + ".sub_dt4";
	public static final String $sub_dt5 = $insp_if + ".sub_dt5";
	public static final String $log_sub_key1 = $insp_if + ".log_sub_key1";
	public static final String $log_sub_key2 = $insp_if + ".log_sub_key2";

	public static final MCMeta insp_if_META = createInnerRowMeta($insp_if, mcframe.serverMS.dbc.MST_INSP_ACT_RECV_IF_R.class);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<InspActRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<InspActRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_if_META,
			err_flg_META,
			peg_no_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"ext_sys_cd",
				"ext_data_no",
				"ext_data_lno",
				"data_crud_typ",
				"exe_sts_typ",
				"insp_no",
				"st_act_tm",
				"end_act_tm",
				"act_usr_cd",
				"act_dpt_cd",
				"smpl_quality_typ",
				"smpl_gd_cd",
				"smpl_dfct_rsn_cd",
				"act_cont_fctr",
				"vld_dt_upd_flg",
				"lmt_dt_frm",
				"vld_dt",
				"lmt_dt",
				"intr_rmrks",
				"lot_rmrks",
				"imp_only_judg",
				"insp_judg_rslt_typ",
				"judg_dt",
				"judg_usr_cd",
				"judg_dpt_cd",
				"judg_rsn",
				"ext_insp_act_no",
				"insp_schd_no",
				"stk_loc_cd",
				"stk_str_ln_cd",
				"ttl_quality_typ",
				"ttl_gd_cd",
				"ttl_dfct_rsn_cd",
				"ttl_act_tm",
				"base_flg",
				"pack_unit_qty",
				"pack_unit_cd",
				"ttl_pack_xfr_pack_unit_qty",
				"ttl_pack_xfr_pack_unit_cd",
				"ttl_intr_rmrks",
				"ext_insp_act_d_no",
				"so_qty",
				"smpl_qty",
				"smpl_pack_xfr_pack_unit_qty",
				"smpl_pack_xfr_pack_unit_cd",
				"smpl_act_tm",
				"bd_dpt_cd",
				"trd_rmrks",
				"smpl_intr_rmrks",
				"ext_insp_smpl_act_no",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"sub_char4",
				"sub_char5",
				"sub_char6",
				"sub_char7",
				"sub_char8",
				"sub_char9",
				"sub_char10",
				"sub_char11",
				"sub_char12",
				"sub_char13",
				"sub_char14",
				"sub_char15",
				"sub_char16",
				"sub_char17",
				"sub_char18",
				"sub_char19",
				"sub_char20",
				"sub_char21",
				"sub_char22",
				"sub_char23",
				"sub_char24",
				"sub_char25",
				"sub_char26",
				"sub_char27",
				"sub_char28",
				"sub_char29",
				"sub_char30",
				"sub_num1",
				"sub_num2",
				"sub_num3",
				"sub_num4",
				"sub_num5",
				"sub_dt1",
				"sub_dt2",
				"sub_dt3",
				"sub_dt4",
				"sub_dt5",
				"log_sub_key1",
				"log_sub_key2"
			},
			{
				$data_lno,
				$data_no,
				$ext_sys_cd,
				$ext_data_no,
				$ext_data_lno,
				$data_crud_typ,
				$exe_sts_typ,
				$insp_no,
				$st_act_tm,
				$end_act_tm,
				$act_usr_cd,
				$act_dpt_cd,
				$smpl_quality_typ,
				$smpl_gd_cd,
				$smpl_dfct_rsn_cd,
				$act_cont_fctr,
				$vld_dt_upd_flg,
				$lmt_dt_frm,
				$vld_dt,
				$lmt_dt,
				$intr_rmrks,
				$lot_rmrks,
				$imp_only_judg,
				$insp_judg_rslt_typ,
				$judg_dt,
				$judg_usr_cd,
				$judg_dpt_cd,
				$judg_rsn,
				$ext_insp_act_no,
				$insp_schd_no,
				$stk_loc_cd,
				$stk_str_ln_cd,
				$ttl_quality_typ,
				$ttl_gd_cd,
				$ttl_dfct_rsn_cd,
				$ttl_act_tm,
				$base_flg,
				$pack_unit_qty,
				$pack_unit_cd,
				$ttl_pack_xfr_pack_unit_qty,
				$ttl_pack_xfr_pack_unit_cd,
				$ttl_intr_rmrks,
				$ext_insp_act_d_no,
				$so_qty,
				$smpl_qty,
				$smpl_pack_xfr_pack_unit_qty,
				$smpl_pack_xfr_pack_unit_cd,
				$smpl_act_tm,
				$bd_dpt_cd,
				$trd_rmrks,
				$smpl_intr_rmrks,
				$ext_insp_smpl_act_no,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$sub_char4,
				$sub_char5,
				$sub_char6,
				$sub_char7,
				$sub_char8,
				$sub_char9,
				$sub_char10,
				$sub_char11,
				$sub_char12,
				$sub_char13,
				$sub_char14,
				$sub_char15,
				$sub_char16,
				$sub_char17,
				$sub_char18,
				$sub_char19,
				$sub_char20,
				$sub_char21,
				$sub_char22,
				$sub_char23,
				$sub_char24,
				$sub_char25,
				$sub_char26,
				$sub_char27,
				$sub_char28,
				$sub_char29,
				$sub_char30,
				$sub_num1,
				$sub_num2,
				$sub_num3,
				$sub_num4,
				$sub_num5,
				$sub_dt1,
				$sub_dt2,
				$sub_dt3,
				$sub_dt4,
				$sub_dt5,
				$log_sub_key1,
				$log_sub_key2
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
				{$insp_if + ".data_lno", "E"},	// insp_if.data_lno
				{$insp_if + ".data_no", "E"},	// insp_if.data_no
				{$insp_if + ".ext_data_no", "E"},	// insp_if.ext_data_no
				{$insp_if + ".ext_data_lno", "E"},	// insp_if.ext_data_lno
				{$insp_if + ".data_crud_typ", "E"},	// insp_if.data_crud_typ
				{$insp_if + ".insp_no", "E"},	// insp_if.insp_no
				{$insp_if + ".ext_insp_act_no", "E"}	// insp_if.ext_insp_act_no
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$insp_if + ".so_qty", "positive"},	// insp_if.so_qty
				{$insp_if + ".smpl_qty", "positive"}	// insp_if.smpl_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$insp_if + ".so_qty", "smpl_qty:S,so_qty:S"},	// insp_if.so_qty
				{$insp_if + ".smpl_qty", "smpl_qty:L"},	// insp_if.smpl_qty
				{$insp_if + ".smpl_pack_xfr_pack_unit_qty", "so_qty:L"}	// insp_if.smpl_pack_xfr_pack_unit_qty
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$insp_if + ".st_act_tm", "tmBfToday"},	// insp_if.st_act_tm
				{$insp_if + ".end_act_tm", "tmBfToday"},	// insp_if.end_act_tm
				{$insp_if + ".judg_dt", "bfToday"},	// insp_if.judg_dt
				{$insp_if + ".ttl_act_tm", "tmBfToday"},	// insp_if.ttl_act_tm
				{$insp_if + ".smpl_act_tm", "tmBfToday"}	// insp_if.smpl_act_tm
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$insp_if + ".st_act_tm", "st_tm1:BF,st_tm2:BF,st_tm3:BF,st_tm4:BF"},	// insp_if.st_act_tm
				{$insp_if + ".end_act_tm", "st_tm1:AF"},	// insp_if.end_act_tm
				{$insp_if + ".vld_dt", "lmt:BF"},	// insp_if.vld_dt
				{$insp_if + ".lmt_dt", "lmt:AF"},	// insp_if.lmt_dt
				{$insp_if + ".judg_dt", "st_tm2:AF"},	// insp_if.judg_dt
				{$insp_if + ".ttl_act_tm", "st_tm3:AF"},	// insp_if.ttl_act_tm
				{$insp_if + ".smpl_act_tm", "st_tm4:AF"}	// insp_if.smpl_act_tm
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
				{$insp_if + ".ext_insp_act_d_no", "E"},	// insp_if.ext_insp_act_d_no
				{$insp_if + ".ext_insp_smpl_act_no", "E"}	// insp_if.ext_insp_smpl_act_no
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
				{$insp_if + ".act_usr_cd", "MA.MAUAL0010.Usr"},	// insp_if.act_usr_cd
				{$insp_if + ".act_dpt_cd", "MA.MAUAL0010.Dpt"},	// insp_if.act_dpt_cd
				{$insp_if + ".smpl_gd_cd", "MA.MAUAL0010.StkGd"},	// insp_if.smpl_gd_cd
				{$insp_if + ".smpl_dfct_rsn_cd", "MA.MAUAL0010.DfctBizRsn"},	// insp_if.smpl_dfct_rsn_cd
				{$insp_if + ".judg_usr_cd", "MA.MAUAL0010.Usr"},	// insp_if.judg_usr_cd
				{$insp_if + ".judg_dpt_cd", "MA.MAUAL0010.Dpt"},	// insp_if.judg_dpt_cd
				{$insp_if + ".stk_loc_cd", "MA.MAUAL0010.Loc"},	// insp_if.stk_loc_cd
				{$insp_if + ".stk_str_ln_cd", "MA.MAUAL0010.StrLn"},	// insp_if.stk_str_ln_cd
				{$insp_if + ".ttl_gd_cd", "MA.MAUAL0010.StkGd"},	// insp_if.ttl_gd_cd
				{$insp_if + ".ttl_dfct_rsn_cd", "MA.MAUAL0010.DfctBizRsn"},	// insp_if.ttl_dfct_rsn_cd
				{$insp_if + ".bd_dpt_cd", "MA.MAUAL0010.Dpt"}	// insp_if.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$insp_if + ".act_dpt_cd", "st_act_tm;act_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"},	// insp_if.act_dpt_cd
				{$insp_if + ".judg_dpt_cd", "judg_dt;judg_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"},	// insp_if.judg_dpt_cd
				{$insp_if + ".stk_loc_cd", "MAC_LOC_IS_SRCH_TYP.COMM"},	// insp_if.stk_loc_cd
				{$insp_if + ".stk_str_ln_cd", "stk_loc_cd;true"},	// insp_if.stk_str_ln_cd
				{$insp_if + ".bd_dpt_cd", "smpl_act_tm;MAC_DPT_IS_SRCH_TYP.BD;true"}	// insp_if.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$insp_if + ".act_dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// insp_if.act_dpt_cd
				{$insp_if + ".judg_dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// insp_if.judg_dpt_cd
				{$insp_if + ".stk_loc_cd", "loc_is_srch_typ"},	// insp_if.stk_loc_cd
				{$insp_if + ".stk_str_ln_cd", "loc_cd;mode_nullval_flg"},	// insp_if.stk_str_ln_cd
				{$insp_if + ".bd_dpt_cd", "dt;dpt_is_srch_typ;bd_dpt_flg"}	// insp_if.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$insp_if + ".data_crud_typ", "MAC_DATA_CRUD_TYP"},	// insp_if.data_crud_typ
				{$insp_if + ".exe_sts_typ", "MAC_EXE_STS_TYP"},	// insp_if.exe_sts_typ
				{$insp_if + ".smpl_quality_typ", "MAC_QUALITY_TYP"},	// insp_if.smpl_quality_typ
				{$insp_if + ".insp_judg_rslt_typ", "MSC_INSP_JUDG_RSLT_TYP"},	// insp_if.insp_judg_rslt_typ
				{$insp_if + ".ttl_quality_typ", "MAC_QUALITY_TYP"}	// insp_if.ttl_quality_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
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
	protected InspActRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends InspActRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActRecvIf_Chk01_DtlR clone() {
		return (InspActRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActRecvIf_Chk01_DtlR createInstance() {
		return (InspActRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspActRecvIf_Chk01_DtlR getValues(String... names) {
		return (InspActRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_INSP_ACT_RECV_IF_R insp_if(){
		return (mcframe.serverMS.dbc.MST_INSP_ACT_RECV_IF_R) getConstInnerRow(offset + 0, $insp_if);
	}
	
	public void insp_if(mcframe.serverMS.dbc.MST_INSP_ACT_RECV_IF_R row){
		setConstInnerRow(offset + 0, $insp_if, row);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($insp_if.equalsIgnoreCase(name)) {
			return insp_if();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($insp_if.equalsIgnoreCase(name)) {
			insp_if(
				((MCContainerMeta) insp_if_META).castInnerRow(mcframe.serverMS.dbc.MST_INSP_ACT_RECV_IF_R.class, value)
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
		return insp_if().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		insp_if().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		insp_if().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		insp_if().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		insp_if().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		insp_if().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return insp_if().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		insp_if().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		insp_if().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		insp_if().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		insp_if().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		insp_if().data_no(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return insp_if().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		insp_if().ext_sys_cd(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return insp_if().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		insp_if().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		insp_if().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		insp_if().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		insp_if().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		insp_if().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return insp_if().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		insp_if().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		insp_if().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		insp_if().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		insp_if().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		insp_if().ext_data_lno(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return insp_if().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		insp_if().data_crud_typ(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return insp_if().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		insp_if().exe_sts_typ(value);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return insp_if().insp_no();
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		insp_if().insp_no(value);
	}

	/**
	 * Inspection start date and time 検査開始日時.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return insp_if().st_act_tm();
	}

	/**
	 * Inspection start date and time 検査開始日時.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		insp_if().st_act_tm(value);
	}

	/**
	 * Inspection finish date and time 検査終了日時.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return insp_if().end_act_tm();
	}

	/**
	 * Inspection finish date and time 検査終了日時.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		insp_if().end_act_tm(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return insp_if().act_usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		insp_if().act_usr_cd(value);
	}

	/**
	 * Implementation dept. cd. 実施担当部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return insp_if().act_dpt_cd();
	}

	/**
	 * Implementation dept. cd. 実施担当部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		insp_if().act_dpt_cd(value);
	}

	/**
	 * Conforming type (Sampling) 良品区分（抜取）.<p>
	 *
	 */
	public String smpl_quality_typ() {
		return insp_if().smpl_quality_typ();
	}

	/**
	 * Conforming type (Sampling) 良品区分（抜取）.<p>
	 *
	 */
	public void smpl_quality_typ(String value) {
		insp_if().smpl_quality_typ(value);
	}

	/**
	 * Grading cd. (Sampling) 格付ＣＤ（抜取）.<p>
	 *
	 */
	public String smpl_gd_cd() {
		return insp_if().smpl_gd_cd();
	}

	/**
	 * Grading cd. (Sampling) 格付ＣＤ（抜取）.<p>
	 *
	 */
	public void smpl_gd_cd(String value) {
		insp_if().smpl_gd_cd(value);
	}

	/**
	 * Defective reason cd. (Sampling) 不良理由ＣＤ（抜取）.<p>
	 *
	 */
	public String smpl_dfct_rsn_cd() {
		return insp_if().smpl_dfct_rsn_cd();
	}

	/**
	 * Defective reason cd. (Sampling) 不良理由ＣＤ（抜取）.<p>
	 *
	 */
	public void smpl_dfct_rsn_cd(String value) {
		insp_if().smpl_dfct_rsn_cd(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return insp_if().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		insp_if().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		insp_if().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		insp_if().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		insp_if().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		insp_if().act_cont_fctr(value);
	}

	/**
	 * Expiration date update flg. 有効期限更新ＦＬＧ.<p>
	 *
	 */
	public boolean vld_dt_upd_flg() {
		return insp_if().vld_dt_upd_flg();
	}

	/**
	 * Expiration date update flg. 有効期限更新ＦＬＧ.<p>
	 *
	 */
	public void vld_dt_upd_flg(boolean value) {
		insp_if().vld_dt_upd_flg(value);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return insp_if().lmt_dt_frm();
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		insp_if().lmt_dt_frm(value);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return insp_if().vld_dt();
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		insp_if().vld_dt(value);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return insp_if().lmt_dt();
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		insp_if().lmt_dt(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return insp_if().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		insp_if().intr_rmrks(value);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return insp_if().lot_rmrks();
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		insp_if().lot_rmrks(value);
	}

	/**
	 * Import decision only flg. 判定のみ取込ＦＬＧ.<p>
	 *
	 */
	public boolean imp_only_judg() {
		return insp_if().imp_only_judg();
	}

	/**
	 * Import decision only flg. 判定のみ取込ＦＬＧ.<p>
	 *
	 */
	public void imp_only_judg(boolean value) {
		insp_if().imp_only_judg(value);
	}

	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return insp_if().insp_judg_rslt_typ();
	}

	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		insp_if().insp_judg_rslt_typ(value);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return insp_if().judg_dt();
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		insp_if().judg_dt(value);
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return insp_if().judg_usr_cd();
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		insp_if().judg_usr_cd(value);
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return insp_if().judg_dpt_cd();
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		insp_if().judg_dpt_cd(value);
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public String judg_rsn() {
		return insp_if().judg_rsn();
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		insp_if().judg_rsn(value);
	}

	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_no() {
		return insp_if().ext_insp_act_no();
	}

	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_no(String value) {
		insp_if().ext_insp_act_no(value);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return insp_if().insp_schd_no();
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		insp_if().insp_schd_no(value);
	}

	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public String stk_loc_cd() {
		return insp_if().stk_loc_cd();
	}

	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		insp_if().stk_loc_cd(value);
	}

	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public String stk_str_ln_cd() {
		return insp_if().stk_str_ln_cd();
	}

	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public void stk_str_ln_cd(String value) {
		insp_if().stk_str_ln_cd(value);
	}

	/**
	 * Conforming type (100%) 良品区分（全数）.<p>
	 *
	 */
	public String ttl_quality_typ() {
		return insp_if().ttl_quality_typ();
	}

	/**
	 * Conforming type (100%) 良品区分（全数）.<p>
	 *
	 */
	public void ttl_quality_typ(String value) {
		insp_if().ttl_quality_typ(value);
	}

	/**
	 * Grading cd. (100%) 格付ＣＤ（全数）.<p>
	 *
	 */
	public String ttl_gd_cd() {
		return insp_if().ttl_gd_cd();
	}

	/**
	 * Grading cd. (100%) 格付ＣＤ（全数）.<p>
	 *
	 */
	public void ttl_gd_cd(String value) {
		insp_if().ttl_gd_cd(value);
	}

	/**
	 * Defective reason cd. (100%) 不良理由ＣＤ（全数）.<p>
	 *
	 */
	public String ttl_dfct_rsn_cd() {
		return insp_if().ttl_dfct_rsn_cd();
	}

	/**
	 * Defective reason cd. (100%) 不良理由ＣＤ（全数）.<p>
	 *
	 */
	public void ttl_dfct_rsn_cd(String value) {
		insp_if().ttl_dfct_rsn_cd(value);
	}

	/**
	 * Actual date and time (100%) 実績日時（全数）.<p>
	 *
	 */
	public MCDate ttl_act_tm() {
		return insp_if().ttl_act_tm();
	}

	/**
	 * Actual date and time (100%) 実績日時（全数）.<p>
	 *
	 */
	public void ttl_act_tm(MCDate value) {
		insp_if().ttl_act_tm(value);
	}

	/**
	 * Base flg. 基準ＦＬＧ.<p>
	 *
	 */
	public boolean base_flg() {
		return insp_if().base_flg();
	}

	/**
	 * Base flg. 基準ＦＬＧ.<p>
	 *
	 */
	public void base_flg(boolean value) {
		insp_if().base_flg(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return insp_if().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		insp_if().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		insp_if().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		insp_if().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		insp_if().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		insp_if().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return insp_if().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		insp_if().pack_unit_cd(value);
	}

	/**
	 * SKU transfer SKU qty. (100%) 荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public MCNumber ttl_pack_xfr_pack_unit_qty() {
		return insp_if().ttl_pack_xfr_pack_unit_qty();
	}

	/**
	 * SKU transfer SKU qty. (100%) 荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(MCNumber value) {
		insp_if().ttl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (100%) 荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(int value) {
		insp_if().ttl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (100%) 荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(long value) {
		insp_if().ttl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (100%) 荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(float value) {
		insp_if().ttl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (100%) 荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(double value) {
		insp_if().ttl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU cd. (100%) 荷姿振替荷姿単位ＣＤ（全数）.<p>
	 *
	 */
	public String ttl_pack_xfr_pack_unit_cd() {
		return insp_if().ttl_pack_xfr_pack_unit_cd();
	}

	/**
	 * SKU transfer SKU cd. (100%) 荷姿振替荷姿単位ＣＤ（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_cd(String value) {
		insp_if().ttl_pack_xfr_pack_unit_cd(value);
	}

	/**
	 * Internal remarks (100%) 内部備考（全数）.<p>
	 *
	 */
	public String ttl_intr_rmrks() {
		return insp_if().ttl_intr_rmrks();
	}

	/**
	 * Internal remarks (100%) 内部備考（全数）.<p>
	 *
	 */
	public void ttl_intr_rmrks(String value) {
		insp_if().ttl_intr_rmrks(value);
	}

	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_d_no() {
		return insp_if().ext_insp_act_d_no();
	}

	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_d_no(String value) {
		insp_if().ext_insp_act_d_no(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public MCNumber so_qty() {
		return insp_if().so_qty();
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(MCNumber value) {
		insp_if().so_qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(int value) {
		insp_if().so_qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(long value) {
		insp_if().so_qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(float value) {
		insp_if().so_qty(value);
	}

	/**
	 * Deducted qty. 引落数量.<p>
	 *
	 */
	public void so_qty(double value) {
		insp_if().so_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public MCNumber smpl_qty() {
		return insp_if().smpl_qty();
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(MCNumber value) {
		insp_if().smpl_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(int value) {
		insp_if().smpl_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(long value) {
		insp_if().smpl_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(float value) {
		insp_if().smpl_qty(value);
	}

	/**
	 * Sampling qty. 抜取数量.<p>
	 *
	 */
	public void smpl_qty(double value) {
		insp_if().smpl_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (Sampling) 荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public MCNumber smpl_pack_xfr_pack_unit_qty() {
		return insp_if().smpl_pack_xfr_pack_unit_qty();
	}

	/**
	 * SKU transfer SKU qty. (Sampling) 荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(MCNumber value) {
		insp_if().smpl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (Sampling) 荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(int value) {
		insp_if().smpl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (Sampling) 荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(long value) {
		insp_if().smpl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (Sampling) 荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(float value) {
		insp_if().smpl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU qty. (Sampling) 荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(double value) {
		insp_if().smpl_pack_xfr_pack_unit_qty(value);
	}

	/**
	 * SKU transfer SKU cd. (Sampling) 荷姿振替荷姿単位ＣＤ（抜取）.<p>
	 *
	 */
	public String smpl_pack_xfr_pack_unit_cd() {
		return insp_if().smpl_pack_xfr_pack_unit_cd();
	}

	/**
	 * SKU transfer SKU cd. (Sampling) 荷姿振替荷姿単位ＣＤ（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_cd(String value) {
		insp_if().smpl_pack_xfr_pack_unit_cd(value);
	}

	/**
	 * Actual date and time (Sampling) 実績日時（抜取）.<p>
	 *
	 */
	public MCDate smpl_act_tm() {
		return insp_if().smpl_act_tm();
	}

	/**
	 * Actual date and time (Sampling) 実績日時（抜取）.<p>
	 *
	 */
	public void smpl_act_tm(MCDate value) {
		insp_if().smpl_act_tm(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return insp_if().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		insp_if().bd_dpt_cd(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return insp_if().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		insp_if().trd_rmrks(value);
	}

	/**
	 * Internal remarks (Sampling) 内部備考（抜取）.<p>
	 *
	 */
	public String smpl_intr_rmrks() {
		return insp_if().smpl_intr_rmrks();
	}

	/**
	 * Internal remarks (Sampling) 内部備考（抜取）.<p>
	 *
	 */
	public void smpl_intr_rmrks(String value) {
		insp_if().smpl_intr_rmrks(value);
	}

	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_smpl_act_no() {
		return insp_if().ext_insp_smpl_act_no();
	}

	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_smpl_act_no(String value) {
		insp_if().ext_insp_smpl_act_no(value);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return insp_if().sub_char1();
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		insp_if().sub_char1(value);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return insp_if().sub_char2();
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		insp_if().sub_char2(value);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return insp_if().sub_char3();
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		insp_if().sub_char3(value);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return insp_if().sub_char4();
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		insp_if().sub_char4(value);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return insp_if().sub_char5();
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		insp_if().sub_char5(value);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return insp_if().sub_char6();
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		insp_if().sub_char6(value);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return insp_if().sub_char7();
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		insp_if().sub_char7(value);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return insp_if().sub_char8();
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		insp_if().sub_char8(value);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return insp_if().sub_char9();
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		insp_if().sub_char9(value);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return insp_if().sub_char10();
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		insp_if().sub_char10(value);
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return insp_if().sub_char11();
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		insp_if().sub_char11(value);
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return insp_if().sub_char12();
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		insp_if().sub_char12(value);
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return insp_if().sub_char13();
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		insp_if().sub_char13(value);
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return insp_if().sub_char14();
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		insp_if().sub_char14(value);
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return insp_if().sub_char15();
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		insp_if().sub_char15(value);
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return insp_if().sub_char16();
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		insp_if().sub_char16(value);
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return insp_if().sub_char17();
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		insp_if().sub_char17(value);
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return insp_if().sub_char18();
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		insp_if().sub_char18(value);
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return insp_if().sub_char19();
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		insp_if().sub_char19(value);
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return insp_if().sub_char20();
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		insp_if().sub_char20(value);
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return insp_if().sub_char21();
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		insp_if().sub_char21(value);
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return insp_if().sub_char22();
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		insp_if().sub_char22(value);
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return insp_if().sub_char23();
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		insp_if().sub_char23(value);
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return insp_if().sub_char24();
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		insp_if().sub_char24(value);
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return insp_if().sub_char25();
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		insp_if().sub_char25(value);
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return insp_if().sub_char26();
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		insp_if().sub_char26(value);
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return insp_if().sub_char27();
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		insp_if().sub_char27(value);
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return insp_if().sub_char28();
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		insp_if().sub_char28(value);
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return insp_if().sub_char29();
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		insp_if().sub_char29(value);
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return insp_if().sub_char30();
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		insp_if().sub_char30(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return insp_if().sub_num1();
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		insp_if().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		insp_if().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		insp_if().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		insp_if().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		insp_if().sub_num1(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return insp_if().sub_num2();
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		insp_if().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		insp_if().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		insp_if().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		insp_if().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		insp_if().sub_num2(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return insp_if().sub_num3();
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		insp_if().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		insp_if().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		insp_if().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		insp_if().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		insp_if().sub_num3(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return insp_if().sub_num4();
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		insp_if().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		insp_if().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		insp_if().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		insp_if().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		insp_if().sub_num4(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return insp_if().sub_num5();
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		insp_if().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		insp_if().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		insp_if().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		insp_if().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		insp_if().sub_num5(value);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return insp_if().sub_dt1();
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		insp_if().sub_dt1(value);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return insp_if().sub_dt2();
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		insp_if().sub_dt2(value);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return insp_if().sub_dt3();
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		insp_if().sub_dt3(value);
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return insp_if().sub_dt4();
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		insp_if().sub_dt4(value);
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return insp_if().sub_dt5();
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		insp_if().sub_dt5(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return insp_if().log_sub_key1();
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		insp_if().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		insp_if().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		insp_if().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		insp_if().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		insp_if().log_sub_key1(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return insp_if().log_sub_key2();
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		insp_if().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		insp_if().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		insp_if().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		insp_if().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		insp_if().log_sub_key2(value);
	}

}

