package mcframe.clientMSBF.MSBFP0010;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	public static final String $st_dt_p = "st_dt_p";
	public static final String $end_dt_p = "end_dt_p";

	public static final String $st_dt = $st_dt_p + ".ymd";
	public static final String $st_hm = $st_dt_p + ".hm";
	public static final String $end_dt = $end_dt_p + ".ymd";
	public static final String $end_hm = $end_dt_p + ".hm";

	public static final MCMeta st_dt_p_META = createInnerRowMeta($st_dt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta end_dt_p_META = createInnerRowMeta($end_dt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_p_META,
			end_dt_p_META
		},
		new String[][]{
			{
				"st_dt",
				"st_hm",
				"end_dt",
				"end_hm"
			},
			{
				$st_dt,
				$st_hm,
				$end_dt,
				$end_hm
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0110.YmdHmR st_dt_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 0, $st_dt_p);
	}
	
	public void st_dt_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 0, $st_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR end_dt_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 1, $end_dt_p);
	}
	
	public void end_dt_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 1, $end_dt_p, row);
	}






	public MCRow getInnerRow(String name) {
		if ($st_dt_p.equalsIgnoreCase(name)) {
			return st_dt_p();
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			return end_dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($st_dt_p.equalsIgnoreCase(name)) {
			st_dt_p(
				((MCContainerMeta) st_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			end_dt_p(
				((MCContainerMeta) end_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Scheduled start date 開始予定日.<p>
	 *
	 */
	public MCDate st_dt() {
		return st_dt_p().ymd();
	}

	/**
	 * Scheduled start date 開始予定日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		st_dt_p().ymd(value);
	}

	/**
	 * Scheduled start time 開始予定時刻.<p>
	 *
	 */
	public MCDate st_hm() {
		return st_dt_p().hm();
	}

	/**
	 * Scheduled start time 開始予定時刻.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		st_dt_p().hm(value);
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCDate end_dt() {
		return end_dt_p().ymd();
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		end_dt_p().ymd(value);
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public MCDate end_hm() {
		return end_dt_p().hm();
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		end_dt_p().hm(value);
	}

}

