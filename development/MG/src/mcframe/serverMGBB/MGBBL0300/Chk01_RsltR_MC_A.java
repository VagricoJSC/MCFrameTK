package mcframe.serverMGBB.MGBBL0300;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	public static final String $dbc = "dbc";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * For location rack/line 場所棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without line ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public static final String $ac_slip_typ_nm = "ac_slip_typ_nm";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_amt_dec_place = "trd_amt_dec_place";
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";

	public static final String $data_lno = $dbc + ".data_lno";
	public static final String $calc_ctg_cd = $dbc + ".calc_ctg_cd";
	public static final String $wg_cd = $dbc + ".wg_cd";
	public static final String $ym = $dbc + ".ym";
	public static final String $ac_dt = $dbc + ".ac_dt";
	public static final String $itm_cd = $dbc + ".itm_cd";
	public static final String $itm_sub1 = $dbc + ".itm_sub1";
	public static final String $itm_sub2 = $dbc + ".itm_sub2";
	public static final String $itm_sub3 = $dbc + ".itm_sub3";
	public static final String $itm_mfg_inst_no = $dbc + ".itm_mfg_inst_no";
	public static final String $mfg_act_no = $dbc + ".mfg_act_no";
	public static final String $oper_act_no = $dbc + ".oper_act_no";
	public static final String $lot_no = $dbc + ".lot_no";
	public static final String $sublot_no = $dbc + ".sublot_no";
	public static final String $sno1 = $dbc + ".sno1";
	public static final String $sno2 = $dbc + ".sno2";
	public static final String $sno3 = $dbc + ".sno3";
	public static final String $sno4 = $dbc + ".sno4";
	public static final String $loc_cd = $dbc + ".loc_cd";
	public static final String $str_ln_cd = $dbc + ".str_ln_cd";
	public static final String $ac_slip_typ = $dbc + ".ac_slip_typ";
	public static final String $ac_rsn_cd = $dbc + ".ac_rsn_cd";
	public static final String $qty = $dbc + ".qty";
	public static final String $amt = $dbc + ".amt";
	public static final String $trd_cur_cd = $dbc + ".trd_cur_cd";
	public static final String $trd_cur_amt = $dbc + ".trd_cur_amt";
	public static final String $xrate = $dbc + ".xrate";
	public static final String $mfg_per = $dbc + ".mfg_per";
	public static final String $mfg_cost_ratio = $dbc + ".mfg_cost_ratio";
	public static final String $expns_cd = $dbc + ".expns_cd";
	public static final String $alc_val1 = $dbc + ".alc_val1";
	public static final String $alc_val2 = $dbc + ".alc_val2";
	public static final String $alc_val3 = $dbc + ".alc_val3";
	public static final String $alc_val4 = $dbc + ".alc_val4";
	public static final String $alc_val5 = $dbc + ".alc_val5";
	public static final String $mfg_act_grp = $dbc + ".mfg_act_grp";
	public static final String $bom_ptn = $dbc + ".bom_ptn";
	public static final String $oper_ptn = $dbc + ".oper_ptn";
	public static final String $no_pln_flg = $dbc + ".no_pln_flg";
	public static final String $no_itm_info_flg = $dbc + ".no_itm_info_flg";
	public static final String $slip_no = $dbc + ".slip_no";
	public static final String $slip_seq_no = $dbc + ".slip_seq_no";
	public static final String $rmrks = $dbc + ".rmrks";
	public static final String $sub_char1 = $dbc + ".sub_char1";
	public static final String $sub_char2 = $dbc + ".sub_char2";
	public static final String $sub_char3 = $dbc + ".sub_char3";
	public static final String $upd_cntr = $dbc + ".upd_cntr";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta dbc_META = createInnerRowMeta($dbc, mcframe.serverMG.dbc.MGT_ACT_MFG_IF_R.class);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_amt_dec_place_META = createCommonMeta($trd_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			dbc_META,
			calc_ctg_nm_META,
			wg_nm_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			loc_nm_META,
			str_ln_tgt_flg_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			site_cd_META,
			site_nm_META,
			ac_slip_typ_nm_META,
			ac_rsn_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			trd_cur_nm_META,
			trd_amt_dec_place_META,
			expns_nm_META
		},
		new String[][]{
			{
				"data_lno",
				"calc_ctg_cd",
				"wg_cd",
				"ym",
				"ac_dt",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_mfg_inst_no",
				"mfg_act_no",
				"oper_act_no",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"loc_cd",
				"str_ln_cd",
				"ac_slip_typ",
				"ac_rsn_cd",
				"qty",
				"amt",
				"trd_cur_cd",
				"trd_cur_amt",
				"xrate",
				"mfg_per",
				"mfg_cost_ratio",
				"expns_cd",
				"alc_val1",
				"alc_val2",
				"alc_val3",
				"alc_val4",
				"alc_val5",
				"mfg_act_grp",
				"bom_ptn",
				"oper_ptn",
				"no_pln_flg",
				"no_itm_info_flg",
				"slip_no",
				"slip_seq_no",
				"rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"upd_cntr"
			},
			{
				$data_lno,
				$calc_ctg_cd,
				$wg_cd,
				$ym,
				$ac_dt,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_mfg_inst_no,
				$mfg_act_no,
				$oper_act_no,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$loc_cd,
				$str_ln_cd,
				$ac_slip_typ,
				$ac_rsn_cd,
				$qty,
				$amt,
				$trd_cur_cd,
				$trd_cur_amt,
				$xrate,
				$mfg_per,
				$mfg_cost_ratio,
				$expns_cd,
				$alc_val1,
				$alc_val2,
				$alc_val3,
				$alc_val4,
				$alc_val5,
				$mfg_act_grp,
				$bom_ptn,
				$oper_ptn,
				$no_pln_flg,
				$no_itm_info_flg,
				$slip_no,
				$slip_seq_no,
				$rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$upd_cntr
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
				{$dbc + ".data_lno", "E"}	// dbc.data_lno
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$dbc + ".calc_ctg_cd", "E"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "E"},	// dbc.wg_cd
				{$dbc + ".ym", "E"},	// dbc.ym
				{$dbc + ".ac_dt", "E"},	// dbc.ac_dt
				{$dbc + ".itm_cd", "E"},	// dbc.itm_cd
				{$dbc + ".itm_mfg_inst_no", "E"},	// dbc.itm_mfg_inst_no
				{$dbc + ".mfg_act_no", "E"},	// dbc.mfg_act_no
				{$dbc + ".loc_cd", "E"},	// dbc.loc_cd
				{$dbc + ".ac_slip_typ", "E"},	// dbc.ac_slip_typ
				{$dbc + ".qty", "E"},	// dbc.qty
				{$dbc + ".mfg_per", "E"}	// dbc.mfg_per
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$dbc + ".xrate", "positive"}	// dbc.xrate
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$dbc + ".mfg_per", "0:100"},	// dbc.mfg_per
				{$dbc + ".mfg_cost_ratio", "0:"}	// dbc.mfg_cost_ratio
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
				{$dbc + ".data_lno", "key"}	// dbc.data_lno
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
				{$dbc + ".calc_ctg_cd", "MA.MAUAL0010.CalcCtg"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "MA.MAUAL0010.CostWg"},	// dbc.wg_cd
				{$dbc + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "MA.MAUAL0010.Loc"},	// dbc.loc_cd
				{$dbc + ".str_ln_cd", "MA.MAUAL0010.StrLn"},	// dbc.str_ln_cd
				{$dbc + ".ac_rsn_cd", "MA.MAUAL0010.AcRsn"},	// dbc.ac_rsn_cd
				{$dbc + ".trd_cur_cd", "MA.MAUAL0010.Cur"},	// dbc.trd_cur_cd
				{$dbc + ".expns_cd", "MA.MAUAL0010.Expns"},	// dbc.expns_cd
				{$itm_jnl_cd, "MA.MAUAL0010.ItmJnl"}	// itm_jnl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$dbc + ".calc_ctg_cd", "calc_ctg_nm"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "wg_nm"},	// dbc.wg_cd
				{$dbc + ".itm_sub3", "itm_nm;itm_jnl_cd;unit_cd;unit_nm;dec_place;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "loc_nm;str_ln_tgt_flg;site_cd;site_nm"},	// dbc.loc_cd
				{$dbc + ".str_ln_cd", "str_ln_nm"},	// dbc.str_ln_cd
				{$dbc + ".ac_rsn_cd", "ac_rsn_nm"},	// dbc.ac_rsn_cd
				{$dbc + ".trd_cur_cd", "trd_cur_nm;trd_amt_dec_place"},	// dbc.trd_cur_cd
				{$dbc + ".expns_cd", "expns_nm"},	// dbc.expns_cd
				{$itm_jnl_cd, "itm_jnl_nm"}	// itm_jnl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".trd_cur_cd", "cur_nm;amt_dec_place"}	// dbc.trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dbc + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;itm_cd;itm_sub1;itm_sub2"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "wg_cd"},	// dbc.loc_cd
				{$dbc + ".str_ln_cd", "loc_cd;true"},	// dbc.str_ln_cd
				{$dbc + ".expns_cd", "MAC_EXPNS_TYP.PROD"}	// dbc.expns_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// dbc.itm_sub3
				{$dbc + ".loc_cd", "wg_cd"},	// dbc.loc_cd
				{$dbc + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// dbc.str_ln_cd
				{$dbc + ".expns_cd", "expns_typ"}	// dbc.expns_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$dbc + ".ac_slip_typ", "MAC_AC_SLIP_TYP"}	// dbc.ac_slip_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$dbc + ".itm_sub1", "E"},	// dbc.itm_sub1
				{$dbc + ".itm_sub2", "E"},	// dbc.itm_sub2
				{$dbc + ".itm_sub3", "E"},	// dbc.itm_sub3
				{$dbc + ".mfg_act_no", "E"},	// dbc.mfg_act_no
				{$dbc + ".oper_act_no", "E"},	// dbc.oper_act_no
				{$dbc + ".lot_no", "E"},	// dbc.lot_no
				{$dbc + ".sublot_no", "E"},	// dbc.sublot_no
				{$dbc + ".sno1", "E"},	// dbc.sno1
				{$dbc + ".sno2", "E"},	// dbc.sno2
				{$dbc + ".sno3", "E"},	// dbc.sno3
				{$dbc + ".sno4", "E"},	// dbc.sno4
				{$dbc + ".str_ln_cd", "E"}	// dbc.str_ln_cd
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
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
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 2, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 2, $rtn_sts_typ, value);
	}


	public mcframe.serverMG.dbc.MGT_ACT_MFG_IF_R dbc(){
		return (mcframe.serverMG.dbc.MGT_ACT_MFG_IF_R) getConstInnerRow(offset + 3, $dbc);
	}
	
	public void dbc(mcframe.serverMG.dbc.MGT_ACT_MFG_IF_R row){
		setConstInnerRow(offset + 3, $dbc, row);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 4, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 4, $calc_ctg_nm, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 6, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 6, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 7, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 7, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 8, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 8, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 11, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 11, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 12, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 12, $itm_jnl_nm, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 13, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 13, $loc_nm, value);
	}


	/**
	 * For location rack/line 場所棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 14, $str_ln_tgt_flg);
	}

	/**
	 * For location rack/line 場所棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 14, $str_ln_tgt_flg, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 15, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 15, $str_ln_nm, value);
	}


	/**
	 * Without line ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 16, $str_ln_cd_none_flg);
	}

	/**
	 * Without line ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 16, $str_ln_cd_none_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 17, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 17, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 18, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 18, $site_nm, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 19, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 19, $ac_slip_typ_nm, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 20, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 20, $ac_rsn_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 21, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 21, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 22, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 22, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 23, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 23, $dec_place, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 24, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 24, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_amt_dec_place() {
		return getConstNumber(offset + 25, $trd_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(int value) {
		setConstNumber(offset + 25, $trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(long value) {
		setConstNumber(offset + 25, $trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(float value) {
		setConstNumber(offset + 25, $trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(double value) {
		setConstNumber(offset + 25, $trd_amt_dec_place, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 26, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 26, $expns_nm, value);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dbc.equalsIgnoreCase(name)) {
			return dbc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dbc.equalsIgnoreCase(name)) {
			dbc(
				((MCContainerMeta) dbc_META).castInnerRow(mcframe.serverMG.dbc.MGT_ACT_MFG_IF_R.class, value)
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
		return dbc().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		dbc().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		dbc().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		dbc().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		dbc().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		dbc().data_lno(value);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return dbc().calc_ctg_cd();
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		dbc().calc_ctg_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return dbc().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		dbc().wg_cd(value);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return dbc().ym();
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		dbc().ym(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return dbc().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		dbc().ac_dt(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return dbc().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		dbc().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return dbc().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		dbc().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return dbc().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		dbc().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return dbc().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		dbc().itm_sub3(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return dbc().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		dbc().itm_mfg_inst_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return dbc().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		dbc().mfg_act_no(value);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return dbc().oper_act_no();
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		dbc().oper_act_no(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return dbc().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		dbc().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return dbc().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		dbc().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return dbc().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		dbc().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return dbc().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		dbc().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return dbc().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		dbc().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return dbc().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		dbc().sno4(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return dbc().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		dbc().loc_cd(value);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return dbc().str_ln_cd();
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		dbc().str_ln_cd(value);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return dbc().ac_slip_typ();
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		dbc().ac_slip_typ(value);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return dbc().ac_rsn_cd();
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		dbc().ac_rsn_cd(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return dbc().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		dbc().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		dbc().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		dbc().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		dbc().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		dbc().qty(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return dbc().amt();
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		dbc().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		dbc().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		dbc().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		dbc().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		dbc().amt(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return dbc().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		dbc().trd_cur_cd(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return dbc().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		dbc().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		dbc().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		dbc().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		dbc().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		dbc().trd_cur_amt(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return dbc().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		dbc().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		dbc().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		dbc().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		dbc().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		dbc().xrate(value);
	}

	/**
	 * Mfg. progress 製造進捗度.<p>
	 *
	 */
	public MCNumber mfg_per() {
		return dbc().mfg_per();
	}

	/**
	 * Mfg. progress 製造進捗度.<p>
	 *
	 */
	public void mfg_per(MCNumber value) {
		dbc().mfg_per(value);
	}

	/**
	 * Mfg. progress 製造進捗度.<p>
	 *
	 */
	public void mfg_per(int value) {
		dbc().mfg_per(value);
	}

	/**
	 * Mfg. progress 製造進捗度.<p>
	 *
	 */
	public void mfg_per(long value) {
		dbc().mfg_per(value);
	}

	/**
	 * Mfg. progress 製造進捗度.<p>
	 *
	 */
	public void mfg_per(float value) {
		dbc().mfg_per(value);
	}

	/**
	 * Mfg. progress 製造進捗度.<p>
	 *
	 */
	public void mfg_per(double value) {
		dbc().mfg_per(value);
	}

	/**
	 * Mfg. cost ratio 製造原価比率.<p>
	 *
	 */
	public MCNumber mfg_cost_ratio() {
		return dbc().mfg_cost_ratio();
	}

	/**
	 * Mfg. cost ratio 製造原価比率.<p>
	 *
	 */
	public void mfg_cost_ratio(MCNumber value) {
		dbc().mfg_cost_ratio(value);
	}

	/**
	 * Mfg. cost ratio 製造原価比率.<p>
	 *
	 */
	public void mfg_cost_ratio(int value) {
		dbc().mfg_cost_ratio(value);
	}

	/**
	 * Mfg. cost ratio 製造原価比率.<p>
	 *
	 */
	public void mfg_cost_ratio(long value) {
		dbc().mfg_cost_ratio(value);
	}

	/**
	 * Mfg. cost ratio 製造原価比率.<p>
	 *
	 */
	public void mfg_cost_ratio(float value) {
		dbc().mfg_cost_ratio(value);
	}

	/**
	 * Mfg. cost ratio 製造原価比率.<p>
	 *
	 */
	public void mfg_cost_ratio(double value) {
		dbc().mfg_cost_ratio(value);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return dbc().expns_cd();
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		dbc().expns_cd(value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public MCNumber alc_val1() {
		return dbc().alc_val1();
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(MCNumber value) {
		dbc().alc_val1(value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(int value) {
		dbc().alc_val1(value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(long value) {
		dbc().alc_val1(value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(float value) {
		dbc().alc_val1(value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(double value) {
		dbc().alc_val1(value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public MCNumber alc_val2() {
		return dbc().alc_val2();
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(MCNumber value) {
		dbc().alc_val2(value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(int value) {
		dbc().alc_val2(value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(long value) {
		dbc().alc_val2(value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(float value) {
		dbc().alc_val2(value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(double value) {
		dbc().alc_val2(value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public MCNumber alc_val3() {
		return dbc().alc_val3();
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(MCNumber value) {
		dbc().alc_val3(value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(int value) {
		dbc().alc_val3(value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(long value) {
		dbc().alc_val3(value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(float value) {
		dbc().alc_val3(value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(double value) {
		dbc().alc_val3(value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public MCNumber alc_val4() {
		return dbc().alc_val4();
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(MCNumber value) {
		dbc().alc_val4(value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(int value) {
		dbc().alc_val4(value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(long value) {
		dbc().alc_val4(value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(float value) {
		dbc().alc_val4(value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(double value) {
		dbc().alc_val4(value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public MCNumber alc_val5() {
		return dbc().alc_val5();
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(MCNumber value) {
		dbc().alc_val5(value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(int value) {
		dbc().alc_val5(value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(long value) {
		dbc().alc_val5(value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(float value) {
		dbc().alc_val5(value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(double value) {
		dbc().alc_val5(value);
	}

	/**
	 * Mfg. result group 製造実績グループ.<p>
	 *
	 */
	public String mfg_act_grp() {
		return dbc().mfg_act_grp();
	}

	/**
	 * Mfg. result group 製造実績グループ.<p>
	 *
	 */
	public void mfg_act_grp(String value) {
		dbc().mfg_act_grp(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return dbc().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		dbc().bom_ptn(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return dbc().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		dbc().oper_ptn(value);
	}

	/**
	 * Not to plan flg. 計画対象外ＦＬＧ.<p>
	 *
	 */
	public boolean no_pln_flg() {
		return dbc().no_pln_flg();
	}

	/**
	 * Not to plan flg. 計画対象外ＦＬＧ.<p>
	 *
	 */
	public void no_pln_flg(boolean value) {
		dbc().no_pln_flg(value);
	}

	/**
	 * Not for item info. 品目情報対象外.<p>
	 *
	 */
	public boolean no_itm_info_flg() {
		return dbc().no_itm_info_flg();
	}

	/**
	 * Not for item info. 品目情報対象外.<p>
	 *
	 */
	public void no_itm_info_flg(boolean value) {
		dbc().no_itm_info_flg(value);
	}

	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public String slip_no() {
		return dbc().slip_no();
	}

	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public void slip_no(String value) {
		dbc().slip_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public MCNumber slip_seq_no() {
		return dbc().slip_seq_no();
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(MCNumber value) {
		dbc().slip_seq_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(int value) {
		dbc().slip_seq_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(long value) {
		dbc().slip_seq_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(float value) {
		dbc().slip_seq_no(value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(double value) {
		dbc().slip_seq_no(value);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return dbc().rmrks();
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		dbc().rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return dbc().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		dbc().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return dbc().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		dbc().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return dbc().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		dbc().sub_char3(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return dbc().upd_cntr();
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		dbc().upd_cntr(value);
	}

}

