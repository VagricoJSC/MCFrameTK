package mcframe.serverMABC.MABCL0030;

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
 * ブロック"Del01_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Del01_Dtl1R_MC_A extends MCConstRow {

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public static final String $da_cd = "da_cd";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_branch_bank_cd = "bank_branch_bank_cd";
	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public static final String $branch_cd = "branch_cd";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public static final String $ac_itm_grp_cd = "ac_itm_grp_cd";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public static final String $wk_rsn_cd = "wk_rsn_cd";
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_grp_cd = "sls_upri_grp_cd";
	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_rank_cd = "sls_upri_rank_cd";
	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public static final String $setoff_grp_cd = "setoff_grp_cd";
	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public static final String $ship_valid_grp_cd = "ship_valid_grp_cd";
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public static final String $itm_ship_grp_cd = "itm_ship_grp_cd";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Export packing container cd. 輸出梱包容器ＣＤ.<p>
	 *
	 */
	public static final String $cntnr_cd = "cntnr_cd";
	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public static final String $port_cd = "port_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public static final String $slip_form_cd = "slip_form_cd";
	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public static final String $pf_grp_cd = "pf_grp_cd";
	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public static final String $itm_spec_grp_cd = "itm_spec_grp_cd";
	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public static final String $itm_comp_grp_cd = "itm_comp_grp_cd";
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public static final String $jnl_act_cd = "jnl_act_cd";
	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public static final String $jnl_grp_cd = "jnl_grp_cd";
	/**
	 * Auto-journal pattern cd. 自動仕訳パタンＣＤ.<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public static final String $auto_jnl_key_cd = "auto_jnl_key_cd";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public static final String $wk_day_cd = "wk_day_cd";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public static final String $rsrc_cd = "rsrc_cd";
	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public static final String $hs_grp_cd = "hs_grp_cd";
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public static final String $ctg_grp_cd = "ctg_grp_cd";
	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public static final String $act_ptn_cd = "act_ptn_cd";
	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public static final String $gp_alc_cd = "gp_alc_cd";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public static final String $rpt_ptn_cd = "rpt_ptn_cd";
	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public static final String $menu_cd = "menu_cd";
	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public static final String $site_co_cd = "site_co_cd";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta da_cd_META = createCommonMeta($da_cd, mcframe.commonMA.meta.MA_META.DA_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_branch_bank_cd_META = createCommonMeta($bank_branch_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta ac_itm_grp_cd_META = createCommonMeta($ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta sls_upri_grp_cd_META = createCommonMeta($sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta sls_upri_rank_cd_META = createCommonMeta($sls_upri_rank_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_RANK_CD);
	public static final MCMeta setoff_grp_cd_META = createCommonMeta($setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta ship_valid_grp_cd_META = createCommonMeta($ship_valid_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_CD);
	public static final MCMeta itm_ship_grp_cd_META = createCommonMeta($itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta cntnr_cd_META = createCommonMeta($cntnr_cd, mcframe.commonMA.meta.MA_META.CNTNR_CD);
	public static final MCMeta port_cd_META = createCommonMeta($port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta slip_form_cd_META = createCommonMeta($slip_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta pf_grp_cd_META = createCommonMeta($pf_grp_cd, mcframe.commonMA.meta.MA_META.PF_GRP_CD);
	public static final MCMeta itm_spec_grp_cd_META = createCommonMeta($itm_spec_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_CD);
	public static final MCMeta itm_comp_grp_cd_META = createCommonMeta($itm_comp_grp_cd, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_CD);
	public static final MCMeta jnl_act_cd_META = createCommonMeta($jnl_act_cd, mcframe.commonMA.meta.MA_META.JNL_ACT_CD);
	public static final MCMeta jnl_grp_cd_META = createCommonMeta($jnl_grp_cd, mcframe.commonMA.meta.MA_META.JNL_GRP_CD);
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta auto_jnl_key_cd_META = createCommonMeta($auto_jnl_key_cd, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_CD);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta wk_day_cd_META = createCommonMeta($wk_day_cd, mcframe.commonMA.meta.MA_META.WK_DAY_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta rsrc_cd_META = createCommonMeta($rsrc_cd, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta hs_grp_cd_META = createCommonMeta($hs_grp_cd, mcframe.commonMA.meta.MA_META.HS_GRP_CD);
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta ctg_grp_cd_META = createCommonMeta($ctg_grp_cd, mcframe.commonMA.meta.MA_META.CTG_GRP_CD);
	public static final MCMeta act_ptn_cd_META = createCommonMeta($act_ptn_cd, mcframe.commonMA.meta.MA_META.ACT_PTN_CD);
	public static final MCMeta gp_alc_cd_META = createCommonMeta($gp_alc_cd, mcframe.commonMA.meta.MA_META.GP_ALC_CD);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta rpt_ptn_cd_META = createCommonMeta($rpt_ptn_cd, mcframe.commonMA.meta.MA_META.RPT_PTN_CD);
	public static final MCMeta menu_cd_META = createCommonMeta($menu_cd, mcframe.commonMA.meta.MA_META.MENU_CD);
	public static final MCMeta site_co_cd_META = createCommonMeta($site_co_cd, mcframe.commonMA.meta.MA_META.SITE_CO_CD);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Del01_Dtl1R> constMetas = new ConstMetaList<Del01_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			da_cd_META,
			dpt_cd_META,
			dpt_lvl_cd_META,
			aprv_role_cd_META,
			cntry_cd_META,
			area_cd_META,
			cur_cd_META,
			unit_cd_META,
			bank_cd_META,
			bank_branch_bank_cd_META,
			branch_cd_META,
			bank_ac_cd_META,
			xrate_cd_META,
			cal_cd_META,
			itm_jnl_cd_META,
			ac_itm_grp_cd_META,
			ac_rsn_cd_META,
			site_cd_META,
			loc_grp_cd_META,
			lg_grp_cd_META,
			alloc_grp_cd_META,
			wg_cd_META,
			oper_cd_META,
			wk_cost_cd_META,
			wk_rsn_cd_META,
			sls_upri_grp_cd_META,
			sls_upri_rank_cd_META,
			setoff_grp_cd_META,
			ship_valid_grp_cd_META,
			itm_ship_grp_cd_META,
			trnspt_cd_META,
			cntnr_cd_META,
			port_cd_META,
			gd_cd_META,
			trd_cd_META,
			slip_form_cd_META,
			pf_grp_cd_META,
			itm_spec_grp_cd_META,
			itm_comp_grp_cd_META,
			jnl_act_cd_META,
			jnl_grp_cd_META,
			jnl_ptn_cd_META,
			auto_jnl_key_cd_META,
			insp_ptn_cd_META,
			wk_day_cd_META,
			ship_term_cd_META,
			ship_wk_cd_META,
			rsrc_cd_META,
			hs_grp_cd_META,
			alc_ptn_cd_META,
			ctg_grp_cd_META,
			act_ptn_cd_META,
			gp_alc_cd_META,
			calc_ctg_cd_META,
			rpt_ptn_cd_META,
			menu_cd_META,
			site_co_cd_META,
			upd_cntr_META
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
	protected Del01_Dtl1R_MC_A(ConstMetaList<? extends Del01_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del01_Dtl1R clone() {
		return (Del01_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del01_Dtl1R createInstance() {
		return (Del01_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Del01_Dtl1R getValues(String... names) {
		return (Del01_Dtl1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public String da_cd() {
		return getConstString(offset + 0, $da_cd);
	}

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public void da_cd(String value) {
		setConstString(offset + 0, $da_cd, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 1, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 1, $dpt_cd, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 2, $dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 2, $dpt_lvl_cd, value);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 3, $aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 3, $aprv_role_cd, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 4, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 4, $cntry_cd, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 5, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 5, $area_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 6, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 6, $cur_cd, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 7, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 7, $unit_cd, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 8, $bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 8, $bank_cd, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_branch_bank_cd() {
		return getConstString(offset + 9, $bank_branch_bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_branch_bank_cd(String value) {
		setConstString(offset + 9, $bank_branch_bank_cd, value);
	}


	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 10, $branch_cd);
	}

	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 10, $branch_cd, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 11, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 11, $bank_ac_cd, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 12, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 12, $xrate_cd, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 13, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 13, $cal_cd, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 14, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 14, $itm_jnl_cd, value);
	}


	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public String ac_itm_grp_cd() {
		return getConstString(offset + 15, $ac_itm_grp_cd);
	}

	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public void ac_itm_grp_cd(String value) {
		setConstString(offset + 15, $ac_itm_grp_cd, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 16, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 16, $ac_rsn_cd, value);
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
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 18, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 18, $loc_grp_cd, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 19, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 19, $lg_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 20, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 20, $alloc_grp_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 21, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 21, $wg_cd, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 22, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 22, $oper_cd, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 23, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 23, $wk_cost_cd, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 24, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 24, $wk_rsn_cd, value);
	}


	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public String sls_upri_grp_cd() {
		return getConstString(offset + 25, $sls_upri_grp_cd);
	}

	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public void sls_upri_grp_cd(String value) {
		setConstString(offset + 25, $sls_upri_grp_cd, value);
	}


	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public String sls_upri_rank_cd() {
		return getConstString(offset + 26, $sls_upri_rank_cd);
	}

	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public void sls_upri_rank_cd(String value) {
		setConstString(offset + 26, $sls_upri_rank_cd, value);
	}


	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public String setoff_grp_cd() {
		return getConstString(offset + 27, $setoff_grp_cd);
	}

	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public void setoff_grp_cd(String value) {
		setConstString(offset + 27, $setoff_grp_cd, value);
	}


	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public String ship_valid_grp_cd() {
		return getConstString(offset + 28, $ship_valid_grp_cd);
	}

	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public void ship_valid_grp_cd(String value) {
		setConstString(offset + 28, $ship_valid_grp_cd, value);
	}


	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public String itm_ship_grp_cd() {
		return getConstString(offset + 29, $itm_ship_grp_cd);
	}

	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public void itm_ship_grp_cd(String value) {
		setConstString(offset + 29, $itm_ship_grp_cd, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 30, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 30, $trnspt_cd, value);
	}


	/**
	 * Export packing container cd. 輸出梱包容器ＣＤ.<p>
	 *
	 */
	public String cntnr_cd() {
		return getConstString(offset + 31, $cntnr_cd);
	}

	/**
	 * Export packing container cd. 輸出梱包容器ＣＤ.<p>
	 *
	 */
	public void cntnr_cd(String value) {
		setConstString(offset + 31, $cntnr_cd, value);
	}


	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public String port_cd() {
		return getConstString(offset + 32, $port_cd);
	}

	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public void port_cd(String value) {
		setConstString(offset + 32, $port_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 33, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 33, $gd_cd, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 34, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 34, $trd_cd, value);
	}


	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String slip_form_cd() {
		return getConstString(offset + 35, $slip_form_cd);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void slip_form_cd(String value) {
		setConstString(offset + 35, $slip_form_cd, value);
	}


	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public String pf_grp_cd() {
		return getConstString(offset + 36, $pf_grp_cd);
	}

	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public void pf_grp_cd(String value) {
		setConstString(offset + 36, $pf_grp_cd, value);
	}


	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public String itm_spec_grp_cd() {
		return getConstString(offset + 37, $itm_spec_grp_cd);
	}

	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public void itm_spec_grp_cd(String value) {
		setConstString(offset + 37, $itm_spec_grp_cd, value);
	}


	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public String itm_comp_grp_cd() {
		return getConstString(offset + 38, $itm_comp_grp_cd);
	}

	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public void itm_comp_grp_cd(String value) {
		setConstString(offset + 38, $itm_comp_grp_cd, value);
	}


	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public String jnl_act_cd() {
		return getConstString(offset + 39, $jnl_act_cd);
	}

	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public void jnl_act_cd(String value) {
		setConstString(offset + 39, $jnl_act_cd, value);
	}


	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public String jnl_grp_cd() {
		return getConstString(offset + 40, $jnl_grp_cd);
	}

	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public void jnl_grp_cd(String value) {
		setConstString(offset + 40, $jnl_grp_cd, value);
	}


	/**
	 * Auto-journal pattern cd. 自動仕訳パタンＣＤ.<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 41, $jnl_ptn_cd);
	}

	/**
	 * Auto-journal pattern cd. 自動仕訳パタンＣＤ.<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 41, $jnl_ptn_cd, value);
	}


	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public String auto_jnl_key_cd() {
		return getConstString(offset + 42, $auto_jnl_key_cd);
	}

	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public void auto_jnl_key_cd(String value) {
		setConstString(offset + 42, $auto_jnl_key_cd, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 43, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 43, $insp_ptn_cd, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 44, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 44, $wk_day_cd, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 45, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 45, $ship_term_cd, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 46, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 46, $ship_wk_cd, value);
	}


	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public String rsrc_cd() {
		return getConstString(offset + 47, $rsrc_cd);
	}

	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public void rsrc_cd(String value) {
		setConstString(offset + 47, $rsrc_cd, value);
	}


	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public String hs_grp_cd() {
		return getConstString(offset + 48, $hs_grp_cd);
	}

	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public void hs_grp_cd(String value) {
		setConstString(offset + 48, $hs_grp_cd, value);
	}


	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 49, $alc_ptn_cd);
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 49, $alc_ptn_cd, value);
	}


	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public String ctg_grp_cd() {
		return getConstString(offset + 50, $ctg_grp_cd);
	}

	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public void ctg_grp_cd(String value) {
		setConstString(offset + 50, $ctg_grp_cd, value);
	}


	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public String act_ptn_cd() {
		return getConstString(offset + 51, $act_ptn_cd);
	}

	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public void act_ptn_cd(String value) {
		setConstString(offset + 51, $act_ptn_cd, value);
	}


	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public String gp_alc_cd() {
		return getConstString(offset + 52, $gp_alc_cd);
	}

	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public void gp_alc_cd(String value) {
		setConstString(offset + 52, $gp_alc_cd, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 53, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 53, $calc_ctg_cd, value);
	}


	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public String rpt_ptn_cd() {
		return getConstString(offset + 54, $rpt_ptn_cd);
	}

	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public void rpt_ptn_cd(String value) {
		setConstString(offset + 54, $rpt_ptn_cd, value);
	}


	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public String menu_cd() {
		return getConstString(offset + 55, $menu_cd);
	}

	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public void menu_cd(String value) {
		setConstString(offset + 55, $menu_cd, value);
	}


	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public String site_co_cd() {
		return getConstString(offset + 56, $site_co_cd);
	}

	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public void site_co_cd(String value) {
		setConstString(offset + 56, $site_co_cd, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 57, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 57, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			return bank_branch_bank_cd();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			return sls_upri_rank_cd();
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			return setoff_grp_cd();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			return cntnr_cd();
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			return port_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			return pf_grp_cd();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			return jnl_grp_cd();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			return hs_grp_cd();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			return ctg_grp_cd();
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			return gp_alc_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			return bank_branch_bank_cd();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			return sls_upri_rank_cd();
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			return setoff_grp_cd();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			return cntnr_cd();
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			return port_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			return pf_grp_cd();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			return jnl_grp_cd();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			return hs_grp_cd();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			return ctg_grp_cd();
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			return gp_alc_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			bank_branch_bank_cd(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			sls_upri_rank_cd(value);
			return;
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			setoff_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			cntnr_cd(value);
			return;
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			port_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			pf_grp_cd(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			jnl_grp_cd(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			hs_grp_cd(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			ctg_grp_cd(value);
			return;
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			gp_alc_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			bank_branch_bank_cd(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			sls_upri_rank_cd(value);
			return;
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			setoff_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			cntnr_cd(value);
			return;
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			port_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			pf_grp_cd(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			jnl_grp_cd(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			hs_grp_cd(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			ctg_grp_cd(value);
			return;
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			gp_alc_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

