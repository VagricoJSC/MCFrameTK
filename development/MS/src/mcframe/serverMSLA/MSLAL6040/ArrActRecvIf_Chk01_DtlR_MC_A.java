package mcframe.serverMSLA.MSLAL6040;

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
 * ブロック"ArrActRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrActRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $aa = "aa";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_ret_schd_no = "sls_ret_schd_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public static final String $arr_schd_tm = "arr_schd_tm";
	/**
	 * Error flg. エラーフラグ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Push notification WG group cd. プッシュ通知ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $push_alert_wg_cd = "push_alert_wg_cd";
	/**
	 * Push notification PIC cd. プッシュ通知担当者ＣＤ.<p>
	 *
	 */
	public static final String $push_alert_usr_cd = "push_alert_usr_cd";
	public static final String $aaIf = "aaIf";

	public static final String $data_lno = $aa + ".data_lno";
	public static final String $data_no = $aa + ".data_no";
	public static final String $exe_sts_typ = $aa + ".exe_sts_typ";
	public static final String $data_crud_typ = $aa + ".data_crud_typ";
	public static final String $ext_sys_cd = $aa + ".ext_sys_cd";
	public static final String $ext_data_no = $aa + ".ext_data_no";
	public static final String $ext_data_lno = $aa + ".ext_data_lno";
	public static final String $data_make_dt = $aa + ".data_make_dt";
	public static final String $imp_flg = $aa + ".imp_flg";
	public static final String $recv_dt = $aa + ".recv_dt";
	public static final String $arr_schd_no = $aa + ".arr_schd_no";
	public static final String $if_po_no = $aa + ".po_no";
	public static final String $po_d_no = $aa + ".po_d_no";
	public static final String $prms_rcpt_d_no = $aa + ".prms_rcpt_d_no";
	public static final String $dlv_inst_no = $aa + ".dlv_inst_no";
	public static final String $dlv_inst_d_no = $aa + ".dlv_inst_d_no";
	public static final String $rcpt_iv_d_no = $aa + ".rcpt_iv_d_no";
	public static final String $sls_ret_schd_d_no = $aa + ".sls_ret_schd_d_no";
	public static final String $dlv_slip_d_no = $aa + ".dlv_slip_d_no";
	public static final String $iv_d_no = $aa + ".iv_d_no";
	public static final String $ext_arr_act_no = $aa + ".ext_arr_act_no";
	public static final String $sppl_cd = $aa + ".sppl_cd";
	public static final String $arr_tm = $aa + ".arr_tm";
	public static final String $arr_dpt_cd = $aa + ".arr_dpt_cd";
	public static final String $arr_usr_cd = $aa + ".arr_usr_cd";
	public static final String $arr_lg_grp_cd = $aa + ".arr_lg_grp_cd";
	public static final String $arr_loc_cd = $aa + ".arr_loc_cd";
	public static final String $arr_str_ln_cd = $aa + ".arr_str_ln_cd";
	public static final String $itm_cd = $aa + ".itm_cd";
	public static final String $itm_sub1 = $aa + ".itm_sub1";
	public static final String $itm_sub2 = $aa + ".itm_sub2";
	public static final String $itm_sub3 = $aa + ".itm_sub3";
	public static final String $lot_no = $aa + ".lot_no";
	public static final String $sublot_no = $aa + ".sublot_no";
	public static final String $ver_no = $aa + ".ver_no";
	public static final String $gd_cd = $aa + ".gd_cd";
	public static final String $trd_unit_qty = $aa + ".trd_unit_qty";
	public static final String $trd_unit_cd = $aa + ".trd_unit_cd";
	public static final String $abort_flg = $aa + ".abort_flg";
	public static final String $bp_lot_no = $aa + ".bp_lot_no";
	public static final String $bp_dlv_slip_no = $aa + ".bp_dlv_slip_no";
	public static final String $bp_dlv_slip_d_no = $aa + ".bp_dlv_slip_d_no";
	public static final String $ship_fr_valid_dt = $aa + ".ship_fr_valid_dt";
	public static final String $intr_rmrks = $aa + ".intr_rmrks";
	public static final String $insp_cnt_rmrks = $aa + ".insp_cnt_rmrks";
	public static final String $sub_char1 = $aa + ".sub_char1";
	public static final String $sub_char2 = $aa + ".sub_char2";
	public static final String $sub_char3 = $aa + ".sub_char3";
	public static final String $sub_char4 = $aa + ".sub_char4";
	public static final String $sub_char5 = $aa + ".sub_char5";
	public static final String $sub_char6 = $aa + ".sub_char6";
	public static final String $sub_char7 = $aa + ".sub_char7";
	public static final String $sub_char8 = $aa + ".sub_char8";
	public static final String $sub_char9 = $aa + ".sub_char9";
	public static final String $sub_char10 = $aa + ".sub_char10";
	public static final String $sub_char11 = $aa + ".sub_char11";
	public static final String $sub_char12 = $aa + ".sub_char12";
	public static final String $sub_char13 = $aa + ".sub_char13";
	public static final String $sub_char14 = $aa + ".sub_char14";
	public static final String $sub_char15 = $aa + ".sub_char15";
	public static final String $sub_char16 = $aa + ".sub_char16";
	public static final String $sub_char17 = $aa + ".sub_char17";
	public static final String $sub_char18 = $aa + ".sub_char18";
	public static final String $sub_char19 = $aa + ".sub_char19";
	public static final String $sub_char20 = $aa + ".sub_char20";
	public static final String $sub_char21 = $aa + ".sub_char21";
	public static final String $sub_char22 = $aa + ".sub_char22";
	public static final String $sub_char23 = $aa + ".sub_char23";
	public static final String $sub_char24 = $aa + ".sub_char24";
	public static final String $sub_char25 = $aa + ".sub_char25";
	public static final String $sub_char26 = $aa + ".sub_char26";
	public static final String $sub_char27 = $aa + ".sub_char27";
	public static final String $sub_char28 = $aa + ".sub_char28";
	public static final String $sub_char29 = $aa + ".sub_char29";
	public static final String $sub_char30 = $aa + ".sub_char30";
	public static final String $sub_num1 = $aa + ".sub_num1";
	public static final String $sub_num2 = $aa + ".sub_num2";
	public static final String $sub_num3 = $aa + ".sub_num3";
	public static final String $sub_num4 = $aa + ".sub_num4";
	public static final String $sub_num5 = $aa + ".sub_num5";
	public static final String $sub_dt1 = $aa + ".sub_dt1";
	public static final String $sub_dt2 = $aa + ".sub_dt2";
	public static final String $sub_dt3 = $aa + ".sub_dt3";
	public static final String $sub_dt4 = $aa + ".sub_dt4";
	public static final String $sub_dt5 = $aa + ".sub_dt5";

	public static final MCMeta aa_META = createInnerRowMeta($aa, mcframe.serverMS.dbc.MSVT_ARR_ACT_RECV_IF_R.class);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta sls_ret_schd_no_META = createCommonMeta($sls_ret_schd_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta arr_schd_tm_META = createCommonMeta($arr_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta push_alert_wg_cd_META = createCommonMeta($push_alert_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta push_alert_usr_cd_META = createCommonMeta($push_alert_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aaIf_META = createInnerRowMeta($aaIf, mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);

	protected static final ConstMetaList<ArrActRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<ArrActRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			aa_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			po_no_META,
			sls_ret_schd_no_META,
			iv_no_META,
			dlv_slip_no_META,
			arr_schd_tm_META,
			err_flg_META,
			push_alert_wg_cd_META,
			push_alert_usr_cd_META,
			aaIf_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"exe_sts_typ",
				"data_crud_typ",
				"ext_sys_cd",
				"ext_data_no",
				"ext_data_lno",
				"data_make_dt",
				"imp_flg",
				"recv_dt",
				"arr_schd_no",
				"if_po_no",
				"po_d_no",
				"prms_rcpt_d_no",
				"dlv_inst_no",
				"dlv_inst_d_no",
				"rcpt_iv_d_no",
				"sls_ret_schd_d_no",
				"dlv_slip_d_no",
				"iv_d_no",
				"ext_arr_act_no",
				"sppl_cd",
				"arr_tm",
				"arr_dpt_cd",
				"arr_usr_cd",
				"arr_lg_grp_cd",
				"arr_loc_cd",
				"arr_str_ln_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"ver_no",
				"gd_cd",
				"trd_unit_qty",
				"trd_unit_cd",
				"abort_flg",
				"bp_lot_no",
				"bp_dlv_slip_no",
				"bp_dlv_slip_d_no",
				"ship_fr_valid_dt",
				"intr_rmrks",
				"insp_cnt_rmrks",
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
				"sub_dt5"
			},
			{
				$data_lno,
				$data_no,
				$exe_sts_typ,
				$data_crud_typ,
				$ext_sys_cd,
				$ext_data_no,
				$ext_data_lno,
				$data_make_dt,
				$imp_flg,
				$recv_dt,
				$arr_schd_no,
				$if_po_no,
				$po_d_no,
				$prms_rcpt_d_no,
				$dlv_inst_no,
				$dlv_inst_d_no,
				$rcpt_iv_d_no,
				$sls_ret_schd_d_no,
				$dlv_slip_d_no,
				$iv_d_no,
				$ext_arr_act_no,
				$sppl_cd,
				$arr_tm,
				$arr_dpt_cd,
				$arr_usr_cd,
				$arr_lg_grp_cd,
				$arr_loc_cd,
				$arr_str_ln_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$ver_no,
				$gd_cd,
				$trd_unit_qty,
				$trd_unit_cd,
				$abort_flg,
				$bp_lot_no,
				$bp_dlv_slip_no,
				$bp_dlv_slip_d_no,
				$ship_fr_valid_dt,
				$intr_rmrks,
				$insp_cnt_rmrks,
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
				$sub_dt5
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
				{$aa + ".data_crud_typ", "E"},	// aa.data_crud_typ
				{$aa + ".ext_arr_act_no", "E"},	// aa.ext_arr_act_no
				{$aa + ".arr_lg_grp_cd", "E"}	// aa.arr_lg_grp_cd
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
				{$aa + ".arr_dpt_cd", "MA.MAUAL0010.Dpt"},	// aa.arr_dpt_cd
				{$aa + ".arr_usr_cd", "MA.MAUAL0010.Usr"},	// aa.arr_usr_cd
				{$aa + ".arr_lg_grp_cd", "MA.MAUAL0010.LgGrp"},	// aa.arr_lg_grp_cd
				{$aa + ".arr_loc_cd", "MA.MAUAL0010.Loc"},	// aa.arr_loc_cd
				{$aa + ".arr_str_ln_cd", "MA.MAUAL0010.StrLn"},	// aa.arr_str_ln_cd
				{$aa + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// aa.itm_sub3
				{$aa + ".gd_cd", "MA.MAUAL0010.StkGd"}	// aa.gd_cd
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
				{$aa + ".arr_dpt_cd", "arr_tm;MAC_DPT_IS_SRCH_TYP.ARR"},	// aa.arr_dpt_cd
				{$aa + ".arr_str_ln_cd", "arr_loc_cd;true"},	// aa.arr_str_ln_cd
				{$aa + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"}	// aa.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$aa + ".arr_dpt_cd", "dt;dpt_is_srch_typ"},	// aa.arr_dpt_cd
				{$aa + ".arr_str_ln_cd", "loc_cd;mode_nullval_flg"},	// aa.arr_str_ln_cd
				{$aa + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// aa.itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$aa + ".data_crud_typ", "MAC_DATA_CRUD_TYP"}	// aa.data_crud_typ
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
	protected ArrActRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends ArrActRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActRecvIf_Chk01_DtlR clone() {
		return (ArrActRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActRecvIf_Chk01_DtlR createInstance() {
		return (ArrActRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActRecvIf_Chk01_DtlR getValues(String... names) {
		return (ArrActRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MSVT_ARR_ACT_RECV_IF_R aa(){
		return (mcframe.serverMS.dbc.MSVT_ARR_ACT_RECV_IF_R) getConstInnerRow(offset + 0, $aa);
	}
	
	public void aa(mcframe.serverMS.dbc.MSVT_ARR_ACT_RECV_IF_R row){
		setConstInnerRow(offset + 0, $aa, row);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 1, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 1, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 2, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 2, $rcpt_iv_mng_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 3, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 3, $po_no, value);
	}


	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_no() {
		return getConstString(offset + 4, $sls_ret_schd_no);
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_no(String value) {
		setConstString(offset + 4, $sls_ret_schd_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 5, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 5, $iv_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 6, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 6, $dlv_slip_no, value);
	}


	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public MCDate arr_schd_tm() {
		return getConstDate(offset + 7, $arr_schd_tm);
	}

	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public void arr_schd_tm(MCDate value) {
		setConstDate(offset + 7, $arr_schd_tm, value);
	}


	/**
	 * Error flg. エラーフラグ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 8, $err_flg);
	}

	/**
	 * Error flg. エラーフラグ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 8, $err_flg, value);
	}


	/**
	 * Push notification WG group cd. プッシュ通知ワーキンググループＣＤ.<p>
	 *
	 */
	public String push_alert_wg_cd() {
		return getConstString(offset + 9, $push_alert_wg_cd);
	}

	/**
	 * Push notification WG group cd. プッシュ通知ワーキンググループＣＤ.<p>
	 *
	 */
	public void push_alert_wg_cd(String value) {
		setConstString(offset + 9, $push_alert_wg_cd, value);
	}


	/**
	 * Push notification PIC cd. プッシュ通知担当者ＣＤ.<p>
	 *
	 */
	public String push_alert_usr_cd() {
		return getConstString(offset + 10, $push_alert_usr_cd);
	}

	/**
	 * Push notification PIC cd. プッシュ通知担当者ＣＤ.<p>
	 *
	 */
	public void push_alert_usr_cd(String value) {
		setConstString(offset + 10, $push_alert_usr_cd, value);
	}


	public mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR aaIf(){
		return (mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR) getConstInnerRow(offset + 11, $aaIf);
	}
	
	public void aaIf(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR row){
		setConstInnerRow(offset + 11, $aaIf, row);
	}


	public String getString(String name) {
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($push_alert_wg_cd.equalsIgnoreCase(name)) {
			return push_alert_wg_cd();
		}
		if ($push_alert_usr_cd.equalsIgnoreCase(name)) {
			return push_alert_usr_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			return arr_schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($push_alert_wg_cd.equalsIgnoreCase(name)) {
			return push_alert_wg_cd();
		}
		if ($push_alert_usr_cd.equalsIgnoreCase(name)) {
			return push_alert_usr_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			return arr_schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($push_alert_wg_cd.equalsIgnoreCase(name)) {
			push_alert_wg_cd(value);
			return;
		}
		if ($push_alert_usr_cd.equalsIgnoreCase(name)) {
			push_alert_usr_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			arr_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($push_alert_wg_cd.equalsIgnoreCase(name)) {
			push_alert_wg_cd(value);
			return;
		}
		if ($push_alert_usr_cd.equalsIgnoreCase(name)) {
			push_alert_usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($arr_schd_tm.equalsIgnoreCase(name)) {
			arr_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($aa.equalsIgnoreCase(name)) {
			return aa();
		}
		if ($aaIf.equalsIgnoreCase(name)) {
			return aaIf();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($aa.equalsIgnoreCase(name)) {
			aa(
				((MCContainerMeta) aa_META).castInnerRow(mcframe.serverMS.dbc.MSVT_ARR_ACT_RECV_IF_R.class, value)
			);
			return;
		}
		if ($aaIf.equalsIgnoreCase(name)) {
			aaIf(
				((MCContainerMeta) aaIf_META).castInnerRow(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class, value)
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
		return aa().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		aa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		aa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		aa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		aa().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		aa().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return aa().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		aa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		aa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		aa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		aa().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		aa().data_no(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return aa().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		aa().exe_sts_typ(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return aa().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		aa().data_crud_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return aa().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		aa().ext_sys_cd(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return aa().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		aa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		aa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		aa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		aa().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		aa().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return aa().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		aa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		aa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		aa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		aa().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		aa().ext_data_lno(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return aa().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		aa().data_make_dt(value);
	}

	/**
	 * To import flg. 取込対象フラグ.<p>
	 *
	 */
	public boolean imp_flg() {
		return aa().imp_flg();
	}

	/**
	 * To import flg. 取込対象フラグ.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		aa().imp_flg(value);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return aa().recv_dt();
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		aa().recv_dt(value);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return aa().arr_schd_no();
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		aa().arr_schd_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String if_po_no() {
		return aa().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void if_po_no(String value) {
		aa().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return aa().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		aa().po_d_no(value);
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_d_no() {
		return aa().prms_rcpt_d_no();
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_d_no(String value) {
		aa().prms_rcpt_d_no(value);
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return aa().dlv_inst_no();
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		aa().dlv_inst_no(value);
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return aa().dlv_inst_d_no();
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		aa().dlv_inst_d_no(value);
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return aa().rcpt_iv_d_no();
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		aa().rcpt_iv_d_no(value);
	}

	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_d_no() {
		return aa().sls_ret_schd_d_no();
	}

	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_d_no(String value) {
		aa().sls_ret_schd_d_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return aa().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		aa().dlv_slip_d_no(value);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return aa().iv_d_no();
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		aa().iv_d_no(value);
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public String ext_arr_act_no() {
		return aa().ext_arr_act_no();
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public void ext_arr_act_no(String value) {
		aa().ext_arr_act_no(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return aa().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		aa().sppl_cd(value);
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public MCDate arr_tm() {
		return aa().arr_tm();
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		aa().arr_tm(value);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return aa().arr_dpt_cd();
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		aa().arr_dpt_cd(value);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return aa().arr_usr_cd();
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		aa().arr_usr_cd(value);
	}

	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public String arr_lg_grp_cd() {
		return aa().arr_lg_grp_cd();
	}

	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public void arr_lg_grp_cd(String value) {
		aa().arr_lg_grp_cd(value);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return aa().arr_loc_cd();
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		aa().arr_loc_cd(value);
	}

	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public String arr_str_ln_cd() {
		return aa().arr_str_ln_cd();
	}

	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public void arr_str_ln_cd(String value) {
		aa().arr_str_ln_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return aa().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		aa().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return aa().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		aa().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return aa().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		aa().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return aa().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		aa().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return aa().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		aa().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return aa().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		aa().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return aa().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		aa().ver_no(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return aa().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		aa().gd_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return aa().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		aa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		aa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		aa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		aa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		aa().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return aa().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		aa().trd_unit_cd(value);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return aa().abort_flg();
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		aa().abort_flg(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return aa().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		aa().bp_lot_no(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return aa().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		aa().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return aa().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		aa().bp_dlv_slip_d_no(value);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return aa().ship_fr_valid_dt();
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		aa().ship_fr_valid_dt(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return aa().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		aa().intr_rmrks(value);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return aa().insp_cnt_rmrks();
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		aa().insp_cnt_rmrks(value);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return aa().sub_char1();
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		aa().sub_char1(value);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return aa().sub_char2();
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		aa().sub_char2(value);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return aa().sub_char3();
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		aa().sub_char3(value);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return aa().sub_char4();
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		aa().sub_char4(value);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return aa().sub_char5();
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		aa().sub_char5(value);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return aa().sub_char6();
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		aa().sub_char6(value);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return aa().sub_char7();
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		aa().sub_char7(value);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return aa().sub_char8();
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		aa().sub_char8(value);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return aa().sub_char9();
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		aa().sub_char9(value);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return aa().sub_char10();
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		aa().sub_char10(value);
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return aa().sub_char11();
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		aa().sub_char11(value);
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return aa().sub_char12();
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		aa().sub_char12(value);
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return aa().sub_char13();
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		aa().sub_char13(value);
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return aa().sub_char14();
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		aa().sub_char14(value);
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return aa().sub_char15();
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		aa().sub_char15(value);
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return aa().sub_char16();
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		aa().sub_char16(value);
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return aa().sub_char17();
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		aa().sub_char17(value);
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return aa().sub_char18();
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		aa().sub_char18(value);
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return aa().sub_char19();
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		aa().sub_char19(value);
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return aa().sub_char20();
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		aa().sub_char20(value);
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return aa().sub_char21();
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		aa().sub_char21(value);
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return aa().sub_char22();
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		aa().sub_char22(value);
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return aa().sub_char23();
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		aa().sub_char23(value);
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return aa().sub_char24();
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		aa().sub_char24(value);
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return aa().sub_char25();
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		aa().sub_char25(value);
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return aa().sub_char26();
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		aa().sub_char26(value);
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return aa().sub_char27();
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		aa().sub_char27(value);
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return aa().sub_char28();
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		aa().sub_char28(value);
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return aa().sub_char29();
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		aa().sub_char29(value);
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return aa().sub_char30();
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		aa().sub_char30(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return aa().sub_num1();
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		aa().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		aa().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		aa().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		aa().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		aa().sub_num1(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return aa().sub_num2();
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		aa().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		aa().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		aa().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		aa().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		aa().sub_num2(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return aa().sub_num3();
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		aa().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		aa().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		aa().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		aa().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		aa().sub_num3(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return aa().sub_num4();
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		aa().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		aa().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		aa().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		aa().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		aa().sub_num4(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return aa().sub_num5();
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		aa().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		aa().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		aa().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		aa().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		aa().sub_num5(value);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return aa().sub_dt1();
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		aa().sub_dt1(value);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return aa().sub_dt2();
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		aa().sub_dt2(value);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return aa().sub_dt3();
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		aa().sub_dt3(value);
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return aa().sub_dt4();
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		aa().sub_dt4(value);
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return aa().sub_dt5();
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		aa().sub_dt5(value);
	}

}

