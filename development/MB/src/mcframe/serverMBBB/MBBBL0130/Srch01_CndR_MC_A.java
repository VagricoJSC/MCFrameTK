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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

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
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public static final String $ac_typ = "ac_typ";
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
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public static final String $ac_if_flg = "ac_if_flg";
	/**
	 * ID ＩＤ.<p>
	 *
	 */
	public static final String $slip_cnt_flg = "slip_cnt_flg";
	/**
	 * Dept. 部門.<p>
	 *
	 */
	public static final String $dpt_flg = "dpt_flg";
	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public static final String $sub_ac_flg = "sub_ac_flg";
	/**
	 * Tax 税.<p>
	 *
	 */
	public static final String $tax_flg = "tax_flg";


	public static final MCMeta jnl_grp_no_META = createCommonMeta($jnl_grp_no, mcframe.commonMA.meta.MA_META.JNL_GRP_NO);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_if_typ_META = createCommonMeta($ac_if_typ, mcframe.commonMA.meta.MA_META.AC_IF_TYP);
	public static final MCMeta slip_cnt_id_META = createCommonMeta($slip_cnt_id, mcframe.commonMA.meta.MA_META.SLIP_CNT_ID);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.AC_DPT_NM);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_typ_META = createCommonMeta($ac_typ, mcframe.commonMA.meta.MA_META.AC_CD_TYP);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta ac_if_flg_META = createCommonMeta($ac_if_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_cnt_flg_META = createCommonMeta($slip_cnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_flg_META = createCommonMeta($dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_ac_flg_META = createCommonMeta($sub_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_flg_META = createCommonMeta($tax_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			jnl_grp_no_META,
			ac_ym_META,
			ac_if_typ_META,
			slip_cnt_id_META,
			dpt_cd_META,
			dpt_nm_META,
			ac_cd_META,
			ac_nm_META,
			ac_typ_META,
			tax_cd_META,
			tax_nm_META,
			ac_if_flg_META,
			slip_cnt_flg_META,
			dpt_flg_META,
			sub_ac_flg_META,
			tax_flg_META
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
			}
		)),
		new MCExtMap.Entry($$GRP_DEF, new MCExtList(
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
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
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public String slip_cnt_id() {
		return getConstString(offset + 3, $slip_cnt_id);
	}

	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public void slip_cnt_id(String value) {
		setConstString(offset + 3, $slip_cnt_id, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 4, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 4, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 5, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 5, $dpt_nm, value);
	}


	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 6, $ac_cd);
	}

	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 6, $ac_cd, value);
	}


	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public String ac_nm() {
		return getConstString(offset + 7, $ac_nm);
	}

	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public void ac_nm(String value) {
		setConstString(offset + 7, $ac_nm, value);
	}


	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public String ac_typ() {
		return getConstString(offset + 8, $ac_typ);
	}

	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public void ac_typ(String value) {
		setConstString(offset + 8, $ac_typ, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 9, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 9, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 10, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 10, $tax_nm, value);
	}


	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public boolean ac_if_flg() {
		return getConstBoolean(offset + 11, $ac_if_flg);
	}

	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public void ac_if_flg(boolean value) {
		setConstBoolean(offset + 11, $ac_if_flg, value);
	}


	/**
	 * ID ＩＤ.<p>
	 *
	 */
	public boolean slip_cnt_flg() {
		return getConstBoolean(offset + 12, $slip_cnt_flg);
	}

	/**
	 * ID ＩＤ.<p>
	 *
	 */
	public void slip_cnt_flg(boolean value) {
		setConstBoolean(offset + 12, $slip_cnt_flg, value);
	}


	/**
	 * Dept. 部門.<p>
	 *
	 */
	public boolean dpt_flg() {
		return getConstBoolean(offset + 13, $dpt_flg);
	}

	/**
	 * Dept. 部門.<p>
	 *
	 */
	public void dpt_flg(boolean value) {
		setConstBoolean(offset + 13, $dpt_flg, value);
	}


	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public boolean sub_ac_flg() {
		return getConstBoolean(offset + 14, $sub_ac_flg);
	}

	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public void sub_ac_flg(boolean value) {
		setConstBoolean(offset + 14, $sub_ac_flg, value);
	}


	/**
	 * Tax 税.<p>
	 *
	 */
	public boolean tax_flg() {
		return getConstBoolean(offset + 15, $tax_flg);
	}

	/**
	 * Tax 税.<p>
	 *
	 */
	public void tax_flg(boolean value) {
		setConstBoolean(offset + 15, $tax_flg, value);
	}


	public String getString(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
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
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ac_if_flg.equalsIgnoreCase(name)) {
			return ac_if_flg();
		}
		if ($slip_cnt_flg.equalsIgnoreCase(name)) {
			return slip_cnt_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($sub_ac_flg.equalsIgnoreCase(name)) {
			return sub_ac_flg();
		}
		if ($tax_flg.equalsIgnoreCase(name)) {
			return tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
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
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ac_if_flg.equalsIgnoreCase(name)) {
			return ac_if_flg();
		}
		if ($slip_cnt_flg.equalsIgnoreCase(name)) {
			return slip_cnt_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($sub_ac_flg.equalsIgnoreCase(name)) {
			return sub_ac_flg();
		}
		if ($tax_flg.equalsIgnoreCase(name)) {
			return tax_flg();
		}
		return super.getBooleanNE(name);
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
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ac_if_flg.equalsIgnoreCase(name)) {
			ac_if_flg(value);
			return;
		}
		if ($slip_cnt_flg.equalsIgnoreCase(name)) {
			slip_cnt_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($sub_ac_flg.equalsIgnoreCase(name)) {
			sub_ac_flg(value);
			return;
		}
		if ($tax_flg.equalsIgnoreCase(name)) {
			tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ac_if_flg.equalsIgnoreCase(name)) {
			ac_if_flg(value);
			return;
		}
		if ($slip_cnt_flg.equalsIgnoreCase(name)) {
			slip_cnt_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($sub_ac_flg.equalsIgnoreCase(name)) {
			sub_ac_flg(value);
			return;
		}
		if ($tax_flg.equalsIgnoreCase(name)) {
			tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

