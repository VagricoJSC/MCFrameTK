package mcframe.serverMSBF.MSBFL5010;

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
 * ブロック"InspSchd_Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspSchd_Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Acquisition not for inspection flg. 検査対象外取得ＦＬＧ.<p>
	 *
	 */
	public static final String $no_insp_srch_flg = "no_insp_srch_flg";
	/**
	 * Not for inspection flg. 検査対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $no_insp_flg = "no_insp_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $to_loc_cd = "to_loc_cd";
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	/**
	 * Shipping point location cd. 出荷元場所ＣＤ.<p>
	 *
	 */
	public static final String $from_loc_cd = "from_loc_cd";
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ = "lmt_dt_frm_typ";
	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public static final String $vld_pd = "vld_pd";
	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public static final String $lmt_pd = "lmt_pd";
	/**
	 * Usage period (At the time of extension) 使用期間（延長時）.<p>
	 *
	 */
	public static final String $lot_insp_vld_pd = "lot_insp_vld_pd";
	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public static final String $calc_pd_typ = "calc_pd_typ";
	/**
	 * Expiration base date type (Extended) 期限起算日区分（延長時）.<p>
	 *
	 */
	public static final String $lot_insp_lmt_dt_frm_typ = "lot_insp_lmt_dt_frm_typ";
	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public static final String $insp_inst_issue_typ = "insp_inst_issue_typ";
	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";
	/**
	 * Inspection order at report issue flg. 検査指図時成績書発行ＦＬＧ.<p>
	 *
	 */
	public static final String $inst_rslt_issue_flg = "inst_rslt_issue_flg";
	/**
	 * Prior inspection validity flg. 先行検査有効ＦＬＧ.<p>
	 *
	 */
	public static final String $pre_insp_valid_flg = "pre_insp_valid_flg";
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public static final String $insp_std_no = "insp_std_no";
	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public static final String $spl_qty = "spl_qty";
	/**
	 * Specific inspection required flg. 規格検査必須ＦＬＧ.<p>
	 *
	 */
	public static final String $std_req_flg = "std_req_flg";
	/**
	 * Specific inspection confirmation required flg. 規格検査確認必須ＦＬＧ.<p>
	 *
	 */
	public static final String $std_cnf_req_flg = "std_cnf_req_flg";
	/**
	 * For factory release approval flg. 工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public static final String $plnt_aprv_role_cd = "plnt_aprv_role_cd";
	/**
	 * For inspection approval flg. 検査承認対象ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_aprv_flg = "insp_aprv_flg";
	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public static final String $insp_aprv_role_cd = "insp_aprv_role_cd";
	/**
	 * Allow inspecting lot shipment flg. 検査中ロット出荷許可ＦＬＧ.<p>
	 *
	 */
	public static final String $so_prmt_insp_flg = "so_prmt_insp_flg";
	/**
	 * Allow inspecting lot use flg. 検査中ロット使用許可ＦＬＧ.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $no_mrkt_judg_flg = "no_mrkt_judg_flg";
	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public static final String $mrkt_judg_flg = "mrkt_judg_flg";
	/**
	 * Market release decision role cd. 市場出荷判定役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_role_cd = "mrkt_judg_role_cd";
	/**
	 * For expiration management flg. 期限管理対象ＦＬＧ.<p>
	 *
	 */
	public static final String $lmt_ctl_flg = "lmt_ctl_flg";
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public static final String $lmt_ctl_categ = "lmt_ctl_categ";
	/**
	 * Master exist マスタ存在.<p>
	 *
	 */
	public static final String $exists_mstr_flg = "exists_mstr_flg";
	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public static final String $strg_schd_dt = "strg_schd_dt";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public static final String $insp_st_schd_dt = "insp_st_schd_dt";
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public static final String $insp_end_schd_dt = "insp_end_schd_dt";
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta no_insp_srch_flg_META = createCommonMeta($no_insp_srch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_insp_flg_META = createCommonMeta($no_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta to_loc_cd_META = createCommonMeta($to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta from_loc_cd_META = createCommonMeta($from_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta vld_pd_META = createCommonMeta($vld_pd, mcframe.commonMA.meta.MA_META.VLD_PD);
	public static final MCMeta lmt_pd_META = createCommonMeta($lmt_pd, mcframe.commonMA.meta.MA_META.LMT_PD);
	public static final MCMeta lot_insp_vld_pd_META = createCommonMeta($lot_insp_vld_pd, mcframe.commonMA.meta.MA_META.VLD_PD);
	public static final MCMeta calc_pd_typ_META = createCommonMeta($calc_pd_typ, mcframe.commonMA.meta.MA_META.CALC_PD_TYP);
	public static final MCMeta lot_insp_lmt_dt_frm_typ_META = createCommonMeta($lot_insp_lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta insp_inst_issue_typ_META = createCommonMeta($insp_inst_issue_typ, mcframe.commonMA.meta.MA_META.INSP_INST_ISSUE_TYP);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta inst_rslt_issue_flg_META = createCommonMeta($inst_rslt_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_insp_valid_flg_META = createCommonMeta($pre_insp_valid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_std_no_META = createCommonMeta($insp_std_no, mcframe.commonMA.meta.MA_META.INSP_STD_NO);
	public static final MCMeta spl_qty_META = createCommonMeta($spl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta std_req_flg_META = createCommonMeta($std_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_req_flg_META = createCommonMeta($std_cnf_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_role_cd_META = createCommonMeta($plnt_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta insp_aprv_flg_META = createCommonMeta($insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_role_cd_META = createCommonMeta($insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta so_prmt_insp_flg_META = createCommonMeta($so_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_mrkt_judg_flg_META = createCommonMeta($no_mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_flg_META = createCommonMeta($mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_role_cd_META = createCommonMeta($mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta lmt_ctl_flg_META = createCommonMeta($lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_ctl_categ_META = createCommonMeta($lmt_ctl_categ, mcframe.commonMA.meta.MA_META.LMT_CTL_CATEG);
	public static final MCMeta exists_mstr_flg_META = createCommonMeta($exists_mstr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_schd_dt_META = createCommonMeta($strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_schd_dt_META = createCommonMeta($insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_META = createCommonMeta($insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);

	protected static final ConstMetaList<InspSchd_Srch01_CndR> constMetas = new ConstMetaList<InspSchd_Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			base_dt_META,
			insp_typ_META,
			insp_ptn_cd_META,
			no_insp_srch_flg_META,
			no_insp_flg_META,
			to_site_cd_META,
			to_loc_cd_META,
			from_site_cd_META,
			from_loc_cd_META,
			lmt_dt_frm_typ_META,
			vld_pd_META,
			lmt_pd_META,
			lot_insp_vld_pd_META,
			calc_pd_typ_META,
			lot_insp_lmt_dt_frm_typ_META,
			insp_inst_issue_typ_META,
			insp_offst_META,
			inst_rslt_issue_flg_META,
			pre_insp_valid_flg_META,
			insp_mtd_typ_META,
			insp_lt_META,
			insp_std_no_META,
			spl_qty_META,
			std_req_flg_META,
			std_cnf_req_flg_META,
			plnt_aprv_flg_META,
			plnt_aprv_role_cd_META,
			insp_aprv_flg_META,
			insp_aprv_role_cd_META,
			so_prmt_insp_flg_META,
			in_prmt_insp_flg_META,
			insp_bind_typ_META,
			skip_chk_ship_flg_META,
			no_mrkt_judg_flg_META,
			mrkt_judg_flg_META,
			mrkt_judg_role_cd_META,
			lmt_ctl_flg_META,
			lmt_ctl_categ_META,
			exists_mstr_flg_META,
			strg_schd_dt_META,
			accpt_schd_dt_META,
			insp_st_schd_dt_META,
			insp_end_schd_dt_META,
			avl_schd_dt_META,
			accpt_insp_lt_META
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
	protected InspSchd_Srch01_CndR_MC_A(ConstMetaList<? extends InspSchd_Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Srch01_CndR clone() {
		return (InspSchd_Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Srch01_CndR createInstance() {
		return (InspSchd_Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Srch01_CndR getValues(String... names) {
		return (InspSchd_Srch01_CndR) super.getValues(names);
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 5, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 5, $mfg_loc_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 6, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 6, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 7, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 7, $maker_cd, value);
	}


	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 8, $base_dt);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 8, $base_dt, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 9, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 9, $insp_typ, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 10, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 10, $insp_ptn_cd, value);
	}


	/**
	 * Acquisition not for inspection flg. 検査対象外取得ＦＬＧ.<p>
	 *
	 */
	public boolean no_insp_srch_flg() {
		return getConstBoolean(offset + 11, $no_insp_srch_flg);
	}

	/**
	 * Acquisition not for inspection flg. 検査対象外取得ＦＬＧ.<p>
	 *
	 */
	public void no_insp_srch_flg(boolean value) {
		setConstBoolean(offset + 11, $no_insp_srch_flg, value);
	}


	/**
	 * Not for inspection flg. 検査対象外ＦＬＧ.<p>
	 *
	 */
	public boolean no_insp_flg() {
		return getConstBoolean(offset + 12, $no_insp_flg);
	}

	/**
	 * Not for inspection flg. 検査対象外ＦＬＧ.<p>
	 *
	 */
	public void no_insp_flg(boolean value) {
		setConstBoolean(offset + 12, $no_insp_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 13, $to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 13, $to_site_cd, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String to_loc_cd() {
		return getConstString(offset + 14, $to_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void to_loc_cd(String value) {
		setConstString(offset + 14, $to_loc_cd, value);
	}


	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 15, $from_site_cd);
	}

	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 15, $from_site_cd, value);
	}


	/**
	 * Shipping point location cd. 出荷元場所ＣＤ.<p>
	 *
	 */
	public String from_loc_cd() {
		return getConstString(offset + 16, $from_loc_cd);
	}

	/**
	 * Shipping point location cd. 出荷元場所ＣＤ.<p>
	 *
	 */
	public void from_loc_cd(String value) {
		setConstString(offset + 16, $from_loc_cd, value);
	}


	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 17, $lmt_dt_frm_typ);
	}

	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 17, $lmt_dt_frm_typ, value);
	}


	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public MCNumber vld_pd() {
		return getConstNumber(offset + 18, $vld_pd);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(MCNumber value) {
		setConstNumber(offset + 18, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(int value) {
		setConstNumber(offset + 18, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(long value) {
		setConstNumber(offset + 18, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(float value) {
		setConstNumber(offset + 18, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(double value) {
		setConstNumber(offset + 18, $vld_pd, value);
	}


	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public MCNumber lmt_pd() {
		return getConstNumber(offset + 19, $lmt_pd);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(MCNumber value) {
		setConstNumber(offset + 19, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(int value) {
		setConstNumber(offset + 19, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(long value) {
		setConstNumber(offset + 19, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(float value) {
		setConstNumber(offset + 19, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(double value) {
		setConstNumber(offset + 19, $lmt_pd, value);
	}


	/**
	 * Usage period (At the time of extension) 使用期間（延長時）.<p>
	 *
	 */
	public MCNumber lot_insp_vld_pd() {
		return getConstNumber(offset + 20, $lot_insp_vld_pd);
	}

	/**
	 * Usage period (At the time of extension) 使用期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(MCNumber value) {
		setConstNumber(offset + 20, $lot_insp_vld_pd, value);
	}

	/**
	 * Usage period (At the time of extension) 使用期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(int value) {
		setConstNumber(offset + 20, $lot_insp_vld_pd, value);
	}

	/**
	 * Usage period (At the time of extension) 使用期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(long value) {
		setConstNumber(offset + 20, $lot_insp_vld_pd, value);
	}

	/**
	 * Usage period (At the time of extension) 使用期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(float value) {
		setConstNumber(offset + 20, $lot_insp_vld_pd, value);
	}

	/**
	 * Usage period (At the time of extension) 使用期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(double value) {
		setConstNumber(offset + 20, $lot_insp_vld_pd, value);
	}


	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public String calc_pd_typ() {
		return getConstString(offset + 21, $calc_pd_typ);
	}

	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public void calc_pd_typ(String value) {
		setConstString(offset + 21, $calc_pd_typ, value);
	}


	/**
	 * Expiration base date type (Extended) 期限起算日区分（延長時）.<p>
	 *
	 */
	public String lot_insp_lmt_dt_frm_typ() {
		return getConstString(offset + 22, $lot_insp_lmt_dt_frm_typ);
	}

	/**
	 * Expiration base date type (Extended) 期限起算日区分（延長時）.<p>
	 *
	 */
	public void lot_insp_lmt_dt_frm_typ(String value) {
		setConstString(offset + 22, $lot_insp_lmt_dt_frm_typ, value);
	}


	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public String insp_inst_issue_typ() {
		return getConstString(offset + 23, $insp_inst_issue_typ);
	}

	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public void insp_inst_issue_typ(String value) {
		setConstString(offset + 23, $insp_inst_issue_typ, value);
	}


	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 24, $insp_offst);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 24, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 24, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 24, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 24, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 24, $insp_offst, value);
	}


	/**
	 * Inspection order at report issue flg. 検査指図時成績書発行ＦＬＧ.<p>
	 *
	 */
	public boolean inst_rslt_issue_flg() {
		return getConstBoolean(offset + 25, $inst_rslt_issue_flg);
	}

	/**
	 * Inspection order at report issue flg. 検査指図時成績書発行ＦＬＧ.<p>
	 *
	 */
	public void inst_rslt_issue_flg(boolean value) {
		setConstBoolean(offset + 25, $inst_rslt_issue_flg, value);
	}


	/**
	 * Prior inspection validity flg. 先行検査有効ＦＬＧ.<p>
	 *
	 */
	public boolean pre_insp_valid_flg() {
		return getConstBoolean(offset + 26, $pre_insp_valid_flg);
	}

	/**
	 * Prior inspection validity flg. 先行検査有効ＦＬＧ.<p>
	 *
	 */
	public void pre_insp_valid_flg(boolean value) {
		setConstBoolean(offset + 26, $pre_insp_valid_flg, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 27, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 27, $insp_mtd_typ, value);
	}


	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 28, $insp_lt);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 28, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 28, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 28, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 28, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 28, $insp_lt, value);
	}


	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public String insp_std_no() {
		return getConstString(offset + 29, $insp_std_no);
	}

	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public void insp_std_no(String value) {
		setConstString(offset + 29, $insp_std_no, value);
	}


	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public MCNumber spl_qty() {
		return getConstNumber(offset + 30, $spl_qty);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(MCNumber value) {
		setConstNumber(offset + 30, $spl_qty, value);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(int value) {
		setConstNumber(offset + 30, $spl_qty, value);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(long value) {
		setConstNumber(offset + 30, $spl_qty, value);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(float value) {
		setConstNumber(offset + 30, $spl_qty, value);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(double value) {
		setConstNumber(offset + 30, $spl_qty, value);
	}


	/**
	 * Specific inspection required flg. 規格検査必須ＦＬＧ.<p>
	 *
	 */
	public boolean std_req_flg() {
		return getConstBoolean(offset + 31, $std_req_flg);
	}

	/**
	 * Specific inspection required flg. 規格検査必須ＦＬＧ.<p>
	 *
	 */
	public void std_req_flg(boolean value) {
		setConstBoolean(offset + 31, $std_req_flg, value);
	}


	/**
	 * Specific inspection confirmation required flg. 規格検査確認必須ＦＬＧ.<p>
	 *
	 */
	public boolean std_cnf_req_flg() {
		return getConstBoolean(offset + 32, $std_cnf_req_flg);
	}

	/**
	 * Specific inspection confirmation required flg. 規格検査確認必須ＦＬＧ.<p>
	 *
	 */
	public void std_cnf_req_flg(boolean value) {
		setConstBoolean(offset + 32, $std_cnf_req_flg, value);
	}


	/**
	 * For factory release approval flg. 工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 33, $plnt_aprv_flg);
	}

	/**
	 * For factory release approval flg. 工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 33, $plnt_aprv_flg, value);
	}


	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public String plnt_aprv_role_cd() {
		return getConstString(offset + 34, $plnt_aprv_role_cd);
	}

	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public void plnt_aprv_role_cd(String value) {
		setConstString(offset + 34, $plnt_aprv_role_cd, value);
	}


	/**
	 * For inspection approval flg. 検査承認対象ＦＬＧ.<p>
	 *
	 */
	public boolean insp_aprv_flg() {
		return getConstBoolean(offset + 35, $insp_aprv_flg);
	}

	/**
	 * For inspection approval flg. 検査承認対象ＦＬＧ.<p>
	 *
	 */
	public void insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 35, $insp_aprv_flg, value);
	}


	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public String insp_aprv_role_cd() {
		return getConstString(offset + 36, $insp_aprv_role_cd);
	}

	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public void insp_aprv_role_cd(String value) {
		setConstString(offset + 36, $insp_aprv_role_cd, value);
	}


	/**
	 * Allow inspecting lot shipment flg. 検査中ロット出荷許可ＦＬＧ.<p>
	 *
	 */
	public boolean so_prmt_insp_flg() {
		return getConstBoolean(offset + 37, $so_prmt_insp_flg);
	}

	/**
	 * Allow inspecting lot shipment flg. 検査中ロット出荷許可ＦＬＧ.<p>
	 *
	 */
	public void so_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 37, $so_prmt_insp_flg, value);
	}


	/**
	 * Allow inspecting lot use flg. 検査中ロット使用許可ＦＬＧ.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 38, $in_prmt_insp_flg);
	}

	/**
	 * Allow inspecting lot use flg. 検査中ロット使用許可ＦＬＧ.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 38, $in_prmt_insp_flg, value);
	}


	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 39, $insp_bind_typ);
	}

	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 39, $insp_bind_typ, value);
	}


	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 40, $skip_chk_ship_flg);
	}

	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 40, $skip_chk_ship_flg, value);
	}


	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public boolean no_mrkt_judg_flg() {
		return getConstBoolean(offset + 41, $no_mrkt_judg_flg);
	}

	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public void no_mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 41, $no_mrkt_judg_flg, value);
	}


	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public boolean mrkt_judg_flg() {
		return getConstBoolean(offset + 42, $mrkt_judg_flg);
	}

	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public void mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 42, $mrkt_judg_flg, value);
	}


	/**
	 * Market release decision role cd. 市場出荷判定役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_role_cd() {
		return getConstString(offset + 43, $mrkt_judg_role_cd);
	}

	/**
	 * Market release decision role cd. 市場出荷判定役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_role_cd(String value) {
		setConstString(offset + 43, $mrkt_judg_role_cd, value);
	}


	/**
	 * For expiration management flg. 期限管理対象ＦＬＧ.<p>
	 *
	 */
	public boolean lmt_ctl_flg() {
		return getConstBoolean(offset + 44, $lmt_ctl_flg);
	}

	/**
	 * For expiration management flg. 期限管理対象ＦＬＧ.<p>
	 *
	 */
	public void lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 44, $lmt_ctl_flg, value);
	}


	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public String lmt_ctl_categ() {
		return getConstString(offset + 45, $lmt_ctl_categ);
	}

	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public void lmt_ctl_categ(String value) {
		setConstString(offset + 45, $lmt_ctl_categ, value);
	}


	/**
	 * Master exist マスタ存在.<p>
	 *
	 */
	public boolean exists_mstr_flg() {
		return getConstBoolean(offset + 46, $exists_mstr_flg);
	}

	/**
	 * Master exist マスタ存在.<p>
	 *
	 */
	public void exists_mstr_flg(boolean value) {
		setConstBoolean(offset + 46, $exists_mstr_flg, value);
	}


	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 47, $strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 47, $strg_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 48, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 48, $accpt_schd_dt, value);
	}


	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 49, $insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 49, $insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 50, $insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 50, $insp_end_schd_dt, value);
	}


	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 51, $avl_schd_dt);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 51, $avl_schd_dt, value);
	}


	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 52, $accpt_insp_lt);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			return to_loc_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($from_loc_cd.equalsIgnoreCase(name)) {
			return from_loc_cd();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			return calc_pd_typ();
		}
		if ($lot_insp_lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lot_insp_lmt_dt_frm_typ();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return plnt_aprv_role_cd();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			return vld_pd();
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			return lmt_pd();
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			return lot_insp_vld_pd();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			return spl_qty();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($no_insp_srch_flg.equalsIgnoreCase(name)) {
			return no_insp_srch_flg();
		}
		if ($no_insp_flg.equalsIgnoreCase(name)) {
			return no_insp_flg();
		}
		if ($inst_rslt_issue_flg.equalsIgnoreCase(name)) {
			return inst_rslt_issue_flg();
		}
		if ($pre_insp_valid_flg.equalsIgnoreCase(name)) {
			return pre_insp_valid_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			return so_prmt_insp_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return no_mrkt_judg_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($exists_mstr_flg.equalsIgnoreCase(name)) {
			return exists_mstr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			return to_loc_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($from_loc_cd.equalsIgnoreCase(name)) {
			return from_loc_cd();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			return calc_pd_typ();
		}
		if ($lot_insp_lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lot_insp_lmt_dt_frm_typ();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return plnt_aprv_role_cd();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			return vld_pd();
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			return lmt_pd();
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			return lot_insp_vld_pd();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			return spl_qty();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($no_insp_srch_flg.equalsIgnoreCase(name)) {
			return no_insp_srch_flg();
		}
		if ($no_insp_flg.equalsIgnoreCase(name)) {
			return no_insp_flg();
		}
		if ($inst_rslt_issue_flg.equalsIgnoreCase(name)) {
			return inst_rslt_issue_flg();
		}
		if ($pre_insp_valid_flg.equalsIgnoreCase(name)) {
			return pre_insp_valid_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			return so_prmt_insp_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return no_mrkt_judg_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($exists_mstr_flg.equalsIgnoreCase(name)) {
			return exists_mstr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			to_loc_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($from_loc_cd.equalsIgnoreCase(name)) {
			from_loc_cd(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			calc_pd_typ(value);
			return;
		}
		if ($lot_insp_lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lot_insp_lmt_dt_frm_typ(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			plnt_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($no_insp_srch_flg.equalsIgnoreCase(name)) {
			no_insp_srch_flg(value);
			return;
		}
		if ($no_insp_flg.equalsIgnoreCase(name)) {
			no_insp_flg(value);
			return;
		}
		if ($inst_rslt_issue_flg.equalsIgnoreCase(name)) {
			inst_rslt_issue_flg(value);
			return;
		}
		if ($pre_insp_valid_flg.equalsIgnoreCase(name)) {
			pre_insp_valid_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			so_prmt_insp_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			no_mrkt_judg_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($exists_mstr_flg.equalsIgnoreCase(name)) {
			exists_mstr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			to_loc_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($from_loc_cd.equalsIgnoreCase(name)) {
			from_loc_cd(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			calc_pd_typ(value);
			return;
		}
		if ($lot_insp_lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lot_insp_lmt_dt_frm_typ(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			plnt_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($no_insp_srch_flg.equalsIgnoreCase(name)) {
			no_insp_srch_flg(value);
			return;
		}
		if ($no_insp_flg.equalsIgnoreCase(name)) {
			no_insp_flg(value);
			return;
		}
		if ($inst_rslt_issue_flg.equalsIgnoreCase(name)) {
			inst_rslt_issue_flg(value);
			return;
		}
		if ($pre_insp_valid_flg.equalsIgnoreCase(name)) {
			pre_insp_valid_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			so_prmt_insp_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			no_mrkt_judg_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($exists_mstr_flg.equalsIgnoreCase(name)) {
			exists_mstr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

