package mcframe.clientMSBF.MSBFP0120;

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
 * ブロック"RsltAprvJudg"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltAprvJudgR_MC_A extends MCConstRow {

	public static final String $itm_p = "itm_p";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
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

	protected static final ConstMetaList<RsltAprvJudgR> constMetas = new ConstMetaList<RsltAprvJudgR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_p_META,
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
	protected RsltAprvJudgR_MC_A(ConstMetaList<? extends RsltAprvJudgR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltAprvJudgR clone() {
		return (RsltAprvJudgR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltAprvJudgR createInstance() {
		return (RsltAprvJudgR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltAprvJudgR getValues(String... names) {
		return (RsltAprvJudgR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 0, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 0, $itm_p, row);
	}


	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 1, $ntfy_nm);
	}

	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 1, $ntfy_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 2, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 2, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 3, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 3, $sublot_no, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 4, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 4, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 5, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 5, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Mfg. approval date 製造承認日.<p>
	 *
	 */
	public MCDate mfg_aprv_dt() {
		return getConstDate(offset + 6, $mfg_aprv_dt);
	}

	/**
	 * Mfg. approval date 製造承認日.<p>
	 *
	 */
	public void mfg_aprv_dt(MCDate value) {
		setConstDate(offset + 6, $mfg_aprv_dt, value);
	}


	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public MCNumber yield_base_unit_qty() {
		return getConstNumber(offset + 7, $yield_base_unit_qty);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 7, $yield_base_unit_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(int value) {
		setConstNumber(offset + 7, $yield_base_unit_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(long value) {
		setConstNumber(offset + 7, $yield_base_unit_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(float value) {
		setConstNumber(offset + 7, $yield_base_unit_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void yield_base_unit_qty(double value) {
		setConstNumber(offset + 7, $yield_base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String yield_base_unit_cd() {
		return getConstString(offset + 8, $yield_base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void yield_base_unit_cd(String value) {
		setConstString(offset + 8, $yield_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String yield_base_unit_nm() {
		return getConstString(offset + 9, $yield_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void yield_base_unit_nm(String value) {
		setConstString(offset + 9, $yield_base_unit_nm, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 10, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 10, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 11, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 11, $insp_aprv_sts_typ_nm, value);
	}


	/**
	 * Inspection decision date 検査判定日.<p>
	 *
	 */
	public MCDate insp_judg_dt() {
		return getConstDate(offset + 12, $insp_judg_dt);
	}

	/**
	 * Inspection decision date 検査判定日.<p>
	 *
	 */
	public void insp_judg_dt(MCDate value) {
		setConstDate(offset + 12, $insp_judg_dt, value);
	}


	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public MCNumber insp_good_qty() {
		return getConstNumber(offset + 13, $insp_good_qty);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(MCNumber value) {
		setConstNumber(offset + 13, $insp_good_qty, value);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(int value) {
		setConstNumber(offset + 13, $insp_good_qty, value);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(long value) {
		setConstNumber(offset + 13, $insp_good_qty, value);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(float value) {
		setConstNumber(offset + 13, $insp_good_qty, value);
	}

	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public void insp_good_qty(double value) {
		setConstNumber(offset + 13, $insp_good_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String insp_base_unit_cd() {
		return getConstString(offset + 14, $insp_base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void insp_base_unit_cd(String value) {
		setConstString(offset + 14, $insp_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String insp_base_unit_nm() {
		return getConstString(offset + 15, $insp_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void insp_base_unit_nm(String value) {
		setConstString(offset + 15, $insp_base_unit_nm, value);
	}


	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 16, $insp_judg_rslt_typ);
	}

	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 16, $insp_judg_rslt_typ, value);
	}


	/**
	 * Inspection decision result type name 検査判定結果区分名.<p>
	 *
	 */
	public String insp_judg_rslt_typ_nm() {
		return getConstString(offset + 17, $insp_judg_rslt_typ_nm);
	}

	/**
	 * Inspection decision result type name 検査判定結果区分名.<p>
	 *
	 */
	public void insp_judg_rslt_typ_nm(String value) {
		setConstString(offset + 17, $insp_judg_rslt_typ_nm, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 18, $plnt_aprv_sts_typ);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 18, $plnt_aprv_sts_typ, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 19, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 19, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public MCDate plnt_aprv_dt() {
		return getConstDate(offset + 20, $plnt_aprv_dt);
	}

	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public void plnt_aprv_dt(MCDate value) {
		setConstDate(offset + 20, $plnt_aprv_dt, value);
	}


	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public MCNumber plnt_base_unit_qty() {
		return getConstNumber(offset + 21, $plnt_base_unit_qty);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 21, $plnt_base_unit_qty, value);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(int value) {
		setConstNumber(offset + 21, $plnt_base_unit_qty, value);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(long value) {
		setConstNumber(offset + 21, $plnt_base_unit_qty, value);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(float value) {
		setConstNumber(offset + 21, $plnt_base_unit_qty, value);
	}

	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public void plnt_base_unit_qty(double value) {
		setConstNumber(offset + 21, $plnt_base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String plnt_base_unit_cd() {
		return getConstString(offset + 22, $plnt_base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void plnt_base_unit_cd(String value) {
		setConstString(offset + 22, $plnt_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String plnt_base_unit_nm() {
		return getConstString(offset + 23, $plnt_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void plnt_base_unit_nm(String value) {
		setConstString(offset + 23, $plnt_base_unit_nm, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 24, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 24, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 25, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 25, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Market shipment decision date 市場出荷判定日.<p>
	 *
	 */
	public MCDate mrkt_judg_dt() {
		return getConstDate(offset + 26, $mrkt_judg_dt);
	}

	/**
	 * Market shipment decision date 市場出荷判定日.<p>
	 *
	 */
	public void mrkt_judg_dt(MCDate value) {
		setConstDate(offset + 26, $mrkt_judg_dt, value);
	}


	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public MCNumber mrkt_base_unit_qty() {
		return getConstNumber(offset + 27, $mrkt_base_unit_qty);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 27, $mrkt_base_unit_qty, value);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(int value) {
		setConstNumber(offset + 27, $mrkt_base_unit_qty, value);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(long value) {
		setConstNumber(offset + 27, $mrkt_base_unit_qty, value);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(float value) {
		setConstNumber(offset + 27, $mrkt_base_unit_qty, value);
	}

	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public void mrkt_base_unit_qty(double value) {
		setConstNumber(offset + 27, $mrkt_base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String mrkt_base_unit_cd() {
		return getConstString(offset + 28, $mrkt_base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void mrkt_base_unit_cd(String value) {
		setConstString(offset + 28, $mrkt_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String mrkt_base_unit_nm() {
		return getConstString(offset + 29, $mrkt_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void mrkt_base_unit_nm(String value) {
		setConstString(offset + 29, $mrkt_base_unit_nm, value);
	}


	public String getString(String name) {
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

