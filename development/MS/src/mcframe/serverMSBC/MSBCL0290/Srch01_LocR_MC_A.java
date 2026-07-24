package mcframe.serverMSBC.MSBCL0290;

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
 * ブロック"Srch01_Loc"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_LocR_MC_A extends MCConstRow {

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public static final String $rsrc_cd1 = "rsrc_cd1";
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public static final String $rsrc_nm1 = "rsrc_nm1";
	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public static final String $rsrc_unit_nm1 = "rsrc_unit_nm1";
	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public static final String $rsrc_dec_place1 = "rsrc_dec_place1";
	/**
	 * Rounding type 1 端数処理区分１.<p>
	 *
	 */
	public static final String $rsrc_rnd_typ1 = "rsrc_rnd_typ1";
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public static final String $rsrc_cd2 = "rsrc_cd2";
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public static final String $rsrc_nm2 = "rsrc_nm2";
	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public static final String $rsrc_unit_nm2 = "rsrc_unit_nm2";
	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public static final String $rsrc_dec_place2 = "rsrc_dec_place2";
	/**
	 * Rounding type 2 端数処理区分２.<p>
	 *
	 */
	public static final String $rsrc_rnd_typ2 = "rsrc_rnd_typ2";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";


	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rsrc_cd1_META = createCommonMeta($rsrc_cd1, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm1_META = createCommonMeta($rsrc_nm1, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_nm1_META = createCommonMeta($rsrc_unit_nm1, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_dec_place1_META = createCommonMeta($rsrc_dec_place1, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rsrc_rnd_typ1_META = createCommonMeta($rsrc_rnd_typ1, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rsrc_cd2_META = createCommonMeta($rsrc_cd2, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm2_META = createCommonMeta($rsrc_nm2, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_nm2_META = createCommonMeta($rsrc_unit_nm2, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_dec_place2_META = createCommonMeta($rsrc_dec_place2, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rsrc_rnd_typ2_META = createCommonMeta($rsrc_rnd_typ2, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);

	protected static final ConstMetaList<Srch01_LocR> constMetas = new ConstMetaList<Srch01_LocR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			cal_cd_META,
			rsrc_cd1_META,
			rsrc_nm1_META,
			rsrc_unit_nm1_META,
			rsrc_dec_place1_META,
			rsrc_rnd_typ1_META,
			rsrc_cd2_META,
			rsrc_nm2_META,
			rsrc_unit_nm2_META,
			rsrc_dec_place2_META,
			rsrc_rnd_typ2_META,
			disp_seq_META,
			sppl_cd_META
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_LocR_MC_A(ConstMetaList<? extends Srch01_LocR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_LocR clone() {
		return (Srch01_LocR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_LocR createInstance() {
		return (Srch01_LocR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_LocR getValues(String... names) {
		return (Srch01_LocR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 0, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 0, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 1, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 1, $mfg_loc_nm, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 2, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 2, $cal_cd, value);
	}


	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public String rsrc_cd1() {
		return getConstString(offset + 3, $rsrc_cd1);
	}

	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public void rsrc_cd1(String value) {
		setConstString(offset + 3, $rsrc_cd1, value);
	}


	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public String rsrc_nm1() {
		return getConstString(offset + 4, $rsrc_nm1);
	}

	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public void rsrc_nm1(String value) {
		setConstString(offset + 4, $rsrc_nm1, value);
	}


	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public String rsrc_unit_nm1() {
		return getConstString(offset + 5, $rsrc_unit_nm1);
	}

	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public void rsrc_unit_nm1(String value) {
		setConstString(offset + 5, $rsrc_unit_nm1, value);
	}


	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public MCNumber rsrc_dec_place1() {
		return getConstNumber(offset + 6, $rsrc_dec_place1);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(MCNumber value) {
		setConstNumber(offset + 6, $rsrc_dec_place1, value);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(int value) {
		setConstNumber(offset + 6, $rsrc_dec_place1, value);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(long value) {
		setConstNumber(offset + 6, $rsrc_dec_place1, value);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(float value) {
		setConstNumber(offset + 6, $rsrc_dec_place1, value);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(double value) {
		setConstNumber(offset + 6, $rsrc_dec_place1, value);
	}


	/**
	 * Rounding type 1 端数処理区分１.<p>
	 *
	 */
	public String rsrc_rnd_typ1() {
		return getConstString(offset + 7, $rsrc_rnd_typ1);
	}

	/**
	 * Rounding type 1 端数処理区分１.<p>
	 *
	 */
	public void rsrc_rnd_typ1(String value) {
		setConstString(offset + 7, $rsrc_rnd_typ1, value);
	}


	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public String rsrc_cd2() {
		return getConstString(offset + 8, $rsrc_cd2);
	}

	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public void rsrc_cd2(String value) {
		setConstString(offset + 8, $rsrc_cd2, value);
	}


	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public String rsrc_nm2() {
		return getConstString(offset + 9, $rsrc_nm2);
	}

	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public void rsrc_nm2(String value) {
		setConstString(offset + 9, $rsrc_nm2, value);
	}


	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public String rsrc_unit_nm2() {
		return getConstString(offset + 10, $rsrc_unit_nm2);
	}

	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public void rsrc_unit_nm2(String value) {
		setConstString(offset + 10, $rsrc_unit_nm2, value);
	}


	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public MCNumber rsrc_dec_place2() {
		return getConstNumber(offset + 11, $rsrc_dec_place2);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(MCNumber value) {
		setConstNumber(offset + 11, $rsrc_dec_place2, value);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(int value) {
		setConstNumber(offset + 11, $rsrc_dec_place2, value);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(long value) {
		setConstNumber(offset + 11, $rsrc_dec_place2, value);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(float value) {
		setConstNumber(offset + 11, $rsrc_dec_place2, value);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(double value) {
		setConstNumber(offset + 11, $rsrc_dec_place2, value);
	}


	/**
	 * Rounding type 2 端数処理区分２.<p>
	 *
	 */
	public String rsrc_rnd_typ2() {
		return getConstString(offset + 12, $rsrc_rnd_typ2);
	}

	/**
	 * Rounding type 2 端数処理区分２.<p>
	 *
	 */
	public void rsrc_rnd_typ2(String value) {
		setConstString(offset + 12, $rsrc_rnd_typ2, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 13, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 14, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 14, $sppl_cd, value);
	}


	public String getString(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			return rsrc_unit_nm1();
		}
		if ($rsrc_rnd_typ1.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			return rsrc_unit_nm2();
		}
		if ($rsrc_rnd_typ2.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ2();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			return rsrc_dec_place1();
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			return rsrc_dec_place2();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			return rsrc_unit_nm1();
		}
		if ($rsrc_rnd_typ1.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			return rsrc_unit_nm2();
		}
		if ($rsrc_rnd_typ2.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ2();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			return rsrc_dec_place1();
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			return rsrc_dec_place2();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			rsrc_unit_nm1(value);
			return;
		}
		if ($rsrc_rnd_typ1.equalsIgnoreCase(name)) {
			rsrc_rnd_typ1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			rsrc_unit_nm2(value);
			return;
		}
		if ($rsrc_rnd_typ2.equalsIgnoreCase(name)) {
			rsrc_rnd_typ2(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			rsrc_unit_nm1(value);
			return;
		}
		if ($rsrc_rnd_typ1.equalsIgnoreCase(name)) {
			rsrc_rnd_typ1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			rsrc_unit_nm2(value);
			return;
		}
		if ($rsrc_rnd_typ2.equalsIgnoreCase(name)) {
			rsrc_rnd_typ2(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

