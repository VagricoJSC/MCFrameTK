package mcframe.serverMSBB.MSBBL1320;

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
 * ブロック"Chk02_SlsAct"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_SlsActR_MC_A extends MCConstRow {

	public static final String $sa = "sa";

	public static final String $sls_act_no = $sa + ".sls_act_no";
	public static final String $sls_act_seq = $sa + ".sls_act_seq";
	public static final String $sls_act_rev = $sa + ".sls_act_rev";
	public static final String $slip_sts_typ = $sa + ".slip_sts_typ";
	public static final String $trd_cd = $sa + ".trd_cd";
	public static final String $trd_ptn_typ = $sa + ".trd_ptn_typ";
	public static final String $ac_ym = $sa + ".ac_ym";
	public static final String $ac_dt = $sa + ".ac_dt";
	public static final String $sls_dpt_cd = $sa + ".sls_dpt_cd";
	public static final String $wg_cd = $sa + ".wg_cd";
	public static final String $sls_usr_cd = $sa + ".sls_usr_cd";
	public static final String $sls_dt = $sa + ".sls_dt";
	public static final String $ship_tm = $sa + ".ship_tm";
	public static final String $dlv_tm = $sa + ".dlv_tm";
	public static final String $cst_cd = $sa + ".cst_cd";
	public static final String $iv_no = $sa + ".iv_no";
	public static final String $ref_iv_no = $sa + ".ref_iv_no";
	public static final String $rcpt_iv_mng_no = $sa + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_no = $sa + ".rcpt_iv_no";
	public static final String $tterm_cd1 = $sa + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $sa + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $sa + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $sa + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $sa + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $sa + ".tterm_rmrks3";
	public static final String $lc_no = $sa + ".lc_no";
	public static final String $lc_dt = $sa + ".lc_dt";
	public static final String $lc_rmrks = $sa + ".lc_rmrks";
	public static final String $rcv_schd_dt = $sa + ".rcv_schd_dt";
	public static final String $bill_basis_dt = $sa + ".bill_basis_dt";
	public static final String $cred_cd = $sa + ".cred_cd";
	public static final String $bcst_cd = $sa + ".bcst_cd";
	public static final String $acst_cd = $sa + ".acst_cd";
	public static final String $ar_dpt_cd = $sa + ".ar_dpt_cd";
	public static final String $cst_po_no = $sa + ".cst_po_no";
	public static final String $trd_cur_cd = $sa + ".trd_cur_cd";
	public static final String $base_cur_cd = $sa + ".base_cur_cd";
	public static final String $xrate_cd = $sa + ".xrate_cd";
	public static final String $xrate = $sa + ".xrate";
	public static final String $ptax_cur_cd = $sa + ".ptax_cur_cd";
	public static final String $ptax_xrate = $sa + ".ptax_xrate";
	public static final String $trd_cur_amt = $sa + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $sa + ".trd_cur_tax_amt";
	public static final String $base_cur_amt = $sa + ".base_cur_amt";
	public static final String $base_cur_tax_amt = $sa + ".base_cur_tax_amt";
	public static final String $trd_rmrks = $sa + ".trd_rmrks";
	public static final String $intr_rmrks = $sa + ".intr_rmrks";
	public static final String $ship_act_no = $sa + ".ship_act_no";
	public static final String $slo_no = $sa + ".slo_no";
	public static final String $sls_ret_schd_no = $sa + ".sls_ret_schd_no";
	public static final String $qtn_no = $sa + ".qtn_no";
	public static final String $qtn_rev = $sa + ".qtn_rev";
	public static final String $dlv_slip_no = $sa + ".dlv_slip_no";
	public static final String $slip_form_cd = $sa + ".slip_form_cd";
	public static final String $aprv_flg = $sa + ".aprv_flg";
	public static final String $aprv_no = $sa + ".aprv_no";
	public static final String $aprv_sts_typ = $sa + ".aprv_sts_typ";
	public static final String $sls_basis_typ = $sa + ".sls_basis_typ";
	public static final String $adjst_tgt_dt = $sa + ".adjst_tgt_dt";
	public static final String $sls_adjst_typ = $sa + ".sls_adjst_typ";
	public static final String $adjst_mtd_typ = $sa + ".adjst_mtd_typ";
	public static final String $sub_char1 = $sa + ".sub_char1";
	public static final String $sub_char2 = $sa + ".sub_char2";
	public static final String $sub_char3 = $sa + ".sub_char3";
	public static final String $upd_cntr = $sa + ".upd_cntr";
	public static final String $ship_dlv_slip_no = $sa + ".ship_dlv_slip_no";

	public static final MCMeta sa_META = createInnerRowMeta($sa, mcframe.serverMS.dbc.MST_SLS_ACT_R.class);

	protected static final ConstMetaList<Chk02_SlsActR> constMetas = new ConstMetaList<Chk02_SlsActR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sa_META
		},
		new String[][]{
			{
				"sls_act_no",
				"sls_act_seq",
				"sls_act_rev",
				"slip_sts_typ",
				"trd_cd",
				"trd_ptn_typ",
				"ac_ym",
				"ac_dt",
				"sls_dpt_cd",
				"wg_cd",
				"sls_usr_cd",
				"sls_dt",
				"ship_tm",
				"dlv_tm",
				"cst_cd",
				"iv_no",
				"ref_iv_no",
				"rcpt_iv_mng_no",
				"rcpt_iv_no",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"lc_no",
				"lc_dt",
				"lc_rmrks",
				"rcv_schd_dt",
				"bill_basis_dt",
				"cred_cd",
				"bcst_cd",
				"acst_cd",
				"ar_dpt_cd",
				"cst_po_no",
				"trd_cur_cd",
				"base_cur_cd",
				"xrate_cd",
				"xrate",
				"ptax_cur_cd",
				"ptax_xrate",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"base_cur_amt",
				"base_cur_tax_amt",
				"trd_rmrks",
				"intr_rmrks",
				"ship_act_no",
				"slo_no",
				"sls_ret_schd_no",
				"qtn_no",
				"qtn_rev",
				"dlv_slip_no",
				"slip_form_cd",
				"aprv_flg",
				"aprv_no",
				"aprv_sts_typ",
				"sls_basis_typ",
				"adjst_tgt_dt",
				"sls_adjst_typ",
				"adjst_mtd_typ",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"upd_cntr",
				"ship_dlv_slip_no"
			},
			{
				$sls_act_no,
				$sls_act_seq,
				$sls_act_rev,
				$slip_sts_typ,
				$trd_cd,
				$trd_ptn_typ,
				$ac_ym,
				$ac_dt,
				$sls_dpt_cd,
				$wg_cd,
				$sls_usr_cd,
				$sls_dt,
				$ship_tm,
				$dlv_tm,
				$cst_cd,
				$iv_no,
				$ref_iv_no,
				$rcpt_iv_mng_no,
				$rcpt_iv_no,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$lc_no,
				$lc_dt,
				$lc_rmrks,
				$rcv_schd_dt,
				$bill_basis_dt,
				$cred_cd,
				$bcst_cd,
				$acst_cd,
				$ar_dpt_cd,
				$cst_po_no,
				$trd_cur_cd,
				$base_cur_cd,
				$xrate_cd,
				$xrate,
				$ptax_cur_cd,
				$ptax_xrate,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$base_cur_amt,
				$base_cur_tax_amt,
				$trd_rmrks,
				$intr_rmrks,
				$ship_act_no,
				$slo_no,
				$sls_ret_schd_no,
				$qtn_no,
				$qtn_rev,
				$dlv_slip_no,
				$slip_form_cd,
				$aprv_flg,
				$aprv_no,
				$aprv_sts_typ,
				$sls_basis_typ,
				$adjst_tgt_dt,
				$sls_adjst_typ,
				$adjst_mtd_typ,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$upd_cntr,
				$ship_dlv_slip_no
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
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
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
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
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Chk02_SlsActR_MC_A(ConstMetaList<? extends Chk02_SlsActR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_SlsActR clone() {
		return (Chk02_SlsActR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_SlsActR createInstance() {
		return (Chk02_SlsActR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_SlsActR getValues(String... names) {
		return (Chk02_SlsActR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_SLS_ACT_R sa(){
		return (mcframe.serverMS.dbc.MST_SLS_ACT_R) getConstInnerRow(offset + 0, $sa);
	}
	
	public void sa(mcframe.serverMS.dbc.MST_SLS_ACT_R row){
		setConstInnerRow(offset + 0, $sa, row);
	}






	public MCRow getInnerRow(String name) {
		if ($sa.equalsIgnoreCase(name)) {
			return sa();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sa.equalsIgnoreCase(name)) {
			sa(
				((MCContainerMeta) sa_META).castInnerRow(mcframe.serverMS.dbc.MST_SLS_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return sa().sls_act_no();
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		sa().sls_act_no(value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumber sls_act_seq() {
		return sa().sls_act_seq();
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(MCNumber value) {
		sa().sls_act_seq(value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(int value) {
		sa().sls_act_seq(value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(long value) {
		sa().sls_act_seq(value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(float value) {
		sa().sls_act_seq(value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(double value) {
		sa().sls_act_seq(value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public MCNumber sls_act_rev() {
		return sa().sls_act_rev();
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(MCNumber value) {
		sa().sls_act_rev(value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(int value) {
		sa().sls_act_rev(value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(long value) {
		sa().sls_act_rev(value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(float value) {
		sa().sls_act_rev(value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(double value) {
		sa().sls_act_rev(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return sa().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		sa().slip_sts_typ(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return sa().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		sa().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return sa().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		sa().trd_ptn_typ(value);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return sa().ac_ym();
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		sa().ac_ym(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return sa().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		sa().ac_dt(value);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return sa().sls_dpt_cd();
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		sa().sls_dpt_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return sa().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		sa().wg_cd(value);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return sa().sls_usr_cd();
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		sa().sls_usr_cd(value);
	}

	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCDate sls_dt() {
		return sa().sls_dt();
	}

	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public void sls_dt(MCDate value) {
		sa().sls_dt(value);
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public MCDate ship_tm() {
		return sa().ship_tm();
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		sa().ship_tm(value);
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public MCDate dlv_tm() {
		return sa().dlv_tm();
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public void dlv_tm(MCDate value) {
		sa().dlv_tm(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return sa().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		sa().cst_cd(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return sa().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		sa().iv_no(value);
	}

	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public String ref_iv_no() {
		return sa().ref_iv_no();
	}

	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public void ref_iv_no(String value) {
		sa().ref_iv_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return sa().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		sa().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return sa().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		sa().rcpt_iv_no(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return sa().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		sa().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return sa().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		sa().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return sa().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		sa().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return sa().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		sa().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return sa().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		sa().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return sa().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		sa().tterm_rmrks3(value);
	}

	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public String lc_no() {
		return sa().lc_no();
	}

	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public void lc_no(String value) {
		sa().lc_no(value);
	}

	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDate lc_dt() {
		return sa().lc_dt();
	}

	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		sa().lc_dt(value);
	}

	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public String lc_rmrks() {
		return sa().lc_rmrks();
	}

	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		sa().lc_rmrks(value);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return sa().rcv_schd_dt();
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		sa().rcv_schd_dt(value);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return sa().bill_basis_dt();
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		sa().bill_basis_dt(value);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return sa().cred_cd();
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		sa().cred_cd(value);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return sa().bcst_cd();
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		sa().bcst_cd(value);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return sa().acst_cd();
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		sa().acst_cd(value);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return sa().ar_dpt_cd();
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		sa().ar_dpt_cd(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return sa().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		sa().cst_po_no(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return sa().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		sa().trd_cur_cd(value);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return sa().base_cur_cd();
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		sa().base_cur_cd(value);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return sa().xrate_cd();
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		sa().xrate_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return sa().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		sa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		sa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		sa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		sa().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		sa().xrate(value);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return sa().ptax_cur_cd();
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		sa().ptax_cur_cd(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return sa().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		sa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		sa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		sa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		sa().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		sa().ptax_xrate(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return sa().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		sa().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		sa().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		sa().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		sa().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		sa().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return sa().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		sa().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		sa().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		sa().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		sa().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		sa().trd_cur_tax_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return sa().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		sa().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		sa().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		sa().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		sa().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		sa().base_cur_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return sa().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		sa().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		sa().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		sa().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		sa().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		sa().base_cur_tax_amt(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return sa().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		sa().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return sa().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		sa().intr_rmrks(value);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return sa().ship_act_no();
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		sa().ship_act_no(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return sa().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		sa().slo_no(value);
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_no() {
		return sa().sls_ret_schd_no();
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_no(String value) {
		sa().sls_ret_schd_no(value);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return sa().qtn_no();
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		sa().qtn_no(value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return sa().qtn_rev();
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		sa().qtn_rev(value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		sa().qtn_rev(value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		sa().qtn_rev(value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		sa().qtn_rev(value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		sa().qtn_rev(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return sa().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		sa().dlv_slip_no(value);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String slip_form_cd() {
		return sa().slip_form_cd();
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void slip_form_cd(String value) {
		sa().slip_form_cd(value);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return sa().aprv_flg();
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		sa().aprv_flg(value);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return sa().aprv_no();
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		sa().aprv_no(value);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return sa().aprv_sts_typ();
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		sa().aprv_sts_typ(value);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return sa().sls_basis_typ();
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		sa().sls_basis_typ(value);
	}

	/**
	 * Adjustment required date 調整対象日.<p>
	 *
	 */
	public MCDate adjst_tgt_dt() {
		return sa().adjst_tgt_dt();
	}

	/**
	 * Adjustment required date 調整対象日.<p>
	 *
	 */
	public void adjst_tgt_dt(MCDate value) {
		sa().adjst_tgt_dt(value);
	}

	/**
	 * Sales adjustment type 売上調整区分.<p>
	 *
	 */
	public String sls_adjst_typ() {
		return sa().sls_adjst_typ();
	}

	/**
	 * Sales adjustment type 売上調整区分.<p>
	 *
	 */
	public void sls_adjst_typ(String value) {
		sa().sls_adjst_typ(value);
	}

	/**
	 * Adjustment method type 調整方法区分.<p>
	 *
	 */
	public String adjst_mtd_typ() {
		return sa().adjst_mtd_typ();
	}

	/**
	 * Adjustment method type 調整方法区分.<p>
	 *
	 */
	public void adjst_mtd_typ(String value) {
		sa().adjst_mtd_typ(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return sa().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		sa().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return sa().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		sa().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return sa().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		sa().sub_char3(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return sa().upd_cntr();
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		sa().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		sa().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		sa().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		sa().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		sa().upd_cntr(value);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return sa().ship_dlv_slip_no();
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		sa().ship_dlv_slip_no(value);
	}

}

