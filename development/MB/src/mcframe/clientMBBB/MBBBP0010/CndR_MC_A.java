package mcframe.clientMBBB.MBBBP0010;

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


	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rerun_flg_META = createCommonMeta($rerun_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta reget_flg_META = createCommonMeta($reget_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_flg_META = createCommonMeta($io_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_flg_META = createCommonMeta($rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_flg_META = createCommonMeta($pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schdpay_flg_META = createCommonMeta($schdpay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta note_flg_META = createCommonMeta($note_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			dt_fr_META,
			dt_to_META,
			rerun_flg_META,
			reget_flg_META,
			io_flg_META,
			stk_flg_META,
			rcv_flg_META,
			pay_flg_META,
			schdpay_flg_META,
			note_flg_META
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
	 * Re-import 再取込.<p>
	 *
	 */
	public boolean rerun_flg() {
		return getConstBoolean(offset + 3, $rerun_flg);
	}

	/**
	 * Re-import 再取込.<p>
	 *
	 */
	public void rerun_flg(boolean value) {
		setConstBoolean(offset + 3, $rerun_flg, value);
	}


	/**
	 * Reacquire master マスタ再取得.<p>
	 *
	 */
	public boolean reget_flg() {
		return getConstBoolean(offset + 4, $reget_flg);
	}

	/**
	 * Reacquire master マスタ再取得.<p>
	 *
	 */
	public void reget_flg(boolean value) {
		setConstBoolean(offset + 4, $reget_flg, value);
	}


	/**
	 * GR/GI info. 受払情報.<p>
	 *
	 */
	public boolean io_flg() {
		return getConstBoolean(offset + 5, $io_flg);
	}

	/**
	 * GR/GI info. 受払情報.<p>
	 *
	 */
	public void io_flg(boolean value) {
		setConstBoolean(offset + 5, $io_flg, value);
	}


	/**
	 * Inventory info. 在庫情報.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 6, $stk_flg);
	}

	/**
	 * Inventory info. 在庫情報.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 6, $stk_flg, value);
	}


	/**
	 * Payment received info. 入金情報.<p>
	 *
	 */
	public boolean rcv_flg() {
		return getConstBoolean(offset + 7, $rcv_flg);
	}

	/**
	 * Payment received info. 入金情報.<p>
	 *
	 */
	public void rcv_flg(boolean value) {
		setConstBoolean(offset + 7, $rcv_flg, value);
	}


	/**
	 * Payment info. 支払情報.<p>
	 *
	 */
	public boolean pay_flg() {
		return getConstBoolean(offset + 8, $pay_flg);
	}

	/**
	 * Payment info. 支払情報.<p>
	 *
	 */
	public void pay_flg(boolean value) {
		setConstBoolean(offset + 8, $pay_flg, value);
	}


	/**
	 * Payment request info. 支払依頼情報.<p>
	 *
	 */
	public boolean schdpay_flg() {
		return getConstBoolean(offset + 9, $schdpay_flg);
	}

	/**
	 * Payment request info. 支払依頼情報.<p>
	 *
	 */
	public void schdpay_flg(boolean value) {
		setConstBoolean(offset + 9, $schdpay_flg, value);
	}


	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public boolean note_flg() {
		return getConstBoolean(offset + 10, $note_flg);
	}

	/**
	 * Note info. 手形情報.<p>
	 *
	 */
	public void note_flg(boolean value) {
		setConstBoolean(offset + 10, $note_flg, value);
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
		if ($rerun_flg.equalsIgnoreCase(name)) {
			return rerun_flg();
		}
		if ($reget_flg.equalsIgnoreCase(name)) {
			return reget_flg();
		}
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
		if ($rerun_flg.equalsIgnoreCase(name)) {
			return rerun_flg();
		}
		if ($reget_flg.equalsIgnoreCase(name)) {
			return reget_flg();
		}
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
		if ($rerun_flg.equalsIgnoreCase(name)) {
			rerun_flg(value);
			return;
		}
		if ($reget_flg.equalsIgnoreCase(name)) {
			reget_flg(value);
			return;
		}
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
		if ($rerun_flg.equalsIgnoreCase(name)) {
			rerun_flg(value);
			return;
		}
		if ($reget_flg.equalsIgnoreCase(name)) {
			reget_flg(value);
			return;
		}
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
		super.setBooleanNE(name, value);
	}



}

