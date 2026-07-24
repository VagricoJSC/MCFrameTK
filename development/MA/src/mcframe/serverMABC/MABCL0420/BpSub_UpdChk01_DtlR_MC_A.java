package mcframe.serverMABC.MABCL0420;

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
 * ブロック"BpSub_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BpSub_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_BP_SUB_R {

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public static final String $cst_flg = "cst_flg";
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public static final String $acst_flg = "acst_flg";
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public static final String $rcst_flg = "rcst_flg";
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public static final String $sppl_flg = "sppl_flg";
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public static final String $asppl_flg = "asppl_flg";
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public static final String $bsppl_flg = "bsppl_flg";
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public static final String $psppl_flg = "psppl_flg";
	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public static final String $cred_flg = "cred_flg";
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public static final String $dlv_flg = "dlv_flg";
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public static final String $maker_flg = "maker_flg";
	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public static final String $dest_flg = "dest_flg";
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public static final String $bill_dpt_typ = "bill_dpt_typ";
	/**
	 * Chargeable supplier flg. 有償支給先ＦＬＧ.<p>
	 *
	 */
	public static final String $onr_prsppl_flg = "onr_prsppl_flg";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";


	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_flg_META = createCommonMeta($cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_flg_META = createCommonMeta($acst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_flg_META = createCommonMeta($rcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_flg_META = createCommonMeta($sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_flg_META = createCommonMeta($asppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_flg_META = createCommonMeta($psppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_flg_META = createCommonMeta($cred_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_flg_META = createCommonMeta($dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_flg_META = createCommonMeta($maker_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_flg_META = createCommonMeta($dest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.AR_DPT_TYP);
	public static final MCMeta bill_dpt_typ_META = createCommonMeta($bill_dpt_typ, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP);
	public static final MCMeta onr_prsppl_flg_META = createCommonMeta($onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BpSub_UpdChk01_DtlR> constMetas = new ConstMetaList<BpSub_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_BP_SUB_R.constMetas,
		new MCMeta[]{
			st_dt_key_META,
			cst_flg_META,
			acst_flg_META,
			bcst_flg_META,
			rcst_flg_META,
			sppl_flg_META,
			asppl_flg_META,
			bsppl_flg_META,
			psppl_flg_META,
			cred_flg_META,
			dlv_flg_META,
			maker_flg_META,
			dest_flg_META,
			ar_dpt_typ_META,
			bill_dpt_typ_META,
			onr_prsppl_flg_META,
			repurc_obli_flg_META,
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
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
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$bp_cd, "E"},	// bp_cd
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$bp_cd, "MA.MAUAL0010.Bp"},	// bp_cd
				{$ar_dpt_cd, "MA.MAUAL0010.Dpt"},	// ar_dpt_cd
				{$sls_tax_cd, "MA.MAUAL0010.SlsTax"},	// sls_tax_cd
				{$sls_anly_cd1, "MA.MAUAL0010.SlsAnly1"},	// sls_anly_cd1
				{$sls_anly_cd2, "MA.MAUAL0010.SlsAnly2"},	// sls_anly_cd2
				{$sls_anly_cd3, "MA.MAUAL0010.SlsAnly3"},	// sls_anly_cd3
				{$bcst_dpt_cd, "MA.MAUAL0010.Dpt"},	// bcst_dpt_cd
				{$vmi_purc_dpt_cd, "MA.MAUAL0010.Dpt"},	// vmi_purc_dpt_cd
				{$purc_tax_cd, "MA.MAUAL0010.PurcTax"},	// purc_tax_cd
				{$prov_tax_cd, "MA.MAUAL0010.ProvTax"},	// prov_tax_cd
				{$ap_dpt_cd, "MA.MAUAL0010.Dpt"},	// ap_dpt_cd
				{$bsppl_dpt_cd, "MA.MAUAL0010.Dpt"},	// bsppl_dpt_cd
				{$pay_dpt_cd, "MA.MAUAL0010.Dpt"}	// pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$bp_cd, "cst_flg;acst_flg;bcst_flg;rcst_flg;sppl_flg;asppl_flg;bsppl_flg;psppl_flg;cred_flg;dlv_flg;maker_flg;dest_flg;ar_dpt_typ;bill_dpt_typ;onr_prsppl_flg;repurc_obli_flg"}	// bp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$bp_cd, "cst_flg;acst_flg;bcst_flg;rcst_flg;sppl_flg;asppl_flg;bsppl_flg;psppl_flg;cred_flg;dlv_flg;maker_flg;dest_flg;ar_dpt_typ;bill_dpt_typ;onr_prsppl_flg;repurc_obli_flg"}	// bp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bp_cd, "MAC_BP_IS_SRCH_TYP.COMM"},	// bp_cd
				{$ar_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;st_dt"},	// ar_dpt_cd
				{$bcst_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;st_dt"},	// bcst_dpt_cd
				{$vmi_purc_dpt_cd, "MAC_DPT_IS_SRCH_TYP.PURC;st_dt"},	// vmi_purc_dpt_cd
				{$prov_tax_cd, "repurc_obli_flg"},	// prov_tax_cd
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;st_dt"},	// ap_dpt_cd
				{$bsppl_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;st_dt"},	// bsppl_dpt_cd
				{$pay_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;st_dt"}	// pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bp_cd, "bp_is_srch_typ"},	// bp_cd
				{$ar_dpt_cd, "dpt_is_srch_typ;dt"},	// ar_dpt_cd
				{$bcst_dpt_cd, "dpt_is_srch_typ;dt"},	// bcst_dpt_cd
				{$vmi_purc_dpt_cd, "dpt_is_srch_typ;dt"},	// vmi_purc_dpt_cd
				{$prov_tax_cd, "repurc_obli_flg"},	// prov_tax_cd
				{$ap_dpt_cd, "dpt_is_srch_typ;dt"},	// ap_dpt_cd
				{$bsppl_dpt_cd, "dpt_is_srch_typ;dt"},	// bsppl_dpt_cd
				{$pay_dpt_cd, "dpt_is_srch_typ;dt"}	// pay_dpt_cd
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$zip_cd, "E1"},	// zip_cd
				{$addr1, "E1"},	// addr1
				{$addr2, "E1"},	// addr2
				{$addr3, "E1"},	// addr3
				{$addr4, "E1"},	// addr4
				{$tel, "E1"},	// tel
				{$fax, "E1"},	// fax
				{$ar_dpt_cd, "E1"},	// ar_dpt_cd
				{$cst_cntct_dpt, "E1"},	// cst_cntct_dpt
				{$cst_cntct_psn, "E1"},	// cst_cntct_psn
				{$cst_cntct_psn_title, "E1"},	// cst_cntct_psn_title
				{$sls_tax_cd, "E1"},	// sls_tax_cd
				{$sls_anly_cd1, "E1"},	// sls_anly_cd1
				{$sls_anly_cd2, "E1"},	// sls_anly_cd2
				{$sls_anly_cd3, "E1"},	// sls_anly_cd3
				{$bcst_dpt_cd, "E1"},	// bcst_dpt_cd
				{$bill_zip_cd, "E1"},	// bill_zip_cd
				{$bill_addr1, "E1"},	// bill_addr1
				{$bill_addr2, "E1"},	// bill_addr2
				{$bill_addr3, "E1"},	// bill_addr3
				{$bill_addr4, "E1"},	// bill_addr4
				{$bill_tel, "E1"},	// bill_tel
				{$bill_bcst_nm, "E1"},	// bill_bcst_nm
				{$bill_bcst_dpt, "E1"},	// bill_bcst_dpt
				{$bill_bcst_psn, "E1"},	// bill_bcst_psn
				{$bill_bcst_psn_title, "E1"},	// bill_bcst_psn_title
				{$vmi_purc_dpt_cd, "E1"},	// vmi_purc_dpt_cd
				{$sppl_cntct_dpt, "E1"},	// sppl_cntct_dpt
				{$sppl_cntct_psn, "E1"},	// sppl_cntct_psn
				{$sppl_cntct_psn_title, "E1"},	// sppl_cntct_psn_title
				{$purc_tax_cd, "E1"},	// purc_tax_cd
				{$prov_tax_cd, "E1"},	// prov_tax_cd
				{$ap_dpt_cd, "E1"},	// ap_dpt_cd
				{$bsppl_dpt_cd, "E1"},	// bsppl_dpt_cd
				{$pay_dpt_cd, "E1"},	// pay_dpt_cd
				{$dlv_cntct_dpt, "E1"},	// dlv_cntct_dpt
				{$dlv_cntct_psn, "E1"},	// dlv_cntct_psn
				{$dlv_cntct_psn_title, "E1"}	// dlv_cntct_psn_title
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$zip_cd, "ZIP"},	// zip_cd
				{$tel, "TEL"},	// tel
				{$fax, "TEL"},	// fax
				{$bill_zip_cd, "ZIP"},	// bill_zip_cd
				{$bill_tel, "TEL"}	// bill_tel
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
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
	protected BpSub_UpdChk01_DtlR_MC_A(ConstMetaList<? extends BpSub_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpSub_UpdChk01_DtlR clone() {
		return (BpSub_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpSub_UpdChk01_DtlR createInstance() {
		return (BpSub_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BpSub_UpdChk01_DtlR getValues(String... names) {
		return (BpSub_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 0, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 0, $st_dt_key, value);
	}


	/**
	 * Customer 得意先.<p>
	 *
	 */
	public boolean cst_flg() {
		return getConstBoolean(offset + 1, $cst_flg);
	}

	/**
	 * Customer 得意先.<p>
	 *
	 */
	public void cst_flg(boolean value) {
		setConstBoolean(offset + 1, $cst_flg, value);
	}


	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public boolean acst_flg() {
		return getConstBoolean(offset + 2, $acst_flg);
	}

	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public void acst_flg(boolean value) {
		setConstBoolean(offset + 2, $acst_flg, value);
	}


	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 3, $bcst_flg);
	}

	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 3, $bcst_flg, value);
	}


	/**
	 * Payer 入金先.<p>
	 *
	 */
	public boolean rcst_flg() {
		return getConstBoolean(offset + 4, $rcst_flg);
	}

	/**
	 * Payer 入金先.<p>
	 *
	 */
	public void rcst_flg(boolean value) {
		setConstBoolean(offset + 4, $rcst_flg, value);
	}


	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public boolean sppl_flg() {
		return getConstBoolean(offset + 5, $sppl_flg);
	}

	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public void sppl_flg(boolean value) {
		setConstBoolean(offset + 5, $sppl_flg, value);
	}


	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public boolean asppl_flg() {
		return getConstBoolean(offset + 6, $asppl_flg);
	}

	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public void asppl_flg(boolean value) {
		setConstBoolean(offset + 6, $asppl_flg, value);
	}


	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 7, $bsppl_flg);
	}

	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 7, $bsppl_flg, value);
	}


	/**
	 * Payee 支払先.<p>
	 *
	 */
	public boolean psppl_flg() {
		return getConstBoolean(offset + 8, $psppl_flg);
	}

	/**
	 * Payee 支払先.<p>
	 *
	 */
	public void psppl_flg(boolean value) {
		setConstBoolean(offset + 8, $psppl_flg, value);
	}


	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public boolean cred_flg() {
		return getConstBoolean(offset + 9, $cred_flg);
	}

	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public void cred_flg(boolean value) {
		setConstBoolean(offset + 9, $cred_flg, value);
	}


	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public boolean dlv_flg() {
		return getConstBoolean(offset + 10, $dlv_flg);
	}

	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public void dlv_flg(boolean value) {
		setConstBoolean(offset + 10, $dlv_flg, value);
	}


	/**
	 * Maker メーカ.<p>
	 *
	 */
	public boolean maker_flg() {
		return getConstBoolean(offset + 11, $maker_flg);
	}

	/**
	 * Maker メーカ.<p>
	 *
	 */
	public void maker_flg(boolean value) {
		setConstBoolean(offset + 11, $maker_flg, value);
	}


	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public boolean dest_flg() {
		return getConstBoolean(offset + 12, $dest_flg);
	}

	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public void dest_flg(boolean value) {
		setConstBoolean(offset + 12, $dest_flg, value);
	}


	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 13, $ar_dpt_typ);
	}

	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 13, $ar_dpt_typ, value);
	}


	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public String bill_dpt_typ() {
		return getConstString(offset + 14, $bill_dpt_typ);
	}

	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public void bill_dpt_typ(String value) {
		setConstString(offset + 14, $bill_dpt_typ, value);
	}


	/**
	 * Chargeable supplier flg. 有償支給先ＦＬＧ.<p>
	 *
	 */
	public boolean onr_prsppl_flg() {
		return getConstBoolean(offset + 15, $onr_prsppl_flg);
	}

	/**
	 * Chargeable supplier flg. 有償支給先ＦＬＧ.<p>
	 *
	 */
	public void onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 15, $onr_prsppl_flg, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 16, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 16, $repurc_obli_flg, value);
	}


	public String getString(String name) {
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

