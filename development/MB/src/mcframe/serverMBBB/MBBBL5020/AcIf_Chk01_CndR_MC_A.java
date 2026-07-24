package mcframe.serverMBBB.MBBBL5020;

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
 * ブロック"AcIf_Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AcIf_Chk01_CndR_MC_A extends MCConstRow {

	/**
	 * Month 対象年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * GR/GI info. 受払情報.<p>
	 *
	 */
	public static final String $io_flg = "io_flg";
	/**
	 * Inventory info. 在庫情報.<p>
	 *
	 */
	public static final String $stk_flg = "stk_flg";
	/**
	 * Payment received info. 入金情報.<p>
	 *
	 */
	public static final String $rcv_flg = "rcv_flg";
	/**
	 * Payment info. 支払情報.<p>
	 *
	 */
	public static final String $pay_flg = "pay_flg";
	/**
	 * Payment request info. 支払依頼情報.<p>
	 *
	 */
	public static final String $schdpay_flg = "schdpay_flg";
	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public static final String $note_flg = "note_flg";
	/**
	 * Re-import 再取込.<p>
	 *
	 */
	public static final String $rerun_flg = "rerun_flg";
	/**
	 * Reacquire master マスタ再取得.<p>
	 *
	 */
	public static final String $reget_flg = "reget_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta io_flg_META = createCommonMeta($io_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_flg_META = createCommonMeta($rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_flg_META = createCommonMeta($pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schdpay_flg_META = createCommonMeta($schdpay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta note_flg_META = createCommonMeta($note_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rerun_flg_META = createCommonMeta($rerun_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta reget_flg_META = createCommonMeta($reget_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<AcIf_Chk01_CndR> constMetas = new ConstMetaList<AcIf_Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			dt_fr_META,
			dt_to_META,
			io_flg_META,
			stk_flg_META,
			rcv_flg_META,
			pay_flg_META,
			schdpay_flg_META,
			note_flg_META,
			rerun_flg_META,
			reget_flg_META,
			err_flg_META
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$ac_ym, "E"}	// ac_ym
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
				{$dt_fr, "dt:BF"},	// dt_fr
				{$dt_to, "dt:AF"}	// dt_to
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
				{$io_flg, "E"},	// io_flg
				{$stk_flg, "E"},	// stk_flg
				{$rcv_flg, "E"},	// rcv_flg
				{$pay_flg, "E"},	// pay_flg
				{$schdpay_flg, "E"},	// schdpay_flg
				{$note_flg, "E"}	// note_flg
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
	protected AcIf_Chk01_CndR_MC_A(ConstMetaList<? extends AcIf_Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcIf_Chk01_CndR clone() {
		return (AcIf_Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcIf_Chk01_CndR createInstance() {
		return (AcIf_Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AcIf_Chk01_CndR getValues(String... names) {
		return (AcIf_Chk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Month 対象年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 0, $ac_ym);
	}

	/**
	 * Month 対象年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 0, $ac_ym, value);
	}


	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 1, $dt_fr);
	}

	/**
	 * Term FROM 対象期間ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 1, $dt_fr, value);
	}


	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 2, $dt_to);
	}

	/**
	 * Term TO 対象期間ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 2, $dt_to, value);
	}


	/**
	 * GR/GI info. 受払情報.<p>
	 *
	 */
	public boolean io_flg() {
		return getConstBoolean(offset + 3, $io_flg);
	}

	/**
	 * GR/GI info. 受払情報.<p>
	 *
	 */
	public void io_flg(boolean value) {
		setConstBoolean(offset + 3, $io_flg, value);
	}


	/**
	 * Inventory info. 在庫情報.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 4, $stk_flg);
	}

	/**
	 * Inventory info. 在庫情報.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 4, $stk_flg, value);
	}


	/**
	 * Payment received info. 入金情報.<p>
	 *
	 */
	public boolean rcv_flg() {
		return getConstBoolean(offset + 5, $rcv_flg);
	}

	/**
	 * Payment received info. 入金情報.<p>
	 *
	 */
	public void rcv_flg(boolean value) {
		setConstBoolean(offset + 5, $rcv_flg, value);
	}


	/**
	 * Payment info. 支払情報.<p>
	 *
	 */
	public boolean pay_flg() {
		return getConstBoolean(offset + 6, $pay_flg);
	}

	/**
	 * Payment info. 支払情報.<p>
	 *
	 */
	public void pay_flg(boolean value) {
		setConstBoolean(offset + 6, $pay_flg, value);
	}


	/**
	 * Payment request info. 支払依頼情報.<p>
	 *
	 */
	public boolean schdpay_flg() {
		return getConstBoolean(offset + 7, $schdpay_flg);
	}

	/**
	 * Payment request info. 支払依頼情報.<p>
	 *
	 */
	public void schdpay_flg(boolean value) {
		setConstBoolean(offset + 7, $schdpay_flg, value);
	}


	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public boolean note_flg() {
		return getConstBoolean(offset + 8, $note_flg);
	}

	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public void note_flg(boolean value) {
		setConstBoolean(offset + 8, $note_flg, value);
	}


	/**
	 * Re-import 再取込.<p>
	 *
	 */
	public boolean rerun_flg() {
		return getConstBoolean(offset + 9, $rerun_flg);
	}

	/**
	 * Re-import 再取込.<p>
	 *
	 */
	public void rerun_flg(boolean value) {
		setConstBoolean(offset + 9, $rerun_flg, value);
	}


	/**
	 * Reacquire master マスタ再取得.<p>
	 *
	 */
	public boolean reget_flg() {
		return getConstBoolean(offset + 10, $reget_flg);
	}

	/**
	 * Reacquire master マスタ再取得.<p>
	 *
	 */
	public void reget_flg(boolean value) {
		setConstBoolean(offset + 10, $reget_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 11, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 11, $err_flg, value);
	}


	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($io_flg.equalsIgnoreCase(name)) {
			return io_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($rcv_flg.equalsIgnoreCase(name)) {
			return rcv_flg();
		}
		if ($pay_flg.equalsIgnoreCase(name)) {
			return pay_flg();
		}
		if ($schdpay_flg.equalsIgnoreCase(name)) {
			return schdpay_flg();
		}
		if ($note_flg.equalsIgnoreCase(name)) {
			return note_flg();
		}
		if ($rerun_flg.equalsIgnoreCase(name)) {
			return rerun_flg();
		}
		if ($reget_flg.equalsIgnoreCase(name)) {
			return reget_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($io_flg.equalsIgnoreCase(name)) {
			return io_flg();
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($rcv_flg.equalsIgnoreCase(name)) {
			return rcv_flg();
		}
		if ($pay_flg.equalsIgnoreCase(name)) {
			return pay_flg();
		}
		if ($schdpay_flg.equalsIgnoreCase(name)) {
			return schdpay_flg();
		}
		if ($note_flg.equalsIgnoreCase(name)) {
			return note_flg();
		}
		if ($rerun_flg.equalsIgnoreCase(name)) {
			return rerun_flg();
		}
		if ($reget_flg.equalsIgnoreCase(name)) {
			return reget_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($io_flg.equalsIgnoreCase(name)) {
			io_flg(value);
			return;
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($rcv_flg.equalsIgnoreCase(name)) {
			rcv_flg(value);
			return;
		}
		if ($pay_flg.equalsIgnoreCase(name)) {
			pay_flg(value);
			return;
		}
		if ($schdpay_flg.equalsIgnoreCase(name)) {
			schdpay_flg(value);
			return;
		}
		if ($note_flg.equalsIgnoreCase(name)) {
			note_flg(value);
			return;
		}
		if ($rerun_flg.equalsIgnoreCase(name)) {
			rerun_flg(value);
			return;
		}
		if ($reget_flg.equalsIgnoreCase(name)) {
			reget_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($io_flg.equalsIgnoreCase(name)) {
			io_flg(value);
			return;
		}
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($rcv_flg.equalsIgnoreCase(name)) {
			rcv_flg(value);
			return;
		}
		if ($pay_flg.equalsIgnoreCase(name)) {
			pay_flg(value);
			return;
		}
		if ($schdpay_flg.equalsIgnoreCase(name)) {
			schdpay_flg(value);
			return;
		}
		if ($note_flg.equalsIgnoreCase(name)) {
			note_flg(value);
			return;
		}
		if ($rerun_flg.equalsIgnoreCase(name)) {
			rerun_flg(value);
			return;
		}
		if ($reget_flg.equalsIgnoreCase(name)) {
			reget_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

