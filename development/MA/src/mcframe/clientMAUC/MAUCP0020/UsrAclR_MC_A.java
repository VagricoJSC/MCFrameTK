package mcframe.clientMAUC.MAUCP0020;

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
 * ブロック"UsrAcl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class UsrAclR_MC_A extends MCConstRow {

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public static final String $da_cd = "da_cd";
	/**
	 * Allow data correction after temporary closing flg. 仮締訂正可能ＦＬＧ.<p>
	 *
	 */
	public static final String $pre_cl_usr_flg = "pre_cl_usr_flg";
	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public static final String $add_dpt_cd1 = "add_dpt_cd1";
	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public static final String $add_dpt_cd2 = "add_dpt_cd2";
	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public static final String $add_dpt_cd3 = "add_dpt_cd3";
	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public static final String $add_dpt_cd4 = "add_dpt_cd4";
	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public static final String $add_dpt_cd5 = "add_dpt_cd5";
	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public static final String $add_dpt_cd6 = "add_dpt_cd6";
	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public static final String $add_dpt_cd7 = "add_dpt_cd7";
	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public static final String $add_dpt_cd8 = "add_dpt_cd8";
	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public static final String $add_dpt_cd9 = "add_dpt_cd9";
	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd1 = "aprv_role_cd1";
	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd2 = "aprv_role_cd2";
	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd3 = "aprv_role_cd3";
	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd4 = "aprv_role_cd4";
	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd5 = "aprv_role_cd5";
	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd6 = "aprv_role_cd6";
	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd7 = "aprv_role_cd7";
	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd8 = "aprv_role_cd8";
	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd9 = "aprv_role_cd9";
	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd = "sub_aprv_role_cd";
	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd1 = "sub_aprv_role_cd1";
	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd2 = "sub_aprv_role_cd2";
	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd3 = "sub_aprv_role_cd3";
	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd4 = "sub_aprv_role_cd4";
	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd5 = "sub_aprv_role_cd5";
	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd6 = "sub_aprv_role_cd6";
	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd7 = "sub_aprv_role_cd7";
	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd8 = "sub_aprv_role_cd8";
	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd9 = "sub_aprv_role_cd9";
	/**
	 * Allow data correction after final closing flg. 本締訂正可能ＦＬＧ.<p>
	 *
	 */
	public static final String $cl_usr_flg = "cl_usr_flg";


	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta da_cd_META = createCommonMeta($da_cd, mcframe.commonMA.meta.MA_META.DA_CD);
	public static final MCMeta pre_cl_usr_flg_META = createCommonMeta($pre_cl_usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd1_META = createCommonMeta($add_dpt_cd1, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd2_META = createCommonMeta($add_dpt_cd2, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd3_META = createCommonMeta($add_dpt_cd3, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd4_META = createCommonMeta($add_dpt_cd4, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd5_META = createCommonMeta($add_dpt_cd5, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd6_META = createCommonMeta($add_dpt_cd6, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd7_META = createCommonMeta($add_dpt_cd7, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd8_META = createCommonMeta($add_dpt_cd8, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_cd9_META = createCommonMeta($add_dpt_cd9, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd1_META = createCommonMeta($aprv_role_cd1, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd2_META = createCommonMeta($aprv_role_cd2, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd3_META = createCommonMeta($aprv_role_cd3, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd4_META = createCommonMeta($aprv_role_cd4, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd5_META = createCommonMeta($aprv_role_cd5, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd6_META = createCommonMeta($aprv_role_cd6, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd7_META = createCommonMeta($aprv_role_cd7, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd8_META = createCommonMeta($aprv_role_cd8, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_cd9_META = createCommonMeta($aprv_role_cd9, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd_META = createCommonMeta($sub_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd1_META = createCommonMeta($sub_aprv_role_cd1, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd2_META = createCommonMeta($sub_aprv_role_cd2, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd3_META = createCommonMeta($sub_aprv_role_cd3, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd4_META = createCommonMeta($sub_aprv_role_cd4, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd5_META = createCommonMeta($sub_aprv_role_cd5, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd6_META = createCommonMeta($sub_aprv_role_cd6, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd7_META = createCommonMeta($sub_aprv_role_cd7, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd8_META = createCommonMeta($sub_aprv_role_cd8, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_cd9_META = createCommonMeta($sub_aprv_role_cd9, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta cl_usr_flg_META = createCommonMeta($cl_usr_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<UsrAclR> constMetas = new ConstMetaList<UsrAclR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			usr_cd_META,
			st_dt_META,
			end_dt_META,
			da_cd_META,
			pre_cl_usr_flg_META,
			dpt_cd_META,
			add_dpt_cd1_META,
			add_dpt_cd2_META,
			add_dpt_cd3_META,
			add_dpt_cd4_META,
			add_dpt_cd5_META,
			add_dpt_cd6_META,
			add_dpt_cd7_META,
			add_dpt_cd8_META,
			add_dpt_cd9_META,
			aprv_role_cd_META,
			aprv_role_cd1_META,
			aprv_role_cd2_META,
			aprv_role_cd3_META,
			aprv_role_cd4_META,
			aprv_role_cd5_META,
			aprv_role_cd6_META,
			aprv_role_cd7_META,
			aprv_role_cd8_META,
			aprv_role_cd9_META,
			sub_aprv_role_cd_META,
			sub_aprv_role_cd1_META,
			sub_aprv_role_cd2_META,
			sub_aprv_role_cd3_META,
			sub_aprv_role_cd4_META,
			sub_aprv_role_cd5_META,
			sub_aprv_role_cd6_META,
			sub_aprv_role_cd7_META,
			sub_aprv_role_cd8_META,
			sub_aprv_role_cd9_META,
			cl_usr_flg_META
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
	protected UsrAclR_MC_A(ConstMetaList<? extends UsrAclR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UsrAclR clone() {
		return (UsrAclR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UsrAclR createInstance() {
		return (UsrAclR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UsrAclR getValues(String... names) {
		return (UsrAclR) super.getValues(names);
	}



	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 0, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 0, $usr_cd, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 1, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 1, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 2, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 2, $end_dt, value);
	}


	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public String da_cd() {
		return getConstString(offset + 3, $da_cd);
	}

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public void da_cd(String value) {
		setConstString(offset + 3, $da_cd, value);
	}


	/**
	 * Allow data correction after temporary closing flg. 仮締訂正可能ＦＬＧ.<p>
	 *
	 */
	public boolean pre_cl_usr_flg() {
		return getConstBoolean(offset + 4, $pre_cl_usr_flg);
	}

	/**
	 * Allow data correction after temporary closing flg. 仮締訂正可能ＦＬＧ.<p>
	 *
	 */
	public void pre_cl_usr_flg(boolean value) {
		setConstBoolean(offset + 4, $pre_cl_usr_flg, value);
	}


	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
	}


	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public String add_dpt_cd1() {
		return getConstString(offset + 6, $add_dpt_cd1);
	}

	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public void add_dpt_cd1(String value) {
		setConstString(offset + 6, $add_dpt_cd1, value);
	}


	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public String add_dpt_cd2() {
		return getConstString(offset + 7, $add_dpt_cd2);
	}

	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public void add_dpt_cd2(String value) {
		setConstString(offset + 7, $add_dpt_cd2, value);
	}


	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public String add_dpt_cd3() {
		return getConstString(offset + 8, $add_dpt_cd3);
	}

	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public void add_dpt_cd3(String value) {
		setConstString(offset + 8, $add_dpt_cd3, value);
	}


	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public String add_dpt_cd4() {
		return getConstString(offset + 9, $add_dpt_cd4);
	}

	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public void add_dpt_cd4(String value) {
		setConstString(offset + 9, $add_dpt_cd4, value);
	}


	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public String add_dpt_cd5() {
		return getConstString(offset + 10, $add_dpt_cd5);
	}

	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public void add_dpt_cd5(String value) {
		setConstString(offset + 10, $add_dpt_cd5, value);
	}


	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public String add_dpt_cd6() {
		return getConstString(offset + 11, $add_dpt_cd6);
	}

	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public void add_dpt_cd6(String value) {
		setConstString(offset + 11, $add_dpt_cd6, value);
	}


	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public String add_dpt_cd7() {
		return getConstString(offset + 12, $add_dpt_cd7);
	}

	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public void add_dpt_cd7(String value) {
		setConstString(offset + 12, $add_dpt_cd7, value);
	}


	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public String add_dpt_cd8() {
		return getConstString(offset + 13, $add_dpt_cd8);
	}

	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public void add_dpt_cd8(String value) {
		setConstString(offset + 13, $add_dpt_cd8, value);
	}


	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public String add_dpt_cd9() {
		return getConstString(offset + 14, $add_dpt_cd9);
	}

	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public void add_dpt_cd9(String value) {
		setConstString(offset + 14, $add_dpt_cd9, value);
	}


	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 15, $aprv_role_cd);
	}

	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 15, $aprv_role_cd, value);
	}


	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public String aprv_role_cd1() {
		return getConstString(offset + 16, $aprv_role_cd1);
	}

	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public void aprv_role_cd1(String value) {
		setConstString(offset + 16, $aprv_role_cd1, value);
	}


	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public String aprv_role_cd2() {
		return getConstString(offset + 17, $aprv_role_cd2);
	}

	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public void aprv_role_cd2(String value) {
		setConstString(offset + 17, $aprv_role_cd2, value);
	}


	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public String aprv_role_cd3() {
		return getConstString(offset + 18, $aprv_role_cd3);
	}

	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public void aprv_role_cd3(String value) {
		setConstString(offset + 18, $aprv_role_cd3, value);
	}


	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public String aprv_role_cd4() {
		return getConstString(offset + 19, $aprv_role_cd4);
	}

	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public void aprv_role_cd4(String value) {
		setConstString(offset + 19, $aprv_role_cd4, value);
	}


	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public String aprv_role_cd5() {
		return getConstString(offset + 20, $aprv_role_cd5);
	}

	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public void aprv_role_cd5(String value) {
		setConstString(offset + 20, $aprv_role_cd5, value);
	}


	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public String aprv_role_cd6() {
		return getConstString(offset + 21, $aprv_role_cd6);
	}

	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public void aprv_role_cd6(String value) {
		setConstString(offset + 21, $aprv_role_cd6, value);
	}


	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public String aprv_role_cd7() {
		return getConstString(offset + 22, $aprv_role_cd7);
	}

	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public void aprv_role_cd7(String value) {
		setConstString(offset + 22, $aprv_role_cd7, value);
	}


	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public String aprv_role_cd8() {
		return getConstString(offset + 23, $aprv_role_cd8);
	}

	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public void aprv_role_cd8(String value) {
		setConstString(offset + 23, $aprv_role_cd8, value);
	}


	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public String aprv_role_cd9() {
		return getConstString(offset + 24, $aprv_role_cd9);
	}

	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public void aprv_role_cd9(String value) {
		setConstString(offset + 24, $aprv_role_cd9, value);
	}


	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd() {
		return getConstString(offset + 25, $sub_aprv_role_cd);
	}

	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd(String value) {
		setConstString(offset + 25, $sub_aprv_role_cd, value);
	}


	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd1() {
		return getConstString(offset + 26, $sub_aprv_role_cd1);
	}

	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd1(String value) {
		setConstString(offset + 26, $sub_aprv_role_cd1, value);
	}


	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd2() {
		return getConstString(offset + 27, $sub_aprv_role_cd2);
	}

	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd2(String value) {
		setConstString(offset + 27, $sub_aprv_role_cd2, value);
	}


	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd3() {
		return getConstString(offset + 28, $sub_aprv_role_cd3);
	}

	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd3(String value) {
		setConstString(offset + 28, $sub_aprv_role_cd3, value);
	}


	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd4() {
		return getConstString(offset + 29, $sub_aprv_role_cd4);
	}

	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd4(String value) {
		setConstString(offset + 29, $sub_aprv_role_cd4, value);
	}


	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd5() {
		return getConstString(offset + 30, $sub_aprv_role_cd5);
	}

	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd5(String value) {
		setConstString(offset + 30, $sub_aprv_role_cd5, value);
	}


	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd6() {
		return getConstString(offset + 31, $sub_aprv_role_cd6);
	}

	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd6(String value) {
		setConstString(offset + 31, $sub_aprv_role_cd6, value);
	}


	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd7() {
		return getConstString(offset + 32, $sub_aprv_role_cd7);
	}

	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd7(String value) {
		setConstString(offset + 32, $sub_aprv_role_cd7, value);
	}


	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd8() {
		return getConstString(offset + 33, $sub_aprv_role_cd8);
	}

	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd8(String value) {
		setConstString(offset + 33, $sub_aprv_role_cd8, value);
	}


	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd9() {
		return getConstString(offset + 34, $sub_aprv_role_cd9);
	}

	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd9(String value) {
		setConstString(offset + 34, $sub_aprv_role_cd9, value);
	}


	/**
	 * Allow data correction after final closing flg. 本締訂正可能ＦＬＧ.<p>
	 *
	 */
	public boolean cl_usr_flg() {
		return getConstBoolean(offset + 35, $cl_usr_flg);
	}

	/**
	 * Allow data correction after final closing flg. 本締訂正可能ＦＬＧ.<p>
	 *
	 */
	public void cl_usr_flg(boolean value) {
		setConstBoolean(offset + 35, $cl_usr_flg, value);
	}


	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			return add_dpt_cd1();
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			return add_dpt_cd2();
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			return add_dpt_cd3();
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			return add_dpt_cd4();
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			return add_dpt_cd5();
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			return add_dpt_cd6();
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			return add_dpt_cd7();
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			return add_dpt_cd8();
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			return add_dpt_cd9();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			return aprv_role_cd1();
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			return aprv_role_cd2();
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			return aprv_role_cd3();
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			return aprv_role_cd4();
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			return aprv_role_cd5();
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			return aprv_role_cd6();
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			return aprv_role_cd7();
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			return aprv_role_cd8();
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			return aprv_role_cd9();
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd();
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd1();
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd2();
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd3();
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd4();
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd5();
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd6();
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd7();
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd8();
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd9();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			return pre_cl_usr_flg();
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			return cl_usr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			return add_dpt_cd1();
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			return add_dpt_cd2();
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			return add_dpt_cd3();
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			return add_dpt_cd4();
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			return add_dpt_cd5();
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			return add_dpt_cd6();
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			return add_dpt_cd7();
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			return add_dpt_cd8();
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			return add_dpt_cd9();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			return aprv_role_cd1();
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			return aprv_role_cd2();
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			return aprv_role_cd3();
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			return aprv_role_cd4();
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			return aprv_role_cd5();
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			return aprv_role_cd6();
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			return aprv_role_cd7();
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			return aprv_role_cd8();
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			return aprv_role_cd9();
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd();
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd1();
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd2();
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd3();
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd4();
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd5();
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd6();
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd7();
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd8();
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd9();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			return pre_cl_usr_flg();
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			return cl_usr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			add_dpt_cd1(value);
			return;
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			add_dpt_cd2(value);
			return;
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			add_dpt_cd3(value);
			return;
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			add_dpt_cd4(value);
			return;
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			add_dpt_cd5(value);
			return;
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			add_dpt_cd6(value);
			return;
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			add_dpt_cd7(value);
			return;
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			add_dpt_cd8(value);
			return;
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			add_dpt_cd9(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			aprv_role_cd1(value);
			return;
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			aprv_role_cd2(value);
			return;
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			aprv_role_cd3(value);
			return;
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			aprv_role_cd4(value);
			return;
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			aprv_role_cd5(value);
			return;
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			aprv_role_cd6(value);
			return;
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			aprv_role_cd7(value);
			return;
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			aprv_role_cd8(value);
			return;
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			aprv_role_cd9(value);
			return;
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			sub_aprv_role_cd(value);
			return;
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			sub_aprv_role_cd1(value);
			return;
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			sub_aprv_role_cd2(value);
			return;
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			sub_aprv_role_cd3(value);
			return;
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			sub_aprv_role_cd4(value);
			return;
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			sub_aprv_role_cd5(value);
			return;
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			sub_aprv_role_cd6(value);
			return;
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			sub_aprv_role_cd7(value);
			return;
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			sub_aprv_role_cd8(value);
			return;
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			sub_aprv_role_cd9(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			pre_cl_usr_flg(value);
			return;
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			cl_usr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			add_dpt_cd1(value);
			return;
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			add_dpt_cd2(value);
			return;
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			add_dpt_cd3(value);
			return;
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			add_dpt_cd4(value);
			return;
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			add_dpt_cd5(value);
			return;
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			add_dpt_cd6(value);
			return;
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			add_dpt_cd7(value);
			return;
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			add_dpt_cd8(value);
			return;
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			add_dpt_cd9(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			aprv_role_cd1(value);
			return;
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			aprv_role_cd2(value);
			return;
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			aprv_role_cd3(value);
			return;
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			aprv_role_cd4(value);
			return;
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			aprv_role_cd5(value);
			return;
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			aprv_role_cd6(value);
			return;
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			aprv_role_cd7(value);
			return;
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			aprv_role_cd8(value);
			return;
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			aprv_role_cd9(value);
			return;
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			sub_aprv_role_cd(value);
			return;
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			sub_aprv_role_cd1(value);
			return;
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			sub_aprv_role_cd2(value);
			return;
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			sub_aprv_role_cd3(value);
			return;
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			sub_aprv_role_cd4(value);
			return;
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			sub_aprv_role_cd5(value);
			return;
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			sub_aprv_role_cd6(value);
			return;
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			sub_aprv_role_cd7(value);
			return;
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			sub_aprv_role_cd8(value);
			return;
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			sub_aprv_role_cd9(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			pre_cl_usr_flg(value);
			return;
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			cl_usr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

