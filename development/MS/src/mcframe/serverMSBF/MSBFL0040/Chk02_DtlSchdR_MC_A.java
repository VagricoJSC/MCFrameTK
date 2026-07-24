package mcframe.serverMSBF.MSBFL0040;

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
 * ブロック"Chk02_DtlSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_DtlSchdR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public static final String $smpl_inst_qty = "smpl_inst_qty";
	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	public static final String $insp_inst_issue_typ = "insp_inst_issue_typ";
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta smpl_inst_qty_META = createCommonMeta($smpl_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta insp_inst_issue_typ_META = createCommonMeta($insp_inst_issue_typ, mcframe.commonMA.meta.MA_META.INSP_INST_ISSUE_TYP);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);

	protected static final ConstMetaList<Chk02_DtlSchdR> constMetas = new ConstMetaList<Chk02_DtlSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			insp_schd_no_META,
			smpl_inst_qty_META,
			upd_cntr_META,
			insp_inst_issue_typ_META,
			insp_mtd_typ_META,
			loc_cd_META,
			mfg_loc_cd_META,
			insp_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$insp_schd_no, "E"}	// insp_schd_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Chk02_DtlSchdR_MC_A(ConstMetaList<? extends Chk02_DtlSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlSchdR clone() {
		return (Chk02_DtlSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlSchdR createInstance() {
		return (Chk02_DtlSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlSchdR getValues(String... names) {
		return (Chk02_DtlSchdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 2, $insp_schd_no);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 2, $insp_schd_no, value);
	}


	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public MCNumber smpl_inst_qty() {
		return getConstNumber(offset + 3, $smpl_inst_qty);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(MCNumber value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(int value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(long value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(float value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(double value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}


	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 4, $upd_cntr);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Inspection schedule update counter 検査予定更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}


	public String insp_inst_issue_typ() {
		return getConstString(offset + 5, $insp_inst_issue_typ);
	}

	public void insp_inst_issue_typ(String value) {
		setConstString(offset + 5, $insp_inst_issue_typ, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 6, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 6, $insp_mtd_typ, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 7, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 7, $loc_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 8, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 8, $mfg_loc_cd, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 9, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 9, $insp_typ, value);
	}


	public String getString(String name) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

