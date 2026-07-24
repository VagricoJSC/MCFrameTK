package mcframe.clientMAUA.MAUAP1030;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public static final String $usr_alt_nm1 = "usr_alt_nm1";
	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public static final String $usr_alt_nm2 = "usr_alt_nm2";
	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public static final String $usr_alt_nm3 = "usr_alt_nm3";
	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public static final String $usr_alt_nm4 = "usr_alt_nm4";
	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public static final String $add_dpt_cd1 = "add_dpt_cd1";
	/**
	 * Concurrent dept. name 1 兼務部門名１.<p>
	 *
	 */
	public static final String $add_dpt_nm1 = "add_dpt_nm1";
	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public static final String $add_dpt_cd2 = "add_dpt_cd2";
	/**
	 * Concurrent dept. name 2 兼務部門名２.<p>
	 *
	 */
	public static final String $add_dpt_nm2 = "add_dpt_nm2";
	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public static final String $add_dpt_cd3 = "add_dpt_cd3";
	/**
	 * Concurrent dept. name 3 兼務部門名３.<p>
	 *
	 */
	public static final String $add_dpt_nm3 = "add_dpt_nm3";
	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public static final String $add_dpt_cd4 = "add_dpt_cd4";
	/**
	 * Concurrent dept. name 4 兼務部門名４.<p>
	 *
	 */
	public static final String $add_dpt_nm4 = "add_dpt_nm4";
	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public static final String $add_dpt_cd5 = "add_dpt_cd5";
	/**
	 * Concurrent dept. name 5 兼務部門名５.<p>
	 *
	 */
	public static final String $add_dpt_nm5 = "add_dpt_nm5";
	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public static final String $add_dpt_cd6 = "add_dpt_cd6";
	/**
	 * Concurrent dept. name 6 兼務部門名６.<p>
	 *
	 */
	public static final String $add_dpt_nm6 = "add_dpt_nm6";
	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public static final String $add_dpt_cd7 = "add_dpt_cd7";
	/**
	 * Concurrent dept. name 7 兼務部門名７.<p>
	 *
	 */
	public static final String $add_dpt_nm7 = "add_dpt_nm7";
	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public static final String $add_dpt_cd8 = "add_dpt_cd8";
	/**
	 * Concurrent dept. name 8 兼務部門名８.<p>
	 *
	 */
	public static final String $add_dpt_nm8 = "add_dpt_nm8";
	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public static final String $add_dpt_cd9 = "add_dpt_cd9";
	/**
	 * Concurrent dept. name 9 兼務部門名９.<p>
	 *
	 */
	public static final String $add_dpt_nm9 = "add_dpt_nm9";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Entry date and time (PIC) 登録日時（担当者）.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time (PIC) 更新日時（担当者）.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $acl_ins_ts = "acl_ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $acl_upd_ts = "acl_upd_ts";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_alt_nm1_META = createCommonMeta($usr_alt_nm1, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm2_META = createCommonMeta($usr_alt_nm2, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm3_META = createCommonMeta($usr_alt_nm3, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm4_META = createCommonMeta($usr_alt_nm4, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd1_META = createCommonMeta($add_dpt_cd1, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm1_META = createCommonMeta($add_dpt_nm1, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd2_META = createCommonMeta($add_dpt_cd2, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm2_META = createCommonMeta($add_dpt_nm2, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd3_META = createCommonMeta($add_dpt_cd3, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm3_META = createCommonMeta($add_dpt_nm3, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd4_META = createCommonMeta($add_dpt_cd4, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm4_META = createCommonMeta($add_dpt_nm4, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd5_META = createCommonMeta($add_dpt_cd5, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm5_META = createCommonMeta($add_dpt_nm5, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd6_META = createCommonMeta($add_dpt_cd6, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm6_META = createCommonMeta($add_dpt_nm6, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd7_META = createCommonMeta($add_dpt_cd7, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm7_META = createCommonMeta($add_dpt_nm7, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd8_META = createCommonMeta($add_dpt_cd8, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm8_META = createCommonMeta($add_dpt_nm8, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd9_META = createCommonMeta($add_dpt_cd9, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm9_META = createCommonMeta($add_dpt_nm9, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta acl_ins_ts_META = createCommonMeta($acl_ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta acl_upd_ts_META = createCommonMeta($acl_upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			usr_cd_META,
			usr_nm_META,
			usr_alt_nm1_META,
			usr_alt_nm2_META,
			usr_alt_nm3_META,
			usr_alt_nm4_META,
			dpt_cd_META,
			dpt_nm_META,
			add_dpt_cd1_META,
			add_dpt_nm1_META,
			add_dpt_cd2_META,
			add_dpt_nm2_META,
			add_dpt_cd3_META,
			add_dpt_nm3_META,
			add_dpt_cd4_META,
			add_dpt_nm4_META,
			add_dpt_cd5_META,
			add_dpt_nm5_META,
			add_dpt_cd6_META,
			add_dpt_nm6_META,
			add_dpt_cd7_META,
			add_dpt_nm7_META,
			add_dpt_cd8_META,
			add_dpt_nm8_META,
			add_dpt_cd9_META,
			add_dpt_nm9_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_ts_META,
			upd_ts_META,
			acl_ins_ts_META,
			acl_upd_ts_META
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 1, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 1, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 2, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 2, $usr_nm, value);
	}


	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public String usr_alt_nm1() {
		return getConstString(offset + 3, $usr_alt_nm1);
	}

	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public void usr_alt_nm1(String value) {
		setConstString(offset + 3, $usr_alt_nm1, value);
	}


	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public String usr_alt_nm2() {
		return getConstString(offset + 4, $usr_alt_nm2);
	}

	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public void usr_alt_nm2(String value) {
		setConstString(offset + 4, $usr_alt_nm2, value);
	}


	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public String usr_alt_nm3() {
		return getConstString(offset + 5, $usr_alt_nm3);
	}

	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public void usr_alt_nm3(String value) {
		setConstString(offset + 5, $usr_alt_nm3, value);
	}


	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public String usr_alt_nm4() {
		return getConstString(offset + 6, $usr_alt_nm4);
	}

	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public void usr_alt_nm4(String value) {
		setConstString(offset + 6, $usr_alt_nm4, value);
	}


	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 7, $dpt_cd);
	}

	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 7, $dpt_cd, value);
	}


	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 8, $dpt_nm);
	}

	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 8, $dpt_nm, value);
	}


	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public String add_dpt_cd1() {
		return getConstString(offset + 9, $add_dpt_cd1);
	}

	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public void add_dpt_cd1(String value) {
		setConstString(offset + 9, $add_dpt_cd1, value);
	}


	/**
	 * Concurrent dept. name 1 兼務部門名１.<p>
	 *
	 */
	public String add_dpt_nm1() {
		return getConstString(offset + 10, $add_dpt_nm1);
	}

	/**
	 * Concurrent dept. name 1 兼務部門名１.<p>
	 *
	 */
	public void add_dpt_nm1(String value) {
		setConstString(offset + 10, $add_dpt_nm1, value);
	}


	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public String add_dpt_cd2() {
		return getConstString(offset + 11, $add_dpt_cd2);
	}

	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public void add_dpt_cd2(String value) {
		setConstString(offset + 11, $add_dpt_cd2, value);
	}


	/**
	 * Concurrent dept. name 2 兼務部門名２.<p>
	 *
	 */
	public String add_dpt_nm2() {
		return getConstString(offset + 12, $add_dpt_nm2);
	}

	/**
	 * Concurrent dept. name 2 兼務部門名２.<p>
	 *
	 */
	public void add_dpt_nm2(String value) {
		setConstString(offset + 12, $add_dpt_nm2, value);
	}


	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public String add_dpt_cd3() {
		return getConstString(offset + 13, $add_dpt_cd3);
	}

	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public void add_dpt_cd3(String value) {
		setConstString(offset + 13, $add_dpt_cd3, value);
	}


	/**
	 * Concurrent dept. name 3 兼務部門名３.<p>
	 *
	 */
	public String add_dpt_nm3() {
		return getConstString(offset + 14, $add_dpt_nm3);
	}

	/**
	 * Concurrent dept. name 3 兼務部門名３.<p>
	 *
	 */
	public void add_dpt_nm3(String value) {
		setConstString(offset + 14, $add_dpt_nm3, value);
	}


	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public String add_dpt_cd4() {
		return getConstString(offset + 15, $add_dpt_cd4);
	}

	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public void add_dpt_cd4(String value) {
		setConstString(offset + 15, $add_dpt_cd4, value);
	}


	/**
	 * Concurrent dept. name 4 兼務部門名４.<p>
	 *
	 */
	public String add_dpt_nm4() {
		return getConstString(offset + 16, $add_dpt_nm4);
	}

	/**
	 * Concurrent dept. name 4 兼務部門名４.<p>
	 *
	 */
	public void add_dpt_nm4(String value) {
		setConstString(offset + 16, $add_dpt_nm4, value);
	}


	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public String add_dpt_cd5() {
		return getConstString(offset + 17, $add_dpt_cd5);
	}

	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public void add_dpt_cd5(String value) {
		setConstString(offset + 17, $add_dpt_cd5, value);
	}


	/**
	 * Concurrent dept. name 5 兼務部門名５.<p>
	 *
	 */
	public String add_dpt_nm5() {
		return getConstString(offset + 18, $add_dpt_nm5);
	}

	/**
	 * Concurrent dept. name 5 兼務部門名５.<p>
	 *
	 */
	public void add_dpt_nm5(String value) {
		setConstString(offset + 18, $add_dpt_nm5, value);
	}


	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public String add_dpt_cd6() {
		return getConstString(offset + 19, $add_dpt_cd6);
	}

	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public void add_dpt_cd6(String value) {
		setConstString(offset + 19, $add_dpt_cd6, value);
	}


	/**
	 * Concurrent dept. name 6 兼務部門名６.<p>
	 *
	 */
	public String add_dpt_nm6() {
		return getConstString(offset + 20, $add_dpt_nm6);
	}

	/**
	 * Concurrent dept. name 6 兼務部門名６.<p>
	 *
	 */
	public void add_dpt_nm6(String value) {
		setConstString(offset + 20, $add_dpt_nm6, value);
	}


	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public String add_dpt_cd7() {
		return getConstString(offset + 21, $add_dpt_cd7);
	}

	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public void add_dpt_cd7(String value) {
		setConstString(offset + 21, $add_dpt_cd7, value);
	}


	/**
	 * Concurrent dept. name 7 兼務部門名７.<p>
	 *
	 */
	public String add_dpt_nm7() {
		return getConstString(offset + 22, $add_dpt_nm7);
	}

	/**
	 * Concurrent dept. name 7 兼務部門名７.<p>
	 *
	 */
	public void add_dpt_nm7(String value) {
		setConstString(offset + 22, $add_dpt_nm7, value);
	}


	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public String add_dpt_cd8() {
		return getConstString(offset + 23, $add_dpt_cd8);
	}

	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public void add_dpt_cd8(String value) {
		setConstString(offset + 23, $add_dpt_cd8, value);
	}


	/**
	 * Concurrent dept. name 8 兼務部門名８.<p>
	 *
	 */
	public String add_dpt_nm8() {
		return getConstString(offset + 24, $add_dpt_nm8);
	}

	/**
	 * Concurrent dept. name 8 兼務部門名８.<p>
	 *
	 */
	public void add_dpt_nm8(String value) {
		setConstString(offset + 24, $add_dpt_nm8, value);
	}


	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public String add_dpt_cd9() {
		return getConstString(offset + 25, $add_dpt_cd9);
	}

	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public void add_dpt_cd9(String value) {
		setConstString(offset + 25, $add_dpt_cd9, value);
	}


	/**
	 * Concurrent dept. name 9 兼務部門名９.<p>
	 *
	 */
	public String add_dpt_nm9() {
		return getConstString(offset + 26, $add_dpt_nm9);
	}

	/**
	 * Concurrent dept. name 9 兼務部門名９.<p>
	 *
	 */
	public void add_dpt_nm9(String value) {
		setConstString(offset + 26, $add_dpt_nm9, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 27, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 27, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 28, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 28, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 29, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 29, $memo3, value);
	}


	/**
	 * Entry date and time (PIC) 登録日時（担当者）.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 30, $ins_ts);
	}

	/**
	 * Entry date and time (PIC) 登録日時（担当者）.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $ins_ts, value);
	}


	/**
	 * Update date and time (PIC) 更新日時（担当者）.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 31, $upd_ts);
	}

	/**
	 * Update date and time (PIC) 更新日時（担当者）.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 31, $upd_ts, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp acl_ins_ts() {
		return getConstTimestamp(offset + 32, $acl_ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void acl_ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $acl_ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp acl_upd_ts() {
		return getConstTimestamp(offset + 33, $acl_upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void acl_upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 33, $acl_upd_ts, value);
	}


	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			return add_dpt_cd1();
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			return add_dpt_nm1();
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			return add_dpt_cd2();
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			return add_dpt_nm2();
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			return add_dpt_cd3();
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			return add_dpt_nm3();
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			return add_dpt_cd4();
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			return add_dpt_nm4();
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			return add_dpt_cd5();
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			return add_dpt_nm5();
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			return add_dpt_cd6();
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			return add_dpt_nm6();
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			return add_dpt_cd7();
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			return add_dpt_nm7();
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			return add_dpt_cd8();
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			return add_dpt_nm8();
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			return add_dpt_cd9();
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			return add_dpt_nm9();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($acl_ins_ts.equalsIgnoreCase(name)) {
			return acl_ins_ts();
		}
		if ($acl_upd_ts.equalsIgnoreCase(name)) {
			return acl_upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			return add_dpt_cd1();
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			return add_dpt_nm1();
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			return add_dpt_cd2();
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			return add_dpt_nm2();
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			return add_dpt_cd3();
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			return add_dpt_nm3();
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			return add_dpt_cd4();
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			return add_dpt_nm4();
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			return add_dpt_cd5();
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			return add_dpt_nm5();
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			return add_dpt_cd6();
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			return add_dpt_nm6();
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			return add_dpt_cd7();
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			return add_dpt_nm7();
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			return add_dpt_cd8();
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			return add_dpt_nm8();
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			return add_dpt_cd9();
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			return add_dpt_nm9();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($acl_ins_ts.equalsIgnoreCase(name)) {
			return acl_ins_ts();
		}
		if ($acl_upd_ts.equalsIgnoreCase(name)) {
			return acl_upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
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
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			add_dpt_cd1(value);
			return;
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			add_dpt_nm1(value);
			return;
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			add_dpt_cd2(value);
			return;
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			add_dpt_nm2(value);
			return;
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			add_dpt_cd3(value);
			return;
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			add_dpt_nm3(value);
			return;
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			add_dpt_cd4(value);
			return;
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			add_dpt_nm4(value);
			return;
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			add_dpt_cd5(value);
			return;
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			add_dpt_nm5(value);
			return;
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			add_dpt_cd6(value);
			return;
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			add_dpt_nm6(value);
			return;
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			add_dpt_cd7(value);
			return;
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			add_dpt_nm7(value);
			return;
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			add_dpt_cd8(value);
			return;
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			add_dpt_nm8(value);
			return;
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			add_dpt_cd9(value);
			return;
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			add_dpt_nm9(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($acl_ins_ts.equalsIgnoreCase(name)) {
			acl_ins_ts(value);
			return;
		}
		if ($acl_upd_ts.equalsIgnoreCase(name)) {
			acl_upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
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
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			add_dpt_cd1(value);
			return;
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			add_dpt_nm1(value);
			return;
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			add_dpt_cd2(value);
			return;
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			add_dpt_nm2(value);
			return;
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			add_dpt_cd3(value);
			return;
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			add_dpt_nm3(value);
			return;
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			add_dpt_cd4(value);
			return;
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			add_dpt_nm4(value);
			return;
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			add_dpt_cd5(value);
			return;
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			add_dpt_nm5(value);
			return;
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			add_dpt_cd6(value);
			return;
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			add_dpt_nm6(value);
			return;
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			add_dpt_cd7(value);
			return;
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			add_dpt_nm7(value);
			return;
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			add_dpt_cd8(value);
			return;
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			add_dpt_nm8(value);
			return;
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			add_dpt_cd9(value);
			return;
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			add_dpt_nm9(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($acl_ins_ts.equalsIgnoreCase(name)) {
			acl_ins_ts(value);
			return;
		}
		if ($acl_upd_ts.equalsIgnoreCase(name)) {
			acl_upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

