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
 * ブロック"UsrAcl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class UsrAclR_MC_A extends MCConstRow {

	/**
	 * PIC authority master 担当者権限マスタ.<p>
	 *
	 */
	public static final String $usr = "usr";

	public static final String $usr_cd = $usr + ".usr_cd";
	public static final String $st_dt = $usr + ".st_dt";
	public static final String $end_dt = $usr + ".end_dt";
	public static final String $da_cd = $usr + ".da_cd";
	public static final String $pre_cl_usr_flg = $usr + ".pre_cl_usr_flg";
	public static final String $dpt_cd = $usr + ".dpt_cd";
	public static final String $add_dpt_cd1 = $usr + ".add_dpt_cd1";
	public static final String $add_dpt_cd2 = $usr + ".add_dpt_cd2";
	public static final String $add_dpt_cd3 = $usr + ".add_dpt_cd3";
	public static final String $add_dpt_cd4 = $usr + ".add_dpt_cd4";
	public static final String $add_dpt_cd5 = $usr + ".add_dpt_cd5";
	public static final String $add_dpt_cd6 = $usr + ".add_dpt_cd6";
	public static final String $add_dpt_cd7 = $usr + ".add_dpt_cd7";
	public static final String $add_dpt_cd8 = $usr + ".add_dpt_cd8";
	public static final String $add_dpt_cd9 = $usr + ".add_dpt_cd9";
	public static final String $aprv_role_cd = $usr + ".aprv_role_cd";
	public static final String $aprv_role_cd1 = $usr + ".aprv_role_cd1";
	public static final String $aprv_role_cd2 = $usr + ".aprv_role_cd2";
	public static final String $aprv_role_cd3 = $usr + ".aprv_role_cd3";
	public static final String $aprv_role_cd4 = $usr + ".aprv_role_cd4";
	public static final String $aprv_role_cd5 = $usr + ".aprv_role_cd5";
	public static final String $aprv_role_cd6 = $usr + ".aprv_role_cd6";
	public static final String $aprv_role_cd7 = $usr + ".aprv_role_cd7";
	public static final String $aprv_role_cd8 = $usr + ".aprv_role_cd8";
	public static final String $aprv_role_cd9 = $usr + ".aprv_role_cd9";
	public static final String $sub_aprv_role_cd = $usr + ".sub_aprv_role_cd";
	public static final String $sub_aprv_role_cd1 = $usr + ".sub_aprv_role_cd1";
	public static final String $sub_aprv_role_cd2 = $usr + ".sub_aprv_role_cd2";
	public static final String $sub_aprv_role_cd3 = $usr + ".sub_aprv_role_cd3";
	public static final String $sub_aprv_role_cd4 = $usr + ".sub_aprv_role_cd4";
	public static final String $sub_aprv_role_cd5 = $usr + ".sub_aprv_role_cd5";
	public static final String $sub_aprv_role_cd6 = $usr + ".sub_aprv_role_cd6";
	public static final String $sub_aprv_role_cd7 = $usr + ".sub_aprv_role_cd7";
	public static final String $sub_aprv_role_cd8 = $usr + ".sub_aprv_role_cd8";
	public static final String $sub_aprv_role_cd9 = $usr + ".sub_aprv_role_cd9";
	public static final String $cl_usr_flg = $usr + ".cl_usr_flg";

	public static final MCMeta usr_META = createInnerRowMeta($usr, mcframe.serverMA.dbc.MAM_USR_ACL_R.class);

	protected static final ConstMetaList<UsrAclR> constMetas = new ConstMetaList<UsrAclR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			usr_META
		},
		new String[][]{
			{
				"usr_cd",
				"st_dt",
				"end_dt",
				"da_cd",
				"pre_cl_usr_flg",
				"dpt_cd",
				"add_dpt_cd1",
				"add_dpt_cd2",
				"add_dpt_cd3",
				"add_dpt_cd4",
				"add_dpt_cd5",
				"add_dpt_cd6",
				"add_dpt_cd7",
				"add_dpt_cd8",
				"add_dpt_cd9",
				"aprv_role_cd",
				"aprv_role_cd1",
				"aprv_role_cd2",
				"aprv_role_cd3",
				"aprv_role_cd4",
				"aprv_role_cd5",
				"aprv_role_cd6",
				"aprv_role_cd7",
				"aprv_role_cd8",
				"aprv_role_cd9",
				"sub_aprv_role_cd",
				"sub_aprv_role_cd1",
				"sub_aprv_role_cd2",
				"sub_aprv_role_cd3",
				"sub_aprv_role_cd4",
				"sub_aprv_role_cd5",
				"sub_aprv_role_cd6",
				"sub_aprv_role_cd7",
				"sub_aprv_role_cd8",
				"sub_aprv_role_cd9",
				"cl_usr_flg"
			},
			{
				$usr_cd,
				$st_dt,
				$end_dt,
				$da_cd,
				$pre_cl_usr_flg,
				$dpt_cd,
				$add_dpt_cd1,
				$add_dpt_cd2,
				$add_dpt_cd3,
				$add_dpt_cd4,
				$add_dpt_cd5,
				$add_dpt_cd6,
				$add_dpt_cd7,
				$add_dpt_cd8,
				$add_dpt_cd9,
				$aprv_role_cd,
				$aprv_role_cd1,
				$aprv_role_cd2,
				$aprv_role_cd3,
				$aprv_role_cd4,
				$aprv_role_cd5,
				$aprv_role_cd6,
				$aprv_role_cd7,
				$aprv_role_cd8,
				$aprv_role_cd9,
				$sub_aprv_role_cd,
				$sub_aprv_role_cd1,
				$sub_aprv_role_cd2,
				$sub_aprv_role_cd3,
				$sub_aprv_role_cd4,
				$sub_aprv_role_cd5,
				$sub_aprv_role_cd6,
				$sub_aprv_role_cd7,
				$sub_aprv_role_cd8,
				$sub_aprv_role_cd9,
				$cl_usr_flg
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * PIC authority master 担当者権限マスタ.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_USR_ACL_R usr(){
		return (mcframe.serverMA.dbc.MAM_USR_ACL_R) getConstInnerRow(offset + 0, $usr);
	}
	
	/**
	 * PIC authority master 担当者権限マスタ.<p>
	 *
	 */
	public void usr(mcframe.serverMA.dbc.MAM_USR_ACL_R row){
		setConstInnerRow(offset + 0, $usr, row);
	}






	public MCRow getInnerRow(String name) {
		if ($usr.equalsIgnoreCase(name)) {
			return usr();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($usr.equalsIgnoreCase(name)) {
			usr(
				((MCContainerMeta) usr_META).castInnerRow(mcframe.serverMA.dbc.MAM_USR_ACL_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return usr().usr_cd();
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		usr().usr_cd(value);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return usr().st_dt();
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		usr().st_dt(value);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return usr().end_dt();
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		usr().end_dt(value);
	}

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public String da_cd() {
		return usr().da_cd();
	}

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public void da_cd(String value) {
		usr().da_cd(value);
	}

	/**
	 * Allow data correction after temporary closing flg. 仮締訂正可能ＦＬＧ.<p>
	 *
	 */
	public boolean pre_cl_usr_flg() {
		return usr().pre_cl_usr_flg();
	}

	/**
	 * Allow data correction after temporary closing flg. 仮締訂正可能ＦＬＧ.<p>
	 *
	 */
	public void pre_cl_usr_flg(boolean value) {
		usr().pre_cl_usr_flg(value);
	}

	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return usr().dpt_cd();
	}

	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		usr().dpt_cd(value);
	}

	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public String add_dpt_cd1() {
		return usr().add_dpt_cd1();
	}

	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public void add_dpt_cd1(String value) {
		usr().add_dpt_cd1(value);
	}

	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public String add_dpt_cd2() {
		return usr().add_dpt_cd2();
	}

	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public void add_dpt_cd2(String value) {
		usr().add_dpt_cd2(value);
	}

	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public String add_dpt_cd3() {
		return usr().add_dpt_cd3();
	}

	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public void add_dpt_cd3(String value) {
		usr().add_dpt_cd3(value);
	}

	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public String add_dpt_cd4() {
		return usr().add_dpt_cd4();
	}

	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public void add_dpt_cd4(String value) {
		usr().add_dpt_cd4(value);
	}

	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public String add_dpt_cd5() {
		return usr().add_dpt_cd5();
	}

	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public void add_dpt_cd5(String value) {
		usr().add_dpt_cd5(value);
	}

	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public String add_dpt_cd6() {
		return usr().add_dpt_cd6();
	}

	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public void add_dpt_cd6(String value) {
		usr().add_dpt_cd6(value);
	}

	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public String add_dpt_cd7() {
		return usr().add_dpt_cd7();
	}

	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public void add_dpt_cd7(String value) {
		usr().add_dpt_cd7(value);
	}

	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public String add_dpt_cd8() {
		return usr().add_dpt_cd8();
	}

	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public void add_dpt_cd8(String value) {
		usr().add_dpt_cd8(value);
	}

	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public String add_dpt_cd9() {
		return usr().add_dpt_cd9();
	}

	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public void add_dpt_cd9(String value) {
		usr().add_dpt_cd9(value);
	}

	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public String aprv_role_cd() {
		return usr().aprv_role_cd();
	}

	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		usr().aprv_role_cd(value);
	}

	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public String aprv_role_cd1() {
		return usr().aprv_role_cd1();
	}

	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public void aprv_role_cd1(String value) {
		usr().aprv_role_cd1(value);
	}

	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public String aprv_role_cd2() {
		return usr().aprv_role_cd2();
	}

	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public void aprv_role_cd2(String value) {
		usr().aprv_role_cd2(value);
	}

	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public String aprv_role_cd3() {
		return usr().aprv_role_cd3();
	}

	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public void aprv_role_cd3(String value) {
		usr().aprv_role_cd3(value);
	}

	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public String aprv_role_cd4() {
		return usr().aprv_role_cd4();
	}

	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public void aprv_role_cd4(String value) {
		usr().aprv_role_cd4(value);
	}

	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public String aprv_role_cd5() {
		return usr().aprv_role_cd5();
	}

	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public void aprv_role_cd5(String value) {
		usr().aprv_role_cd5(value);
	}

	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public String aprv_role_cd6() {
		return usr().aprv_role_cd6();
	}

	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public void aprv_role_cd6(String value) {
		usr().aprv_role_cd6(value);
	}

	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public String aprv_role_cd7() {
		return usr().aprv_role_cd7();
	}

	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public void aprv_role_cd7(String value) {
		usr().aprv_role_cd7(value);
	}

	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public String aprv_role_cd8() {
		return usr().aprv_role_cd8();
	}

	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public void aprv_role_cd8(String value) {
		usr().aprv_role_cd8(value);
	}

	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public String aprv_role_cd9() {
		return usr().aprv_role_cd9();
	}

	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public void aprv_role_cd9(String value) {
		usr().aprv_role_cd9(value);
	}

	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd() {
		return usr().sub_aprv_role_cd();
	}

	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd(String value) {
		usr().sub_aprv_role_cd(value);
	}

	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd1() {
		return usr().sub_aprv_role_cd1();
	}

	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd1(String value) {
		usr().sub_aprv_role_cd1(value);
	}

	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd2() {
		return usr().sub_aprv_role_cd2();
	}

	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd2(String value) {
		usr().sub_aprv_role_cd2(value);
	}

	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd3() {
		return usr().sub_aprv_role_cd3();
	}

	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd3(String value) {
		usr().sub_aprv_role_cd3(value);
	}

	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd4() {
		return usr().sub_aprv_role_cd4();
	}

	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd4(String value) {
		usr().sub_aprv_role_cd4(value);
	}

	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd5() {
		return usr().sub_aprv_role_cd5();
	}

	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd5(String value) {
		usr().sub_aprv_role_cd5(value);
	}

	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd6() {
		return usr().sub_aprv_role_cd6();
	}

	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd6(String value) {
		usr().sub_aprv_role_cd6(value);
	}

	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd7() {
		return usr().sub_aprv_role_cd7();
	}

	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd7(String value) {
		usr().sub_aprv_role_cd7(value);
	}

	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd8() {
		return usr().sub_aprv_role_cd8();
	}

	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd8(String value) {
		usr().sub_aprv_role_cd8(value);
	}

	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd9() {
		return usr().sub_aprv_role_cd9();
	}

	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd9(String value) {
		usr().sub_aprv_role_cd9(value);
	}

	/**
	 * Allow data correction after final closing flg. 本締訂正可能ＦＬＧ.<p>
	 *
	 */
	public boolean cl_usr_flg() {
		return usr().cl_usr_flg();
	}

	/**
	 * Allow data correction after final closing flg. 本締訂正可能ＦＬＧ.<p>
	 *
	 */
	public void cl_usr_flg(boolean value) {
		usr().cl_usr_flg(value);
	}

}

