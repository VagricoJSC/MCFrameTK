package mcframe.serverMSBF.MSBFL5200;

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
 * ブロック"LotTrace_Srch01_RsltAprvJudg"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LotTrace_Srch01_RsltAprvJudgR_MC_A extends MCConstRow {

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
	 * Notification name 届出名.<p>
	 *
	 */
	public static final String $ntfy_nm = "ntfy_nm";
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
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
	/**
	 * Mfg. approval date 製造承認日.<p>
	 *
	 */
	public static final String $mfg_aprv_dt = "mfg_aprv_dt";
	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public static final String $yield_base_unit_qty = "yield_base_unit_qty";
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public static final String $yield_base_unit_cd = "yield_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $yield_base_unit_nm = "yield_base_unit_nm";
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
	/**
	 * Inspection decision date 検査判定日.<p>
	 *
	 */
	public static final String $insp_judg_dt = "insp_judg_dt";
	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public static final String $insp_good_qty = "insp_good_qty";
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public static final String $insp_base_unit_cd = "insp_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $insp_base_unit_nm = "insp_base_unit_nm";
	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	/**
	 * Inspection decision result type name 検査判定結果区分名.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ_nm = "insp_judg_rslt_typ_nm";
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public static final String $plnt_aprv_dt = "plnt_aprv_dt";
	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public static final String $plnt_base_unit_qty = "plnt_base_unit_qty";
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public static final String $plnt_base_unit_cd = "plnt_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $plnt_base_unit_nm = "plnt_base_unit_nm";
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 * Market shipment decision date 市場出荷判定日.<p>
	 *
	 */
	public static final String $mrkt_judg_dt = "mrkt_judg_dt";
	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public static final String $mrkt_base_unit_qty = "mrkt_base_unit_qty";
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public static final String $mrkt_base_unit_cd = "mrkt_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $mrkt_base_unit_nm = "mrkt_base_unit_nm";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ntfy_nm_META = createCommonMeta($ntfy_nm, mcframe.commonMA.meta.MA_META.NTFY_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta mfg_aprv_dt_META = createCommonMeta($mfg_aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta yield_base_unit_qty_META = createCommonMeta($yield_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_base_unit_cd_META = createCommonMeta($yield_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta yield_base_unit_nm_META = createCommonMeta($yield_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta insp_judg_dt_META = createCommonMeta($insp_judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_good_qty_META = createCommonMeta($insp_good_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_base_unit_cd_META = createCommonMeta($insp_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta insp_base_unit_nm_META = createCommonMeta($insp_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta insp_judg_rslt_typ_nm_META = createCommonMeta($insp_judg_rslt_typ_nm, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP_NM);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta plnt_aprv_sts_typ_nm_META = createCommonMeta($plnt_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP_NM);
	public static final MCMeta plnt_aprv_dt_META = createCommonMeta($plnt_aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta plnt_base_unit_qty_META = createCommonMeta($plnt_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta plnt_base_unit_cd_META = createCommonMeta($plnt_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta plnt_base_unit_nm_META = createCommonMeta($plnt_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta mrkt_judg_dt_META = createCommonMeta($mrkt_judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrkt_base_unit_qty_META = createCommonMeta($mrkt_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mrkt_base_unit_cd_META = createCommonMeta($mrkt_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta mrkt_base_unit_nm_META = createCommonMeta($mrkt_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);

	protected static final ConstMetaList<LotTrace_Srch01_RsltAprvJudgR> constMetas = new ConstMetaList<LotTrace_Srch01_RsltAprvJudgR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ntfy_nm_META,
			lot_no_META,
			sublot_no_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			mfg_aprv_dt_META,
			yield_base_unit_qty_META,
			yield_base_unit_cd_META,
			yield_base_unit_nm_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			insp_judg_dt_META,
			insp_good_qty_META,
			insp_base_unit_cd_META,
			insp_base_unit_nm_META,
			insp_judg_rslt_typ_META,
			insp_judg_rslt_typ_nm_META,
			plnt_aprv_sts_typ_META,
			plnt_aprv_sts_typ_nm_META,
			plnt_aprv_dt_META,
			plnt_base_unit_qty_META,
			plnt_base_unit_cd_META,
			plnt_base_unit_nm_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			mrkt_judg_dt_META,
			mrkt_base_unit_qty_META,
			mrkt_base_unit_cd_META,
			mrkt_base_unit_nm_META
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
	protected LotTrace_Srch01_RsltAprvJudgR_MC_A(ConstMetaList<? extends LotTrace_Srch01_RsltAprvJudgR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch01_RsltAprvJudgR clone() {
		return (LotTrace_Srch01_RsltAprvJudgR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch01_RsltAprvJudgR createInstance() {
		return (LotTrace_Srch01_RsltAprvJudgR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch01_RsltAprvJudgR getValues(String... names) {
		return (LotTrace_Srch01_RsltAprvJudgR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 5, $ntfy_nm);
	}

	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 5, $ntfy_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 6, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 6, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 7, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 7, $sublot_no, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 8, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 8, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 9, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 9, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Mfg. approval date 製造承認日.<p>
	 *
	 */
	public MCDate mfg_aprv_dt() {
		return getConstDate(offset + 10, $mfg_aprv_dt);
	}

	/**
	 * Mfg. approval date 製造承認日.<p>
	 *
	 */
	public void mfg_aprv_dt(MCDate value) {
		setConstDate(offset + 10, $mfg_aprv_dt, value);
	}


	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public MCNumber yield_base_unit_qty() {
		return getConstNumber(offset + 11, $yield_base_unit_qty);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 11, $yield_base_unit_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(int value) {
		setConstNumber(offset + 11, $yield_base_unit_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(long value) {
		setConstNumber(offset + 11, $yield_base_unit_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(float value) {
		setConstNumber(offset + 11, $yield_base_unit_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(double value) {
		setConstNumber(offset + 11, $yield_base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String yield_base_unit_cd() {
		return getConstString(offset + 12, $yield_base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void yield_base_unit_cd(String value) {
		setConstString(offset + 12, $yield_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String yield_base_unit_nm() {
		return getConstString(offset + 13, $yield_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void yield_base_unit_nm(String value) {
		setConstString(offset + 13, $yield_base_unit_nm, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 14, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 14, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 15, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 15, $insp_aprv_sts_typ_nm, value);
	}


	/**
	 * Inspection decision date 検査判定日.<p>
	 *
	 */
	public MCDate insp_judg_dt() {
		return getConstDate(offset + 16, $insp_judg_dt);
	}

	/**
	 * Inspection decision date 検査判定日.<p>
	 *
	 */
	public void insp_judg_dt(MCDate value) {
		setConstDate(offset + 16, $insp_judg_dt, value);
	}


	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public MCNumber insp_good_qty() {
		return getConstNumber(offset + 17, $insp_good_qty);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(MCNumber value) {
		setConstNumber(offset + 17, $insp_good_qty, value);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(int value) {
		setConstNumber(offset + 17, $insp_good_qty, value);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(long value) {
		setConstNumber(offset + 17, $insp_good_qty, value);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(float value) {
		setConstNumber(offset + 17, $insp_good_qty, value);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(double value) {
		setConstNumber(offset + 17, $insp_good_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String insp_base_unit_cd() {
		return getConstString(offset + 18, $insp_base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void insp_base_unit_cd(String value) {
		setConstString(offset + 18, $insp_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String insp_base_unit_nm() {
		return getConstString(offset + 19, $insp_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void insp_base_unit_nm(String value) {
		setConstString(offset + 19, $insp_base_unit_nm, value);
	}


	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 20, $insp_judg_rslt_typ);
	}

	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 20, $insp_judg_rslt_typ, value);
	}


	/**
	 * Inspection decision result type name 検査判定結果区分名.<p>
	 *
	 */
	public String insp_judg_rslt_typ_nm() {
		return getConstString(offset + 21, $insp_judg_rslt_typ_nm);
	}

	/**
	 * Inspection decision result type name 検査判定結果区分名.<p>
	 *
	 */
	public void insp_judg_rslt_typ_nm(String value) {
		setConstString(offset + 21, $insp_judg_rslt_typ_nm, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 22, $plnt_aprv_sts_typ);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 22, $plnt_aprv_sts_typ, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 23, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 23, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public MCDate plnt_aprv_dt() {
		return getConstDate(offset + 24, $plnt_aprv_dt);
	}

	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public void plnt_aprv_dt(MCDate value) {
		setConstDate(offset + 24, $plnt_aprv_dt, value);
	}


	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public MCNumber plnt_base_unit_qty() {
		return getConstNumber(offset + 25, $plnt_base_unit_qty);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 25, $plnt_base_unit_qty, value);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(int value) {
		setConstNumber(offset + 25, $plnt_base_unit_qty, value);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(long value) {
		setConstNumber(offset + 25, $plnt_base_unit_qty, value);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(float value) {
		setConstNumber(offset + 25, $plnt_base_unit_qty, value);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(double value) {
		setConstNumber(offset + 25, $plnt_base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String plnt_base_unit_cd() {
		return getConstString(offset + 26, $plnt_base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void plnt_base_unit_cd(String value) {
		setConstString(offset + 26, $plnt_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String plnt_base_unit_nm() {
		return getConstString(offset + 27, $plnt_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void plnt_base_unit_nm(String value) {
		setConstString(offset + 27, $plnt_base_unit_nm, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 28, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 28, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 29, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 29, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Market shipment decision date 市場出荷判定日.<p>
	 *
	 */
	public MCDate mrkt_judg_dt() {
		return getConstDate(offset + 30, $mrkt_judg_dt);
	}

	/**
	 * Market shipment decision date 市場出荷判定日.<p>
	 *
	 */
	public void mrkt_judg_dt(MCDate value) {
		setConstDate(offset + 30, $mrkt_judg_dt, value);
	}


	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public MCNumber mrkt_base_unit_qty() {
		return getConstNumber(offset + 31, $mrkt_base_unit_qty);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 31, $mrkt_base_unit_qty, value);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(int value) {
		setConstNumber(offset + 31, $mrkt_base_unit_qty, value);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(long value) {
		setConstNumber(offset + 31, $mrkt_base_unit_qty, value);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(float value) {
		setConstNumber(offset + 31, $mrkt_base_unit_qty, value);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(double value) {
		setConstNumber(offset + 31, $mrkt_base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String mrkt_base_unit_cd() {
		return getConstString(offset + 32, $mrkt_base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void mrkt_base_unit_cd(String value) {
		setConstString(offset + 32, $mrkt_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String mrkt_base_unit_nm() {
		return getConstString(offset + 33, $mrkt_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void mrkt_base_unit_nm(String value) {
		setConstString(offset + 33, $mrkt_base_unit_nm, value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($yield_base_unit_cd.equalsIgnoreCase(name)) {
			return yield_base_unit_cd();
		}
		if ($yield_base_unit_nm.equalsIgnoreCase(name)) {
			return yield_base_unit_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($insp_base_unit_cd.equalsIgnoreCase(name)) {
			return insp_base_unit_cd();
		}
		if ($insp_base_unit_nm.equalsIgnoreCase(name)) {
			return insp_base_unit_nm();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($plnt_base_unit_cd.equalsIgnoreCase(name)) {
			return plnt_base_unit_cd();
		}
		if ($plnt_base_unit_nm.equalsIgnoreCase(name)) {
			return plnt_base_unit_nm();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($mrkt_base_unit_cd.equalsIgnoreCase(name)) {
			return mrkt_base_unit_cd();
		}
		if ($mrkt_base_unit_nm.equalsIgnoreCase(name)) {
			return mrkt_base_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			return yield_base_unit_qty();
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			return insp_good_qty();
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			return plnt_base_unit_qty();
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			return mrkt_base_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mfg_aprv_dt.equalsIgnoreCase(name)) {
			return mfg_aprv_dt();
		}
		if ($insp_judg_dt.equalsIgnoreCase(name)) {
			return insp_judg_dt();
		}
		if ($plnt_aprv_dt.equalsIgnoreCase(name)) {
			return plnt_aprv_dt();
		}
		if ($mrkt_judg_dt.equalsIgnoreCase(name)) {
			return mrkt_judg_dt();
		}
		return super.getDate(name);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($yield_base_unit_cd.equalsIgnoreCase(name)) {
			return yield_base_unit_cd();
		}
		if ($yield_base_unit_nm.equalsIgnoreCase(name)) {
			return yield_base_unit_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($insp_base_unit_cd.equalsIgnoreCase(name)) {
			return insp_base_unit_cd();
		}
		if ($insp_base_unit_nm.equalsIgnoreCase(name)) {
			return insp_base_unit_nm();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($plnt_base_unit_cd.equalsIgnoreCase(name)) {
			return plnt_base_unit_cd();
		}
		if ($plnt_base_unit_nm.equalsIgnoreCase(name)) {
			return plnt_base_unit_nm();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($mrkt_base_unit_cd.equalsIgnoreCase(name)) {
			return mrkt_base_unit_cd();
		}
		if ($mrkt_base_unit_nm.equalsIgnoreCase(name)) {
			return mrkt_base_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			return yield_base_unit_qty();
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			return insp_good_qty();
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			return plnt_base_unit_qty();
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			return mrkt_base_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mfg_aprv_dt.equalsIgnoreCase(name)) {
			return mfg_aprv_dt();
		}
		if ($insp_judg_dt.equalsIgnoreCase(name)) {
			return insp_judg_dt();
		}
		if ($plnt_aprv_dt.equalsIgnoreCase(name)) {
			return plnt_aprv_dt();
		}
		if ($mrkt_judg_dt.equalsIgnoreCase(name)) {
			return mrkt_judg_dt();
		}
		return super.getDateNE(name);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($yield_base_unit_cd.equalsIgnoreCase(name)) {
			yield_base_unit_cd(value);
			return;
		}
		if ($yield_base_unit_nm.equalsIgnoreCase(name)) {
			yield_base_unit_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($insp_base_unit_cd.equalsIgnoreCase(name)) {
			insp_base_unit_cd(value);
			return;
		}
		if ($insp_base_unit_nm.equalsIgnoreCase(name)) {
			insp_base_unit_nm(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ_nm(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
			return;
		}
		if ($plnt_base_unit_cd.equalsIgnoreCase(name)) {
			plnt_base_unit_cd(value);
			return;
		}
		if ($plnt_base_unit_nm.equalsIgnoreCase(name)) {
			plnt_base_unit_nm(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($mrkt_base_unit_cd.equalsIgnoreCase(name)) {
			mrkt_base_unit_cd(value);
			return;
		}
		if ($mrkt_base_unit_nm.equalsIgnoreCase(name)) {
			mrkt_base_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mfg_aprv_dt.equalsIgnoreCase(name)) {
			mfg_aprv_dt(value);
			return;
		}
		if ($insp_judg_dt.equalsIgnoreCase(name)) {
			insp_judg_dt(value);
			return;
		}
		if ($plnt_aprv_dt.equalsIgnoreCase(name)) {
			plnt_aprv_dt(value);
			return;
		}
		if ($mrkt_judg_dt.equalsIgnoreCase(name)) {
			mrkt_judg_dt(value);
			return;
		}
		super.setDate(name, value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($yield_base_unit_cd.equalsIgnoreCase(name)) {
			yield_base_unit_cd(value);
			return;
		}
		if ($yield_base_unit_nm.equalsIgnoreCase(name)) {
			yield_base_unit_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($insp_base_unit_cd.equalsIgnoreCase(name)) {
			insp_base_unit_cd(value);
			return;
		}
		if ($insp_base_unit_nm.equalsIgnoreCase(name)) {
			insp_base_unit_nm(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ_nm(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
			return;
		}
		if ($plnt_base_unit_cd.equalsIgnoreCase(name)) {
			plnt_base_unit_cd(value);
			return;
		}
		if ($plnt_base_unit_nm.equalsIgnoreCase(name)) {
			plnt_base_unit_nm(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($mrkt_base_unit_cd.equalsIgnoreCase(name)) {
			mrkt_base_unit_cd(value);
			return;
		}
		if ($mrkt_base_unit_nm.equalsIgnoreCase(name)) {
			mrkt_base_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($yield_base_unit_qty.equalsIgnoreCase(name)) {
			yield_base_unit_qty(value);
			return;
		}
		if ($insp_good_qty.equalsIgnoreCase(name)) {
			insp_good_qty(value);
			return;
		}
		if ($plnt_base_unit_qty.equalsIgnoreCase(name)) {
			plnt_base_unit_qty(value);
			return;
		}
		if ($mrkt_base_unit_qty.equalsIgnoreCase(name)) {
			mrkt_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mfg_aprv_dt.equalsIgnoreCase(name)) {
			mfg_aprv_dt(value);
			return;
		}
		if ($insp_judg_dt.equalsIgnoreCase(name)) {
			insp_judg_dt(value);
			return;
		}
		if ($plnt_aprv_dt.equalsIgnoreCase(name)) {
			plnt_aprv_dt(value);
			return;
		}
		if ($mrkt_judg_dt.equalsIgnoreCase(name)) {
			mrkt_judg_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

