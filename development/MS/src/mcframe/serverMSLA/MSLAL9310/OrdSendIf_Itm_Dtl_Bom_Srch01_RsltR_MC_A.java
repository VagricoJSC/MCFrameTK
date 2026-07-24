package mcframe.serverMSLA.MSLAL9310;

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
 * ブロック"OrdSendIf_Itm_Dtl_Bom_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR_MC_A extends MCConstRow {

	public static final String $itm_dtl_bom = "itm_dtl_bom";

	public static final String $wg_cd = $itm_dtl_bom + ".wg_cd";
	public static final String $par_itm_cd = $itm_dtl_bom + ".par_itm_cd";
	public static final String $par_itm_sub1 = $itm_dtl_bom + ".par_itm_sub1";
	public static final String $par_itm_sub2 = $itm_dtl_bom + ".par_itm_sub2";
	public static final String $par_itm_sub3 = $itm_dtl_bom + ".par_itm_sub3";
	public static final String $mfg_loc_cd = $itm_dtl_bom + ".mfg_loc_cd";
	public static final String $bom_ptn = $itm_dtl_bom + ".bom_ptn";
	public static final String $itm_dtl_st_dt = $itm_dtl_bom + ".itm_dtl_st_dt";
	public static final String $itm_dtl_end_dt = $itm_dtl_bom + ".itm_dtl_end_dt";
	public static final String $oper_ptn = $itm_dtl_bom + ".oper_ptn";
	public static final String $mfg_lt = $itm_dtl_bom + ".mfg_lt";
	public static final String $mfg_lt_add_qty = $itm_dtl_bom + ".mfg_lt_add_qty";
	public static final String $purc_lt = $itm_dtl_bom + ".purc_lt";
	public static final String $purc_lt_add_qty = $itm_dtl_bom + ".purc_lt_add_qty";
	public static final String $accpt_insp_lt = $itm_dtl_bom + ".accpt_insp_lt";
	public static final String $buf_lt = $itm_dtl_bom + ".buf_lt";
	public static final String $sz_day_week_typ = $itm_dtl_bom + ".sz_day_week_typ";
	public static final String $sz_week = $itm_dtl_bom + ".sz_week";
	public static final String $lot_sz_pd = $itm_dtl_bom + ".lot_sz_pd";
	public static final String $min_lot_qty = $itm_dtl_bom + ".min_lot_qty";
	public static final String $batch_lot_qty = $itm_dtl_bom + ".batch_lot_qty";
	public static final String $max_lot_qty = $itm_dtl_bom + ".max_lot_qty";
	public static final String $max_order = $itm_dtl_bom + ".max_order";
	public static final String $prio = $itm_dtl_bom + ".prio";
	public static final String $order_ratio = $itm_dtl_bom + ".order_ratio";
	public static final String $yield_schd_qty = $itm_dtl_bom + ".yield_schd_qty";
	public static final String $mfg_inst_qty = $itm_dtl_bom + ".mfg_inst_qty";
	public static final String $fxd_rqmt_qty = $itm_dtl_bom + ".fxd_rqmt_qty";
	public static final String $sno1 = $itm_dtl_bom + ".sno1";
	public static final String $sno2 = $itm_dtl_bom + ".sno2";
	public static final String $sno3 = $itm_dtl_bom + ".sno3";
	public static final String $sno4 = $itm_dtl_bom + ".sno4";
	public static final String $oper_cd = $itm_dtl_bom + ".oper_cd";
	public static final String $oper_seq = $itm_dtl_bom + ".oper_seq";
	public static final String $chd_itm_cd = $itm_dtl_bom + ".chd_itm_cd";
	public static final String $chd_itm_sub1 = $itm_dtl_bom + ".chd_itm_sub1";
	public static final String $chd_itm_sub2 = $itm_dtl_bom + ".chd_itm_sub2";
	public static final String $chd_itm_sub3 = $itm_dtl_bom + ".chd_itm_sub3";
	public static final String $ver_no = $itm_dtl_bom + ".ver_no";
	public static final String $alt_grp_cd = $itm_dtl_bom + ".alt_grp_cd";
	public static final String $alt_grp_seq = $itm_dtl_bom + ".alt_grp_seq";
	public static final String $alt_itm_typ = $itm_dtl_bom + ".alt_itm_typ";
	public static final String $alt_itm_ratio = $itm_dtl_bom + ".alt_itm_ratio";
	public static final String $alt_alloc_prio = $itm_dtl_bom + ".alt_alloc_prio";
	public static final String $par_inst_qty = $itm_dtl_bom + ".par_inst_qty";
	public static final String $chd_rqmt_qty = $itm_dtl_bom + ".chd_rqmt_qty";
	public static final String $fxd_chd_rqmt_qty = $itm_dtl_bom + ".fxd_chd_rqmt_qty";
	public static final String $sno_typ1 = $itm_dtl_bom + ".sno_typ1";
	public static final String $sno_typ2 = $itm_dtl_bom + ".sno_typ2";
	public static final String $sno_typ3 = $itm_dtl_bom + ".sno_typ3";
	public static final String $sno_typ4 = $itm_dtl_bom + ".sno_typ4";
	public static final String $in_offst_typ = $itm_dtl_bom + ".in_offst_typ";
	public static final String $in_offst = $itm_dtl_bom + ".in_offst";
	public static final String $inpt_ctl_typ = $itm_dtl_bom + ".inpt_ctl_typ";

	public static final MCMeta itm_dtl_bom_META = createInnerRowMeta($itm_dtl_bom, mcframe.serverMS.dbc.MST_ORDSND_DTL_BOM_IF_R.class);

	protected static final ConstMetaList<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> constMetas = new ConstMetaList<OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_dtl_bom_META
		},
		new String[][]{
			{
				"wg_cd",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"mfg_loc_cd",
				"bom_ptn",
				"itm_dtl_st_dt",
				"itm_dtl_end_dt",
				"oper_ptn",
				"mfg_lt",
				"mfg_lt_add_qty",
				"purc_lt",
				"purc_lt_add_qty",
				"accpt_insp_lt",
				"buf_lt",
				"sz_day_week_typ",
				"sz_week",
				"lot_sz_pd",
				"min_lot_qty",
				"batch_lot_qty",
				"max_lot_qty",
				"max_order",
				"prio",
				"order_ratio",
				"yield_schd_qty",
				"mfg_inst_qty",
				"fxd_rqmt_qty",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"oper_cd",
				"oper_seq",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"ver_no",
				"alt_grp_cd",
				"alt_grp_seq",
				"alt_itm_typ",
				"alt_itm_ratio",
				"alt_alloc_prio",
				"par_inst_qty",
				"chd_rqmt_qty",
				"fxd_chd_rqmt_qty",
				"sno_typ1",
				"sno_typ2",
				"sno_typ3",
				"sno_typ4",
				"in_offst_typ",
				"in_offst",
				"inpt_ctl_typ"
			},
			{
				$wg_cd,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$mfg_loc_cd,
				$bom_ptn,
				$itm_dtl_st_dt,
				$itm_dtl_end_dt,
				$oper_ptn,
				$mfg_lt,
				$mfg_lt_add_qty,
				$purc_lt,
				$purc_lt_add_qty,
				$accpt_insp_lt,
				$buf_lt,
				$sz_day_week_typ,
				$sz_week,
				$lot_sz_pd,
				$min_lot_qty,
				$batch_lot_qty,
				$max_lot_qty,
				$max_order,
				$prio,
				$order_ratio,
				$yield_schd_qty,
				$mfg_inst_qty,
				$fxd_rqmt_qty,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$oper_cd,
				$oper_seq,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$ver_no,
				$alt_grp_cd,
				$alt_grp_seq,
				$alt_itm_typ,
				$alt_itm_ratio,
				$alt_alloc_prio,
				$par_inst_qty,
				$chd_rqmt_qty,
				$fxd_chd_rqmt_qty,
				$sno_typ1,
				$sno_typ2,
				$sno_typ3,
				$sno_typ4,
				$in_offst_typ,
				$in_offst,
				$inpt_ctl_typ
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
	protected OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR_MC_A(ConstMetaList<? extends OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR clone() {
		return (OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR createInstance() {
		return (OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR getValues(String... names) {
		return (OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_ORDSND_DTL_BOM_IF_R itm_dtl_bom(){
		return (mcframe.serverMS.dbc.MST_ORDSND_DTL_BOM_IF_R) getConstInnerRow(offset + 0, $itm_dtl_bom);
	}
	
	public void itm_dtl_bom(mcframe.serverMS.dbc.MST_ORDSND_DTL_BOM_IF_R row){
		setConstInnerRow(offset + 0, $itm_dtl_bom, row);
	}






	public MCRow getInnerRow(String name) {
		if ($itm_dtl_bom.equalsIgnoreCase(name)) {
			return itm_dtl_bom();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_dtl_bom.equalsIgnoreCase(name)) {
			itm_dtl_bom(
				((MCContainerMeta) itm_dtl_bom_META).castInnerRow(mcframe.serverMS.dbc.MST_ORDSND_DTL_BOM_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return itm_dtl_bom().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		itm_dtl_bom().wg_cd(value);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return itm_dtl_bom().par_itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		itm_dtl_bom().par_itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return itm_dtl_bom().par_itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		itm_dtl_bom().par_itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return itm_dtl_bom().par_itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		itm_dtl_bom().par_itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return itm_dtl_bom().par_itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		itm_dtl_bom().par_itm_sub3(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return itm_dtl_bom().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		itm_dtl_bom().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return itm_dtl_bom().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		itm_dtl_bom().bom_ptn(value);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate itm_dtl_st_dt() {
		return itm_dtl_bom().itm_dtl_st_dt();
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void itm_dtl_st_dt(MCDate value) {
		itm_dtl_bom().itm_dtl_st_dt(value);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate itm_dtl_end_dt() {
		return itm_dtl_bom().itm_dtl_end_dt();
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void itm_dtl_end_dt(MCDate value) {
		itm_dtl_bom().itm_dtl_end_dt(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return itm_dtl_bom().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		itm_dtl_bom().oper_ptn(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return itm_dtl_bom().mfg_lt();
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		itm_dtl_bom().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		itm_dtl_bom().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		itm_dtl_bom().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		itm_dtl_bom().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		itm_dtl_bom().mfg_lt(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber mfg_lt_add_qty() {
		return itm_dtl_bom().mfg_lt_add_qty();
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(MCNumber value) {
		itm_dtl_bom().mfg_lt_add_qty(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(int value) {
		itm_dtl_bom().mfg_lt_add_qty(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(long value) {
		itm_dtl_bom().mfg_lt_add_qty(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(float value) {
		itm_dtl_bom().mfg_lt_add_qty(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(double value) {
		itm_dtl_bom().mfg_lt_add_qty(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return itm_dtl_bom().purc_lt();
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		itm_dtl_bom().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		itm_dtl_bom().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		itm_dtl_bom().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		itm_dtl_bom().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		itm_dtl_bom().purc_lt(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber purc_lt_add_qty() {
		return itm_dtl_bom().purc_lt_add_qty();
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(MCNumber value) {
		itm_dtl_bom().purc_lt_add_qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(int value) {
		itm_dtl_bom().purc_lt_add_qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(long value) {
		itm_dtl_bom().purc_lt_add_qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(float value) {
		itm_dtl_bom().purc_lt_add_qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(double value) {
		itm_dtl_bom().purc_lt_add_qty(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return itm_dtl_bom().accpt_insp_lt();
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		itm_dtl_bom().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		itm_dtl_bom().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		itm_dtl_bom().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		itm_dtl_bom().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		itm_dtl_bom().accpt_insp_lt(value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public MCNumber buf_lt() {
		return itm_dtl_bom().buf_lt();
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(MCNumber value) {
		itm_dtl_bom().buf_lt(value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(int value) {
		itm_dtl_bom().buf_lt(value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(long value) {
		itm_dtl_bom().buf_lt(value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(float value) {
		itm_dtl_bom().buf_lt(value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(double value) {
		itm_dtl_bom().buf_lt(value);
	}

	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public String sz_day_week_typ() {
		return itm_dtl_bom().sz_day_week_typ();
	}

	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public void sz_day_week_typ(String value) {
		itm_dtl_bom().sz_day_week_typ(value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public MCNumber sz_week() {
		return itm_dtl_bom().sz_week();
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(MCNumber value) {
		itm_dtl_bom().sz_week(value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(int value) {
		itm_dtl_bom().sz_week(value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(long value) {
		itm_dtl_bom().sz_week(value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(float value) {
		itm_dtl_bom().sz_week(value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(double value) {
		itm_dtl_bom().sz_week(value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public MCNumber lot_sz_pd() {
		return itm_dtl_bom().lot_sz_pd();
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(MCNumber value) {
		itm_dtl_bom().lot_sz_pd(value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(int value) {
		itm_dtl_bom().lot_sz_pd(value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(long value) {
		itm_dtl_bom().lot_sz_pd(value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(float value) {
		itm_dtl_bom().lot_sz_pd(value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(double value) {
		itm_dtl_bom().lot_sz_pd(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return itm_dtl_bom().min_lot_qty();
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		itm_dtl_bom().min_lot_qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(int value) {
		itm_dtl_bom().min_lot_qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(long value) {
		itm_dtl_bom().min_lot_qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(float value) {
		itm_dtl_bom().min_lot_qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(double value) {
		itm_dtl_bom().min_lot_qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return itm_dtl_bom().batch_lot_qty();
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		itm_dtl_bom().batch_lot_qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		itm_dtl_bom().batch_lot_qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		itm_dtl_bom().batch_lot_qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		itm_dtl_bom().batch_lot_qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		itm_dtl_bom().batch_lot_qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public MCNumber max_lot_qty() {
		return itm_dtl_bom().max_lot_qty();
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(MCNumber value) {
		itm_dtl_bom().max_lot_qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(int value) {
		itm_dtl_bom().max_lot_qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(long value) {
		itm_dtl_bom().max_lot_qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(float value) {
		itm_dtl_bom().max_lot_qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(double value) {
		itm_dtl_bom().max_lot_qty(value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public MCNumber max_order() {
		return itm_dtl_bom().max_order();
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(MCNumber value) {
		itm_dtl_bom().max_order(value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(int value) {
		itm_dtl_bom().max_order(value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(long value) {
		itm_dtl_bom().max_order(value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(float value) {
		itm_dtl_bom().max_order(value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(double value) {
		itm_dtl_bom().max_order(value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return itm_dtl_bom().prio();
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		itm_dtl_bom().prio(value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		itm_dtl_bom().prio(value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		itm_dtl_bom().prio(value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		itm_dtl_bom().prio(value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		itm_dtl_bom().prio(value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCNumber order_ratio() {
		return itm_dtl_bom().order_ratio();
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(MCNumber value) {
		itm_dtl_bom().order_ratio(value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(int value) {
		itm_dtl_bom().order_ratio(value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(long value) {
		itm_dtl_bom().order_ratio(value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(float value) {
		itm_dtl_bom().order_ratio(value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(double value) {
		itm_dtl_bom().order_ratio(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return itm_dtl_bom().yield_schd_qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		itm_dtl_bom().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		itm_dtl_bom().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		itm_dtl_bom().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		itm_dtl_bom().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		itm_dtl_bom().yield_schd_qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public MCNumber mfg_inst_qty() {
		return itm_dtl_bom().mfg_inst_qty();
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(MCNumber value) {
		itm_dtl_bom().mfg_inst_qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(int value) {
		itm_dtl_bom().mfg_inst_qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(long value) {
		itm_dtl_bom().mfg_inst_qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(float value) {
		itm_dtl_bom().mfg_inst_qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(double value) {
		itm_dtl_bom().mfg_inst_qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_rqmt_qty() {
		return itm_dtl_bom().fxd_rqmt_qty();
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(MCNumber value) {
		itm_dtl_bom().fxd_rqmt_qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(int value) {
		itm_dtl_bom().fxd_rqmt_qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(long value) {
		itm_dtl_bom().fxd_rqmt_qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(float value) {
		itm_dtl_bom().fxd_rqmt_qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(double value) {
		itm_dtl_bom().fxd_rqmt_qty(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return itm_dtl_bom().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		itm_dtl_bom().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return itm_dtl_bom().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		itm_dtl_bom().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return itm_dtl_bom().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		itm_dtl_bom().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return itm_dtl_bom().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		itm_dtl_bom().sno4(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return itm_dtl_bom().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		itm_dtl_bom().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return itm_dtl_bom().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		itm_dtl_bom().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		itm_dtl_bom().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		itm_dtl_bom().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		itm_dtl_bom().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		itm_dtl_bom().oper_seq(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return itm_dtl_bom().chd_itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		itm_dtl_bom().chd_itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return itm_dtl_bom().chd_itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		itm_dtl_bom().chd_itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return itm_dtl_bom().chd_itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		itm_dtl_bom().chd_itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return itm_dtl_bom().chd_itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		itm_dtl_bom().chd_itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return itm_dtl_bom().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		itm_dtl_bom().ver_no(value);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return itm_dtl_bom().alt_grp_cd();
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		itm_dtl_bom().alt_grp_cd(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return itm_dtl_bom().alt_grp_seq();
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		itm_dtl_bom().alt_grp_seq(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		itm_dtl_bom().alt_grp_seq(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		itm_dtl_bom().alt_grp_seq(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		itm_dtl_bom().alt_grp_seq(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		itm_dtl_bom().alt_grp_seq(value);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return itm_dtl_bom().alt_itm_typ();
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		itm_dtl_bom().alt_itm_typ(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return itm_dtl_bom().alt_itm_ratio();
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		itm_dtl_bom().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		itm_dtl_bom().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		itm_dtl_bom().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		itm_dtl_bom().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		itm_dtl_bom().alt_itm_ratio(value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return itm_dtl_bom().alt_alloc_prio();
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		itm_dtl_bom().alt_alloc_prio(value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		itm_dtl_bom().alt_alloc_prio(value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		itm_dtl_bom().alt_alloc_prio(value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		itm_dtl_bom().alt_alloc_prio(value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		itm_dtl_bom().alt_alloc_prio(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return itm_dtl_bom().par_inst_qty();
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		itm_dtl_bom().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		itm_dtl_bom().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		itm_dtl_bom().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		itm_dtl_bom().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		itm_dtl_bom().par_inst_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return itm_dtl_bom().chd_rqmt_qty();
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		itm_dtl_bom().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		itm_dtl_bom().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		itm_dtl_bom().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		itm_dtl_bom().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		itm_dtl_bom().chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return itm_dtl_bom().fxd_chd_rqmt_qty();
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		itm_dtl_bom().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		itm_dtl_bom().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		itm_dtl_bom().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		itm_dtl_bom().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		itm_dtl_bom().fxd_chd_rqmt_qty(value);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String sno_typ1() {
		return itm_dtl_bom().sno_typ1();
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void sno_typ1(String value) {
		itm_dtl_bom().sno_typ1(value);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String sno_typ2() {
		return itm_dtl_bom().sno_typ2();
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void sno_typ2(String value) {
		itm_dtl_bom().sno_typ2(value);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String sno_typ3() {
		return itm_dtl_bom().sno_typ3();
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void sno_typ3(String value) {
		itm_dtl_bom().sno_typ3(value);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String sno_typ4() {
		return itm_dtl_bom().sno_typ4();
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void sno_typ4(String value) {
		itm_dtl_bom().sno_typ4(value);
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public String in_offst_typ() {
		return itm_dtl_bom().in_offst_typ();
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		itm_dtl_bom().in_offst_typ(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCNumber in_offst() {
		return itm_dtl_bom().in_offst();
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		itm_dtl_bom().in_offst(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(int value) {
		itm_dtl_bom().in_offst(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(long value) {
		itm_dtl_bom().in_offst(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(float value) {
		itm_dtl_bom().in_offst(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(double value) {
		itm_dtl_bom().in_offst(value);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return itm_dtl_bom().inpt_ctl_typ();
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		itm_dtl_bom().inpt_ctl_typ(value);
	}

}

