package mcframe.serverMSBB.MSBBB0020;

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
 * ブロック"SlsActReg_Ins01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SlsActReg_Ins01_CndR_MC_A extends MCConstRow {

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Scheduled sales date FROM 売上予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $sls_schd_dt_fr = "sls_schd_dt_fr";
	/**
	 * Scheduled sales date TO 売上予定日ＴＯ.<p>
	 *
	 */
	public static final String $sls_schd_dt_to = "sls_schd_dt_to";
	/**
	 * Not copy scheduled sales date 売上予定日を引き継がない.<p>
	 *
	 */
	public static final String $sls_schd_dt_not_ac_flg = "sls_schd_dt_not_ac_flg";
	/**
	 * Include acceptance base 検収基準を含む.<p>
	 *
	 */
	public static final String $inc_in_basis_flg = "inc_in_basis_flg";
	/**
	 * Include partially sold 一部売上済を含む.<p>
	 *
	 */
	public static final String $inc_partial_sls_flg = "inc_partial_sls_flg";
	/**
	 * Include direct delivery 仕入直送を含む.<p>
	 *
	 */
	public static final String $inc_purc_ddlv_flg = "inc_purc_ddlv_flg";
	/**
	 * Do not issue delivery note 納品書を発行しない.<p>
	 *
	 */
	public static final String $non_prnt_dlv_flg = "non_prnt_dlv_flg";


	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sls_schd_dt_fr_META = createCommonMeta($sls_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_schd_dt_to_META = createCommonMeta($sls_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_schd_dt_not_ac_flg_META = createCommonMeta($sls_schd_dt_not_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_in_basis_flg_META = createCommonMeta($inc_in_basis_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_partial_sls_flg_META = createCommonMeta($inc_partial_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_purc_ddlv_flg_META = createCommonMeta($inc_purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_prnt_dlv_flg_META = createCommonMeta($non_prnt_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<SlsActReg_Ins01_CndR> constMetas = new ConstMetaList<SlsActReg_Ins01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cst_cd_META,
			dlv_cd_META,
			sls_schd_dt_fr_META,
			sls_schd_dt_to_META,
			sls_schd_dt_not_ac_flg_META,
			inc_in_basis_flg_META,
			inc_partial_sls_flg_META,
			inc_purc_ddlv_flg_META,
			non_prnt_dlv_flg_META
		},
		new String[][]{
			{
			},
			{
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
	protected SlsActReg_Ins01_CndR_MC_A(ConstMetaList<? extends SlsActReg_Ins01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsActReg_Ins01_CndR clone() {
		return (SlsActReg_Ins01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsActReg_Ins01_CndR createInstance() {
		return (SlsActReg_Ins01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsActReg_Ins01_CndR getValues(String... names) {
		return (SlsActReg_Ins01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 0, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 0, $cst_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 1, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 1, $dlv_cd, value);
	}


	/**
	 * Scheduled sales date FROM 売上予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate sls_schd_dt_fr() {
		return getConstDate(offset + 2, $sls_schd_dt_fr);
	}

	/**
	 * Scheduled sales date FROM 売上予定日ＦＲＯＭ.<p>
	 *
	 */
	public void sls_schd_dt_fr(MCDate value) {
		setConstDate(offset + 2, $sls_schd_dt_fr, value);
	}


	/**
	 * Scheduled sales date TO 売上予定日ＴＯ.<p>
	 *
	 */
	public MCDate sls_schd_dt_to() {
		return getConstDate(offset + 3, $sls_schd_dt_to);
	}

	/**
	 * Scheduled sales date TO 売上予定日ＴＯ.<p>
	 *
	 */
	public void sls_schd_dt_to(MCDate value) {
		setConstDate(offset + 3, $sls_schd_dt_to, value);
	}


	/**
	 * Not copy scheduled sales date 売上予定日を引き継がない.<p>
	 *
	 */
	public boolean sls_schd_dt_not_ac_flg() {
		return getConstBoolean(offset + 4, $sls_schd_dt_not_ac_flg);
	}

	/**
	 * Not copy scheduled sales date 売上予定日を引き継がない.<p>
	 *
	 */
	public void sls_schd_dt_not_ac_flg(boolean value) {
		setConstBoolean(offset + 4, $sls_schd_dt_not_ac_flg, value);
	}


	/**
	 * Include acceptance base 検収基準を含む.<p>
	 *
	 */
	public boolean inc_in_basis_flg() {
		return getConstBoolean(offset + 5, $inc_in_basis_flg);
	}

	/**
	 * Include acceptance base 検収基準を含む.<p>
	 *
	 */
	public void inc_in_basis_flg(boolean value) {
		setConstBoolean(offset + 5, $inc_in_basis_flg, value);
	}


	/**
	 * Include partially sold 一部売上済を含む.<p>
	 *
	 */
	public boolean inc_partial_sls_flg() {
		return getConstBoolean(offset + 6, $inc_partial_sls_flg);
	}

	/**
	 * Include partially sold 一部売上済を含む.<p>
	 *
	 */
	public void inc_partial_sls_flg(boolean value) {
		setConstBoolean(offset + 6, $inc_partial_sls_flg, value);
	}


	/**
	 * Include direct delivery 仕入直送を含む.<p>
	 *
	 */
	public boolean inc_purc_ddlv_flg() {
		return getConstBoolean(offset + 7, $inc_purc_ddlv_flg);
	}

	/**
	 * Include direct delivery 仕入直送を含む.<p>
	 *
	 */
	public void inc_purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 7, $inc_purc_ddlv_flg, value);
	}


	/**
	 * Do not issue delivery note 納品書を発行しない.<p>
	 *
	 */
	public boolean non_prnt_dlv_flg() {
		return getConstBoolean(offset + 8, $non_prnt_dlv_flg);
	}

	/**
	 * Do not issue delivery note 納品書を発行しない.<p>
	 *
	 */
	public void non_prnt_dlv_flg(boolean value) {
		setConstBoolean(offset + 8, $non_prnt_dlv_flg, value);
	}


	public String getString(String name) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($sls_schd_dt_fr.equalsIgnoreCase(name)) {
			return sls_schd_dt_fr();
		}
		if ($sls_schd_dt_to.equalsIgnoreCase(name)) {
			return sls_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sls_schd_dt_not_ac_flg.equalsIgnoreCase(name)) {
			return sls_schd_dt_not_ac_flg();
		}
		if ($inc_in_basis_flg.equalsIgnoreCase(name)) {
			return inc_in_basis_flg();
		}
		if ($inc_partial_sls_flg.equalsIgnoreCase(name)) {
			return inc_partial_sls_flg();
		}
		if ($inc_purc_ddlv_flg.equalsIgnoreCase(name)) {
			return inc_purc_ddlv_flg();
		}
		if ($non_prnt_dlv_flg.equalsIgnoreCase(name)) {
			return non_prnt_dlv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($sls_schd_dt_fr.equalsIgnoreCase(name)) {
			return sls_schd_dt_fr();
		}
		if ($sls_schd_dt_to.equalsIgnoreCase(name)) {
			return sls_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sls_schd_dt_not_ac_flg.equalsIgnoreCase(name)) {
			return sls_schd_dt_not_ac_flg();
		}
		if ($inc_in_basis_flg.equalsIgnoreCase(name)) {
			return inc_in_basis_flg();
		}
		if ($inc_partial_sls_flg.equalsIgnoreCase(name)) {
			return inc_partial_sls_flg();
		}
		if ($inc_purc_ddlv_flg.equalsIgnoreCase(name)) {
			return inc_purc_ddlv_flg();
		}
		if ($non_prnt_dlv_flg.equalsIgnoreCase(name)) {
			return non_prnt_dlv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($sls_schd_dt_fr.equalsIgnoreCase(name)) {
			sls_schd_dt_fr(value);
			return;
		}
		if ($sls_schd_dt_to.equalsIgnoreCase(name)) {
			sls_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sls_schd_dt_not_ac_flg.equalsIgnoreCase(name)) {
			sls_schd_dt_not_ac_flg(value);
			return;
		}
		if ($inc_in_basis_flg.equalsIgnoreCase(name)) {
			inc_in_basis_flg(value);
			return;
		}
		if ($inc_partial_sls_flg.equalsIgnoreCase(name)) {
			inc_partial_sls_flg(value);
			return;
		}
		if ($inc_purc_ddlv_flg.equalsIgnoreCase(name)) {
			inc_purc_ddlv_flg(value);
			return;
		}
		if ($non_prnt_dlv_flg.equalsIgnoreCase(name)) {
			non_prnt_dlv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($sls_schd_dt_fr.equalsIgnoreCase(name)) {
			sls_schd_dt_fr(value);
			return;
		}
		if ($sls_schd_dt_to.equalsIgnoreCase(name)) {
			sls_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sls_schd_dt_not_ac_flg.equalsIgnoreCase(name)) {
			sls_schd_dt_not_ac_flg(value);
			return;
		}
		if ($inc_in_basis_flg.equalsIgnoreCase(name)) {
			inc_in_basis_flg(value);
			return;
		}
		if ($inc_partial_sls_flg.equalsIgnoreCase(name)) {
			inc_partial_sls_flg(value);
			return;
		}
		if ($inc_purc_ddlv_flg.equalsIgnoreCase(name)) {
			inc_purc_ddlv_flg(value);
			return;
		}
		if ($non_prnt_dlv_flg.equalsIgnoreCase(name)) {
			non_prnt_dlv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

