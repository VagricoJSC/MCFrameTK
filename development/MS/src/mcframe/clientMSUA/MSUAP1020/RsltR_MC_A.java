package mcframe.clientMSUA.MSUAP1020;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	public static final String $mi_rqst_dlv_rqst_p = "mi_rqst_dlv_rqst_p";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mpr_mfg_sts_typ = "mpr_mfg_sts_typ";
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public static final String $mpr_mfg_sts_typ_nm = "mpr_mfg_sts_typ_nm";
	public static final String $imi_itm_p = "imi_itm_p";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $imi_lot_no = "imi_lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $imi_sublot_no = "imi_sublot_no";
	public static final String $imi_sno_wrk_no_p = "imi_sno_wrk_no_p";
	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public static final String $mi_base_unit_inst_qty = "mi_base_unit_inst_qty";
	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public static final String $ma_base_unit_yield_qty = "ma_base_unit_yield_qty";
	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public static final String $ma_base_unit_dfct_qty = "ma_base_unit_dfct_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $imi_base_unit_cd = "imi_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $imi_base_unit_nm = "imi_base_unit_nm";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $imi_mfg_loc_cd = "imi_mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $imi_mfg_loc_nm = "imi_mfg_loc_nm";
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $imi_mfg_str_ln_cd = "imi_mfg_str_ln_cd";
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public static final String $imi_mfg_str_ln_nm = "imi_mfg_str_ln_nm";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $imi_sppl_cd = "imi_sppl_cd";
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public static final String $imi_sppl_nm = "imi_sppl_nm";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $mi_po_d_no = "mi_po_d_no";
	public static final String $mi_st_schd_dt_p = "mi_st_schd_dt_p";
	public static final String $mi_end_schd_dt_p = "mi_end_schd_dt_p";
	public static final String $ma_st_act_dt_p = "ma_st_act_dt_p";
	public static final String $ma_end_act_dt_p = "ma_end_act_dt_p";

	public static final String $mi_rqst_dlv_rqst_dt = $mi_rqst_dlv_rqst_p + ".ymd";
	public static final String $mi_rqst_dlv_rqst_hm = $mi_rqst_dlv_rqst_p + ".hm";
	public static final String $imi_itm_cd = $imi_itm_p + ".itm_cd";
	public static final String $imi_itm_sub1 = $imi_itm_p + ".itm_sub1";
	public static final String $imi_itm_sub2 = $imi_itm_p + ".itm_sub2";
	public static final String $imi_itm_sub3 = $imi_itm_p + ".itm_sub3";
	public static final String $imi_itm_nm = $imi_itm_p + ".itm_nm";
	public static final String $imi_sno1 = $imi_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $imi_sno2 = $imi_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $imi_sno3 = $imi_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $imi_sno4 = $imi_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $imi_wrk_no = $imi_sno_wrk_no_p + ".wrk_no";
	public static final String $imi_wrk_nm = $imi_sno_wrk_no_p + ".wrk_nm";
	public static final String $mi_st_schd_dt = $mi_st_schd_dt_p + ".ymd";
	public static final String $mi_st_schd_hm = $mi_st_schd_dt_p + ".hm";
	public static final String $mi_end_schd_dt = $mi_end_schd_dt_p + ".ymd";
	public static final String $mi_end_schd_hm = $mi_end_schd_dt_p + ".hm";
	public static final String $ma_st_act_dt = $ma_st_act_dt_p + ".ymd";
	public static final String $ma_st_act_hm = $ma_st_act_dt_p + ".hm";
	public static final String $ma_end_act_dt = $ma_end_act_dt_p + ".ymd";
	public static final String $ma_end_act_hm = $ma_end_act_dt_p + ".hm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mi_rqst_dlv_rqst_p_META = createInnerRowMeta($mi_rqst_dlv_rqst_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta mpr_mfg_sts_typ_META = createCommonMeta($mpr_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mpr_mfg_sts_typ_nm_META = createCommonMeta($mpr_mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta imi_itm_p_META = createInnerRowMeta($imi_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta imi_lot_no_META = createCommonMeta($imi_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta imi_sublot_no_META = createCommonMeta($imi_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta imi_sno_wrk_no_p_META = createInnerRowMeta($imi_sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta mi_base_unit_inst_qty_META = createCommonMeta($mi_base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ma_base_unit_yield_qty_META = createCommonMeta($ma_base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ma_base_unit_dfct_qty_META = createCommonMeta($ma_base_unit_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta imi_base_unit_cd_META = createCommonMeta($imi_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta imi_base_unit_nm_META = createCommonMeta($imi_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta imi_mfg_loc_cd_META = createCommonMeta($imi_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta imi_mfg_loc_nm_META = createCommonMeta($imi_mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta imi_mfg_str_ln_cd_META = createCommonMeta($imi_mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta imi_mfg_str_ln_nm_META = createCommonMeta($imi_mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta imi_sppl_cd_META = createCommonMeta($imi_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta imi_sppl_nm_META = createCommonMeta($imi_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mi_po_d_no_META = createCommonMeta($mi_po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta mi_st_schd_dt_p_META = createInnerRowMeta($mi_st_schd_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta mi_end_schd_dt_p_META = createInnerRowMeta($mi_end_schd_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ma_st_act_dt_p_META = createInnerRowMeta($ma_st_act_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ma_end_act_dt_p_META = createInnerRowMeta($ma_end_act_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			mfg_inst_no_META,
			div_seq_META,
			mi_rqst_dlv_rqst_p_META,
			mpr_mfg_sts_typ_META,
			mpr_mfg_sts_typ_nm_META,
			imi_itm_p_META,
			imi_lot_no_META,
			imi_sublot_no_META,
			imi_sno_wrk_no_p_META,
			mi_base_unit_inst_qty_META,
			ma_base_unit_yield_qty_META,
			ma_base_unit_dfct_qty_META,
			imi_base_unit_cd_META,
			imi_base_unit_nm_META,
			imi_mfg_loc_cd_META,
			imi_mfg_loc_nm_META,
			imi_mfg_str_ln_cd_META,
			imi_mfg_str_ln_nm_META,
			imi_sppl_cd_META,
			imi_sppl_nm_META,
			mi_po_d_no_META,
			mi_st_schd_dt_p_META,
			mi_end_schd_dt_p_META,
			ma_st_act_dt_p_META,
			ma_end_act_dt_p_META
		},
		new String[][]{
			{
				"mi_rqst_dlv_rqst_dt",
				"mi_rqst_dlv_rqst_hm",
				"imi_itm_cd",
				"imi_itm_sub1",
				"imi_itm_sub2",
				"imi_itm_sub3",
				"imi_itm_nm",
				"imi_sno1",
				"imi_sno2",
				"imi_sno3",
				"imi_sno4",
				"imi_wrk_no",
				"imi_wrk_nm",
				"mi_st_schd_dt",
				"mi_st_schd_hm",
				"mi_end_schd_dt",
				"mi_end_schd_hm",
				"ma_st_act_dt",
				"ma_st_act_hm",
				"ma_end_act_dt",
				"ma_end_act_hm"
			},
			{
				$mi_rqst_dlv_rqst_dt,
				$mi_rqst_dlv_rqst_hm,
				$imi_itm_cd,
				$imi_itm_sub1,
				$imi_itm_sub2,
				$imi_itm_sub3,
				$imi_itm_nm,
				$imi_sno1,
				$imi_sno2,
				$imi_sno3,
				$imi_sno4,
				$imi_wrk_no,
				$imi_wrk_nm,
				$mi_st_schd_dt,
				$mi_st_schd_hm,
				$mi_end_schd_dt,
				$mi_end_schd_hm,
				$ma_st_act_dt,
				$ma_st_act_hm,
				$ma_end_act_dt,
				$ma_end_act_hm
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
				{$imi_mfg_str_ln_cd, "STR_LN"},	// imi_mfg_str_ln_cd
				{$imi_mfg_str_ln_nm, "STR_LN"}	// imi_mfg_str_ln_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 1, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 1, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 2, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 2, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 2, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 2, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 2, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 2, $div_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR mi_rqst_dlv_rqst_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 3, $mi_rqst_dlv_rqst_p);
	}
	
	public void mi_rqst_dlv_rqst_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 3, $mi_rqst_dlv_rqst_p, row);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mpr_mfg_sts_typ() {
		return getConstString(offset + 4, $mpr_mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mpr_mfg_sts_typ(String value) {
		setConstString(offset + 4, $mpr_mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mpr_mfg_sts_typ_nm() {
		return getConstString(offset + 5, $mpr_mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mpr_mfg_sts_typ_nm(String value) {
		setConstString(offset + 5, $mpr_mfg_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR imi_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 6, $imi_itm_p);
	}
	
	public void imi_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 6, $imi_itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String imi_lot_no() {
		return getConstString(offset + 7, $imi_lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void imi_lot_no(String value) {
		setConstString(offset + 7, $imi_lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String imi_sublot_no() {
		return getConstString(offset + 8, $imi_sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void imi_sublot_no(String value) {
		setConstString(offset + 8, $imi_sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR imi_sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 9, $imi_sno_wrk_no_p);
	}
	
	public void imi_sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 9, $imi_sno_wrk_no_p, row);
	}


	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCNumber mi_base_unit_inst_qty() {
		return getConstNumber(offset + 10, $mi_base_unit_inst_qty);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void mi_base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 10, $mi_base_unit_inst_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void mi_base_unit_inst_qty(int value) {
		setConstNumber(offset + 10, $mi_base_unit_inst_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void mi_base_unit_inst_qty(long value) {
		setConstNumber(offset + 10, $mi_base_unit_inst_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void mi_base_unit_inst_qty(float value) {
		setConstNumber(offset + 10, $mi_base_unit_inst_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void mi_base_unit_inst_qty(double value) {
		setConstNumber(offset + 10, $mi_base_unit_inst_qty, value);
	}


	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public MCNumber ma_base_unit_yield_qty() {
		return getConstNumber(offset + 11, $ma_base_unit_yield_qty);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void ma_base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 11, $ma_base_unit_yield_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void ma_base_unit_yield_qty(int value) {
		setConstNumber(offset + 11, $ma_base_unit_yield_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void ma_base_unit_yield_qty(long value) {
		setConstNumber(offset + 11, $ma_base_unit_yield_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void ma_base_unit_yield_qty(float value) {
		setConstNumber(offset + 11, $ma_base_unit_yield_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void ma_base_unit_yield_qty(double value) {
		setConstNumber(offset + 11, $ma_base_unit_yield_qty, value);
	}


	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public MCNumber ma_base_unit_dfct_qty() {
		return getConstNumber(offset + 12, $ma_base_unit_dfct_qty);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(MCNumber value) {
		setConstNumber(offset + 12, $ma_base_unit_dfct_qty, value);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(int value) {
		setConstNumber(offset + 12, $ma_base_unit_dfct_qty, value);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(long value) {
		setConstNumber(offset + 12, $ma_base_unit_dfct_qty, value);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(float value) {
		setConstNumber(offset + 12, $ma_base_unit_dfct_qty, value);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void ma_base_unit_dfct_qty(double value) {
		setConstNumber(offset + 12, $ma_base_unit_dfct_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String imi_base_unit_cd() {
		return getConstString(offset + 13, $imi_base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void imi_base_unit_cd(String value) {
		setConstString(offset + 13, $imi_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String imi_base_unit_nm() {
		return getConstString(offset + 14, $imi_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void imi_base_unit_nm(String value) {
		setConstString(offset + 14, $imi_base_unit_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String imi_mfg_loc_cd() {
		return getConstString(offset + 15, $imi_mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void imi_mfg_loc_cd(String value) {
		setConstString(offset + 15, $imi_mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String imi_mfg_loc_nm() {
		return getConstString(offset + 16, $imi_mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void imi_mfg_loc_nm(String value) {
		setConstString(offset + 16, $imi_mfg_loc_nm, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String imi_mfg_str_ln_cd() {
		return getConstString(offset + 17, $imi_mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void imi_mfg_str_ln_cd(String value) {
		setConstString(offset + 17, $imi_mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String imi_mfg_str_ln_nm() {
		return getConstString(offset + 18, $imi_mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void imi_mfg_str_ln_nm(String value) {
		setConstString(offset + 18, $imi_mfg_str_ln_nm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String imi_sppl_cd() {
		return getConstString(offset + 19, $imi_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void imi_sppl_cd(String value) {
		setConstString(offset + 19, $imi_sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String imi_sppl_nm() {
		return getConstString(offset + 20, $imi_sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void imi_sppl_nm(String value) {
		setConstString(offset + 20, $imi_sppl_nm, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String mi_po_d_no() {
		return getConstString(offset + 21, $mi_po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void mi_po_d_no(String value) {
		setConstString(offset + 21, $mi_po_d_no, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR mi_st_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 22, $mi_st_schd_dt_p);
	}
	
	public void mi_st_schd_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 22, $mi_st_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR mi_end_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 23, $mi_end_schd_dt_p);
	}
	
	public void mi_end_schd_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 23, $mi_end_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ma_st_act_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 24, $ma_st_act_dt_p);
	}
	
	public void ma_st_act_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 24, $ma_st_act_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ma_end_act_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 25, $ma_end_act_dt_p);
	}
	
	public void ma_end_act_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 25, $ma_end_act_dt_p, row);
	}


	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mpr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return mpr_mfg_sts_typ();
		}
		if ($mpr_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mpr_mfg_sts_typ_nm();
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			return imi_lot_no();
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			return imi_sublot_no();
		}
		if ($imi_base_unit_cd.equalsIgnoreCase(name)) {
			return imi_base_unit_cd();
		}
		if ($imi_base_unit_nm.equalsIgnoreCase(name)) {
			return imi_base_unit_nm();
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			return imi_mfg_loc_cd();
		}
		if ($imi_mfg_loc_nm.equalsIgnoreCase(name)) {
			return imi_mfg_loc_nm();
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_cd();
		}
		if ($imi_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_nm();
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			return imi_sppl_cd();
		}
		if ($imi_sppl_nm.equalsIgnoreCase(name)) {
			return imi_sppl_nm();
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			return mi_po_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			return mi_base_unit_inst_qty();
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			return ma_base_unit_yield_qty();
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			return ma_base_unit_dfct_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mpr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return mpr_mfg_sts_typ();
		}
		if ($mpr_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mpr_mfg_sts_typ_nm();
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			return imi_lot_no();
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			return imi_sublot_no();
		}
		if ($imi_base_unit_cd.equalsIgnoreCase(name)) {
			return imi_base_unit_cd();
		}
		if ($imi_base_unit_nm.equalsIgnoreCase(name)) {
			return imi_base_unit_nm();
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			return imi_mfg_loc_cd();
		}
		if ($imi_mfg_loc_nm.equalsIgnoreCase(name)) {
			return imi_mfg_loc_nm();
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_cd();
		}
		if ($imi_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_nm();
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			return imi_sppl_cd();
		}
		if ($imi_sppl_nm.equalsIgnoreCase(name)) {
			return imi_sppl_nm();
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			return mi_po_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			return mi_base_unit_inst_qty();
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			return ma_base_unit_yield_qty();
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			return ma_base_unit_dfct_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mpr_mfg_sts_typ.equalsIgnoreCase(name)) {
			mpr_mfg_sts_typ(value);
			return;
		}
		if ($mpr_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mpr_mfg_sts_typ_nm(value);
			return;
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			imi_lot_no(value);
			return;
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			imi_sublot_no(value);
			return;
		}
		if ($imi_base_unit_cd.equalsIgnoreCase(name)) {
			imi_base_unit_cd(value);
			return;
		}
		if ($imi_base_unit_nm.equalsIgnoreCase(name)) {
			imi_base_unit_nm(value);
			return;
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			imi_mfg_loc_cd(value);
			return;
		}
		if ($imi_mfg_loc_nm.equalsIgnoreCase(name)) {
			imi_mfg_loc_nm(value);
			return;
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_cd(value);
			return;
		}
		if ($imi_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_nm(value);
			return;
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			imi_sppl_cd(value);
			return;
		}
		if ($imi_sppl_nm.equalsIgnoreCase(name)) {
			imi_sppl_nm(value);
			return;
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			mi_po_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mpr_mfg_sts_typ.equalsIgnoreCase(name)) {
			mpr_mfg_sts_typ(value);
			return;
		}
		if ($mpr_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mpr_mfg_sts_typ_nm(value);
			return;
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			imi_lot_no(value);
			return;
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			imi_sublot_no(value);
			return;
		}
		if ($imi_base_unit_cd.equalsIgnoreCase(name)) {
			imi_base_unit_cd(value);
			return;
		}
		if ($imi_base_unit_nm.equalsIgnoreCase(name)) {
			imi_base_unit_nm(value);
			return;
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			imi_mfg_loc_cd(value);
			return;
		}
		if ($imi_mfg_loc_nm.equalsIgnoreCase(name)) {
			imi_mfg_loc_nm(value);
			return;
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_cd(value);
			return;
		}
		if ($imi_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_nm(value);
			return;
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			imi_sppl_cd(value);
			return;
		}
		if ($imi_sppl_nm.equalsIgnoreCase(name)) {
			imi_sppl_nm(value);
			return;
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			mi_po_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mi_base_unit_inst_qty.equalsIgnoreCase(name)) {
			mi_base_unit_inst_qty(value);
			return;
		}
		if ($ma_base_unit_yield_qty.equalsIgnoreCase(name)) {
			ma_base_unit_yield_qty(value);
			return;
		}
		if ($ma_base_unit_dfct_qty.equalsIgnoreCase(name)) {
			ma_base_unit_dfct_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($mi_rqst_dlv_rqst_p.equalsIgnoreCase(name)) {
			return mi_rqst_dlv_rqst_p();
		}
		if ($imi_itm_p.equalsIgnoreCase(name)) {
			return imi_itm_p();
		}
		if ($imi_sno_wrk_no_p.equalsIgnoreCase(name)) {
			return imi_sno_wrk_no_p();
		}
		if ($mi_st_schd_dt_p.equalsIgnoreCase(name)) {
			return mi_st_schd_dt_p();
		}
		if ($mi_end_schd_dt_p.equalsIgnoreCase(name)) {
			return mi_end_schd_dt_p();
		}
		if ($ma_st_act_dt_p.equalsIgnoreCase(name)) {
			return ma_st_act_dt_p();
		}
		if ($ma_end_act_dt_p.equalsIgnoreCase(name)) {
			return ma_end_act_dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($mi_rqst_dlv_rqst_p.equalsIgnoreCase(name)) {
			mi_rqst_dlv_rqst_p(
				((MCContainerMeta) mi_rqst_dlv_rqst_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($imi_itm_p.equalsIgnoreCase(name)) {
			imi_itm_p(
				((MCContainerMeta) imi_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($imi_sno_wrk_no_p.equalsIgnoreCase(name)) {
			imi_sno_wrk_no_p(
				((MCContainerMeta) imi_sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($mi_st_schd_dt_p.equalsIgnoreCase(name)) {
			mi_st_schd_dt_p(
				((MCContainerMeta) mi_st_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($mi_end_schd_dt_p.equalsIgnoreCase(name)) {
			mi_end_schd_dt_p(
				((MCContainerMeta) mi_end_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ma_st_act_dt_p.equalsIgnoreCase(name)) {
			ma_st_act_dt_p(
				((MCContainerMeta) ma_st_act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ma_end_act_dt_p.equalsIgnoreCase(name)) {
			ma_end_act_dt_p(
				((MCContainerMeta) ma_end_act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate mi_rqst_dlv_rqst_dt() {
		return mi_rqst_dlv_rqst_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void mi_rqst_dlv_rqst_dt(MCDate value) {
		mi_rqst_dlv_rqst_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate mi_rqst_dlv_rqst_hm() {
		return mi_rqst_dlv_rqst_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void mi_rqst_dlv_rqst_hm(MCDate value) {
		mi_rqst_dlv_rqst_p().hm(value);
	}

	public String imi_itm_cd() {
		return imi_itm_p().itm_cd();
	}

	public void imi_itm_cd(String value) {
		imi_itm_p().itm_cd(value);
	}

	public String imi_itm_sub1() {
		return imi_itm_p().itm_sub1();
	}

	public void imi_itm_sub1(String value) {
		imi_itm_p().itm_sub1(value);
	}

	public String imi_itm_sub2() {
		return imi_itm_p().itm_sub2();
	}

	public void imi_itm_sub2(String value) {
		imi_itm_p().itm_sub2(value);
	}

	public String imi_itm_sub3() {
		return imi_itm_p().itm_sub3();
	}

	public void imi_itm_sub3(String value) {
		imi_itm_p().itm_sub3(value);
	}

	public String imi_itm_nm() {
		return imi_itm_p().itm_nm();
	}

	public void imi_itm_nm(String value) {
		imi_itm_p().itm_nm(value);
	}

	public String imi_sno1() {
		return imi_sno_wrk_no_p().sno1();
	}

	public void imi_sno1(String value) {
		imi_sno_wrk_no_p().sno1(value);
	}

	public String imi_sno2() {
		return imi_sno_wrk_no_p().sno2();
	}

	public void imi_sno2(String value) {
		imi_sno_wrk_no_p().sno2(value);
	}

	public String imi_sno3() {
		return imi_sno_wrk_no_p().sno3();
	}

	public void imi_sno3(String value) {
		imi_sno_wrk_no_p().sno3(value);
	}

	public String imi_sno4() {
		return imi_sno_wrk_no_p().sno4();
	}

	public void imi_sno4(String value) {
		imi_sno_wrk_no_p().sno4(value);
	}

	public String imi_wrk_no() {
		return imi_sno_wrk_no_p().wrk_no();
	}

	public void imi_wrk_no(String value) {
		imi_sno_wrk_no_p().wrk_no(value);
	}

	public String imi_wrk_nm() {
		return imi_sno_wrk_no_p().wrk_nm();
	}

	public void imi_wrk_nm(String value) {
		imi_sno_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mi_st_schd_dt() {
		return mi_st_schd_dt_p().ymd();
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mi_st_schd_dt(MCDate value) {
		mi_st_schd_dt_p().ymd(value);
	}

	/**
	 * Schedule mfg. start time 製造着手予定時刻.<p>
	 *
	 */
	public MCDate mi_st_schd_hm() {
		return mi_st_schd_dt_p().hm();
	}

	/**
	 * Schedule mfg. start time 製造着手予定時刻.<p>
	 *
	 */
	public void mi_st_schd_hm(MCDate value) {
		mi_st_schd_dt_p().hm(value);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mi_end_schd_dt() {
		return mi_end_schd_dt_p().ymd();
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mi_end_schd_dt(MCDate value) {
		mi_end_schd_dt_p().ymd(value);
	}

	/**
	 * Scheduled mfg. end time 製造終了予定時刻.<p>
	 *
	 */
	public MCDate mi_end_schd_hm() {
		return mi_end_schd_dt_p().hm();
	}

	/**
	 * Scheduled mfg. end time 製造終了予定時刻.<p>
	 *
	 */
	public void mi_end_schd_hm(MCDate value) {
		mi_end_schd_dt_p().hm(value);
	}

	/**
	 * Actual mfg. start date 製造着手実績日.<p>
	 *
	 */
	public MCDate ma_st_act_dt() {
		return ma_st_act_dt_p().ymd();
	}

	/**
	 * Actual mfg. start date 製造着手実績日.<p>
	 *
	 */
	public void ma_st_act_dt(MCDate value) {
		ma_st_act_dt_p().ymd(value);
	}

	/**
	 * Actual mfg. start time 製造着手実績時刻.<p>
	 *
	 */
	public MCDate ma_st_act_hm() {
		return ma_st_act_dt_p().hm();
	}

	/**
	 * Actual mfg. start time 製造着手実績時刻.<p>
	 *
	 */
	public void ma_st_act_hm(MCDate value) {
		ma_st_act_dt_p().hm(value);
	}

	/**
	 * Actual mfg. end date 製造終了実績日.<p>
	 *
	 */
	public MCDate ma_end_act_dt() {
		return ma_end_act_dt_p().ymd();
	}

	/**
	 * Actual mfg. end date 製造終了実績日.<p>
	 *
	 */
	public void ma_end_act_dt(MCDate value) {
		ma_end_act_dt_p().ymd(value);
	}

	/**
	 * Actual mfg. end time 製造終了実績時刻.<p>
	 *
	 */
	public MCDate ma_end_act_hm() {
		return ma_end_act_dt_p().hm();
	}

	/**
	 * Actual mfg. end time 製造終了実績時刻.<p>
	 *
	 */
	public void ma_end_act_hm(MCDate value) {
		ma_end_act_dt_p().hm(value);
	}

}

