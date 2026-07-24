package mcframe.clientMGBF.MGBFP0260;

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
 * ブロック"Mstr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MstrR_MC_A extends MCConstRow {

	/**
	 * GR/GI column cd. 受払項目ＣＤ.<p>
	 *
	 */
	public static final String $io_col_cd = "io_col_cd";
	/**
	 * GR/GI column name 受払項目名.<p>
	 *
	 */
	public static final String $io_col_nm = "io_col_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $io_seq = "io_seq";
	/**
	 * GR/GI type 受払対象区分.<p>
	 *
	 */
	public static final String $io_tgt_typ = "io_tgt_typ";
	/**
	 * Unit price display flg. 単価表示ＦＬＧ.<p>
	 *
	 */
	public static final String $unit_flg = "unit_flg";
	/**
	 * Display qty. flg. 数量表示ＦＬＧ.<p>
	 *
	 */
	public static final String $qty_flg = "qty_flg";
	/**
	 * Display amount flg. 金額表示ＦＬＧ.<p>
	 *
	 */
	public static final String $amt_flg = "amt_flg";
	/**
	 * Display standard flg. 標準表示ＦＬＧ.<p>
	 *
	 */
	public static final String $std_flg = "std_flg";
	/**
	 * Display variance flg. 差異表示ＦＬＧ.<p>
	 *
	 */
	public static final String $diff_flg = "diff_flg";
	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public static final String $fg_r = "fg_r";
	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public static final String $fg_g = "fg_g";
	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public static final String $fg_b = "fg_b";
	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public static final String $bg_r = "bg_r";
	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public static final String $bg_g = "bg_g";
	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public static final String $bg_b = "bg_b";
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";


	public static final MCMeta io_col_cd_META = createCommonMeta($io_col_cd, mcframe.commonMA.meta.MA_META.IO_COL_CD);
	public static final MCMeta io_col_nm_META = createCommonMeta($io_col_nm, mcframe.commonMA.meta.MA_META.IO_COL_NM);
	public static final MCMeta io_seq_META = createCommonMeta($io_seq, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta io_tgt_typ_META = createCommonMeta($io_tgt_typ, mcframe.commonMA.meta.MA_META.IO_TGT_TYP);
	public static final MCMeta unit_flg_META = createCommonMeta($unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty_flg_META = createCommonMeta($qty_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_flg_META = createCommonMeta($amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_flg_META = createCommonMeta($std_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta diff_flg_META = createCommonMeta($diff_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fg_r_META = createCommonMeta($fg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_g_META = createCommonMeta($fg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta fg_b_META = createCommonMeta($fg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_r_META = createCommonMeta($bg_r, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_g_META = createCommonMeta($bg_g, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta bg_b_META = createCommonMeta($bg_b, mcframe.commonMA.meta.MA_META.RGB);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);

	protected static final ConstMetaList<MstrR> constMetas = new ConstMetaList<MstrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			io_col_cd_META,
			io_col_nm_META,
			io_seq_META,
			io_tgt_typ_META,
			unit_flg_META,
			qty_flg_META,
			amt_flg_META,
			std_flg_META,
			diff_flg_META,
			fg_r_META,
			fg_g_META,
			fg_b_META,
			bg_r_META,
			bg_g_META,
			bg_b_META,
			ac_slip_typ_META,
			ac_rsn_cd_META
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[COL_TYP]のキー定数 */
	public static final String $$COL_TYP = "COL_TYP";

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
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$COL_TYP, new MCExtList(
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
	protected MstrR_MC_A(ConstMetaList<? extends MstrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstrR clone() {
		return (MstrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstrR createInstance() {
		return (MstrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstrR getValues(String... names) {
		return (MstrR) super.getValues(names);
	}



	/**
	 * GR/GI column cd. 受払項目ＣＤ.<p>
	 *
	 */
	public String io_col_cd() {
		return getConstString(offset + 0, $io_col_cd);
	}

	/**
	 * GR/GI column cd. 受払項目ＣＤ.<p>
	 *
	 */
	public void io_col_cd(String value) {
		setConstString(offset + 0, $io_col_cd, value);
	}


	/**
	 * GR/GI column name 受払項目名.<p>
	 *
	 */
	public String io_col_nm() {
		return getConstString(offset + 1, $io_col_nm);
	}

	/**
	 * GR/GI column name 受払項目名.<p>
	 *
	 */
	public void io_col_nm(String value) {
		setConstString(offset + 1, $io_col_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber io_seq() {
		return getConstNumber(offset + 2, $io_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(MCNumber value) {
		setConstNumber(offset + 2, $io_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(int value) {
		setConstNumber(offset + 2, $io_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(long value) {
		setConstNumber(offset + 2, $io_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(float value) {
		setConstNumber(offset + 2, $io_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void io_seq(double value) {
		setConstNumber(offset + 2, $io_seq, value);
	}


	/**
	 * GR/GI type 受払対象区分.<p>
	 *
	 */
	public String io_tgt_typ() {
		return getConstString(offset + 3, $io_tgt_typ);
	}

	/**
	 * GR/GI type 受払対象区分.<p>
	 *
	 */
	public void io_tgt_typ(String value) {
		setConstString(offset + 3, $io_tgt_typ, value);
	}


	/**
	 * Unit price display flg. 単価表示ＦＬＧ.<p>
	 *
	 */
	public boolean unit_flg() {
		return getConstBoolean(offset + 4, $unit_flg);
	}

	/**
	 * Unit price display flg. 単価表示ＦＬＧ.<p>
	 *
	 */
	public void unit_flg(boolean value) {
		setConstBoolean(offset + 4, $unit_flg, value);
	}


	/**
	 * Display qty. flg. 数量表示ＦＬＧ.<p>
	 *
	 */
	public boolean qty_flg() {
		return getConstBoolean(offset + 5, $qty_flg);
	}

	/**
	 * Display qty. flg. 数量表示ＦＬＧ.<p>
	 *
	 */
	public void qty_flg(boolean value) {
		setConstBoolean(offset + 5, $qty_flg, value);
	}


	/**
	 * Display amount flg. 金額表示ＦＬＧ.<p>
	 *
	 */
	public boolean amt_flg() {
		return getConstBoolean(offset + 6, $amt_flg);
	}

	/**
	 * Display amount flg. 金額表示ＦＬＧ.<p>
	 *
	 */
	public void amt_flg(boolean value) {
		setConstBoolean(offset + 6, $amt_flg, value);
	}


	/**
	 * Display standard flg. 標準表示ＦＬＧ.<p>
	 *
	 */
	public boolean std_flg() {
		return getConstBoolean(offset + 7, $std_flg);
	}

	/**
	 * Display standard flg. 標準表示ＦＬＧ.<p>
	 *
	 */
	public void std_flg(boolean value) {
		setConstBoolean(offset + 7, $std_flg, value);
	}


	/**
	 * Display variance flg. 差異表示ＦＬＧ.<p>
	 *
	 */
	public boolean diff_flg() {
		return getConstBoolean(offset + 8, $diff_flg);
	}

	/**
	 * Display variance flg. 差異表示ＦＬＧ.<p>
	 *
	 */
	public void diff_flg(boolean value) {
		setConstBoolean(offset + 8, $diff_flg, value);
	}


	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public MCNumber fg_r() {
		return getConstNumber(offset + 9, $fg_r);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(MCNumber value) {
		setConstNumber(offset + 9, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(int value) {
		setConstNumber(offset + 9, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(long value) {
		setConstNumber(offset + 9, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(float value) {
		setConstNumber(offset + 9, $fg_r, value);
	}

	/**
	 * Foreground color (R) 前景色（Ｒ）.<p>
	 *
	 */
	public void fg_r(double value) {
		setConstNumber(offset + 9, $fg_r, value);
	}


	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public MCNumber fg_g() {
		return getConstNumber(offset + 10, $fg_g);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(MCNumber value) {
		setConstNumber(offset + 10, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(int value) {
		setConstNumber(offset + 10, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(long value) {
		setConstNumber(offset + 10, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(float value) {
		setConstNumber(offset + 10, $fg_g, value);
	}

	/**
	 * Foreground color (G) 前景色（Ｇ）.<p>
	 *
	 */
	public void fg_g(double value) {
		setConstNumber(offset + 10, $fg_g, value);
	}


	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public MCNumber fg_b() {
		return getConstNumber(offset + 11, $fg_b);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(MCNumber value) {
		setConstNumber(offset + 11, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(int value) {
		setConstNumber(offset + 11, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(long value) {
		setConstNumber(offset + 11, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(float value) {
		setConstNumber(offset + 11, $fg_b, value);
	}

	/**
	 * Foreground color (B) 前景色（Ｂ）.<p>
	 *
	 */
	public void fg_b(double value) {
		setConstNumber(offset + 11, $fg_b, value);
	}


	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public MCNumber bg_r() {
		return getConstNumber(offset + 12, $bg_r);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(MCNumber value) {
		setConstNumber(offset + 12, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(int value) {
		setConstNumber(offset + 12, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(long value) {
		setConstNumber(offset + 12, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(float value) {
		setConstNumber(offset + 12, $bg_r, value);
	}

	/**
	 * Background color (R) 背景色（Ｒ）.<p>
	 *
	 */
	public void bg_r(double value) {
		setConstNumber(offset + 12, $bg_r, value);
	}


	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public MCNumber bg_g() {
		return getConstNumber(offset + 13, $bg_g);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(MCNumber value) {
		setConstNumber(offset + 13, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(int value) {
		setConstNumber(offset + 13, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(long value) {
		setConstNumber(offset + 13, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(float value) {
		setConstNumber(offset + 13, $bg_g, value);
	}

	/**
	 * Background color (G) 背景色（Ｇ）.<p>
	 *
	 */
	public void bg_g(double value) {
		setConstNumber(offset + 13, $bg_g, value);
	}


	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public MCNumber bg_b() {
		return getConstNumber(offset + 14, $bg_b);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(MCNumber value) {
		setConstNumber(offset + 14, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(int value) {
		setConstNumber(offset + 14, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(long value) {
		setConstNumber(offset + 14, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(float value) {
		setConstNumber(offset + 14, $bg_b, value);
	}

	/**
	 * Background color (B) 背景色（Ｂ）.<p>
	 *
	 */
	public void bg_b(double value) {
		setConstNumber(offset + 14, $bg_b, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 15, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 15, $ac_slip_typ, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 16, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 16, $ac_rsn_cd, value);
	}


	public String getString(String name) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			return io_col_cd();
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			return io_col_nm();
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			return io_tgt_typ();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($io_seq.equalsIgnoreCase(name)) {
			return io_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($unit_flg.equalsIgnoreCase(name)) {
			return unit_flg();
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			return qty_flg();
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			return amt_flg();
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			return diff_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			return io_col_cd();
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			return io_col_nm();
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			return io_tgt_typ();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($io_seq.equalsIgnoreCase(name)) {
			return io_seq();
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			return fg_r();
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			return fg_g();
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			return fg_b();
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			return bg_r();
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			return bg_g();
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			return bg_b();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($unit_flg.equalsIgnoreCase(name)) {
			return unit_flg();
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			return qty_flg();
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			return amt_flg();
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			return diff_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			io_col_cd(value);
			return;
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			io_col_nm(value);
			return;
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			io_tgt_typ(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($unit_flg.equalsIgnoreCase(name)) {
			unit_flg(value);
			return;
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			qty_flg(value);
			return;
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			amt_flg(value);
			return;
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			diff_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			io_col_cd(value);
			return;
		}
		if ($io_col_nm.equalsIgnoreCase(name)) {
			io_col_nm(value);
			return;
		}
		if ($io_tgt_typ.equalsIgnoreCase(name)) {
			io_tgt_typ(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($io_seq.equalsIgnoreCase(name)) {
			io_seq(value);
			return;
		}
		if ($fg_r.equalsIgnoreCase(name)) {
			fg_r(value);
			return;
		}
		if ($fg_g.equalsIgnoreCase(name)) {
			fg_g(value);
			return;
		}
		if ($fg_b.equalsIgnoreCase(name)) {
			fg_b(value);
			return;
		}
		if ($bg_r.equalsIgnoreCase(name)) {
			bg_r(value);
			return;
		}
		if ($bg_g.equalsIgnoreCase(name)) {
			bg_g(value);
			return;
		}
		if ($bg_b.equalsIgnoreCase(name)) {
			bg_b(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($unit_flg.equalsIgnoreCase(name)) {
			unit_flg(value);
			return;
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			qty_flg(value);
			return;
		}
		if ($amt_flg.equalsIgnoreCase(name)) {
			amt_flg(value);
			return;
		}
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($diff_flg.equalsIgnoreCase(name)) {
			diff_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

