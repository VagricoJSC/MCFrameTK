package mcframe.serverMAUC.MAUCL0020;

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
 * ブロック"Co"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CoR_MC_A extends MCConstRow {

	/**
	 * Company 会社.<p>
	 *
	 */
	public static final String $co = "co";

	public static final String $co_cd = $co + ".co_cd";
	public static final String $co_nm = $co + ".co_nm";
	public static final String $co_alt_nm1 = $co + ".co_alt_nm1";
	public static final String $co_alt_nm2 = $co + ".co_alt_nm2";
	public static final String $co_alt_nm3 = $co + ".co_alt_nm3";
	public static final String $co_alt_nm4 = $co + ".co_alt_nm4";
	public static final String $zip_cd = $co + ".zip_cd";
	public static final String $addr1 = $co + ".addr1";
	public static final String $addr2 = $co + ".addr2";
	public static final String $addr3 = $co + ".addr3";
	public static final String $addr4 = $co + ".addr4";
	public static final String $tel = $co + ".tel";
	public static final String $fax = $co + ".fax";
	public static final String $co_repl_nm = $co + ".co_repl_nm";
	public static final String $ein = $co + ".ein";
	public static final String $biz_co_no = $co + ".biz_co_no";
	public static final String $std_co_cd = $co + ".std_co_cd";
	public static final String $cntry_cd = $co + ".cntry_cd";
	public static final String $area_cd = $co + ".area_cd";
	public static final String $base_cur_cd = $co + ".base_cur_cd";
	public static final String $ptax_cur_cd = $co + ".ptax_cur_cd";
	public static final String $st_mon = $co + ".st_mon";
	public static final String $ac_cl_day = $co + ".ac_cl_day";
	public static final String $ac_cl_mon_base = $co + ".ac_cl_mon_base";
	public static final String $ar_no_use_flg = $co + ".ar_no_use_flg";
	public static final String $ap_no_use_flg = $co + ".ap_no_use_flg";
	public static final String $temp_ap_use_flg = $co + ".temp_ap_use_flg";
	public static final String $std_cal_cd = $co + ".std_cal_cd";
	public static final String $bill_cl_cal_cd = $co + ".bill_cl_cal_cd";
	public static final String $sls_cl_flg = $co + ".sls_cl_flg";
	public static final String $rcv_cl_flg = $co + ".rcv_cl_flg";
	public static final String $purc_cl_flg = $co + ".purc_cl_flg";
	public static final String $pay_cl_flg = $co + ".pay_cl_flg";
	public static final String $sls_cl_cal_cd = $co + ".sls_cl_cal_cd";
	public static final String $rcv_cl_cal_cd = $co + ".rcv_cl_cal_cd";
	public static final String $purc_cl_cal_cd = $co + ".purc_cl_cal_cd";
	public static final String $pay_cl_cal_cd = $co + ".pay_cl_cal_cd";
	public static final String $stk_cl_cal_cd = $co + ".stk_cl_cal_cd";
	public static final String $sls_cl_delay_days = $co + ".sls_cl_delay_days";
	public static final String $sls_cl_ba_typ = $co + ".sls_cl_ba_typ";
	public static final String $rcv_cl_delay_days = $co + ".rcv_cl_delay_days";
	public static final String $rcv_cl_ba_typ = $co + ".rcv_cl_ba_typ";
	public static final String $purc_cl_delay_days = $co + ".purc_cl_delay_days";
	public static final String $purc_cl_ba_typ = $co + ".purc_cl_ba_typ";
	public static final String $pay_cl_delay_days = $co + ".pay_cl_delay_days";
	public static final String $pay_cl_ba_typ = $co + ".pay_cl_ba_typ";
	public static final String $stk_cl_delay_days = $co + ".stk_cl_delay_days";
	public static final String $stk_cl_ba_typ = $co + ".stk_cl_ba_typ";
	public static final String $sls_xrate_cd = $co + ".sls_xrate_cd";
	public static final String $purc_xrate_cd = $co + ".purc_xrate_cd";
	public static final String $prov_xrate_cd = $co + ".prov_xrate_cd";
	public static final String $bill_xrate_conv_flg = $co + ".bill_xrate_conv_flg";
	public static final String $bill_xrate_cd = $co + ".bill_xrate_cd";
	public static final String $pay_xrate_conv_flg = $co + ".pay_xrate_conv_flg";
	public static final String $pay_xrate_cd = $co + ".pay_xrate_cd";
	public static final String $mon01_xrate_rev_flg = $co + ".mon01_xrate_rev_flg";
	public static final String $mon02_xrate_rev_flg = $co + ".mon02_xrate_rev_flg";
	public static final String $mon03_xrate_rev_flg = $co + ".mon03_xrate_rev_flg";
	public static final String $mon04_xrate_rev_flg = $co + ".mon04_xrate_rev_flg";
	public static final String $mon05_xrate_rev_flg = $co + ".mon05_xrate_rev_flg";
	public static final String $mon06_xrate_rev_flg = $co + ".mon06_xrate_rev_flg";
	public static final String $mon07_xrate_rev_flg = $co + ".mon07_xrate_rev_flg";
	public static final String $mon08_xrate_rev_flg = $co + ".mon08_xrate_rev_flg";
	public static final String $mon09_xrate_rev_flg = $co + ".mon09_xrate_rev_flg";
	public static final String $mon10_xrate_rev_flg = $co + ".mon10_xrate_rev_flg";
	public static final String $mon11_xrate_rev_flg = $co + ".mon11_xrate_rev_flg";
	public static final String $mon12_xrate_rev_flg = $co + ".mon12_xrate_rev_flg";
	public static final String $sls_upri_req_typ = $co + ".sls_upri_req_typ";
	public static final String $purc_upri_req_typ = $co + ".purc_upri_req_typ";
	public static final String $outsrc_upri_typ = $co + ".outsrc_upri_typ";
	public static final String $xrate_rnd_typ = $co + ".xrate_rnd_typ";
	public static final String $sls_basis_typ = $co + ".sls_basis_typ";
	public static final String $bill_basis_typ = $co + ".bill_basis_typ";
	public static final String $ship_schd_split_typ = $co + ".ship_schd_split_typ";
	public static final String $xfr_stk_mng_typ = $co + ".xfr_stk_mng_typ";
	public static final String $setoff_tax_rnd_typ = $co + ".setoff_tax_rnd_typ";
	public static final String $com_paid_tax_rnd_typ = $co + ".com_paid_tax_rnd_typ";
	public static final String $wtax_rnd_typ = $co + ".wtax_rnd_typ";
	public static final String $stk_amt_rnd_typ = $co + ".stk_amt_rnd_typ";
	public static final String $stk_amt_dec_place = $co + ".stk_amt_dec_place";
	public static final String $sls_bdj_rnd_typ = $co + ".sls_bdj_rnd_typ";
	public static final String $po_print_cd = $co + ".po_print_cd";
	public static final String $stk_lst_cnf_num = $co + ".stk_lst_cnf_num";
	public static final String $stk_lst_limit_num = $co + ".stk_lst_limit_num";
	public static final String $gm_std_upri_typ = $co + ".gm_std_upri_typ";
	public static final String $stk_std_upri_typ = $co + ".stk_std_upri_typ";
	public static final String $early_ship_dt_add_days = $co + ".early_ship_dt_add_days";
	public static final String $ac_slip_digit = $co + ".ac_slip_digit";
	public static final String $ac_slip_seq_flg = $co + ".ac_slip_seq_flg";
	public static final String $rpt_strg_ext_sys_cd = $co + ".rpt_strg_ext_sys_cd";
	public static final String $memo1 = $co + ".memo1";
	public static final String $memo2 = $co + ".memo2";
	public static final String $memo3 = $co + ".memo3";
	public static final String $dt_switch_time = $co + ".dt_switch_time";
	public static final String $pay_schd_cl_cal_cd = $co + ".pay_schd_cl_cal_cd";

	public static final MCMeta co_META = createInnerRowMeta($co, mcframe.serverMA.dbc.MAM_CO_R.class);

	protected static final ConstMetaList<CoR> constMetas = new ConstMetaList<CoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			co_META
		},
		new String[][]{
			{
				"co_cd",
				"co_nm",
				"co_alt_nm1",
				"co_alt_nm2",
				"co_alt_nm3",
				"co_alt_nm4",
				"zip_cd",
				"addr1",
				"addr2",
				"addr3",
				"addr4",
				"tel",
				"fax",
				"co_repl_nm",
				"ein",
				"biz_co_no",
				"std_co_cd",
				"cntry_cd",
				"area_cd",
				"base_cur_cd",
				"ptax_cur_cd",
				"st_mon",
				"ac_cl_day",
				"ac_cl_mon_base",
				"ar_no_use_flg",
				"ap_no_use_flg",
				"temp_ap_use_flg",
				"std_cal_cd",
				"bill_cl_cal_cd",
				"sls_cl_flg",
				"rcv_cl_flg",
				"purc_cl_flg",
				"pay_cl_flg",
				"sls_cl_cal_cd",
				"rcv_cl_cal_cd",
				"purc_cl_cal_cd",
				"pay_cl_cal_cd",
				"stk_cl_cal_cd",
				"sls_cl_delay_days",
				"sls_cl_ba_typ",
				"rcv_cl_delay_days",
				"rcv_cl_ba_typ",
				"purc_cl_delay_days",
				"purc_cl_ba_typ",
				"pay_cl_delay_days",
				"pay_cl_ba_typ",
				"stk_cl_delay_days",
				"stk_cl_ba_typ",
				"sls_xrate_cd",
				"purc_xrate_cd",
				"prov_xrate_cd",
				"bill_xrate_conv_flg",
				"bill_xrate_cd",
				"pay_xrate_conv_flg",
				"pay_xrate_cd",
				"mon01_xrate_rev_flg",
				"mon02_xrate_rev_flg",
				"mon03_xrate_rev_flg",
				"mon04_xrate_rev_flg",
				"mon05_xrate_rev_flg",
				"mon06_xrate_rev_flg",
				"mon07_xrate_rev_flg",
				"mon08_xrate_rev_flg",
				"mon09_xrate_rev_flg",
				"mon10_xrate_rev_flg",
				"mon11_xrate_rev_flg",
				"mon12_xrate_rev_flg",
				"sls_upri_req_typ",
				"purc_upri_req_typ",
				"outsrc_upri_typ",
				"xrate_rnd_typ",
				"sls_basis_typ",
				"bill_basis_typ",
				"ship_schd_split_typ",
				"xfr_stk_mng_typ",
				"setoff_tax_rnd_typ",
				"com_paid_tax_rnd_typ",
				"wtax_rnd_typ",
				"stk_amt_rnd_typ",
				"stk_amt_dec_place",
				"sls_bdj_rnd_typ",
				"po_print_cd",
				"stk_lst_cnf_num",
				"stk_lst_limit_num",
				"gm_std_upri_typ",
				"stk_std_upri_typ",
				"early_ship_dt_add_days",
				"ac_slip_digit",
				"ac_slip_seq_flg",
				"rpt_strg_ext_sys_cd",
				"memo1",
				"memo2",
				"memo3",
				"dt_switch_time",
				"pay_schd_cl_cal_cd"
			},
			{
				$co_cd,
				$co_nm,
				$co_alt_nm1,
				$co_alt_nm2,
				$co_alt_nm3,
				$co_alt_nm4,
				$zip_cd,
				$addr1,
				$addr2,
				$addr3,
				$addr4,
				$tel,
				$fax,
				$co_repl_nm,
				$ein,
				$biz_co_no,
				$std_co_cd,
				$cntry_cd,
				$area_cd,
				$base_cur_cd,
				$ptax_cur_cd,
				$st_mon,
				$ac_cl_day,
				$ac_cl_mon_base,
				$ar_no_use_flg,
				$ap_no_use_flg,
				$temp_ap_use_flg,
				$std_cal_cd,
				$bill_cl_cal_cd,
				$sls_cl_flg,
				$rcv_cl_flg,
				$purc_cl_flg,
				$pay_cl_flg,
				$sls_cl_cal_cd,
				$rcv_cl_cal_cd,
				$purc_cl_cal_cd,
				$pay_cl_cal_cd,
				$stk_cl_cal_cd,
				$sls_cl_delay_days,
				$sls_cl_ba_typ,
				$rcv_cl_delay_days,
				$rcv_cl_ba_typ,
				$purc_cl_delay_days,
				$purc_cl_ba_typ,
				$pay_cl_delay_days,
				$pay_cl_ba_typ,
				$stk_cl_delay_days,
				$stk_cl_ba_typ,
				$sls_xrate_cd,
				$purc_xrate_cd,
				$prov_xrate_cd,
				$bill_xrate_conv_flg,
				$bill_xrate_cd,
				$pay_xrate_conv_flg,
				$pay_xrate_cd,
				$mon01_xrate_rev_flg,
				$mon02_xrate_rev_flg,
				$mon03_xrate_rev_flg,
				$mon04_xrate_rev_flg,
				$mon05_xrate_rev_flg,
				$mon06_xrate_rev_flg,
				$mon07_xrate_rev_flg,
				$mon08_xrate_rev_flg,
				$mon09_xrate_rev_flg,
				$mon10_xrate_rev_flg,
				$mon11_xrate_rev_flg,
				$mon12_xrate_rev_flg,
				$sls_upri_req_typ,
				$purc_upri_req_typ,
				$outsrc_upri_typ,
				$xrate_rnd_typ,
				$sls_basis_typ,
				$bill_basis_typ,
				$ship_schd_split_typ,
				$xfr_stk_mng_typ,
				$setoff_tax_rnd_typ,
				$com_paid_tax_rnd_typ,
				$wtax_rnd_typ,
				$stk_amt_rnd_typ,
				$stk_amt_dec_place,
				$sls_bdj_rnd_typ,
				$po_print_cd,
				$stk_lst_cnf_num,
				$stk_lst_limit_num,
				$gm_std_upri_typ,
				$stk_std_upri_typ,
				$early_ship_dt_add_days,
				$ac_slip_digit,
				$ac_slip_seq_flg,
				$rpt_strg_ext_sys_cd,
				$memo1,
				$memo2,
				$memo3,
				$dt_switch_time,
				$pay_schd_cl_cal_cd
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
	protected CoR_MC_A(ConstMetaList<? extends CoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoR clone() {
		return (CoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoR createInstance() {
		return (CoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoR getValues(String... names) {
		return (CoR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Company 会社.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_CO_R co(){
		return (mcframe.serverMA.dbc.MAM_CO_R) getConstInnerRow(offset + 0, $co);
	}
	
	/**
	 * Company 会社.<p>
	 *
	 */
	public void co(mcframe.serverMA.dbc.MAM_CO_R row){
		setConstInnerRow(offset + 0, $co, row);
	}






	public MCRow getInnerRow(String name) {
		if ($co.equalsIgnoreCase(name)) {
			return co();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($co.equalsIgnoreCase(name)) {
			co(
				((MCContainerMeta) co_META).castInnerRow(mcframe.serverMA.dbc.MAM_CO_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return co().co_cd();
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		co().co_cd(value);
	}

	/**
	 * Own company name 自社名.<p>
	 *
	 */
	public String co_nm() {
		return co().co_nm();
	}

	/**
	 * Own company name 自社名.<p>
	 *
	 */
	public void co_nm(String value) {
		co().co_nm(value);
	}

	/**
	 * Company alias 1 会社別名１.<p>
	 *
	 */
	public String co_alt_nm1() {
		return co().co_alt_nm1();
	}

	/**
	 * Company alias 1 会社別名１.<p>
	 *
	 */
	public void co_alt_nm1(String value) {
		co().co_alt_nm1(value);
	}

	/**
	 * Company alias 2 会社別名２.<p>
	 *
	 */
	public String co_alt_nm2() {
		return co().co_alt_nm2();
	}

	/**
	 * Company alias 2 会社別名２.<p>
	 *
	 */
	public void co_alt_nm2(String value) {
		co().co_alt_nm2(value);
	}

	/**
	 * Company alias 3 会社別名３.<p>
	 *
	 */
	public String co_alt_nm3() {
		return co().co_alt_nm3();
	}

	/**
	 * Company alias 3 会社別名３.<p>
	 *
	 */
	public void co_alt_nm3(String value) {
		co().co_alt_nm3(value);
	}

	/**
	 * Company alias 4 会社別名４.<p>
	 *
	 */
	public String co_alt_nm4() {
		return co().co_alt_nm4();
	}

	/**
	 * Company alias 4 会社別名４.<p>
	 *
	 */
	public void co_alt_nm4(String value) {
		co().co_alt_nm4(value);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return co().zip_cd();
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		co().zip_cd(value);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return co().addr1();
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		co().addr1(value);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return co().addr2();
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		co().addr2(value);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return co().addr3();
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		co().addr3(value);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return co().addr4();
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		co().addr4(value);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return co().tel();
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		co().tel(value);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return co().fax();
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		co().fax(value);
	}

	/**
	 * Representative name 代表者名.<p>
	 *
	 */
	public String co_repl_nm() {
		return co().co_repl_nm();
	}

	/**
	 * Representative name 代表者名.<p>
	 *
	 */
	public void co_repl_nm(String value) {
		co().co_repl_nm(value);
	}

	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public String ein() {
		return co().ein();
	}

	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public void ein(String value) {
		co().ein(value);
	}

	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public String biz_co_no() {
		return co().biz_co_no();
	}

	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public void biz_co_no(String value) {
		co().biz_co_no(value);
	}

	/**
	 * Standard company cd. 標準企業ＣＤ.<p>
	 *
	 */
	public String std_co_cd() {
		return co().std_co_cd();
	}

	/**
	 * Standard company cd. 標準企業ＣＤ.<p>
	 *
	 */
	public void std_co_cd(String value) {
		co().std_co_cd(value);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return co().cntry_cd();
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		co().cntry_cd(value);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return co().area_cd();
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		co().area_cd(value);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return co().base_cur_cd();
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		co().base_cur_cd(value);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return co().ptax_cur_cd();
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		co().ptax_cur_cd(value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public MCNumber st_mon() {
		return co().st_mon();
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(MCNumber value) {
		co().st_mon(value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(int value) {
		co().st_mon(value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(long value) {
		co().st_mon(value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(float value) {
		co().st_mon(value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(double value) {
		co().st_mon(value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public MCNumber ac_cl_day() {
		return co().ac_cl_day();
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(MCNumber value) {
		co().ac_cl_day(value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(int value) {
		co().ac_cl_day(value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(long value) {
		co().ac_cl_day(value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(float value) {
		co().ac_cl_day(value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(double value) {
		co().ac_cl_day(value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public MCNumber ac_cl_mon_base() {
		return co().ac_cl_mon_base();
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(MCNumber value) {
		co().ac_cl_mon_base(value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(int value) {
		co().ac_cl_mon_base(value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(long value) {
		co().ac_cl_mon_base(value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(float value) {
		co().ac_cl_mon_base(value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(double value) {
		co().ac_cl_mon_base(value);
	}

	/**
	 * AR not use flg. 債権不使用ＦＬＧ.<p>
	 *
	 */
	public boolean ar_no_use_flg() {
		return co().ar_no_use_flg();
	}

	/**
	 * AR not use flg. 債権不使用ＦＬＧ.<p>
	 *
	 */
	public void ar_no_use_flg(boolean value) {
		co().ar_no_use_flg(value);
	}

	/**
	 * AP not used flg. 債務不使用ＦＬＧ.<p>
	 *
	 */
	public boolean ap_no_use_flg() {
		return co().ap_no_use_flg();
	}

	/**
	 * AP not used flg. 債務不使用ＦＬＧ.<p>
	 *
	 */
	public void ap_no_use_flg(boolean value) {
		co().ap_no_use_flg(value);
	}

	/**
	 * Temporary AP use flg. 暫定買掛使用ＦＬＧ.<p>
	 *
	 */
	public boolean temp_ap_use_flg() {
		return co().temp_ap_use_flg();
	}

	/**
	 * Temporary AP use flg. 暫定買掛使用ＦＬＧ.<p>
	 *
	 */
	public void temp_ap_use_flg(boolean value) {
		co().temp_ap_use_flg(value);
	}

	/**
	 * Standard calendar cd. 標準カレンダＣＤ.<p>
	 *
	 */
	public String std_cal_cd() {
		return co().std_cal_cd();
	}

	/**
	 * Standard calendar cd. 標準カレンダＣＤ.<p>
	 *
	 */
	public void std_cal_cd(String value) {
		co().std_cal_cd(value);
	}

	/**
	 * Billing closing calendar cd. 請求締カレンダＣＤ.<p>
	 *
	 */
	public String bill_cl_cal_cd() {
		return co().bill_cl_cal_cd();
	}

	/**
	 * Billing closing calendar cd. 請求締カレンダＣＤ.<p>
	 *
	 */
	public void bill_cl_cal_cd(String value) {
		co().bill_cl_cal_cd(value);
	}

	/**
	 * Sales closing flg. 売上締ＦＬＧ.<p>
	 *
	 */
	public boolean sls_cl_flg() {
		return co().sls_cl_flg();
	}

	/**
	 * Sales closing flg. 売上締ＦＬＧ.<p>
	 *
	 */
	public void sls_cl_flg(boolean value) {
		co().sls_cl_flg(value);
	}

	/**
	 * Payment received closing flg. 入金締ＦＬＧ.<p>
	 *
	 */
	public boolean rcv_cl_flg() {
		return co().rcv_cl_flg();
	}

	/**
	 * Payment received closing flg. 入金締ＦＬＧ.<p>
	 *
	 */
	public void rcv_cl_flg(boolean value) {
		co().rcv_cl_flg(value);
	}

	/**
	 * Purchase closing flg. 仕入締ＦＬＧ.<p>
	 *
	 */
	public boolean purc_cl_flg() {
		return co().purc_cl_flg();
	}

	/**
	 * Purchase closing flg. 仕入締ＦＬＧ.<p>
	 *
	 */
	public void purc_cl_flg(boolean value) {
		co().purc_cl_flg(value);
	}

	/**
	 * Payment closing flg. 支払締ＦＬＧ.<p>
	 *
	 */
	public boolean pay_cl_flg() {
		return co().pay_cl_flg();
	}

	/**
	 * Payment closing flg. 支払締ＦＬＧ.<p>
	 *
	 */
	public void pay_cl_flg(boolean value) {
		co().pay_cl_flg(value);
	}

	/**
	 * Sales closing calendar cd. 売上締カレンダＣＤ.<p>
	 *
	 */
	public String sls_cl_cal_cd() {
		return co().sls_cl_cal_cd();
	}

	/**
	 * Sales closing calendar cd. 売上締カレンダＣＤ.<p>
	 *
	 */
	public void sls_cl_cal_cd(String value) {
		co().sls_cl_cal_cd(value);
	}

	/**
	 * Payment received closing calendar cd. 入金締カレンダＣＤ.<p>
	 *
	 */
	public String rcv_cl_cal_cd() {
		return co().rcv_cl_cal_cd();
	}

	/**
	 * Payment received closing calendar cd. 入金締カレンダＣＤ.<p>
	 *
	 */
	public void rcv_cl_cal_cd(String value) {
		co().rcv_cl_cal_cd(value);
	}

	/**
	 * Purchase closing calendar cd. 仕入締カレンダＣＤ.<p>
	 *
	 */
	public String purc_cl_cal_cd() {
		return co().purc_cl_cal_cd();
	}

	/**
	 * Purchase closing calendar cd. 仕入締カレンダＣＤ.<p>
	 *
	 */
	public void purc_cl_cal_cd(String value) {
		co().purc_cl_cal_cd(value);
	}

	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public String pay_cl_cal_cd() {
		return co().pay_cl_cal_cd();
	}

	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public void pay_cl_cal_cd(String value) {
		co().pay_cl_cal_cd(value);
	}

	/**
	 * Inventory closing calendar cd. 在庫締カレンダＣＤ.<p>
	 *
	 */
	public String stk_cl_cal_cd() {
		return co().stk_cl_cal_cd();
	}

	/**
	 * Inventory closing calendar cd. 在庫締カレンダＣＤ.<p>
	 *
	 */
	public void stk_cl_cal_cd(String value) {
		co().stk_cl_cal_cd(value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public MCNumber sls_cl_delay_days() {
		return co().sls_cl_delay_days();
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(MCNumber value) {
		co().sls_cl_delay_days(value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(int value) {
		co().sls_cl_delay_days(value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(long value) {
		co().sls_cl_delay_days(value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(float value) {
		co().sls_cl_delay_days(value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(double value) {
		co().sls_cl_delay_days(value);
	}

	/**
	 * Sales closing day before/after type 売上締日前後区分.<p>
	 *
	 */
	public String sls_cl_ba_typ() {
		return co().sls_cl_ba_typ();
	}

	/**
	 * Sales closing day before/after type 売上締日前後区分.<p>
	 *
	 */
	public void sls_cl_ba_typ(String value) {
		co().sls_cl_ba_typ(value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public MCNumber rcv_cl_delay_days() {
		return co().rcv_cl_delay_days();
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(MCNumber value) {
		co().rcv_cl_delay_days(value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(int value) {
		co().rcv_cl_delay_days(value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(long value) {
		co().rcv_cl_delay_days(value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(float value) {
		co().rcv_cl_delay_days(value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(double value) {
		co().rcv_cl_delay_days(value);
	}

	/**
	 * Payment received closing day before/after type 入金締日前後区分.<p>
	 *
	 */
	public String rcv_cl_ba_typ() {
		return co().rcv_cl_ba_typ();
	}

	/**
	 * Payment received closing day before/after type 入金締日前後区分.<p>
	 *
	 */
	public void rcv_cl_ba_typ(String value) {
		co().rcv_cl_ba_typ(value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public MCNumber purc_cl_delay_days() {
		return co().purc_cl_delay_days();
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(MCNumber value) {
		co().purc_cl_delay_days(value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(int value) {
		co().purc_cl_delay_days(value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(long value) {
		co().purc_cl_delay_days(value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(float value) {
		co().purc_cl_delay_days(value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(double value) {
		co().purc_cl_delay_days(value);
	}

	/**
	 * Purchase closing day before/after type 仕入締日前後区分.<p>
	 *
	 */
	public String purc_cl_ba_typ() {
		return co().purc_cl_ba_typ();
	}

	/**
	 * Purchase closing day before/after type 仕入締日前後区分.<p>
	 *
	 */
	public void purc_cl_ba_typ(String value) {
		co().purc_cl_ba_typ(value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public MCNumber pay_cl_delay_days() {
		return co().pay_cl_delay_days();
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(MCNumber value) {
		co().pay_cl_delay_days(value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(int value) {
		co().pay_cl_delay_days(value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(long value) {
		co().pay_cl_delay_days(value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(float value) {
		co().pay_cl_delay_days(value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(double value) {
		co().pay_cl_delay_days(value);
	}

	/**
	 * Payment closing day before/after type 支払締日前後区分.<p>
	 *
	 */
	public String pay_cl_ba_typ() {
		return co().pay_cl_ba_typ();
	}

	/**
	 * Payment closing day before/after type 支払締日前後区分.<p>
	 *
	 */
	public void pay_cl_ba_typ(String value) {
		co().pay_cl_ba_typ(value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public MCNumber stk_cl_delay_days() {
		return co().stk_cl_delay_days();
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(MCNumber value) {
		co().stk_cl_delay_days(value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(int value) {
		co().stk_cl_delay_days(value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(long value) {
		co().stk_cl_delay_days(value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(float value) {
		co().stk_cl_delay_days(value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(double value) {
		co().stk_cl_delay_days(value);
	}

	/**
	 * Inventory closing day before/after type 在庫締日前後区分.<p>
	 *
	 */
	public String stk_cl_ba_typ() {
		return co().stk_cl_ba_typ();
	}

	/**
	 * Inventory closing day before/after type 在庫締日前後区分.<p>
	 *
	 */
	public void stk_cl_ba_typ(String value) {
		co().stk_cl_ba_typ(value);
	}

	/**
	 * Sales exchange rate cd. 売上為替レートＣＤ.<p>
	 *
	 */
	public String sls_xrate_cd() {
		return co().sls_xrate_cd();
	}

	/**
	 * Sales exchange rate cd. 売上為替レートＣＤ.<p>
	 *
	 */
	public void sls_xrate_cd(String value) {
		co().sls_xrate_cd(value);
	}

	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public String purc_xrate_cd() {
		return co().purc_xrate_cd();
	}

	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public void purc_xrate_cd(String value) {
		co().purc_xrate_cd(value);
	}

	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public String prov_xrate_cd() {
		return co().prov_xrate_cd();
	}

	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public void prov_xrate_cd(String value) {
		co().prov_xrate_cd(value);
	}

	/**
	 * Convert at exchange rate upon billing flg. 請求時為替レート換算ＦＬＧ.<p>
	 *
	 */
	public boolean bill_xrate_conv_flg() {
		return co().bill_xrate_conv_flg();
	}

	/**
	 * Convert at exchange rate upon billing flg. 請求時為替レート換算ＦＬＧ.<p>
	 *
	 */
	public void bill_xrate_conv_flg(boolean value) {
		co().bill_xrate_conv_flg(value);
	}

	/**
	 * Billing exchange rate cd. 請求為替レートＣＤ.<p>
	 *
	 */
	public String bill_xrate_cd() {
		return co().bill_xrate_cd();
	}

	/**
	 * Billing exchange rate cd. 請求為替レートＣＤ.<p>
	 *
	 */
	public void bill_xrate_cd(String value) {
		co().bill_xrate_cd(value);
	}

	/**
	 * Convert at exchange rate upon payment collation flg. 支払照合時為替レート換算ＦＬＧ.<p>
	 *
	 */
	public boolean pay_xrate_conv_flg() {
		return co().pay_xrate_conv_flg();
	}

	/**
	 * Convert at exchange rate upon payment collation flg. 支払照合時為替レート換算ＦＬＧ.<p>
	 *
	 */
	public void pay_xrate_conv_flg(boolean value) {
		co().pay_xrate_conv_flg(value);
	}

	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public String pay_xrate_cd() {
		return co().pay_xrate_cd();
	}

	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public void pay_xrate_cd(String value) {
		co().pay_xrate_cd(value);
	}

	/**
	 * January 1月.<p>
	 *
	 */
	public boolean mon01_xrate_rev_flg() {
		return co().mon01_xrate_rev_flg();
	}

	/**
	 * January 1月.<p>
	 *
	 */
	public void mon01_xrate_rev_flg(boolean value) {
		co().mon01_xrate_rev_flg(value);
	}

	/**
	 * February 2月.<p>
	 *
	 */
	public boolean mon02_xrate_rev_flg() {
		return co().mon02_xrate_rev_flg();
	}

	/**
	 * February 2月.<p>
	 *
	 */
	public void mon02_xrate_rev_flg(boolean value) {
		co().mon02_xrate_rev_flg(value);
	}

	/**
	 * March 3月.<p>
	 *
	 */
	public boolean mon03_xrate_rev_flg() {
		return co().mon03_xrate_rev_flg();
	}

	/**
	 * March 3月.<p>
	 *
	 */
	public void mon03_xrate_rev_flg(boolean value) {
		co().mon03_xrate_rev_flg(value);
	}

	/**
	 * April 4月.<p>
	 *
	 */
	public boolean mon04_xrate_rev_flg() {
		return co().mon04_xrate_rev_flg();
	}

	/**
	 * April 4月.<p>
	 *
	 */
	public void mon04_xrate_rev_flg(boolean value) {
		co().mon04_xrate_rev_flg(value);
	}

	/**
	 * May 5月.<p>
	 *
	 */
	public boolean mon05_xrate_rev_flg() {
		return co().mon05_xrate_rev_flg();
	}

	/**
	 * May 5月.<p>
	 *
	 */
	public void mon05_xrate_rev_flg(boolean value) {
		co().mon05_xrate_rev_flg(value);
	}

	/**
	 * June 6月.<p>
	 *
	 */
	public boolean mon06_xrate_rev_flg() {
		return co().mon06_xrate_rev_flg();
	}

	/**
	 * June 6月.<p>
	 *
	 */
	public void mon06_xrate_rev_flg(boolean value) {
		co().mon06_xrate_rev_flg(value);
	}

	/**
	 * July 7月.<p>
	 *
	 */
	public boolean mon07_xrate_rev_flg() {
		return co().mon07_xrate_rev_flg();
	}

	/**
	 * July 7月.<p>
	 *
	 */
	public void mon07_xrate_rev_flg(boolean value) {
		co().mon07_xrate_rev_flg(value);
	}

	/**
	 * August 8月.<p>
	 *
	 */
	public boolean mon08_xrate_rev_flg() {
		return co().mon08_xrate_rev_flg();
	}

	/**
	 * August 8月.<p>
	 *
	 */
	public void mon08_xrate_rev_flg(boolean value) {
		co().mon08_xrate_rev_flg(value);
	}

	/**
	 * September 9月.<p>
	 *
	 */
	public boolean mon09_xrate_rev_flg() {
		return co().mon09_xrate_rev_flg();
	}

	/**
	 * September 9月.<p>
	 *
	 */
	public void mon09_xrate_rev_flg(boolean value) {
		co().mon09_xrate_rev_flg(value);
	}

	/**
	 * October 10月.<p>
	 *
	 */
	public boolean mon10_xrate_rev_flg() {
		return co().mon10_xrate_rev_flg();
	}

	/**
	 * October 10月.<p>
	 *
	 */
	public void mon10_xrate_rev_flg(boolean value) {
		co().mon10_xrate_rev_flg(value);
	}

	/**
	 * November 11月.<p>
	 *
	 */
	public boolean mon11_xrate_rev_flg() {
		return co().mon11_xrate_rev_flg();
	}

	/**
	 * November 11月.<p>
	 *
	 */
	public void mon11_xrate_rev_flg(boolean value) {
		co().mon11_xrate_rev_flg(value);
	}

	/**
	 * December 12月.<p>
	 *
	 */
	public boolean mon12_xrate_rev_flg() {
		return co().mon12_xrate_rev_flg();
	}

	/**
	 * December 12月.<p>
	 *
	 */
	public void mon12_xrate_rev_flg(boolean value) {
		co().mon12_xrate_rev_flg(value);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return co().sls_upri_req_typ();
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		co().sls_upri_req_typ(value);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return co().purc_upri_req_typ();
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		co().purc_upri_req_typ(value);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return co().outsrc_upri_typ();
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		co().outsrc_upri_typ(value);
	}

	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public String xrate_rnd_typ() {
		return co().xrate_rnd_typ();
	}

	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public void xrate_rnd_typ(String value) {
		co().xrate_rnd_typ(value);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return co().sls_basis_typ();
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		co().sls_basis_typ(value);
	}

	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public String bill_basis_typ() {
		return co().bill_basis_typ();
	}

	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		co().bill_basis_typ(value);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return co().ship_schd_split_typ();
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		co().ship_schd_split_typ(value);
	}

	/**
	 * In-transit inventory controlled site type 積送在庫管轄先区分.<p>
	 *
	 */
	public String xfr_stk_mng_typ() {
		return co().xfr_stk_mng_typ();
	}

	/**
	 * In-transit inventory controlled site type 積送在庫管轄先区分.<p>
	 *
	 */
	public void xfr_stk_mng_typ(String value) {
		co().xfr_stk_mng_typ(value);
	}

	/**
	 * Offset tax rounding type 相殺税額端数処理区分.<p>
	 *
	 */
	public String setoff_tax_rnd_typ() {
		return co().setoff_tax_rnd_typ();
	}

	/**
	 * Offset tax rounding type 相殺税額端数処理区分.<p>
	 *
	 */
	public void setoff_tax_rnd_typ(String value) {
		co().setoff_tax_rnd_typ(value);
	}

	/**
	 * Rounding type (Payment fee tax) 支払手数料税額端数処理区分.<p>
	 *
	 */
	public String com_paid_tax_rnd_typ() {
		return co().com_paid_tax_rnd_typ();
	}

	/**
	 * Rounding type (Payment fee tax) 支払手数料税額端数処理区分.<p>
	 *
	 */
	public void com_paid_tax_rnd_typ(String value) {
		co().com_paid_tax_rnd_typ(value);
	}

	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public String wtax_rnd_typ() {
		return co().wtax_rnd_typ();
	}

	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public void wtax_rnd_typ(String value) {
		co().wtax_rnd_typ(value);
	}

	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public String stk_amt_rnd_typ() {
		return co().stk_amt_rnd_typ();
	}

	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public void stk_amt_rnd_typ(String value) {
		co().stk_amt_rnd_typ(value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber stk_amt_dec_place() {
		return co().stk_amt_dec_place();
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(MCNumber value) {
		co().stk_amt_dec_place(value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(int value) {
		co().stk_amt_dec_place(value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(long value) {
		co().stk_amt_dec_place(value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(float value) {
		co().stk_amt_dec_place(value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(double value) {
		co().stk_amt_dec_place(value);
	}

	/**
	 * Sales budget unit type 販売予算単位区分.<p>
	 *
	 */
	public String sls_bdj_rnd_typ() {
		return co().sls_bdj_rnd_typ();
	}

	/**
	 * Sales budget unit type 販売予算単位区分.<p>
	 *
	 */
	public void sls_bdj_rnd_typ(String value) {
		co().sls_bdj_rnd_typ(value);
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return co().po_print_cd();
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		co().po_print_cd(value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public MCNumber stk_lst_cnf_num() {
		return co().stk_lst_cnf_num();
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(MCNumber value) {
		co().stk_lst_cnf_num(value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(int value) {
		co().stk_lst_cnf_num(value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(long value) {
		co().stk_lst_cnf_num(value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(float value) {
		co().stk_lst_cnf_num(value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(double value) {
		co().stk_lst_cnf_num(value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public MCNumber stk_lst_limit_num() {
		return co().stk_lst_limit_num();
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(MCNumber value) {
		co().stk_lst_limit_num(value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(int value) {
		co().stk_lst_limit_num(value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(long value) {
		co().stk_lst_limit_num(value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(float value) {
		co().stk_lst_limit_num(value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(double value) {
		co().stk_lst_limit_num(value);
	}

	/**
	 * Standard unit cost acquisition type (For gross profit calculation) 標準単価取得区分（粗利計算用）.<p>
	 *
	 */
	public String gm_std_upri_typ() {
		return co().gm_std_upri_typ();
	}

	/**
	 * Standard unit cost acquisition type (For gross profit calculation) 標準単価取得区分（粗利計算用）.<p>
	 *
	 */
	public void gm_std_upri_typ(String value) {
		co().gm_std_upri_typ(value);
	}

	/**
	 * Standard unit cost acquisition type (For inventory valuation) 標準単価取得区分（在庫評価用）.<p>
	 *
	 */
	public String stk_std_upri_typ() {
		return co().stk_std_upri_typ();
	}

	/**
	 * Standard unit cost acquisition type (For inventory valuation) 標準単価取得区分（在庫評価用）.<p>
	 *
	 */
	public void stk_std_upri_typ(String value) {
		co().stk_std_upri_typ(value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public MCNumber early_ship_dt_add_days() {
		return co().early_ship_dt_add_days();
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(MCNumber value) {
		co().early_ship_dt_add_days(value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(int value) {
		co().early_ship_dt_add_days(value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(long value) {
		co().early_ship_dt_add_days(value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(float value) {
		co().early_ship_dt_add_days(value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(double value) {
		co().early_ship_dt_add_days(value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public MCNumber ac_slip_digit() {
		return co().ac_slip_digit();
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(MCNumber value) {
		co().ac_slip_digit(value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(int value) {
		co().ac_slip_digit(value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(long value) {
		co().ac_slip_digit(value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(float value) {
		co().ac_slip_digit(value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(double value) {
		co().ac_slip_digit(value);
	}

	/**
	 * Debit credit details number flg. 貸借明細番号ＦＬＧ.<p>
	 *
	 */
	public boolean ac_slip_seq_flg() {
		return co().ac_slip_seq_flg();
	}

	/**
	 * Debit credit details number flg. 貸借明細番号ＦＬＧ.<p>
	 *
	 */
	public void ac_slip_seq_flg(boolean value) {
		co().ac_slip_seq_flg(value);
	}

	/**
	 * Report storage system cd. 帳票保存システムＣＤ.<p>
	 *
	 */
	public String rpt_strg_ext_sys_cd() {
		return co().rpt_strg_ext_sys_cd();
	}

	/**
	 * Report storage system cd. 帳票保存システムＣＤ.<p>
	 *
	 */
	public void rpt_strg_ext_sys_cd(String value) {
		co().rpt_strg_ext_sys_cd(value);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return co().memo1();
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		co().memo1(value);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return co().memo2();
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		co().memo2(value);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return co().memo3();
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		co().memo3(value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public MCNumber dt_switch_time() {
		return co().dt_switch_time();
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(MCNumber value) {
		co().dt_switch_time(value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(int value) {
		co().dt_switch_time(value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(long value) {
		co().dt_switch_time(value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(float value) {
		co().dt_switch_time(value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(double value) {
		co().dt_switch_time(value);
	}

	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public String pay_schd_cl_cal_cd() {
		return co().pay_schd_cl_cal_cd();
	}

	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public void pay_schd_cl_cal_cd(String value) {
		co().pay_schd_cl_cal_cd(value);
	}

}

