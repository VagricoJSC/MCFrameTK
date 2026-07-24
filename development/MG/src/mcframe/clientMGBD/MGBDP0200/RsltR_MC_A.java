package mcframe.clientMGBD.MGBDP0200;

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
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public static final String $inpt_alc_typ = "inpt_alc_typ";
	/**
	 * Input expense type name 入力費用区分名.<p>
	 *
	 */
	public static final String $inpt_alc_typ_nm = "inpt_alc_typ_nm";
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
	public static final String $itm_p = "itm_p";
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Input amount 入力金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public static final String $alc_amt = "alc_amt";
	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public static final String $trd_alc_amt = "trd_alc_amt";
	/**
	 * Allocation variance amount 配賦差額.<p>
	 *
	 */
	public static final String $alc_diff = "alc_diff";
	/**
	 * Budget amount 予算金額.<p>
	 *
	 */
	public static final String $pln_amt = "pln_amt";
	/**
	 * Standard allocation amount 標準配賦金額.<p>
	 *
	 */
	public static final String $std_alc_amt = "std_alc_amt";
	/**
	 * Standard allocation difference 標準配賦差額.<p>
	 *
	 */
	public static final String $std_alc_diff = "std_alc_diff";
	/**
	 * Budget variance 予算差異.<p>
	 *
	 */
	public static final String $pln_diff = "pln_diff";
	/**
	 * Operation capacity variance 操業度差異.<p>
	 *
	 */
	public static final String $capa_diff = "capa_diff";
	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public static final String $alc_tgt_val = "alc_tgt_val";
	/**
	 * Budget allocation target 予算配賦対象.<p>
	 *
	 */
	public static final String $pln_alc_tgt_val = "pln_alc_tgt_val";
	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public static final String $alc_rate = "alc_rate";
	/**
	 * Transfer allocation target 振替配賦対象.<p>
	 *
	 */
	public static final String $trd_alc_tgt_val = "trd_alc_tgt_val";
	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public static final String $std_alc_rate = "std_alc_rate";
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public static final String $alc_ptn_nm = "alc_ptn_nm";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * Allocation group ID 配賦グループＩＤ.<p>
	 *
	 */
	public static final String $alc_grp_id = "alc_grp_id";
	/**
	 * Allocation rate calculation type 配賦率計算区分.<p>
	 *
	 */
	public static final String $alc_calc_typ = "alc_calc_typ";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta inpt_alc_typ_META = createCommonMeta($inpt_alc_typ, mcframe.commonMG.meta.MG_META.INPT_ALC_TYP);
	public static final MCMeta inpt_alc_typ_nm_META = createCommonMeta($inpt_alc_typ_nm, mcframe.commonMG.meta.MG_META.INPT_ALC_TYP_NM);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_amt_META = createCommonMeta($alc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_alc_amt_META = createCommonMeta($trd_alc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_diff_META = createCommonMeta($alc_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_amt_META = createCommonMeta($pln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_alc_amt_META = createCommonMeta($std_alc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_alc_diff_META = createCommonMeta($std_alc_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_diff_META = createCommonMeta($pln_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta capa_diff_META = createCommonMeta($capa_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_tgt_val_META = createCommonMeta($alc_tgt_val, mcframe.commonMG.meta.MG_META.ALC_TGT_VAL);
	public static final MCMeta pln_alc_tgt_val_META = createCommonMeta($pln_alc_tgt_val, mcframe.commonMG.meta.MG_META.ALC_TGT_VAL);
	public static final MCMeta alc_rate_META = createCommonMeta($alc_rate, mcframe.commonMA.meta.MA_META.ALC_RATE);
	public static final MCMeta trd_alc_tgt_val_META = createCommonMeta($trd_alc_tgt_val, mcframe.commonMG.meta.MG_META.ALC_TGT_VAL);
	public static final MCMeta std_alc_rate_META = createCommonMeta($std_alc_rate, mcframe.commonMA.meta.MA_META.ALC_RATE);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta alc_ptn_nm_META = createCommonMeta($alc_ptn_nm, mcframe.commonMA.meta.MA_META.ALC_PTN_NM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta alc_grp_id_META = createCommonMeta($alc_grp_id, mcframe.commonMG.meta.MG_META.ALC_GRP_ID);
	public static final MCMeta alc_calc_typ_META = createCommonMeta($alc_calc_typ, mcframe.commonMA.meta.MA_META.ALC_CALC_TYP);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			ym_META,
			inpt_alc_typ_META,
			inpt_alc_typ_nm_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			loc_cd_META,
			loc_nm_META,
			oper_cd_META,
			oper_nm_META,
			bp_cd_META,
			bp_nm_META,
			ctg_cd_META,
			ctg_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			itm_mfg_inst_no_META,
			iv_no_META,
			po_no_META,
			slo_no_META,
			amt_META,
			alc_amt_META,
			trd_alc_amt_META,
			alc_diff_META,
			pln_amt_META,
			std_alc_amt_META,
			std_alc_diff_META,
			pln_diff_META,
			capa_diff_META,
			alc_tgt_val_META,
			pln_alc_tgt_val_META,
			alc_rate_META,
			trd_alc_tgt_val_META,
			std_alc_rate_META,
			expns_cd_META,
			expns_nm_META,
			alc_ptn_cd_META,
			alc_ptn_nm_META,
			calc_grp_cd_META,
			calc_no_META,
			alc_grp_id_META,
			alc_calc_typ_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
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
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"}	// sno4
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 2, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 2, $ym, value);
	}


	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public String inpt_alc_typ() {
		return getConstString(offset + 3, $inpt_alc_typ);
	}

	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public void inpt_alc_typ(String value) {
		setConstString(offset + 3, $inpt_alc_typ, value);
	}


	/**
	 * Input expense type name 入力費用区分名.<p>
	 *
	 */
	public String inpt_alc_typ_nm() {
		return getConstString(offset + 4, $inpt_alc_typ_nm);
	}

	/**
	 * Input expense type name 入力費用区分名.<p>
	 *
	 */
	public void inpt_alc_typ_nm(String value) {
		setConstString(offset + 4, $inpt_alc_typ_nm, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 5, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 5, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 6, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 6, $alc_ac_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 7, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 7, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 8, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 8, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 9, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 9, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 10, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 10, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 11, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 11, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 12, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 12, $oper_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 13, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 13, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 14, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 14, $bp_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 15, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 15, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 16, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 16, $ctg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 17, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 17, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 18, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 18, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 19, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 19, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 20, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 20, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 21, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 21, $itm_typ_d_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 22, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 22, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 23, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 23, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 24, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 24, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 25, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 25, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 26, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 26, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 27, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 27, $sno4, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 28, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 28, $itm_mfg_inst_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 29, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 29, $iv_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 30, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 30, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 31, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 31, $slo_no, value);
	}


	/**
	 * Input amount 入力金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 32, $amt);
	}

	/**
	 * Input amount 入力金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 32, $amt, value);
	}

	/**
	 * Input amount 入力金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 32, $amt, value);
	}

	/**
	 * Input amount 入力金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 32, $amt, value);
	}

	/**
	 * Input amount 入力金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 32, $amt, value);
	}

	/**
	 * Input amount 入力金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 32, $amt, value);
	}


	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public MCNumber alc_amt() {
		return getConstNumber(offset + 33, $alc_amt);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(MCNumber value) {
		setConstNumber(offset + 33, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(int value) {
		setConstNumber(offset + 33, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(long value) {
		setConstNumber(offset + 33, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(float value) {
		setConstNumber(offset + 33, $alc_amt, value);
	}

	/**
	 * Allocation amount 配賦金額.<p>
	 *
	 */
	public void alc_amt(double value) {
		setConstNumber(offset + 33, $alc_amt, value);
	}


	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public MCNumber trd_alc_amt() {
		return getConstNumber(offset + 34, $trd_alc_amt);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void trd_alc_amt(MCNumber value) {
		setConstNumber(offset + 34, $trd_alc_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void trd_alc_amt(int value) {
		setConstNumber(offset + 34, $trd_alc_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void trd_alc_amt(long value) {
		setConstNumber(offset + 34, $trd_alc_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void trd_alc_amt(float value) {
		setConstNumber(offset + 34, $trd_alc_amt, value);
	}

	/**
	 * Transfer amount 振替金額.<p>
	 *
	 */
	public void trd_alc_amt(double value) {
		setConstNumber(offset + 34, $trd_alc_amt, value);
	}


	/**
	 * Allocation variance amount 配賦差額.<p>
	 *
	 */
	public MCNumber alc_diff() {
		return getConstNumber(offset + 35, $alc_diff);
	}

	/**
	 * Allocation variance amount 配賦差額.<p>
	 *
	 */
	public void alc_diff(MCNumber value) {
		setConstNumber(offset + 35, $alc_diff, value);
	}

	/**
	 * Allocation variance amount 配賦差額.<p>
	 *
	 */
	public void alc_diff(int value) {
		setConstNumber(offset + 35, $alc_diff, value);
	}

	/**
	 * Allocation variance amount 配賦差額.<p>
	 *
	 */
	public void alc_diff(long value) {
		setConstNumber(offset + 35, $alc_diff, value);
	}

	/**
	 * Allocation variance amount 配賦差額.<p>
	 *
	 */
	public void alc_diff(float value) {
		setConstNumber(offset + 35, $alc_diff, value);
	}

	/**
	 * Allocation variance amount 配賦差額.<p>
	 *
	 */
	public void alc_diff(double value) {
		setConstNumber(offset + 35, $alc_diff, value);
	}


	/**
	 * Budget amount 予算金額.<p>
	 *
	 */
	public MCNumber pln_amt() {
		return getConstNumber(offset + 36, $pln_amt);
	}

	/**
	 * Budget amount 予算金額.<p>
	 *
	 */
	public void pln_amt(MCNumber value) {
		setConstNumber(offset + 36, $pln_amt, value);
	}

	/**
	 * Budget amount 予算金額.<p>
	 *
	 */
	public void pln_amt(int value) {
		setConstNumber(offset + 36, $pln_amt, value);
	}

	/**
	 * Budget amount 予算金額.<p>
	 *
	 */
	public void pln_amt(long value) {
		setConstNumber(offset + 36, $pln_amt, value);
	}

	/**
	 * Budget amount 予算金額.<p>
	 *
	 */
	public void pln_amt(float value) {
		setConstNumber(offset + 36, $pln_amt, value);
	}

	/**
	 * Budget amount 予算金額.<p>
	 *
	 */
	public void pln_amt(double value) {
		setConstNumber(offset + 36, $pln_amt, value);
	}


	/**
	 * Standard allocation amount 標準配賦金額.<p>
	 *
	 */
	public MCNumber std_alc_amt() {
		return getConstNumber(offset + 37, $std_alc_amt);
	}

	/**
	 * Standard allocation amount 標準配賦金額.<p>
	 *
	 */
	public void std_alc_amt(MCNumber value) {
		setConstNumber(offset + 37, $std_alc_amt, value);
	}

	/**
	 * Standard allocation amount 標準配賦金額.<p>
	 *
	 */
	public void std_alc_amt(int value) {
		setConstNumber(offset + 37, $std_alc_amt, value);
	}

	/**
	 * Standard allocation amount 標準配賦金額.<p>
	 *
	 */
	public void std_alc_amt(long value) {
		setConstNumber(offset + 37, $std_alc_amt, value);
	}

	/**
	 * Standard allocation amount 標準配賦金額.<p>
	 *
	 */
	public void std_alc_amt(float value) {
		setConstNumber(offset + 37, $std_alc_amt, value);
	}

	/**
	 * Standard allocation amount 標準配賦金額.<p>
	 *
	 */
	public void std_alc_amt(double value) {
		setConstNumber(offset + 37, $std_alc_amt, value);
	}


	/**
	 * Standard allocation difference 標準配賦差額.<p>
	 *
	 */
	public MCNumber std_alc_diff() {
		return getConstNumber(offset + 38, $std_alc_diff);
	}

	/**
	 * Standard allocation difference 標準配賦差額.<p>
	 *
	 */
	public void std_alc_diff(MCNumber value) {
		setConstNumber(offset + 38, $std_alc_diff, value);
	}

	/**
	 * Standard allocation difference 標準配賦差額.<p>
	 *
	 */
	public void std_alc_diff(int value) {
		setConstNumber(offset + 38, $std_alc_diff, value);
	}

	/**
	 * Standard allocation difference 標準配賦差額.<p>
	 *
	 */
	public void std_alc_diff(long value) {
		setConstNumber(offset + 38, $std_alc_diff, value);
	}

	/**
	 * Standard allocation difference 標準配賦差額.<p>
	 *
	 */
	public void std_alc_diff(float value) {
		setConstNumber(offset + 38, $std_alc_diff, value);
	}

	/**
	 * Standard allocation difference 標準配賦差額.<p>
	 *
	 */
	public void std_alc_diff(double value) {
		setConstNumber(offset + 38, $std_alc_diff, value);
	}


	/**
	 * Budget variance 予算差異.<p>
	 *
	 */
	public MCNumber pln_diff() {
		return getConstNumber(offset + 39, $pln_diff);
	}

	/**
	 * Budget variance 予算差異.<p>
	 *
	 */
	public void pln_diff(MCNumber value) {
		setConstNumber(offset + 39, $pln_diff, value);
	}

	/**
	 * Budget variance 予算差異.<p>
	 *
	 */
	public void pln_diff(int value) {
		setConstNumber(offset + 39, $pln_diff, value);
	}

	/**
	 * Budget variance 予算差異.<p>
	 *
	 */
	public void pln_diff(long value) {
		setConstNumber(offset + 39, $pln_diff, value);
	}

	/**
	 * Budget variance 予算差異.<p>
	 *
	 */
	public void pln_diff(float value) {
		setConstNumber(offset + 39, $pln_diff, value);
	}

	/**
	 * Budget variance 予算差異.<p>
	 *
	 */
	public void pln_diff(double value) {
		setConstNumber(offset + 39, $pln_diff, value);
	}


	/**
	 * Operation capacity variance 操業度差異.<p>
	 *
	 */
	public MCNumber capa_diff() {
		return getConstNumber(offset + 40, $capa_diff);
	}

	/**
	 * Operation capacity variance 操業度差異.<p>
	 *
	 */
	public void capa_diff(MCNumber value) {
		setConstNumber(offset + 40, $capa_diff, value);
	}

	/**
	 * Operation capacity variance 操業度差異.<p>
	 *
	 */
	public void capa_diff(int value) {
		setConstNumber(offset + 40, $capa_diff, value);
	}

	/**
	 * Operation capacity variance 操業度差異.<p>
	 *
	 */
	public void capa_diff(long value) {
		setConstNumber(offset + 40, $capa_diff, value);
	}

	/**
	 * Operation capacity variance 操業度差異.<p>
	 *
	 */
	public void capa_diff(float value) {
		setConstNumber(offset + 40, $capa_diff, value);
	}

	/**
	 * Operation capacity variance 操業度差異.<p>
	 *
	 */
	public void capa_diff(double value) {
		setConstNumber(offset + 40, $capa_diff, value);
	}


	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public MCNumber alc_tgt_val() {
		return getConstNumber(offset + 41, $alc_tgt_val);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(MCNumber value) {
		setConstNumber(offset + 41, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(int value) {
		setConstNumber(offset + 41, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(long value) {
		setConstNumber(offset + 41, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(float value) {
		setConstNumber(offset + 41, $alc_tgt_val, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void alc_tgt_val(double value) {
		setConstNumber(offset + 41, $alc_tgt_val, value);
	}


	/**
	 * Budget allocation target 予算配賦対象.<p>
	 *
	 */
	public MCNumber pln_alc_tgt_val() {
		return getConstNumber(offset + 42, $pln_alc_tgt_val);
	}

	/**
	 * Budget allocation target 予算配賦対象.<p>
	 *
	 */
	public void pln_alc_tgt_val(MCNumber value) {
		setConstNumber(offset + 42, $pln_alc_tgt_val, value);
	}

	/**
	 * Budget allocation target 予算配賦対象.<p>
	 *
	 */
	public void pln_alc_tgt_val(int value) {
		setConstNumber(offset + 42, $pln_alc_tgt_val, value);
	}

	/**
	 * Budget allocation target 予算配賦対象.<p>
	 *
	 */
	public void pln_alc_tgt_val(long value) {
		setConstNumber(offset + 42, $pln_alc_tgt_val, value);
	}

	/**
	 * Budget allocation target 予算配賦対象.<p>
	 *
	 */
	public void pln_alc_tgt_val(float value) {
		setConstNumber(offset + 42, $pln_alc_tgt_val, value);
	}

	/**
	 * Budget allocation target 予算配賦対象.<p>
	 *
	 */
	public void pln_alc_tgt_val(double value) {
		setConstNumber(offset + 42, $pln_alc_tgt_val, value);
	}


	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public MCNumber alc_rate() {
		return getConstNumber(offset + 43, $alc_rate);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(MCNumber value) {
		setConstNumber(offset + 43, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(int value) {
		setConstNumber(offset + 43, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(long value) {
		setConstNumber(offset + 43, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(float value) {
		setConstNumber(offset + 43, $alc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void alc_rate(double value) {
		setConstNumber(offset + 43, $alc_rate, value);
	}


	/**
	 * Transfer allocation target 振替配賦対象.<p>
	 *
	 */
	public MCNumber trd_alc_tgt_val() {
		return getConstNumber(offset + 44, $trd_alc_tgt_val);
	}

	/**
	 * Transfer allocation target 振替配賦対象.<p>
	 *
	 */
	public void trd_alc_tgt_val(MCNumber value) {
		setConstNumber(offset + 44, $trd_alc_tgt_val, value);
	}

	/**
	 * Transfer allocation target 振替配賦対象.<p>
	 *
	 */
	public void trd_alc_tgt_val(int value) {
		setConstNumber(offset + 44, $trd_alc_tgt_val, value);
	}

	/**
	 * Transfer allocation target 振替配賦対象.<p>
	 *
	 */
	public void trd_alc_tgt_val(long value) {
		setConstNumber(offset + 44, $trd_alc_tgt_val, value);
	}

	/**
	 * Transfer allocation target 振替配賦対象.<p>
	 *
	 */
	public void trd_alc_tgt_val(float value) {
		setConstNumber(offset + 44, $trd_alc_tgt_val, value);
	}

	/**
	 * Transfer allocation target 振替配賦対象.<p>
	 *
	 */
	public void trd_alc_tgt_val(double value) {
		setConstNumber(offset + 44, $trd_alc_tgt_val, value);
	}


	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public MCNumber std_alc_rate() {
		return getConstNumber(offset + 45, $std_alc_rate);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(MCNumber value) {
		setConstNumber(offset + 45, $std_alc_rate, value);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(int value) {
		setConstNumber(offset + 45, $std_alc_rate, value);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(long value) {
		setConstNumber(offset + 45, $std_alc_rate, value);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(float value) {
		setConstNumber(offset + 45, $std_alc_rate, value);
	}

	/**
	 * Standard allocation rate 標準配賦率.<p>
	 *
	 */
	public void std_alc_rate(double value) {
		setConstNumber(offset + 45, $std_alc_rate, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 46, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 46, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 47, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 47, $expns_nm, value);
	}


	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 48, $alc_ptn_cd);
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 48, $alc_ptn_cd, value);
	}


	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public String alc_ptn_nm() {
		return getConstString(offset + 49, $alc_ptn_nm);
	}

	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public void alc_ptn_nm(String value) {
		setConstString(offset + 49, $alc_ptn_nm, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 50, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 50, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 51, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 51, $calc_no, value);
	}


	/**
	 * Allocation group ID 配賦グループＩＤ.<p>
	 *
	 */
	public MCNumber alc_grp_id() {
		return getConstNumber(offset + 52, $alc_grp_id);
	}

	/**
	 * Allocation group ID 配賦グループＩＤ.<p>
	 *
	 */
	public void alc_grp_id(MCNumber value) {
		setConstNumber(offset + 52, $alc_grp_id, value);
	}

	/**
	 * Allocation group ID 配賦グループＩＤ.<p>
	 *
	 */
	public void alc_grp_id(int value) {
		setConstNumber(offset + 52, $alc_grp_id, value);
	}

	/**
	 * Allocation group ID 配賦グループＩＤ.<p>
	 *
	 */
	public void alc_grp_id(long value) {
		setConstNumber(offset + 52, $alc_grp_id, value);
	}

	/**
	 * Allocation group ID 配賦グループＩＤ.<p>
	 *
	 */
	public void alc_grp_id(float value) {
		setConstNumber(offset + 52, $alc_grp_id, value);
	}

	/**
	 * Allocation group ID 配賦グループＩＤ.<p>
	 *
	 */
	public void alc_grp_id(double value) {
		setConstNumber(offset + 52, $alc_grp_id, value);
	}


	/**
	 * Allocation rate calculation type 配賦率計算区分.<p>
	 *
	 */
	public String alc_calc_typ() {
		return getConstString(offset + 53, $alc_calc_typ);
	}

	/**
	 * Allocation rate calculation type 配賦率計算区分.<p>
	 *
	 */
	public void alc_calc_typ(String value) {
		setConstString(offset + 53, $alc_calc_typ, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			return inpt_alc_typ();
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			return inpt_alc_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			return trd_alc_amt();
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			return alc_diff();
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			return pln_amt();
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			return std_alc_amt();
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			return std_alc_diff();
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			return pln_diff();
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			return capa_diff();
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			return alc_tgt_val();
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			return pln_alc_tgt_val();
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			return alc_rate();
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			return trd_alc_tgt_val();
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			return std_alc_rate();
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			return alc_grp_id();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			return inpt_alc_typ();
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			return inpt_alc_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			return trd_alc_amt();
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			return alc_diff();
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			return pln_amt();
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			return std_alc_amt();
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			return std_alc_diff();
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			return pln_diff();
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			return capa_diff();
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			return alc_tgt_val();
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			return pln_alc_tgt_val();
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			return alc_rate();
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			return trd_alc_tgt_val();
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			return std_alc_rate();
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			return alc_grp_id();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			inpt_alc_typ(value);
			return;
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			inpt_alc_typ_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			inpt_alc_typ(value);
			return;
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			inpt_alc_typ_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($trd_alc_amt.equalsIgnoreCase(name)) {
			trd_alc_amt(value);
			return;
		}
		if ($alc_diff.equalsIgnoreCase(name)) {
			alc_diff(value);
			return;
		}
		if ($pln_amt.equalsIgnoreCase(name)) {
			pln_amt(value);
			return;
		}
		if ($std_alc_amt.equalsIgnoreCase(name)) {
			std_alc_amt(value);
			return;
		}
		if ($std_alc_diff.equalsIgnoreCase(name)) {
			std_alc_diff(value);
			return;
		}
		if ($pln_diff.equalsIgnoreCase(name)) {
			pln_diff(value);
			return;
		}
		if ($capa_diff.equalsIgnoreCase(name)) {
			capa_diff(value);
			return;
		}
		if ($alc_tgt_val.equalsIgnoreCase(name)) {
			alc_tgt_val(value);
			return;
		}
		if ($pln_alc_tgt_val.equalsIgnoreCase(name)) {
			pln_alc_tgt_val(value);
			return;
		}
		if ($alc_rate.equalsIgnoreCase(name)) {
			alc_rate(value);
			return;
		}
		if ($trd_alc_tgt_val.equalsIgnoreCase(name)) {
			trd_alc_tgt_val(value);
			return;
		}
		if ($std_alc_rate.equalsIgnoreCase(name)) {
			std_alc_rate(value);
			return;
		}
		if ($alc_grp_id.equalsIgnoreCase(name)) {
			alc_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

