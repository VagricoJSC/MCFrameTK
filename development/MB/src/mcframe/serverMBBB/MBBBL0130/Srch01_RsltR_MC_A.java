package mcframe.serverMBBB.MBBBL0130;

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
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public static final String $jnl_grp_no = "jnl_grp_no";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public static final String $ac_if_typ = "ac_if_typ";
	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public static final String $ac_if_typ_nm = "ac_if_typ_nm";
	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public static final String $slip_cnt_id = "slip_cnt_id";
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
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $ac_cd = "ac_cd";
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public static final String $ac_nm = "ac_nm";
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $sub_ac_cd = "sub_ac_cd";
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public static final String $sub_ac_nm = "sub_ac_nm";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Debit amount (Base currency) 基準通貨借方金額.<p>
	 *
	 */
	public static final String $d_amt = "d_amt";
	/**
	 * Debit tax amount (Base currency) 基準通貨借方税額.<p>
	 *
	 */
	public static final String $d_tax_amt = "d_tax_amt";
	/**
	 * Credit amount (Base currency) 基準通貨貸方金額.<p>
	 *
	 */
	public static final String $c_amt = "c_amt";
	/**
	 * Credit tax amount (Base currency) 基準通貨貸方税額.<p>
	 *
	 */
	public static final String $c_tax_amt = "c_tax_amt";
	/**
	 * Total debt and credit amount (Base currency) 基準通貨貸借金額合計.<p>
	 *
	 */
	public static final String $total_amt = "total_amt";
	/**
	 * Total debt and credit tax amount (Base currency) 基準通貨貸借税額合計.<p>
	 *
	 */
	public static final String $total_tax_amt = "total_tax_amt";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction currency debit amount 取引通貨借方金額.<p>
	 *
	 */
	public static final String $d_trd_amt = "d_trd_amt";
	/**
	 * Transaction currency debit tax amount 取引通貨借方税額.<p>
	 *
	 */
	public static final String $d_trd_tax_amt = "d_trd_tax_amt";
	/**
	 * Credit amount (Transaction currency) 取引通貨貸方金額.<p>
	 *
	 */
	public static final String $c_trd_amt = "c_trd_amt";
	/**
	 * Credit tax amount (Transaction currency) 取引通貨貸方税額.<p>
	 *
	 */
	public static final String $c_trd_tax_amt = "c_trd_tax_amt";
	/**
	 * Debt and credit amount total (Transaction currency) 取引通貨貸借金額合計.<p>
	 *
	 */
	public static final String $total_trd_amt = "total_trd_amt";
	/**
	 * Debt and credit tax amount total (Transaction currency) 取引通貨貸借税額合計.<p>
	 *
	 */
	public static final String $total_trd_tax_amt = "total_trd_tax_amt";
	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public static final String $dc_typ = "dc_typ";


	public static final MCMeta jnl_grp_no_META = createCommonMeta($jnl_grp_no, mcframe.commonMA.meta.MA_META.JNL_GRP_NO);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_if_typ_META = createCommonMeta($ac_if_typ, mcframe.commonMA.meta.MA_META.AC_IF_TYP);
	public static final MCMeta ac_if_typ_nm_META = createCommonMeta($ac_if_typ_nm, mcframe.commonMA.meta.MA_META.AC_IF_TYP_NM);
	public static final MCMeta slip_cnt_id_META = createCommonMeta($slip_cnt_id, mcframe.commonMA.meta.MA_META.SLIP_CNT_ID);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.AC_DPT_NM);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta sub_ac_cd_META = createCommonMeta($sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta sub_ac_nm_META = createCommonMeta($sub_ac_nm, mcframe.commonMA.meta.MA_META.SUB_AC_NM);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta d_amt_META = createCommonMeta($d_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta d_tax_amt_META = createCommonMeta($d_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta c_amt_META = createCommonMeta($c_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta c_tax_amt_META = createCommonMeta($c_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta total_amt_META = createCommonMeta($total_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta total_tax_amt_META = createCommonMeta($total_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta d_trd_amt_META = createCommonMeta($d_trd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta d_trd_tax_amt_META = createCommonMeta($d_trd_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta c_trd_amt_META = createCommonMeta($c_trd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta c_trd_tax_amt_META = createCommonMeta($c_trd_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta total_trd_amt_META = createCommonMeta($total_trd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta total_trd_tax_amt_META = createCommonMeta($total_trd_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dc_typ_META = createCommonMeta($dc_typ, mcframe.commonMA.meta.MA_META.DC_TYP);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			jnl_grp_no_META,
			ac_ym_META,
			ac_if_typ_META,
			ac_if_typ_nm_META,
			slip_cnt_id_META,
			dpt_cd_META,
			dpt_nm_META,
			ac_cd_META,
			ac_nm_META,
			sub_ac_cd_META,
			sub_ac_nm_META,
			tax_cd_META,
			tax_nm_META,
			base_cur_cd_META,
			base_cur_nm_META,
			d_amt_META,
			d_tax_amt_META,
			c_amt_META,
			c_tax_amt_META,
			total_amt_META,
			total_tax_amt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			d_trd_amt_META,
			d_trd_tax_amt_META,
			c_trd_amt_META,
			c_trd_tax_amt_META,
			total_trd_amt_META,
			total_trd_tax_amt_META,
			dc_typ_META
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
	/** 項目属性情報のグループ[GRP_DEF]のキー定数 */
	public static final String $$GRP_DEF = "GRP_DEF";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$ac_if_typ, "MAC_AC_IF_TYP"}	// ac_if_typ
			}
		)),
		new MCExtMap.Entry($$GRP_DEF, new MCExtList(
			new String[][]{
				{$jnl_grp_no, "KEY"},	// jnl_grp_no
				{$ac_ym, "KEY,1"},	// ac_ym
				{$ac_if_typ, "ac_if_flg,2"},	// ac_if_typ
				{$ac_if_typ_nm, "ac_if_flg"},	// ac_if_typ_nm
				{$slip_cnt_id, "slip_cnt_flg"},	// slip_cnt_id
				{$dpt_cd, "dpt_flg,3"},	// dpt_cd
				{$dpt_nm, "dpt_flg"},	// dpt_nm
				{$ac_cd, "KEY,4"},	// ac_cd
				{$ac_nm, "KEY"},	// ac_nm
				{$sub_ac_cd, "sub_ac_flg"},	// sub_ac_cd
				{$sub_ac_nm, "sub_ac_flg"},	// sub_ac_nm
				{$tax_cd, "tax_flg"},	// tax_cd
				{$tax_nm, "tax_flg"},	// tax_nm
				{$base_cur_cd, "KEY"},	// base_cur_cd
				{$base_cur_nm, "KEY"},	// base_cur_nm
				{$d_amt, "SUM"},	// d_amt
				{$d_tax_amt, "SUM"},	// d_tax_amt
				{$c_amt, "SUM"},	// c_amt
				{$c_tax_amt, "SUM"},	// c_tax_amt
				{$total_amt, "SUM"},	// total_amt
				{$total_tax_amt, "SUM"},	// total_tax_amt
				{$trd_cur_cd, "KEY"},	// trd_cur_cd
				{$trd_cur_nm, "KEY"},	// trd_cur_nm
				{$d_trd_amt, "SUM"},	// d_trd_amt
				{$d_trd_tax_amt, "SUM"},	// d_trd_tax_amt
				{$c_trd_amt, "SUM"},	// c_trd_amt
				{$c_trd_tax_amt, "SUM"},	// c_trd_tax_amt
				{$total_trd_amt, "SUM"},	// total_trd_amt
				{$total_trd_tax_amt, "SUM"},	// total_trd_tax_amt
				{$dc_typ, "KEY"}	// dc_typ
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
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public String jnl_grp_no() {
		return getConstString(offset + 0, $jnl_grp_no);
	}

	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public void jnl_grp_no(String value) {
		setConstString(offset + 0, $jnl_grp_no, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 1, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 1, $ac_ym, value);
	}


	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public String ac_if_typ() {
		return getConstString(offset + 2, $ac_if_typ);
	}

	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public void ac_if_typ(String value) {
		setConstString(offset + 2, $ac_if_typ, value);
	}


	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public String ac_if_typ_nm() {
		return getConstString(offset + 3, $ac_if_typ_nm);
	}

	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public void ac_if_typ_nm(String value) {
		setConstString(offset + 3, $ac_if_typ_nm, value);
	}


	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public String slip_cnt_id() {
		return getConstString(offset + 4, $slip_cnt_id);
	}

	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public void slip_cnt_id(String value) {
		setConstString(offset + 4, $slip_cnt_id, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 6, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 6, $dpt_nm, value);
	}


	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 7, $ac_cd);
	}

	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 7, $ac_cd, value);
	}


	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public String ac_nm() {
		return getConstString(offset + 8, $ac_nm);
	}

	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public void ac_nm(String value) {
		setConstString(offset + 8, $ac_nm, value);
	}


	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public String sub_ac_cd() {
		return getConstString(offset + 9, $sub_ac_cd);
	}

	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public void sub_ac_cd(String value) {
		setConstString(offset + 9, $sub_ac_cd, value);
	}


	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public String sub_ac_nm() {
		return getConstString(offset + 10, $sub_ac_nm);
	}

	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public void sub_ac_nm(String value) {
		setConstString(offset + 10, $sub_ac_nm, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 11, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 11, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 12, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 12, $tax_nm, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 13, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 13, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 14, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 14, $base_cur_nm, value);
	}


	/**
	 * Debit amount (Base currency) 基準通貨借方金額.<p>
	 *
	 */
	public MCNumber d_amt() {
		return getConstNumber(offset + 15, $d_amt);
	}

	/**
	 * Debit amount (Base currency) 基準通貨借方金額.<p>
	 *
	 */
	public void d_amt(MCNumber value) {
		setConstNumber(offset + 15, $d_amt, value);
	}

	/**
	 * Debit amount (Base currency) 基準通貨借方金額.<p>
	 *
	 */
	public void d_amt(int value) {
		setConstNumber(offset + 15, $d_amt, value);
	}

	/**
	 * Debit amount (Base currency) 基準通貨借方金額.<p>
	 *
	 */
	public void d_amt(long value) {
		setConstNumber(offset + 15, $d_amt, value);
	}

	/**
	 * Debit amount (Base currency) 基準通貨借方金額.<p>
	 *
	 */
	public void d_amt(float value) {
		setConstNumber(offset + 15, $d_amt, value);
	}

	/**
	 * Debit amount (Base currency) 基準通貨借方金額.<p>
	 *
	 */
	public void d_amt(double value) {
		setConstNumber(offset + 15, $d_amt, value);
	}


	/**
	 * Debit tax amount (Base currency) 基準通貨借方税額.<p>
	 *
	 */
	public MCNumber d_tax_amt() {
		return getConstNumber(offset + 16, $d_tax_amt);
	}

	/**
	 * Debit tax amount (Base currency) 基準通貨借方税額.<p>
	 *
	 */
	public void d_tax_amt(MCNumber value) {
		setConstNumber(offset + 16, $d_tax_amt, value);
	}

	/**
	 * Debit tax amount (Base currency) 基準通貨借方税額.<p>
	 *
	 */
	public void d_tax_amt(int value) {
		setConstNumber(offset + 16, $d_tax_amt, value);
	}

	/**
	 * Debit tax amount (Base currency) 基準通貨借方税額.<p>
	 *
	 */
	public void d_tax_amt(long value) {
		setConstNumber(offset + 16, $d_tax_amt, value);
	}

	/**
	 * Debit tax amount (Base currency) 基準通貨借方税額.<p>
	 *
	 */
	public void d_tax_amt(float value) {
		setConstNumber(offset + 16, $d_tax_amt, value);
	}

	/**
	 * Debit tax amount (Base currency) 基準通貨借方税額.<p>
	 *
	 */
	public void d_tax_amt(double value) {
		setConstNumber(offset + 16, $d_tax_amt, value);
	}


	/**
	 * Credit amount (Base currency) 基準通貨貸方金額.<p>
	 *
	 */
	public MCNumber c_amt() {
		return getConstNumber(offset + 17, $c_amt);
	}

	/**
	 * Credit amount (Base currency) 基準通貨貸方金額.<p>
	 *
	 */
	public void c_amt(MCNumber value) {
		setConstNumber(offset + 17, $c_amt, value);
	}

	/**
	 * Credit amount (Base currency) 基準通貨貸方金額.<p>
	 *
	 */
	public void c_amt(int value) {
		setConstNumber(offset + 17, $c_amt, value);
	}

	/**
	 * Credit amount (Base currency) 基準通貨貸方金額.<p>
	 *
	 */
	public void c_amt(long value) {
		setConstNumber(offset + 17, $c_amt, value);
	}

	/**
	 * Credit amount (Base currency) 基準通貨貸方金額.<p>
	 *
	 */
	public void c_amt(float value) {
		setConstNumber(offset + 17, $c_amt, value);
	}

	/**
	 * Credit amount (Base currency) 基準通貨貸方金額.<p>
	 *
	 */
	public void c_amt(double value) {
		setConstNumber(offset + 17, $c_amt, value);
	}


	/**
	 * Credit tax amount (Base currency) 基準通貨貸方税額.<p>
	 *
	 */
	public MCNumber c_tax_amt() {
		return getConstNumber(offset + 18, $c_tax_amt);
	}

	/**
	 * Credit tax amount (Base currency) 基準通貨貸方税額.<p>
	 *
	 */
	public void c_tax_amt(MCNumber value) {
		setConstNumber(offset + 18, $c_tax_amt, value);
	}

	/**
	 * Credit tax amount (Base currency) 基準通貨貸方税額.<p>
	 *
	 */
	public void c_tax_amt(int value) {
		setConstNumber(offset + 18, $c_tax_amt, value);
	}

	/**
	 * Credit tax amount (Base currency) 基準通貨貸方税額.<p>
	 *
	 */
	public void c_tax_amt(long value) {
		setConstNumber(offset + 18, $c_tax_amt, value);
	}

	/**
	 * Credit tax amount (Base currency) 基準通貨貸方税額.<p>
	 *
	 */
	public void c_tax_amt(float value) {
		setConstNumber(offset + 18, $c_tax_amt, value);
	}

	/**
	 * Credit tax amount (Base currency) 基準通貨貸方税額.<p>
	 *
	 */
	public void c_tax_amt(double value) {
		setConstNumber(offset + 18, $c_tax_amt, value);
	}


	/**
	 * Total debt and credit amount (Base currency) 基準通貨貸借金額合計.<p>
	 *
	 */
	public MCNumber total_amt() {
		return getConstNumber(offset + 19, $total_amt);
	}

	/**
	 * Total debt and credit amount (Base currency) 基準通貨貸借金額合計.<p>
	 *
	 */
	public void total_amt(MCNumber value) {
		setConstNumber(offset + 19, $total_amt, value);
	}

	/**
	 * Total debt and credit amount (Base currency) 基準通貨貸借金額合計.<p>
	 *
	 */
	public void total_amt(int value) {
		setConstNumber(offset + 19, $total_amt, value);
	}

	/**
	 * Total debt and credit amount (Base currency) 基準通貨貸借金額合計.<p>
	 *
	 */
	public void total_amt(long value) {
		setConstNumber(offset + 19, $total_amt, value);
	}

	/**
	 * Total debt and credit amount (Base currency) 基準通貨貸借金額合計.<p>
	 *
	 */
	public void total_amt(float value) {
		setConstNumber(offset + 19, $total_amt, value);
	}

	/**
	 * Total debt and credit amount (Base currency) 基準通貨貸借金額合計.<p>
	 *
	 */
	public void total_amt(double value) {
		setConstNumber(offset + 19, $total_amt, value);
	}


	/**
	 * Total debt and credit tax amount (Base currency) 基準通貨貸借税額合計.<p>
	 *
	 */
	public MCNumber total_tax_amt() {
		return getConstNumber(offset + 20, $total_tax_amt);
	}

	/**
	 * Total debt and credit tax amount (Base currency) 基準通貨貸借税額合計.<p>
	 *
	 */
	public void total_tax_amt(MCNumber value) {
		setConstNumber(offset + 20, $total_tax_amt, value);
	}

	/**
	 * Total debt and credit tax amount (Base currency) 基準通貨貸借税額合計.<p>
	 *
	 */
	public void total_tax_amt(int value) {
		setConstNumber(offset + 20, $total_tax_amt, value);
	}

	/**
	 * Total debt and credit tax amount (Base currency) 基準通貨貸借税額合計.<p>
	 *
	 */
	public void total_tax_amt(long value) {
		setConstNumber(offset + 20, $total_tax_amt, value);
	}

	/**
	 * Total debt and credit tax amount (Base currency) 基準通貨貸借税額合計.<p>
	 *
	 */
	public void total_tax_amt(float value) {
		setConstNumber(offset + 20, $total_tax_amt, value);
	}

	/**
	 * Total debt and credit tax amount (Base currency) 基準通貨貸借税額合計.<p>
	 *
	 */
	public void total_tax_amt(double value) {
		setConstNumber(offset + 20, $total_tax_amt, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 21, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 21, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 22, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 22, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency debit amount 取引通貨借方金額.<p>
	 *
	 */
	public MCNumber d_trd_amt() {
		return getConstNumber(offset + 23, $d_trd_amt);
	}

	/**
	 * Transaction currency debit amount 取引通貨借方金額.<p>
	 *
	 */
	public void d_trd_amt(MCNumber value) {
		setConstNumber(offset + 23, $d_trd_amt, value);
	}

	/**
	 * Transaction currency debit amount 取引通貨借方金額.<p>
	 *
	 */
	public void d_trd_amt(int value) {
		setConstNumber(offset + 23, $d_trd_amt, value);
	}

	/**
	 * Transaction currency debit amount 取引通貨借方金額.<p>
	 *
	 */
	public void d_trd_amt(long value) {
		setConstNumber(offset + 23, $d_trd_amt, value);
	}

	/**
	 * Transaction currency debit amount 取引通貨借方金額.<p>
	 *
	 */
	public void d_trd_amt(float value) {
		setConstNumber(offset + 23, $d_trd_amt, value);
	}

	/**
	 * Transaction currency debit amount 取引通貨借方金額.<p>
	 *
	 */
	public void d_trd_amt(double value) {
		setConstNumber(offset + 23, $d_trd_amt, value);
	}


	/**
	 * Transaction currency debit tax amount 取引通貨借方税額.<p>
	 *
	 */
	public MCNumber d_trd_tax_amt() {
		return getConstNumber(offset + 24, $d_trd_tax_amt);
	}

	/**
	 * Transaction currency debit tax amount 取引通貨借方税額.<p>
	 *
	 */
	public void d_trd_tax_amt(MCNumber value) {
		setConstNumber(offset + 24, $d_trd_tax_amt, value);
	}

	/**
	 * Transaction currency debit tax amount 取引通貨借方税額.<p>
	 *
	 */
	public void d_trd_tax_amt(int value) {
		setConstNumber(offset + 24, $d_trd_tax_amt, value);
	}

	/**
	 * Transaction currency debit tax amount 取引通貨借方税額.<p>
	 *
	 */
	public void d_trd_tax_amt(long value) {
		setConstNumber(offset + 24, $d_trd_tax_amt, value);
	}

	/**
	 * Transaction currency debit tax amount 取引通貨借方税額.<p>
	 *
	 */
	public void d_trd_tax_amt(float value) {
		setConstNumber(offset + 24, $d_trd_tax_amt, value);
	}

	/**
	 * Transaction currency debit tax amount 取引通貨借方税額.<p>
	 *
	 */
	public void d_trd_tax_amt(double value) {
		setConstNumber(offset + 24, $d_trd_tax_amt, value);
	}


	/**
	 * Credit amount (Transaction currency) 取引通貨貸方金額.<p>
	 *
	 */
	public MCNumber c_trd_amt() {
		return getConstNumber(offset + 25, $c_trd_amt);
	}

	/**
	 * Credit amount (Transaction currency) 取引通貨貸方金額.<p>
	 *
	 */
	public void c_trd_amt(MCNumber value) {
		setConstNumber(offset + 25, $c_trd_amt, value);
	}

	/**
	 * Credit amount (Transaction currency) 取引通貨貸方金額.<p>
	 *
	 */
	public void c_trd_amt(int value) {
		setConstNumber(offset + 25, $c_trd_amt, value);
	}

	/**
	 * Credit amount (Transaction currency) 取引通貨貸方金額.<p>
	 *
	 */
	public void c_trd_amt(long value) {
		setConstNumber(offset + 25, $c_trd_amt, value);
	}

	/**
	 * Credit amount (Transaction currency) 取引通貨貸方金額.<p>
	 *
	 */
	public void c_trd_amt(float value) {
		setConstNumber(offset + 25, $c_trd_amt, value);
	}

	/**
	 * Credit amount (Transaction currency) 取引通貨貸方金額.<p>
	 *
	 */
	public void c_trd_amt(double value) {
		setConstNumber(offset + 25, $c_trd_amt, value);
	}


	/**
	 * Credit tax amount (Transaction currency) 取引通貨貸方税額.<p>
	 *
	 */
	public MCNumber c_trd_tax_amt() {
		return getConstNumber(offset + 26, $c_trd_tax_amt);
	}

	/**
	 * Credit tax amount (Transaction currency) 取引通貨貸方税額.<p>
	 *
	 */
	public void c_trd_tax_amt(MCNumber value) {
		setConstNumber(offset + 26, $c_trd_tax_amt, value);
	}

	/**
	 * Credit tax amount (Transaction currency) 取引通貨貸方税額.<p>
	 *
	 */
	public void c_trd_tax_amt(int value) {
		setConstNumber(offset + 26, $c_trd_tax_amt, value);
	}

	/**
	 * Credit tax amount (Transaction currency) 取引通貨貸方税額.<p>
	 *
	 */
	public void c_trd_tax_amt(long value) {
		setConstNumber(offset + 26, $c_trd_tax_amt, value);
	}

	/**
	 * Credit tax amount (Transaction currency) 取引通貨貸方税額.<p>
	 *
	 */
	public void c_trd_tax_amt(float value) {
		setConstNumber(offset + 26, $c_trd_tax_amt, value);
	}

	/**
	 * Credit tax amount (Transaction currency) 取引通貨貸方税額.<p>
	 *
	 */
	public void c_trd_tax_amt(double value) {
		setConstNumber(offset + 26, $c_trd_tax_amt, value);
	}


	/**
	 * Debt and credit amount total (Transaction currency) 取引通貨貸借金額合計.<p>
	 *
	 */
	public MCNumber total_trd_amt() {
		return getConstNumber(offset + 27, $total_trd_amt);
	}

	/**
	 * Debt and credit amount total (Transaction currency) 取引通貨貸借金額合計.<p>
	 *
	 */
	public void total_trd_amt(MCNumber value) {
		setConstNumber(offset + 27, $total_trd_amt, value);
	}

	/**
	 * Debt and credit amount total (Transaction currency) 取引通貨貸借金額合計.<p>
	 *
	 */
	public void total_trd_amt(int value) {
		setConstNumber(offset + 27, $total_trd_amt, value);
	}

	/**
	 * Debt and credit amount total (Transaction currency) 取引通貨貸借金額合計.<p>
	 *
	 */
	public void total_trd_amt(long value) {
		setConstNumber(offset + 27, $total_trd_amt, value);
	}

	/**
	 * Debt and credit amount total (Transaction currency) 取引通貨貸借金額合計.<p>
	 *
	 */
	public void total_trd_amt(float value) {
		setConstNumber(offset + 27, $total_trd_amt, value);
	}

	/**
	 * Debt and credit amount total (Transaction currency) 取引通貨貸借金額合計.<p>
	 *
	 */
	public void total_trd_amt(double value) {
		setConstNumber(offset + 27, $total_trd_amt, value);
	}


	/**
	 * Debt and credit tax amount total (Transaction currency) 取引通貨貸借税額合計.<p>
	 *
	 */
	public MCNumber total_trd_tax_amt() {
		return getConstNumber(offset + 28, $total_trd_tax_amt);
	}

	/**
	 * Debt and credit tax amount total (Transaction currency) 取引通貨貸借税額合計.<p>
	 *
	 */
	public void total_trd_tax_amt(MCNumber value) {
		setConstNumber(offset + 28, $total_trd_tax_amt, value);
	}

	/**
	 * Debt and credit tax amount total (Transaction currency) 取引通貨貸借税額合計.<p>
	 *
	 */
	public void total_trd_tax_amt(int value) {
		setConstNumber(offset + 28, $total_trd_tax_amt, value);
	}

	/**
	 * Debt and credit tax amount total (Transaction currency) 取引通貨貸借税額合計.<p>
	 *
	 */
	public void total_trd_tax_amt(long value) {
		setConstNumber(offset + 28, $total_trd_tax_amt, value);
	}

	/**
	 * Debt and credit tax amount total (Transaction currency) 取引通貨貸借税額合計.<p>
	 *
	 */
	public void total_trd_tax_amt(float value) {
		setConstNumber(offset + 28, $total_trd_tax_amt, value);
	}

	/**
	 * Debt and credit tax amount total (Transaction currency) 取引通貨貸借税額合計.<p>
	 *
	 */
	public void total_trd_tax_amt(double value) {
		setConstNumber(offset + 28, $total_trd_tax_amt, value);
	}


	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public String dc_typ() {
		return getConstString(offset + 29, $dc_typ);
	}

	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public void dc_typ(String value) {
		setConstString(offset + 29, $dc_typ, value);
	}


	public String getString(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
		}
		if ($ac_if_typ_nm.equalsIgnoreCase(name)) {
			return ac_if_typ_nm();
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			return slip_cnt_id();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			return sub_ac_cd();
		}
		if ($sub_ac_nm.equalsIgnoreCase(name)) {
			return sub_ac_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($d_amt.equalsIgnoreCase(name)) {
			return d_amt();
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			return d_tax_amt();
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			return c_amt();
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			return c_tax_amt();
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			return total_amt();
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			return total_tax_amt();
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			return d_trd_amt();
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			return d_trd_tax_amt();
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			return c_trd_amt();
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			return c_trd_tax_amt();
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			return total_trd_amt();
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			return total_trd_tax_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
		}
		if ($ac_if_typ_nm.equalsIgnoreCase(name)) {
			return ac_if_typ_nm();
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			return slip_cnt_id();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			return sub_ac_cd();
		}
		if ($sub_ac_nm.equalsIgnoreCase(name)) {
			return sub_ac_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($d_amt.equalsIgnoreCase(name)) {
			return d_amt();
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			return d_tax_amt();
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			return c_amt();
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			return c_tax_amt();
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			return total_amt();
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			return total_tax_amt();
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			return d_trd_amt();
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			return d_trd_tax_amt();
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			return c_trd_amt();
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			return c_trd_tax_amt();
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			return total_trd_amt();
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			return total_trd_tax_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			ac_if_typ(value);
			return;
		}
		if ($ac_if_typ_nm.equalsIgnoreCase(name)) {
			ac_if_typ_nm(value);
			return;
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			slip_cnt_id(value);
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
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			sub_ac_cd(value);
			return;
		}
		if ($sub_ac_nm.equalsIgnoreCase(name)) {
			sub_ac_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			ac_if_typ(value);
			return;
		}
		if ($ac_if_typ_nm.equalsIgnoreCase(name)) {
			ac_if_typ_nm(value);
			return;
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			slip_cnt_id(value);
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
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			sub_ac_cd(value);
			return;
		}
		if ($sub_ac_nm.equalsIgnoreCase(name)) {
			sub_ac_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($d_amt.equalsIgnoreCase(name)) {
			d_amt(value);
			return;
		}
		if ($d_tax_amt.equalsIgnoreCase(name)) {
			d_tax_amt(value);
			return;
		}
		if ($c_amt.equalsIgnoreCase(name)) {
			c_amt(value);
			return;
		}
		if ($c_tax_amt.equalsIgnoreCase(name)) {
			c_tax_amt(value);
			return;
		}
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_tax_amt.equalsIgnoreCase(name)) {
			total_tax_amt(value);
			return;
		}
		if ($d_trd_amt.equalsIgnoreCase(name)) {
			d_trd_amt(value);
			return;
		}
		if ($d_trd_tax_amt.equalsIgnoreCase(name)) {
			d_trd_tax_amt(value);
			return;
		}
		if ($c_trd_amt.equalsIgnoreCase(name)) {
			c_trd_amt(value);
			return;
		}
		if ($c_trd_tax_amt.equalsIgnoreCase(name)) {
			c_trd_tax_amt(value);
			return;
		}
		if ($total_trd_amt.equalsIgnoreCase(name)) {
			total_trd_amt(value);
			return;
		}
		if ($total_trd_tax_amt.equalsIgnoreCase(name)) {
			total_trd_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

