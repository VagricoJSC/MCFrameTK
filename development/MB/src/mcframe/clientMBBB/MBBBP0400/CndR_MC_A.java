package mcframe.clientMBBB.MBBBP0400;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * ADD_ONLY,Add only;ADD_UPD,Add/Update;REMAKE,Re-create after deletion ADD_ONLY,追加のみ;ADD_UPD,追加・更新;REMAKE,削除後再作成.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Master import type マスタ取込区分.<p>
	 *
	 */
	public static final String $master_imp_typ = "master_imp_typ";
	/**
	 * Import account master 勘定科目マスタ取込.<p>
	 *
	 */
	public static final String $account_flg = "account_flg";
	/**
	 * Import subsidiary account master 補助勘定科目マスタ取込.<p>
	 *
	 */
	public static final String $sub_account_flg = "sub_account_flg";
	/**
	 * Import accounting dept. master 会計部門マスタ取込.<p>
	 *
	 */
	public static final String $ac_dpt_flg = "ac_dpt_flg";
	/**
	 * Import bank account type setting master 口座科目設定マスタ取込.<p>
	 *
	 */
	public static final String $bac_ac_flg = "bac_ac_flg";
	/**
	 * Import bank master 銀行マスタ取込.<p>
	 *
	 */
	public static final String $bank_flg = "bank_flg";
	/**
	 * Import bank branch master 銀行支店マスタ取込.<p>
	 *
	 */
	public static final String $bank_branch_flg = "bank_branch_flg";
	/**
	 * Import bank account master 口座マスタ取込.<p>
	 *
	 */
	public static final String $bank_ac_flg = "bank_ac_flg";
	/**
	 * Import exchange rate master 為替レートマスタ取込.<p>
	 *
	 */
	public static final String $cur_xrate_flg = "cur_xrate_flg";
	/**
	 * Import accounting tax master 会計税マスタ取込.<p>
	 *
	 */
	public static final String $ac_tax_flg = "ac_tax_flg";


	public static final MCMeta ope_META = createStringMeta($ope);
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

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			master_imp_typ_META,
			account_flg_META,
			sub_account_flg_META,
			ac_dpt_flg_META,
			bac_ac_flg_META,
			bank_flg_META,
			bank_branch_flg_META,
			bank_ac_flg_META,
			cur_xrate_flg_META,
			ac_tax_flg_META
		},
		new String[][]{
			{
			},
			{
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * ADD_ONLY,Add only;ADD_UPD,Add/Update;REMAKE,Re-create after deletion ADD_ONLY,追加のみ;ADD_UPD,追加・更新;REMAKE,削除後再作成.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * ADD_ONLY,Add only;ADD_UPD,Add/Update;REMAKE,Re-create after deletion ADD_ONLY,追加のみ;ADD_UPD,追加・更新;REMAKE,削除後再作成.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Master import type マスタ取込区分.<p>
	 *
	 */
	public String master_imp_typ() {
		return getConstString(offset + 1, $master_imp_typ);
	}

	/**
	 * Master import type マスタ取込区分.<p>
	 *
	 */
	public void master_imp_typ(String value) {
		setConstString(offset + 1, $master_imp_typ, value);
	}


	/**
	 * Import account master 勘定科目マスタ取込.<p>
	 *
	 */
	public boolean account_flg() {
		return getConstBoolean(offset + 2, $account_flg);
	}

	/**
	 * Import account master 勘定科目マスタ取込.<p>
	 *
	 */
	public void account_flg(boolean value) {
		setConstBoolean(offset + 2, $account_flg, value);
	}


	/**
	 * Import subsidiary account master 補助勘定科目マスタ取込.<p>
	 *
	 */
	public boolean sub_account_flg() {
		return getConstBoolean(offset + 3, $sub_account_flg);
	}

	/**
	 * Import subsidiary account master 補助勘定科目マスタ取込.<p>
	 *
	 */
	public void sub_account_flg(boolean value) {
		setConstBoolean(offset + 3, $sub_account_flg, value);
	}


	/**
	 * Import accounting dept. master 会計部門マスタ取込.<p>
	 *
	 */
	public boolean ac_dpt_flg() {
		return getConstBoolean(offset + 4, $ac_dpt_flg);
	}

	/**
	 * Import accounting dept. master 会計部門マスタ取込.<p>
	 *
	 */
	public void ac_dpt_flg(boolean value) {
		setConstBoolean(offset + 4, $ac_dpt_flg, value);
	}


	/**
	 * Import bank account type setting master 口座科目設定マスタ取込.<p>
	 *
	 */
	public boolean bac_ac_flg() {
		return getConstBoolean(offset + 5, $bac_ac_flg);
	}

	/**
	 * Import bank account type setting master 口座科目設定マスタ取込.<p>
	 *
	 */
	public void bac_ac_flg(boolean value) {
		setConstBoolean(offset + 5, $bac_ac_flg, value);
	}


	/**
	 * Import bank master 銀行マスタ取込.<p>
	 *
	 */
	public boolean bank_flg() {
		return getConstBoolean(offset + 6, $bank_flg);
	}

	/**
	 * Import bank master 銀行マスタ取込.<p>
	 *
	 */
	public void bank_flg(boolean value) {
		setConstBoolean(offset + 6, $bank_flg, value);
	}


	/**
	 * Import bank branch master 銀行支店マスタ取込.<p>
	 *
	 */
	public boolean bank_branch_flg() {
		return getConstBoolean(offset + 7, $bank_branch_flg);
	}

	/**
	 * Import bank branch master 銀行支店マスタ取込.<p>
	 *
	 */
	public void bank_branch_flg(boolean value) {
		setConstBoolean(offset + 7, $bank_branch_flg, value);
	}


	/**
	 * Import bank account master 口座マスタ取込.<p>
	 *
	 */
	public boolean bank_ac_flg() {
		return getConstBoolean(offset + 8, $bank_ac_flg);
	}

	/**
	 * Import bank account master 口座マスタ取込.<p>
	 *
	 */
	public void bank_ac_flg(boolean value) {
		setConstBoolean(offset + 8, $bank_ac_flg, value);
	}


	/**
	 * Import exchange rate master 為替レートマスタ取込.<p>
	 *
	 */
	public boolean cur_xrate_flg() {
		return getConstBoolean(offset + 9, $cur_xrate_flg);
	}

	/**
	 * Import exchange rate master 為替レートマスタ取込.<p>
	 *
	 */
	public void cur_xrate_flg(boolean value) {
		setConstBoolean(offset + 9, $cur_xrate_flg, value);
	}


	/**
	 * Import accounting tax master 会計税マスタ取込.<p>
	 *
	 */
	public boolean ac_tax_flg() {
		return getConstBoolean(offset + 10, $ac_tax_flg);
	}

	/**
	 * Import accounting tax master 会計税マスタ取込.<p>
	 *
	 */
	public void ac_tax_flg(boolean value) {
		setConstBoolean(offset + 10, $ac_tax_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
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
		super.setBooleanNE(name, value);
	}



}

