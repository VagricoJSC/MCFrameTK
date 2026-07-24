package mcframe.serverMSBB.MSBBL6080;

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
 * ブロック"SloSts_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SloSts_DtlR_MC_A extends MCConstRow {

	public static final String $slo_sts = "slo_sts";
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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";

	public static final String $slo_sts_no = $slo_sts + ".slo_sts_no";
	public static final String $slo_d_no = $slo_sts + ".slo_d_no";
	public static final String $slo_sts_typ = $slo_sts + ".slo_sts_typ";
	public static final String $unit_cd = $slo_sts + ".unit_cd";
	public static final String $qty = $slo_sts + ".qty";
	public static final String $cur_cd = $slo_sts + ".cur_cd";
	public static final String $upri = $slo_sts + ".upri";
	public static final String $amt = $slo_sts + ".amt";
	public static final String $tax_cd = $slo_sts + ".tax_cd";
	public static final String $tax_amt = $slo_sts + ".tax_amt";
	public static final String $loc_cd = $slo_sts + ".loc_cd";
	public static final String $ship_lg_grp_cd = $slo_sts + ".ship_lg_grp_cd";
	public static final String $alloc_grp_cd = $slo_sts + ".alloc_grp_cd";
	public static final String $slo_prms_rev = $slo_sts + ".slo_prms_rev";
	public static final String $iv_no = $slo_sts + ".iv_no";
	public static final String $iv_d_no = $slo_sts + ".iv_d_no";
	public static final String $rcpt_iv_no = $slo_sts + ".rcpt_iv_no";
	public static final String $rcpt_iv_d_no = $slo_sts + ".rcpt_iv_d_no";
	public static final String $dlv_slip_no = $slo_sts + ".dlv_slip_no";
	public static final String $dlv_slip_d_no = $slo_sts + ".dlv_slip_d_no";
	public static final String $bill_no = $slo_sts + ".bill_no";
	public static final String $ac_dt = $slo_sts + ".ac_dt";
	public static final String $biz_tm = $slo_sts + ".biz_tm";
	public static final String $st_schd_tm = $slo_sts + ".st_schd_tm";
	public static final String $end_schd_tm = $slo_sts + ".end_schd_tm";
	public static final String $st_act_tm = $slo_sts + ".st_act_tm";
	public static final String $end_act_tm = $slo_sts + ".end_act_tm";
	public static final String $ship_inst_no = $slo_sts + ".ship_inst_no";
	public static final String $ship_inst_d_no = $slo_sts + ".ship_inst_d_no";
	public static final String $arr_act_no = $slo_sts + ".arr_act_no";
	public static final String $sls_act_no = $slo_sts + ".sls_act_no";
	public static final String $sls_act_d_no = $slo_sts + ".sls_act_d_no";
	public static final String $po_no = $slo_sts + ".po_no";
	public static final String $po_d_no = $slo_sts + ".po_d_no";
	public static final String $purc_act_no = $slo_sts + ".purc_act_no";
	public static final String $purc_act_d_no = $slo_sts + ".purc_act_d_no";
	public static final String $wg_rqst_no = $slo_sts + ".wg_rqst_no";
	public static final String $dlv_inst_no = $slo_sts + ".dlv_inst_no";
	public static final String $dlv_inst_d_no = $slo_sts + ".dlv_inst_d_no";
	public static final String $dlv_inst_rcpt_no = $slo_sts + ".dlv_inst_rcpt_no";
	public static final String $itm_ord_no = $slo_sts + ".itm_ord_no";
	public static final String $mfg_inst_no = $slo_sts + ".mfg_inst_no";
	public static final String $mfg_act_no = $slo_sts + ".mfg_act_no";
	public static final String $insp_no = $slo_sts + ".insp_no";
	public static final String $insp_act_no = $slo_sts + ".insp_act_no";
	public static final String $xfr_inst_no = $slo_sts + ".xfr_inst_no";
	public static final String $xfr_inst_d_no = $slo_sts + ".xfr_inst_d_no";
	public static final String $xfr_act_no = $slo_sts + ".xfr_act_no";
	public static final String $xfr_act_d_no = $slo_sts + ".xfr_act_d_no";

	public static final MCMeta slo_sts_META = createInnerRowMeta($slo_sts, mcframe.serverMS.dbc.MST_SLO_STS_R.class);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);

	protected static final ConstMetaList<SloSts_DtlR> constMetas = new ConstMetaList<SloSts_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_sts_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			data_crud_typ_META
		},
		new String[][]{
			{
				"slo_sts_no",
				"slo_d_no",
				"slo_sts_typ",
				"unit_cd",
				"qty",
				"cur_cd",
				"upri",
				"amt",
				"tax_cd",
				"tax_amt",
				"loc_cd",
				"ship_lg_grp_cd",
				"alloc_grp_cd",
				"slo_prms_rev",
				"iv_no",
				"iv_d_no",
				"rcpt_iv_no",
				"rcpt_iv_d_no",
				"dlv_slip_no",
				"dlv_slip_d_no",
				"bill_no",
				"ac_dt",
				"biz_tm",
				"st_schd_tm",
				"end_schd_tm",
				"st_act_tm",
				"end_act_tm",
				"ship_inst_no",
				"ship_inst_d_no",
				"arr_act_no",
				"sls_act_no",
				"sls_act_d_no",
				"po_no",
				"po_d_no",
				"purc_act_no",
				"purc_act_d_no",
				"wg_rqst_no",
				"dlv_inst_no",
				"dlv_inst_d_no",
				"dlv_inst_rcpt_no",
				"itm_ord_no",
				"mfg_inst_no",
				"mfg_act_no",
				"insp_no",
				"insp_act_no",
				"xfr_inst_no",
				"xfr_inst_d_no",
				"xfr_act_no",
				"xfr_act_d_no"
			},
			{
				$slo_sts_no,
				$slo_d_no,
				$slo_sts_typ,
				$unit_cd,
				$qty,
				$cur_cd,
				$upri,
				$amt,
				$tax_cd,
				$tax_amt,
				$loc_cd,
				$ship_lg_grp_cd,
				$alloc_grp_cd,
				$slo_prms_rev,
				$iv_no,
				$iv_d_no,
				$rcpt_iv_no,
				$rcpt_iv_d_no,
				$dlv_slip_no,
				$dlv_slip_d_no,
				$bill_no,
				$ac_dt,
				$biz_tm,
				$st_schd_tm,
				$end_schd_tm,
				$st_act_tm,
				$end_act_tm,
				$ship_inst_no,
				$ship_inst_d_no,
				$arr_act_no,
				$sls_act_no,
				$sls_act_d_no,
				$po_no,
				$po_d_no,
				$purc_act_no,
				$purc_act_d_no,
				$wg_rqst_no,
				$dlv_inst_no,
				$dlv_inst_d_no,
				$dlv_inst_rcpt_no,
				$itm_ord_no,
				$mfg_inst_no,
				$mfg_act_no,
				$insp_no,
				$insp_act_no,
				$xfr_inst_no,
				$xfr_inst_d_no,
				$xfr_act_no,
				$xfr_act_d_no
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
	protected SloSts_DtlR_MC_A(ConstMetaList<? extends SloSts_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloSts_DtlR clone() {
		return (SloSts_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloSts_DtlR createInstance() {
		return (SloSts_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloSts_DtlR getValues(String... names) {
		return (SloSts_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_SLO_STS_R slo_sts(){
		return (mcframe.serverMS.dbc.MST_SLO_STS_R) getConstInnerRow(offset + 0, $slo_sts);
	}
	
	public void slo_sts(mcframe.serverMS.dbc.MST_SLO_STS_R row){
		setConstInnerRow(offset + 0, $slo_sts, row);
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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 5, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 5, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 6, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 6, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 7, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 7, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 8, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 8, $sno4, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 9, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 9, $data_crud_typ, value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($slo_sts.equalsIgnoreCase(name)) {
			return slo_sts();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($slo_sts.equalsIgnoreCase(name)) {
			slo_sts(
				((MCContainerMeta) slo_sts_META).castInnerRow(mcframe.serverMS.dbc.MST_SLO_STS_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Sales order status No. 受注状況ＮＯ.<p>
	 *
	 */
	public String slo_sts_no() {
		return slo_sts().slo_sts_no();
	}

	/**
	 * Sales order status No. 受注状況ＮＯ.<p>
	 *
	 */
	public void slo_sts_no(String value) {
		slo_sts().slo_sts_no(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return slo_sts().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		slo_sts().slo_d_no(value);
	}

	/**
	 * Sales order status type 受注状況区分.<p>
	 *
	 */
	public String slo_sts_typ() {
		return slo_sts().slo_sts_typ();
	}

	/**
	 * Sales order status type 受注状況区分.<p>
	 *
	 */
	public void slo_sts_typ(String value) {
		slo_sts().slo_sts_typ(value);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return slo_sts().unit_cd();
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		slo_sts().unit_cd(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return slo_sts().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		slo_sts().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		slo_sts().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		slo_sts().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		slo_sts().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		slo_sts().qty(value);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return slo_sts().cur_cd();
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		slo_sts().cur_cd(value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri() {
		return slo_sts().upri();
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(MCNumber value) {
		slo_sts().upri(value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(int value) {
		slo_sts().upri(value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(long value) {
		slo_sts().upri(value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(float value) {
		slo_sts().upri(value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(double value) {
		slo_sts().upri(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return slo_sts().amt();
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		slo_sts().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		slo_sts().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		slo_sts().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		slo_sts().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		slo_sts().amt(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return slo_sts().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		slo_sts().tax_cd(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return slo_sts().tax_amt();
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		slo_sts().tax_amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		slo_sts().tax_amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		slo_sts().tax_amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		slo_sts().tax_amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		slo_sts().tax_amt(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return slo_sts().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		slo_sts().loc_cd(value);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return slo_sts().ship_lg_grp_cd();
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		slo_sts().ship_lg_grp_cd(value);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return slo_sts().alloc_grp_cd();
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		slo_sts().alloc_grp_cd(value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public MCNumber slo_prms_rev() {
		return slo_sts().slo_prms_rev();
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(MCNumber value) {
		slo_sts().slo_prms_rev(value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(int value) {
		slo_sts().slo_prms_rev(value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(long value) {
		slo_sts().slo_prms_rev(value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(float value) {
		slo_sts().slo_prms_rev(value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(double value) {
		slo_sts().slo_prms_rev(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return slo_sts().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		slo_sts().iv_no(value);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return slo_sts().iv_d_no();
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		slo_sts().iv_d_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return slo_sts().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		slo_sts().rcpt_iv_no(value);
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return slo_sts().rcpt_iv_d_no();
	}

	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		slo_sts().rcpt_iv_d_no(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return slo_sts().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		slo_sts().dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return slo_sts().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		slo_sts().dlv_slip_d_no(value);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return slo_sts().bill_no();
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		slo_sts().bill_no(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return slo_sts().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		slo_sts().ac_dt(value);
	}

	/**
	 * Business processed date and time 業務実施日時.<p>
	 *
	 */
	public MCDate biz_tm() {
		return slo_sts().biz_tm();
	}

	/**
	 * Business processed date and time 業務実施日時.<p>
	 *
	 */
	public void biz_tm(MCDate value) {
		slo_sts().biz_tm(value);
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return slo_sts().st_schd_tm();
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		slo_sts().st_schd_tm(value);
	}

	/**
	 * Scheduled completion date and time 完了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return slo_sts().end_schd_tm();
	}

	/**
	 * Scheduled completion date and time 完了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		slo_sts().end_schd_tm(value);
	}

	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return slo_sts().st_act_tm();
	}

	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		slo_sts().st_act_tm(value);
	}

	/**
	 * Actual completion date and time 完了実績日時.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return slo_sts().end_act_tm();
	}

	/**
	 * Actual completion date and time 完了実績日時.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		slo_sts().end_act_tm(value);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return slo_sts().ship_inst_no();
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		slo_sts().ship_inst_no(value);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return slo_sts().ship_inst_d_no();
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		slo_sts().ship_inst_d_no(value);
	}

	/**
	 * Receipt result No. 入荷実績NO.<p>
	 *
	 */
	public String arr_act_no() {
		return slo_sts().arr_act_no();
	}

	/**
	 * Receipt result No. 入荷実績NO.<p>
	 *
	 */
	public void arr_act_no(String value) {
		slo_sts().arr_act_no(value);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return slo_sts().sls_act_no();
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		slo_sts().sls_act_no(value);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return slo_sts().sls_act_d_no();
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		slo_sts().sls_act_d_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return slo_sts().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		slo_sts().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return slo_sts().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		slo_sts().po_d_no(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return slo_sts().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		slo_sts().purc_act_no(value);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return slo_sts().purc_act_d_no();
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		slo_sts().purc_act_d_no(value);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return slo_sts().wg_rqst_no();
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		slo_sts().wg_rqst_no(value);
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return slo_sts().dlv_inst_no();
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		slo_sts().dlv_inst_no(value);
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return slo_sts().dlv_inst_d_no();
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		slo_sts().dlv_inst_d_no(value);
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public String dlv_inst_rcpt_no() {
		return slo_sts().dlv_inst_rcpt_no();
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public void dlv_inst_rcpt_no(String value) {
		slo_sts().dlv_inst_rcpt_no(value);
	}

	/**
	 * Item order No. 品目オーダNO.<p>
	 *
	 */
	public String itm_ord_no() {
		return slo_sts().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダNO.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		slo_sts().itm_ord_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return slo_sts().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		slo_sts().mfg_inst_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return slo_sts().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		slo_sts().mfg_act_no(value);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return slo_sts().insp_no();
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		slo_sts().insp_no(value);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return slo_sts().insp_act_no();
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		slo_sts().insp_act_no(value);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return slo_sts().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		slo_sts().xfr_inst_no(value);
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return slo_sts().xfr_inst_d_no();
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		slo_sts().xfr_inst_d_no(value);
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no() {
		return slo_sts().xfr_act_no();
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no(String value) {
		slo_sts().xfr_act_no(value);
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public String xfr_act_d_no() {
		return slo_sts().xfr_act_d_no();
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public void xfr_act_d_no(String value) {
		slo_sts().xfr_act_d_no(value);
	}

}

