package mcframe.serverMGBD.MGBDL0260;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public static final String $hrrchy = "hrrchy";
	/**
	 * Loop flg. ループＦＬＧ.<p>
	 *
	 */
	public static final String $loop_flg = "loop_flg";
	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public static final String $extno = "extno";
	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public static final String $par_extno = "par_extno";
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
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
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
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public static final String $pre_alc_rate = "pre_alc_rate";
	/**
	 * Allocation target total 配賦対象合計.<p>
	 *
	 */
	public static final String $pre_alc_total = "pre_alc_total";
	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public static final String $pre_alc_calc_rate = "pre_alc_calc_rate";
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public static final String $pre_alc_rate_cd = "pre_alc_rate_cd";
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public static final String $pre_alc_rate_nm = "pre_alc_rate_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $src_wg_cd = "src_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $src_wg_nm = "src_wg_nm";
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public static final String $pre_alc_seq = "pre_alc_seq";
	/**
	 * Allocation source sequence number 配賦元連番.<p>
	 *
	 */
	public static final String $src_pre_alc_seq = "src_pre_alc_seq";
	/**
	 * Top sequence number 最上位連番.<p>
	 *
	 */
	public static final String $top_pre_alc_seq = "top_pre_alc_seq";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta inpt_alc_typ_META = createCommonMeta($inpt_alc_typ, mcframe.commonMG.meta.MG_META.INPT_ALC_TYP);
	public static final MCMeta inpt_alc_typ_nm_META = createCommonMeta($inpt_alc_typ_nm, mcframe.commonMG.meta.MG_META.INPT_ALC_TYP_NM);
	public static final MCMeta hrrchy_META = createCommonMeta($hrrchy, mcframe.commonMA.meta.MA_META.TREE_LVL);
	public static final MCMeta loop_flg_META = createCommonMeta($loop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta extno_META = createNumberMeta($extno);
	public static final MCMeta par_extno_META = createNumberMeta($par_extno);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
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
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta pre_alc_rate_META = createCommonMeta($pre_alc_rate, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pre_alc_total_META = createCommonMeta($pre_alc_total, mcframe.commonMG.meta.MG_META.PRE_ALC_TOTAL);
	public static final MCMeta pre_alc_calc_rate_META = createCommonMeta($pre_alc_calc_rate, mcframe.commonMG.meta.MG_META.PRE_ALC_CALC_RATE);
	public static final MCMeta pre_alc_rate_cd_META = createCommonMeta($pre_alc_rate_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_CD);
	public static final MCMeta pre_alc_rate_nm_META = createCommonMeta($pre_alc_rate_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_NM);
	public static final MCMeta src_wg_cd_META = createCommonMeta($src_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta src_wg_nm_META = createCommonMeta($src_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta pre_alc_seq_META = createCommonMeta($pre_alc_seq, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_REC);
	public static final MCMeta src_pre_alc_seq_META = createCommonMeta($src_pre_alc_seq, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_REC);
	public static final MCMeta top_pre_alc_seq_META = createCommonMeta($top_pre_alc_seq, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_REC);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			inpt_alc_typ_META,
			inpt_alc_typ_nm_META,
			hrrchy_META,
			loop_flg_META,
			extno_META,
			par_extno_META,
			wg_cd_META,
			wg_nm_META,
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
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
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
			pre_alc_rate_META,
			pre_alc_total_META,
			pre_alc_calc_rate_META,
			pre_alc_rate_cd_META,
			pre_alc_rate_nm_META,
			src_wg_cd_META,
			src_wg_nm_META,
			pre_alc_seq_META,
			src_pre_alc_seq_META,
			top_pre_alc_seq_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$inpt_alc_typ, "MGC_INPT_ALC_TYP"},	// inpt_alc_typ
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public String inpt_alc_typ() {
		return getConstString(offset + 1, $inpt_alc_typ);
	}

	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public void inpt_alc_typ(String value) {
		setConstString(offset + 1, $inpt_alc_typ, value);
	}


	/**
	 * Input expense type name 入力費用区分名.<p>
	 *
	 */
	public String inpt_alc_typ_nm() {
		return getConstString(offset + 2, $inpt_alc_typ_nm);
	}

	/**
	 * Input expense type name 入力費用区分名.<p>
	 *
	 */
	public void inpt_alc_typ_nm(String value) {
		setConstString(offset + 2, $inpt_alc_typ_nm, value);
	}


	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public MCNumber hrrchy() {
		return getConstNumber(offset + 3, $hrrchy);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(MCNumber value) {
		setConstNumber(offset + 3, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(int value) {
		setConstNumber(offset + 3, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(long value) {
		setConstNumber(offset + 3, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(float value) {
		setConstNumber(offset + 3, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(double value) {
		setConstNumber(offset + 3, $hrrchy, value);
	}


	/**
	 * Loop flg. ループＦＬＧ.<p>
	 *
	 */
	public boolean loop_flg() {
		return getConstBoolean(offset + 4, $loop_flg);
	}

	/**
	 * Loop flg. ループＦＬＧ.<p>
	 *
	 */
	public void loop_flg(boolean value) {
		setConstBoolean(offset + 4, $loop_flg, value);
	}


	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public MCNumber extno() {
		return getConstNumber(offset + 5, $extno);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(MCNumber value) {
		setConstNumber(offset + 5, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(int value) {
		setConstNumber(offset + 5, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(long value) {
		setConstNumber(offset + 5, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(float value) {
		setConstNumber(offset + 5, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(double value) {
		setConstNumber(offset + 5, $extno, value);
	}


	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public MCNumber par_extno() {
		return getConstNumber(offset + 6, $par_extno);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(MCNumber value) {
		setConstNumber(offset + 6, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(int value) {
		setConstNumber(offset + 6, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(long value) {
		setConstNumber(offset + 6, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(float value) {
		setConstNumber(offset + 6, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(double value) {
		setConstNumber(offset + 6, $par_extno, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 8, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 8, $wg_nm, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 9, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 9, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 10, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 10, $alc_ac_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 11, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 11, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 12, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 12, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 13, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 13, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 14, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 14, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 15, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 15, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 16, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 16, $oper_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 17, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 17, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 18, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 18, $bp_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 19, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 19, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 20, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 20, $ctg_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 21, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 21, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 22, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 22, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 23, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 23, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 24, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 24, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 25, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 25, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 26, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 26, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 27, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 27, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 28, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 28, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 29, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 29, $itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 30, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 30, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 31, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 31, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 32, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 32, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 33, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 33, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 34, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 34, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 35, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 35, $sno4, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 36, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 36, $itm_mfg_inst_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 37, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 37, $iv_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 38, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 38, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 39, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 39, $slo_no, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 40, $amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 40, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 40, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 40, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 40, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 40, $amt, value);
	}


	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public MCNumber pre_alc_rate() {
		return getConstNumber(offset + 41, $pre_alc_rate);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void pre_alc_rate(MCNumber value) {
		setConstNumber(offset + 41, $pre_alc_rate, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void pre_alc_rate(int value) {
		setConstNumber(offset + 41, $pre_alc_rate, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void pre_alc_rate(long value) {
		setConstNumber(offset + 41, $pre_alc_rate, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void pre_alc_rate(float value) {
		setConstNumber(offset + 41, $pre_alc_rate, value);
	}

	/**
	 * Allocation target 配賦対象.<p>
	 *
	 */
	public void pre_alc_rate(double value) {
		setConstNumber(offset + 41, $pre_alc_rate, value);
	}


	/**
	 * Allocation target total 配賦対象合計.<p>
	 *
	 */
	public MCNumber pre_alc_total() {
		return getConstNumber(offset + 42, $pre_alc_total);
	}

	/**
	 * Allocation target total 配賦対象合計.<p>
	 *
	 */
	public void pre_alc_total(MCNumber value) {
		setConstNumber(offset + 42, $pre_alc_total, value);
	}

	/**
	 * Allocation target total 配賦対象合計.<p>
	 *
	 */
	public void pre_alc_total(int value) {
		setConstNumber(offset + 42, $pre_alc_total, value);
	}

	/**
	 * Allocation target total 配賦対象合計.<p>
	 *
	 */
	public void pre_alc_total(long value) {
		setConstNumber(offset + 42, $pre_alc_total, value);
	}

	/**
	 * Allocation target total 配賦対象合計.<p>
	 *
	 */
	public void pre_alc_total(float value) {
		setConstNumber(offset + 42, $pre_alc_total, value);
	}

	/**
	 * Allocation target total 配賦対象合計.<p>
	 *
	 */
	public void pre_alc_total(double value) {
		setConstNumber(offset + 42, $pre_alc_total, value);
	}


	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public MCNumber pre_alc_calc_rate() {
		return getConstNumber(offset + 43, $pre_alc_calc_rate);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void pre_alc_calc_rate(MCNumber value) {
		setConstNumber(offset + 43, $pre_alc_calc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void pre_alc_calc_rate(int value) {
		setConstNumber(offset + 43, $pre_alc_calc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void pre_alc_calc_rate(long value) {
		setConstNumber(offset + 43, $pre_alc_calc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void pre_alc_calc_rate(float value) {
		setConstNumber(offset + 43, $pre_alc_calc_rate, value);
	}

	/**
	 * Allocation rate 配賦率.<p>
	 *
	 */
	public void pre_alc_calc_rate(double value) {
		setConstNumber(offset + 43, $pre_alc_calc_rate, value);
	}


	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return getConstString(offset + 44, $pre_alc_rate_cd);
	}

	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		setConstString(offset + 44, $pre_alc_rate_cd, value);
	}


	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public String pre_alc_rate_nm() {
		return getConstString(offset + 45, $pre_alc_rate_nm);
	}

	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public void pre_alc_rate_nm(String value) {
		setConstString(offset + 45, $pre_alc_rate_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String src_wg_cd() {
		return getConstString(offset + 46, $src_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void src_wg_cd(String value) {
		setConstString(offset + 46, $src_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String src_wg_nm() {
		return getConstString(offset + 47, $src_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void src_wg_nm(String value) {
		setConstString(offset + 47, $src_wg_nm, value);
	}


	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCNumber pre_alc_seq() {
		return getConstNumber(offset + 48, $pre_alc_seq);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void pre_alc_seq(MCNumber value) {
		setConstNumber(offset + 48, $pre_alc_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void pre_alc_seq(int value) {
		setConstNumber(offset + 48, $pre_alc_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void pre_alc_seq(long value) {
		setConstNumber(offset + 48, $pre_alc_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void pre_alc_seq(float value) {
		setConstNumber(offset + 48, $pre_alc_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void pre_alc_seq(double value) {
		setConstNumber(offset + 48, $pre_alc_seq, value);
	}


	/**
	 * Allocation source sequence number 配賦元連番.<p>
	 *
	 */
	public MCNumber src_pre_alc_seq() {
		return getConstNumber(offset + 49, $src_pre_alc_seq);
	}

	/**
	 * Allocation source sequence number 配賦元連番.<p>
	 *
	 */
	public void src_pre_alc_seq(MCNumber value) {
		setConstNumber(offset + 49, $src_pre_alc_seq, value);
	}

	/**
	 * Allocation source sequence number 配賦元連番.<p>
	 *
	 */
	public void src_pre_alc_seq(int value) {
		setConstNumber(offset + 49, $src_pre_alc_seq, value);
	}

	/**
	 * Allocation source sequence number 配賦元連番.<p>
	 *
	 */
	public void src_pre_alc_seq(long value) {
		setConstNumber(offset + 49, $src_pre_alc_seq, value);
	}

	/**
	 * Allocation source sequence number 配賦元連番.<p>
	 *
	 */
	public void src_pre_alc_seq(float value) {
		setConstNumber(offset + 49, $src_pre_alc_seq, value);
	}

	/**
	 * Allocation source sequence number 配賦元連番.<p>
	 *
	 */
	public void src_pre_alc_seq(double value) {
		setConstNumber(offset + 49, $src_pre_alc_seq, value);
	}


	/**
	 * Top sequence number 最上位連番.<p>
	 *
	 */
	public MCNumber top_pre_alc_seq() {
		return getConstNumber(offset + 50, $top_pre_alc_seq);
	}

	/**
	 * Top sequence number 最上位連番.<p>
	 *
	 */
	public void top_pre_alc_seq(MCNumber value) {
		setConstNumber(offset + 50, $top_pre_alc_seq, value);
	}

	/**
	 * Top sequence number 最上位連番.<p>
	 *
	 */
	public void top_pre_alc_seq(int value) {
		setConstNumber(offset + 50, $top_pre_alc_seq, value);
	}

	/**
	 * Top sequence number 最上位連番.<p>
	 *
	 */
	public void top_pre_alc_seq(long value) {
		setConstNumber(offset + 50, $top_pre_alc_seq, value);
	}

	/**
	 * Top sequence number 最上位連番.<p>
	 *
	 */
	public void top_pre_alc_seq(float value) {
		setConstNumber(offset + 50, $top_pre_alc_seq, value);
	}

	/**
	 * Top sequence number 最上位連番.<p>
	 *
	 */
	public void top_pre_alc_seq(double value) {
		setConstNumber(offset + 50, $top_pre_alc_seq, value);
	}


	public String getString(String name) {
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			return inpt_alc_typ();
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			return inpt_alc_typ_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			return src_wg_cd();
		}
		if ($src_wg_nm.equalsIgnoreCase(name)) {
			return src_wg_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($extno.equalsIgnoreCase(name)) {
			return extno();
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			return par_extno();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			return pre_alc_rate();
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			return pre_alc_total();
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			return pre_alc_calc_rate();
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			return pre_alc_seq();
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			return src_pre_alc_seq();
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			return top_pre_alc_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			return inpt_alc_typ();
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			return inpt_alc_typ_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			return src_wg_cd();
		}
		if ($src_wg_nm.equalsIgnoreCase(name)) {
			return src_wg_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($extno.equalsIgnoreCase(name)) {
			return extno();
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			return par_extno();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			return pre_alc_rate();
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			return pre_alc_total();
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			return pre_alc_calc_rate();
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			return pre_alc_seq();
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			return src_pre_alc_seq();
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			return top_pre_alc_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			inpt_alc_typ(value);
			return;
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			inpt_alc_typ_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			src_wg_cd(value);
			return;
		}
		if ($src_wg_nm.equalsIgnoreCase(name)) {
			src_wg_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
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
	public void setBoolean(String name, boolean value) {
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_alc_typ.equalsIgnoreCase(name)) {
			inpt_alc_typ(value);
			return;
		}
		if ($inpt_alc_typ_nm.equalsIgnoreCase(name)) {
			inpt_alc_typ_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			src_wg_cd(value);
			return;
		}
		if ($src_wg_nm.equalsIgnoreCase(name)) {
			src_wg_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($pre_alc_rate.equalsIgnoreCase(name)) {
			pre_alc_rate(value);
			return;
		}
		if ($pre_alc_total.equalsIgnoreCase(name)) {
			pre_alc_total(value);
			return;
		}
		if ($pre_alc_calc_rate.equalsIgnoreCase(name)) {
			pre_alc_calc_rate(value);
			return;
		}
		if ($pre_alc_seq.equalsIgnoreCase(name)) {
			pre_alc_seq(value);
			return;
		}
		if ($src_pre_alc_seq.equalsIgnoreCase(name)) {
			src_pre_alc_seq(value);
			return;
		}
		if ($top_pre_alc_seq.equalsIgnoreCase(name)) {
			top_pre_alc_seq(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

