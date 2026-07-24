package mcframe.serverMBBB.MBBBL5010;

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
 * ブロック"AcMst_Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AcMst_Chk01_CndR_MC_A extends MCConstRow {

	/**
	 * Master import type マスタ取込区分.<p>
	 *
	 */
	public static final String $master_imp_typ = "master_imp_typ";
	/**
	 * Account master 勘定科目マスタ.<p>
	 *
	 */
	public static final String $account_flg = "account_flg";
	/**
	 * Subsidiary account master 補助勘定科目マスタ.<p>
	 *
	 */
	public static final String $sub_account_flg = "sub_account_flg";
	/**
	 * Accounting dept. master 会計部門マスタ.<p>
	 *
	 */
	public static final String $ac_dpt_flg = "ac_dpt_flg";
	/**
	 * Bank account type setting master 口座科目設定マスタ.<p>
	 *
	 */
	public static final String $bac_ac_flg = "bac_ac_flg";
	/**
	 * Bank master 銀行マスタ.<p>
	 *
	 */
	public static final String $bank_flg = "bank_flg";
	/**
	 * Bank branch master 銀行支店マスタ.<p>
	 *
	 */
	public static final String $bank_branch_flg = "bank_branch_flg";
	/**
	 * Bank account master 口座マスタ.<p>
	 *
	 */
	public static final String $bank_ac_flg = "bank_ac_flg";
	/**
	 * Exchange rate master 為替レートマスタ.<p>
	 *
	 */
	public static final String $cur_xrate_flg = "cur_xrate_flg";
	/**
	 * Accounting tax master 会計税マスタ.<p>
	 *
	 */
	public static final String $ac_tax_flg = "ac_tax_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta master_imp_typ_META = createCommonMeta($master_imp_typ, mcframe.commonMA.meta.MA_META.MASTER_IMP_TYP);
	public static final MCMeta account_flg_META = createCommonMeta($account_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_account_flg_META = createCommonMeta($sub_account_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_dpt_flg_META = createCommonMeta($ac_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bac_ac_flg_META = createCommonMeta($bac_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_flg_META = createCommonMeta($bank_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_branch_flg_META = createCommonMeta($bank_branch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_ac_flg_META = createCommonMeta($bank_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cur_xrate_flg_META = createCommonMeta($cur_xrate_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_tax_flg_META = createCommonMeta($ac_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<AcMst_Chk01_CndR> constMetas = new ConstMetaList<AcMst_Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			master_imp_typ_META,
			account_flg_META,
			sub_account_flg_META,
			ac_dpt_flg_META,
			bac_ac_flg_META,
			bank_flg_META,
			bank_branch_flg_META,
			bank_ac_flg_META,
			cur_xrate_flg_META,
			ac_tax_flg_META,
			err_flg_META
		},
		new String[][]{
			{
			},
			{
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
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
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
				{$master_imp_typ, "E"}	// master_imp_typ
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
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
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
				{$account_flg, "E"},	// account_flg
				{$sub_account_flg, "E"},	// sub_account_flg
				{$ac_dpt_flg, "E"},	// ac_dpt_flg
				{$bac_ac_flg, "E"},	// bac_ac_flg
				{$bank_flg, "E"},	// bank_flg
				{$bank_branch_flg, "E"},	// bank_branch_flg
				{$bank_ac_flg, "E"},	// bank_ac_flg
				{$cur_xrate_flg, "E"},	// cur_xrate_flg
				{$ac_tax_flg, "E"}	// ac_tax_flg
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
				{$master_imp_typ, "MAC_MASTER_IMP_TYP"}	// master_imp_typ
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
	protected AcMst_Chk01_CndR_MC_A(ConstMetaList<? extends AcMst_Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcMst_Chk01_CndR clone() {
		return (AcMst_Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcMst_Chk01_CndR createInstance() {
		return (AcMst_Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcMst_Chk01_CndR getValues(String... names) {
		return (AcMst_Chk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Master import type マスタ取込区分.<p>
	 *
	 */
	public String master_imp_typ() {
		return getConstString(offset + 0, $master_imp_typ);
	}

	/**
	 * Master import type マスタ取込区分.<p>
	 *
	 */
	public void master_imp_typ(String value) {
		setConstString(offset + 0, $master_imp_typ, value);
	}


	/**
	 * Account master 勘定科目マスタ.<p>
	 *
	 */
	public boolean account_flg() {
		return getConstBoolean(offset + 1, $account_flg);
	}

	/**
	 * Account master 勘定科目マスタ.<p>
	 *
	 */
	public void account_flg(boolean value) {
		setConstBoolean(offset + 1, $account_flg, value);
	}


	/**
	 * Subsidiary account master 補助勘定科目マスタ.<p>
	 *
	 */
	public boolean sub_account_flg() {
		return getConstBoolean(offset + 2, $sub_account_flg);
	}

	/**
	 * Subsidiary account master 補助勘定科目マスタ.<p>
	 *
	 */
	public void sub_account_flg(boolean value) {
		setConstBoolean(offset + 2, $sub_account_flg, value);
	}


	/**
	 * Accounting dept. master 会計部門マスタ.<p>
	 *
	 */
	public boolean ac_dpt_flg() {
		return getConstBoolean(offset + 3, $ac_dpt_flg);
	}

	/**
	 * Accounting dept. master 会計部門マスタ.<p>
	 *
	 */
	public void ac_dpt_flg(boolean value) {
		setConstBoolean(offset + 3, $ac_dpt_flg, value);
	}


	/**
	 * Bank account type setting master 口座科目設定マスタ.<p>
	 *
	 */
	public boolean bac_ac_flg() {
		return getConstBoolean(offset + 4, $bac_ac_flg);
	}

	/**
	 * Bank account type setting master 口座科目設定マスタ.<p>
	 *
	 */
	public void bac_ac_flg(boolean value) {
		setConstBoolean(offset + 4, $bac_ac_flg, value);
	}


	/**
	 * Bank master 銀行マスタ.<p>
	 *
	 */
	public boolean bank_flg() {
		return getConstBoolean(offset + 5, $bank_flg);
	}

	/**
	 * Bank master 銀行マスタ.<p>
	 *
	 */
	public void bank_flg(boolean value) {
		setConstBoolean(offset + 5, $bank_flg, value);
	}


	/**
	 * Bank branch master 銀行支店マスタ.<p>
	 *
	 */
	public boolean bank_branch_flg() {
		return getConstBoolean(offset + 6, $bank_branch_flg);
	}

	/**
	 * Bank branch master 銀行支店マスタ.<p>
	 *
	 */
	public void bank_branch_flg(boolean value) {
		setConstBoolean(offset + 6, $bank_branch_flg, value);
	}


	/**
	 * Bank account master 口座マスタ.<p>
	 *
	 */
	public boolean bank_ac_flg() {
		return getConstBoolean(offset + 7, $bank_ac_flg);
	}

	/**
	 * Bank account master 口座マスタ.<p>
	 *
	 */
	public void bank_ac_flg(boolean value) {
		setConstBoolean(offset + 7, $bank_ac_flg, value);
	}


	/**
	 * Exchange rate master 為替レートマスタ.<p>
	 *
	 */
	public boolean cur_xrate_flg() {
		return getConstBoolean(offset + 8, $cur_xrate_flg);
	}

	/**
	 * Exchange rate master 為替レートマスタ.<p>
	 *
	 */
	public void cur_xrate_flg(boolean value) {
		setConstBoolean(offset + 8, $cur_xrate_flg, value);
	}


	/**
	 * Accounting tax master 会計税マスタ.<p>
	 *
	 */
	public boolean ac_tax_flg() {
		return getConstBoolean(offset + 9, $ac_tax_flg);
	}

	/**
	 * Accounting tax master 会計税マスタ.<p>
	 *
	 */
	public void ac_tax_flg(boolean value) {
		setConstBoolean(offset + 9, $ac_tax_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 10, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 10, $err_flg, value);
	}


	public String getString(String name) {
		if ($master_imp_typ.equalsIgnoreCase(name)) {
			return master_imp_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($account_flg.equalsIgnoreCase(name)) {
			return account_flg();
		}
		if ($sub_account_flg.equalsIgnoreCase(name)) {
			return sub_account_flg();
		}
		if ($ac_dpt_flg.equalsIgnoreCase(name)) {
			return ac_dpt_flg();
		}
		if ($bac_ac_flg.equalsIgnoreCase(name)) {
			return bac_ac_flg();
		}
		if ($bank_flg.equalsIgnoreCase(name)) {
			return bank_flg();
		}
		if ($bank_branch_flg.equalsIgnoreCase(name)) {
			return bank_branch_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		if ($cur_xrate_flg.equalsIgnoreCase(name)) {
			return cur_xrate_flg();
		}
		if ($ac_tax_flg.equalsIgnoreCase(name)) {
			return ac_tax_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($master_imp_typ.equalsIgnoreCase(name)) {
			return master_imp_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($account_flg.equalsIgnoreCase(name)) {
			return account_flg();
		}
		if ($sub_account_flg.equalsIgnoreCase(name)) {
			return sub_account_flg();
		}
		if ($ac_dpt_flg.equalsIgnoreCase(name)) {
			return ac_dpt_flg();
		}
		if ($bac_ac_flg.equalsIgnoreCase(name)) {
			return bac_ac_flg();
		}
		if ($bank_flg.equalsIgnoreCase(name)) {
			return bank_flg();
		}
		if ($bank_branch_flg.equalsIgnoreCase(name)) {
			return bank_branch_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		if ($cur_xrate_flg.equalsIgnoreCase(name)) {
			return cur_xrate_flg();
		}
		if ($ac_tax_flg.equalsIgnoreCase(name)) {
			return ac_tax_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($master_imp_typ.equalsIgnoreCase(name)) {
			master_imp_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($account_flg.equalsIgnoreCase(name)) {
			account_flg(value);
			return;
		}
		if ($sub_account_flg.equalsIgnoreCase(name)) {
			sub_account_flg(value);
			return;
		}
		if ($ac_dpt_flg.equalsIgnoreCase(name)) {
			ac_dpt_flg(value);
			return;
		}
		if ($bac_ac_flg.equalsIgnoreCase(name)) {
			bac_ac_flg(value);
			return;
		}
		if ($bank_flg.equalsIgnoreCase(name)) {
			bank_flg(value);
			return;
		}
		if ($bank_branch_flg.equalsIgnoreCase(name)) {
			bank_branch_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		if ($cur_xrate_flg.equalsIgnoreCase(name)) {
			cur_xrate_flg(value);
			return;
		}
		if ($ac_tax_flg.equalsIgnoreCase(name)) {
			ac_tax_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($master_imp_typ.equalsIgnoreCase(name)) {
			master_imp_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($account_flg.equalsIgnoreCase(name)) {
			account_flg(value);
			return;
		}
		if ($sub_account_flg.equalsIgnoreCase(name)) {
			sub_account_flg(value);
			return;
		}
		if ($ac_dpt_flg.equalsIgnoreCase(name)) {
			ac_dpt_flg(value);
			return;
		}
		if ($bac_ac_flg.equalsIgnoreCase(name)) {
			bac_ac_flg(value);
			return;
		}
		if ($bank_flg.equalsIgnoreCase(name)) {
			bank_flg(value);
			return;
		}
		if ($bank_branch_flg.equalsIgnoreCase(name)) {
			bank_branch_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		if ($cur_xrate_flg.equalsIgnoreCase(name)) {
			cur_xrate_flg(value);
			return;
		}
		if ($ac_tax_flg.equalsIgnoreCase(name)) {
			ac_tax_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

