package mcframe.serverMGBD.MGBDL5010;

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
 * ブロック"Ins02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Ins02_CndR_MC_A extends MCConstRow {

	public static final String $arg = "arg";
	/**
	 * Process type 処理区分.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	/**
	 * SQL No. ＳＱＬＮＯ.<p>
	 *
	 */
	public static final String $sql_no = "sql_no";
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public static final String $rpt_ptn_cd = "rpt_ptn_cd";
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public static final String $rpt_key_cd = "rpt_key_cd";
	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public static final String $cost_io_id = "cost_io_id";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public static final String $itm_grp_typ = "itm_grp_typ";
	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public static final String $itm_grp_cd = "itm_grp_cd";

	public static final String $calc_grp_cd = $arg + ".calc_grp_cd";
	public static final String $calc_no = $arg + ".calc_no";
	public static final String $st_ym = $arg + ".st_ym";
	public static final String $end_ym = $arg + ".end_ym";

	public static final MCMeta arg_META = createInnerRowMeta($arg, mcframe.serverMG.dbc.MGT_ARG_R.class);
	public static final MCMeta proc_typ_META = createStringMeta($proc_typ, 20);
	public static final MCMeta sql_no_META = createNumberMeta($sql_no, 3, 0, false);
	public static final MCMeta rpt_ptn_cd_META = createCommonMeta($rpt_ptn_cd, mcframe.commonMA.meta.MA_META.RPT_PTN_CD);
	public static final MCMeta rpt_key_cd_META = createCommonMeta($rpt_key_cd, mcframe.commonMA.meta.MA_META.RPT_KEY_CD);
	public static final MCMeta cost_io_id_META = createCommonMeta($cost_io_id, mcframe.commonMA.meta.MA_META.COST_IO_ID);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_grp_typ_META = createCommonMeta($itm_grp_typ, mcframe.commonMA.meta.MA_META.ITM_GRP_TYP);
	public static final MCMeta itm_grp_cd_META = createCommonMeta($itm_grp_cd, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);

	protected static final ConstMetaList<Ins02_CndR> constMetas = new ConstMetaList<Ins02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			arg_META,
			proc_typ_META,
			sql_no_META,
			rpt_ptn_cd_META,
			rpt_key_cd_META,
			cost_io_id_META,
			wg_cd_META,
			dpt_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_jnl_cd_META,
			itm_grp_typ_META,
			itm_grp_cd_META
		},
		new String[][]{
			{
				"calc_grp_cd",
				"calc_no",
				"st_ym",
				"end_ym"
			},
			{
				$calc_grp_cd,
				$calc_no,
				$st_ym,
				$end_ym
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
	protected Ins02_CndR_MC_A(ConstMetaList<? extends Ins02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins02_CndR clone() {
		return (Ins02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins02_CndR createInstance() {
		return (Ins02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins02_CndR getValues(String... names) {
		return (Ins02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMG.dbc.MGT_ARG_R arg(){
		return (mcframe.serverMG.dbc.MGT_ARG_R) getConstInnerRow(offset + 0, $arg);
	}
	
	public void arg(mcframe.serverMG.dbc.MGT_ARG_R row){
		setConstInnerRow(offset + 0, $arg, row);
	}


	/**
	 * Process type 処理区分.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 1, $proc_typ);
	}

	/**
	 * Process type 処理区分.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 1, $proc_typ, value);
	}


	/**
	 * SQL No. ＳＱＬＮＯ.<p>
	 *
	 */
	public MCNumber sql_no() {
		return getConstNumber(offset + 2, $sql_no);
	}

	/**
	 * SQL No. ＳＱＬＮＯ.<p>
	 *
	 */
	public void sql_no(MCNumber value) {
		setConstNumber(offset + 2, $sql_no, value);
	}

	/**
	 * SQL No. ＳＱＬＮＯ.<p>
	 *
	 */
	public void sql_no(int value) {
		setConstNumber(offset + 2, $sql_no, value);
	}

	/**
	 * SQL No. ＳＱＬＮＯ.<p>
	 *
	 */
	public void sql_no(long value) {
		setConstNumber(offset + 2, $sql_no, value);
	}

	/**
	 * SQL No. ＳＱＬＮＯ.<p>
	 *
	 */
	public void sql_no(float value) {
		setConstNumber(offset + 2, $sql_no, value);
	}

	/**
	 * SQL No. ＳＱＬＮＯ.<p>
	 *
	 */
	public void sql_no(double value) {
		setConstNumber(offset + 2, $sql_no, value);
	}


	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public String rpt_ptn_cd() {
		return getConstString(offset + 3, $rpt_ptn_cd);
	}

	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public void rpt_ptn_cd(String value) {
		setConstString(offset + 3, $rpt_ptn_cd, value);
	}


	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public String rpt_key_cd() {
		return getConstString(offset + 4, $rpt_key_cd);
	}

	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public void rpt_key_cd(String value) {
		setConstString(offset + 4, $rpt_key_cd, value);
	}


	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public MCNumber cost_io_id() {
		return getConstNumber(offset + 5, $cost_io_id);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(MCNumber value) {
		setConstNumber(offset + 5, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(int value) {
		setConstNumber(offset + 5, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(long value) {
		setConstNumber(offset + 5, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(float value) {
		setConstNumber(offset + 5, $cost_io_id, value);
	}

	/**
	 * GR/GI list ID 受払表ＩＤ.<p>
	 *
	 */
	public void cost_io_id(double value) {
		setConstNumber(offset + 5, $cost_io_id, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 7, $dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 7, $dpt_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 12, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 12, $itm_jnl_cd, value);
	}


	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public String itm_grp_typ() {
		return getConstString(offset + 13, $itm_grp_typ);
	}

	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public void itm_grp_typ(String value) {
		setConstString(offset + 13, $itm_grp_typ, value);
	}


	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public String itm_grp_cd() {
		return getConstString(offset + 14, $itm_grp_cd);
	}

	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public void itm_grp_cd(String value) {
		setConstString(offset + 14, $itm_grp_cd, value);
	}


	public String getString(String name) {
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			return rpt_key_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sql_no.equalsIgnoreCase(name)) {
			return sql_no();
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			return rpt_key_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sql_no.equalsIgnoreCase(name)) {
			return sql_no();
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			rpt_key_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			rpt_key_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sql_no.equalsIgnoreCase(name)) {
			sql_no(value);
			return;
		}
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($arg.equalsIgnoreCase(name)) {
			return arg();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($arg.equalsIgnoreCase(name)) {
			arg(
				((MCContainerMeta) arg_META).castInnerRow(mcframe.serverMG.dbc.MGT_ARG_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return arg().calc_grp_cd();
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		arg().calc_grp_cd(value);
	}

	/**
	 * Calculation No. 計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return arg().calc_no();
	}

	/**
	 * Calculation No. 計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		arg().calc_no(value);
	}

	/**
	 * Term start month 対象期間開始年月.<p>
	 *
	 */
	public MCDate st_ym() {
		return arg().st_ym();
	}

	/**
	 * Term start month 対象期間開始年月.<p>
	 *
	 */
	public void st_ym(MCDate value) {
		arg().st_ym(value);
	}

	/**
	 * End month of the term 対象期間終了年月.<p>
	 *
	 */
	public MCDate end_ym() {
		return arg().end_ym();
	}

	/**
	 * End month of the term 対象期間終了年月.<p>
	 *
	 */
	public void end_ym(MCDate value) {
		arg().end_ym(value);
	}

}

