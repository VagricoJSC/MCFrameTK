package mcframe.clientMBBB.MBBBP0120;

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
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public static final String $jnl_grp_no = "jnl_grp_no";
	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public static final String $jnl_rmrks = "jnl_rmrks";
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
	 * Journal slip No. 仕訳伝票ＮＯ.<p>
	 *
	 */
	public static final String $jnl_no = "jnl_no";
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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
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
	public static final String $bp_grp = "bp_grp";

	public static final String $bp_grp_lab1 = $bp_grp + ".bp_grp_lab1";
	public static final String $bp_grp_flg1 = $bp_grp + ".bp_grp_flg1";
	public static final String $bp_grp_cd1 = $bp_grp + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $bp_grp + ".bp_grp_nm1";
	public static final String $bp_grp_lab2 = $bp_grp + ".bp_grp_lab2";
	public static final String $bp_grp_flg2 = $bp_grp + ".bp_grp_flg2";
	public static final String $bp_grp_cd2 = $bp_grp + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $bp_grp + ".bp_grp_nm2";
	public static final String $bp_grp_lab3 = $bp_grp + ".bp_grp_lab3";
	public static final String $bp_grp_flg3 = $bp_grp + ".bp_grp_flg3";
	public static final String $bp_grp_cd3 = $bp_grp + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $bp_grp + ".bp_grp_nm3";
	public static final String $bp_grp_lab4 = $bp_grp + ".bp_grp_lab4";
	public static final String $bp_grp_flg4 = $bp_grp + ".bp_grp_flg4";
	public static final String $bp_grp_cd4 = $bp_grp + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $bp_grp + ".bp_grp_nm4";
	public static final String $bp_grp_lab5 = $bp_grp + ".bp_grp_lab5";
	public static final String $bp_grp_flg5 = $bp_grp + ".bp_grp_flg5";
	public static final String $bp_grp_cd5 = $bp_grp + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $bp_grp + ".bp_grp_nm5";
	public static final String $bp_grp_lab6 = $bp_grp + ".bp_grp_lab6";
	public static final String $bp_grp_flg6 = $bp_grp + ".bp_grp_flg6";
	public static final String $bp_grp_cd6 = $bp_grp + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $bp_grp + ".bp_grp_nm6";
	public static final String $bp_grp_lab7 = $bp_grp + ".bp_grp_lab7";
	public static final String $bp_grp_flg7 = $bp_grp + ".bp_grp_flg7";
	public static final String $bp_grp_cd7 = $bp_grp + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $bp_grp + ".bp_grp_nm7";
	public static final String $bp_grp_lab8 = $bp_grp + ".bp_grp_lab8";
	public static final String $bp_grp_flg8 = $bp_grp + ".bp_grp_flg8";
	public static final String $bp_grp_cd8 = $bp_grp + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $bp_grp + ".bp_grp_nm8";
	public static final String $bp_grp_lab9 = $bp_grp + ".bp_grp_lab9";
	public static final String $bp_grp_flg9 = $bp_grp + ".bp_grp_flg9";
	public static final String $bp_grp_cd9 = $bp_grp + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $bp_grp + ".bp_grp_nm9";
	public static final String $bp_grp_lab10 = $bp_grp + ".bp_grp_lab10";
	public static final String $bp_grp_flg10 = $bp_grp + ".bp_grp_flg10";
	public static final String $bp_grp_cd10 = $bp_grp + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $bp_grp + ".bp_grp_nm10";

	public static final MCMeta jnl_grp_no_META = createCommonMeta($jnl_grp_no, mcframe.commonMA.meta.MA_META.JNL_GRP_NO);
	public static final MCMeta jnl_rmrks_META = createCommonMeta($jnl_rmrks, mcframe.commonMA.meta.MA_META.JNL_RMRKS);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_if_typ_META = createCommonMeta($ac_if_typ, mcframe.commonMA.meta.MA_META.AC_IF_TYP);
	public static final MCMeta ac_if_typ_nm_META = createCommonMeta($ac_if_typ_nm, mcframe.commonMA.meta.MA_META.AC_IF_TYP_NM);
	public static final MCMeta slip_cnt_id_META = createCommonMeta($slip_cnt_id, mcframe.commonMA.meta.MA_META.SLIP_CNT_ID);
	public static final MCMeta jnl_no_META = createCommonMeta($jnl_no, mcframe.commonMA.meta.MA_META.JNL_NO);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta sub_ac_cd_META = createCommonMeta($sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta sub_ac_nm_META = createCommonMeta($sub_ac_nm, mcframe.commonMA.meta.MA_META.SUB_AC_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.AC_DPT_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta bp_grp_META = createInnerRowMeta($bp_grp, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			jnl_grp_no_META,
			jnl_rmrks_META,
			ac_ym_META,
			ac_if_typ_META,
			ac_if_typ_nm_META,
			slip_cnt_id_META,
			jnl_no_META,
			ac_cd_META,
			ac_nm_META,
			sub_ac_cd_META,
			sub_ac_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			bp_cd_META,
			bp_nm_META,
			tax_cd_META,
			tax_nm_META,
			bp_grp_META
		},
		new String[][]{
			{
				"bp_grp_flg1",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_flg2",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_flg3",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_flg4",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_flg5",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_flg6",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_flg7",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_flg8",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_flg9",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_flg10",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$bp_grp_flg1,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_flg2,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_flg3,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_flg4,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_flg5,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_flg6,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_flg7,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_flg8,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_flg9,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_flg10,
				$bp_grp_cd10,
				$bp_grp_nm10
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "ac_dpt_nm"},	// dpt_cd
				{$tax_cd, "ac_tax_nm"}	// tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sub_ac_cd, "ac_cd"},	// sub_ac_cd
				{$dpt_cd, "true"}	// dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "mode_today_flg"}	// dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public String jnl_rmrks() {
		return getConstString(offset + 1, $jnl_rmrks);
	}

	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public void jnl_rmrks(String value) {
		setConstString(offset + 1, $jnl_rmrks, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 2, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 2, $ac_ym, value);
	}


	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public String ac_if_typ() {
		return getConstString(offset + 3, $ac_if_typ);
	}

	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public void ac_if_typ(String value) {
		setConstString(offset + 3, $ac_if_typ, value);
	}


	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public String ac_if_typ_nm() {
		return getConstString(offset + 4, $ac_if_typ_nm);
	}

	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public void ac_if_typ_nm(String value) {
		setConstString(offset + 4, $ac_if_typ_nm, value);
	}


	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public String slip_cnt_id() {
		return getConstString(offset + 5, $slip_cnt_id);
	}

	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public void slip_cnt_id(String value) {
		setConstString(offset + 5, $slip_cnt_id, value);
	}


	/**
	 * Journal slip No. 仕訳伝票ＮＯ.<p>
	 *
	 */
	public String jnl_no() {
		return getConstString(offset + 6, $jnl_no);
	}

	/**
	 * Journal slip No. 仕訳伝票ＮＯ.<p>
	 *
	 */
	public void jnl_no(String value) {
		setConstString(offset + 6, $jnl_no, value);
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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 11, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 11, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 12, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 12, $dpt_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 13, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 13, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 14, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 14, $bp_nm, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 15, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 15, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 16, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 16, $tax_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bp_grp(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 17, $bp_grp);
	}
	
	public void bp_grp(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 17, $bp_grp, row);
	}


	public String getString(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			return jnl_rmrks();
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
		if ($jnl_no.equalsIgnoreCase(name)) {
			return jnl_no();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
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

	public String getStringNE(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			return jnl_rmrks();
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
		if ($jnl_no.equalsIgnoreCase(name)) {
			return jnl_no();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
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

	public void setString(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			jnl_rmrks(value);
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
		if ($jnl_no.equalsIgnoreCase(name)) {
			jnl_no(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
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

	public void setStringNE(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			jnl_rmrks(value);
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
		if ($jnl_no.equalsIgnoreCase(name)) {
			jnl_no(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
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

	public MCRow getInnerRow(String name) {
		if ($bp_grp.equalsIgnoreCase(name)) {
			return bp_grp();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($bp_grp.equalsIgnoreCase(name)) {
			bp_grp(
				((MCContainerMeta) bp_grp_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return bp_grp().bp_grp_flg1();
	}

	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		bp_grp().bp_grp_flg1(value);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return bp_grp().bp_grp_cd1();
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		bp_grp().bp_grp_cd1(value);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return bp_grp().bp_grp_nm1();
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		bp_grp().bp_grp_nm1(value);
	}

	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return bp_grp().bp_grp_flg2();
	}

	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		bp_grp().bp_grp_flg2(value);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return bp_grp().bp_grp_cd2();
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		bp_grp().bp_grp_cd2(value);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return bp_grp().bp_grp_nm2();
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		bp_grp().bp_grp_nm2(value);
	}

	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return bp_grp().bp_grp_flg3();
	}

	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		bp_grp().bp_grp_flg3(value);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return bp_grp().bp_grp_cd3();
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		bp_grp().bp_grp_cd3(value);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return bp_grp().bp_grp_nm3();
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		bp_grp().bp_grp_nm3(value);
	}

	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return bp_grp().bp_grp_flg4();
	}

	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		bp_grp().bp_grp_flg4(value);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return bp_grp().bp_grp_cd4();
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		bp_grp().bp_grp_cd4(value);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return bp_grp().bp_grp_nm4();
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		bp_grp().bp_grp_nm4(value);
	}

	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return bp_grp().bp_grp_flg5();
	}

	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		bp_grp().bp_grp_flg5(value);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return bp_grp().bp_grp_cd5();
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		bp_grp().bp_grp_cd5(value);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return bp_grp().bp_grp_nm5();
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		bp_grp().bp_grp_nm5(value);
	}

	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return bp_grp().bp_grp_flg6();
	}

	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		bp_grp().bp_grp_flg6(value);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return bp_grp().bp_grp_cd6();
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		bp_grp().bp_grp_cd6(value);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return bp_grp().bp_grp_nm6();
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		bp_grp().bp_grp_nm6(value);
	}

	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return bp_grp().bp_grp_flg7();
	}

	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		bp_grp().bp_grp_flg7(value);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return bp_grp().bp_grp_cd7();
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		bp_grp().bp_grp_cd7(value);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return bp_grp().bp_grp_nm7();
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		bp_grp().bp_grp_nm7(value);
	}

	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return bp_grp().bp_grp_flg8();
	}

	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		bp_grp().bp_grp_flg8(value);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return bp_grp().bp_grp_cd8();
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		bp_grp().bp_grp_cd8(value);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return bp_grp().bp_grp_nm8();
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		bp_grp().bp_grp_nm8(value);
	}

	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return bp_grp().bp_grp_flg9();
	}

	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		bp_grp().bp_grp_flg9(value);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return bp_grp().bp_grp_cd9();
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		bp_grp().bp_grp_cd9(value);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return bp_grp().bp_grp_nm9();
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		bp_grp().bp_grp_nm9(value);
	}

	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return bp_grp().bp_grp_flg10();
	}

	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		bp_grp().bp_grp_flg10(value);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return bp_grp().bp_grp_cd10();
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		bp_grp().bp_grp_cd10(value);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return bp_grp().bp_grp_nm10();
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		bp_grp().bp_grp_nm10(value);
	}

}

