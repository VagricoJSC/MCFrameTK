package mcframe.clientMSBF.MSBFP0060;

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
 * ブロック"ActBulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ActBulkSetR_MC_A extends MCConstRow {

	public static final String $st_dt_p = "st_dt_p";
	public static final String $end_dt_p = "end_dt_p";
	public static final String $act_usr_dpt_p = "act_usr_dpt_p";

	public static final String $st_dt = $st_dt_p + ".ymd";
	public static final String $st_hm = $st_dt_p + ".hm";
	public static final String $end_dt = $end_dt_p + ".ymd";
	public static final String $end_hm = $end_dt_p + ".hm";
	public static final String $act_usr_cd = $act_usr_dpt_p + ".usr_cd";
	public static final String $act_usr_nm = $act_usr_dpt_p + ".usr_nm";
	public static final String $act_dpt_cd = $act_usr_dpt_p + ".dpt_cd";
	public static final String $act_dpt_nm = $act_usr_dpt_p + ".dpt_nm";

	public static final MCMeta st_dt_p_META = createInnerRowMeta($st_dt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta end_dt_p_META = createInnerRowMeta($end_dt_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta act_usr_dpt_p_META = createInnerRowMeta($act_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);

	protected static final ConstMetaList<ActBulkSetR> constMetas = new ConstMetaList<ActBulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_p_META,
			end_dt_p_META,
			act_usr_dpt_p_META
		},
		new String[][]{
			{
				"st_dt",
				"st_hm",
				"end_dt",
				"end_hm",
				"act_usr_cd",
				"act_usr_nm",
				"act_dpt_cd",
				"act_dpt_nm"
			},
			{
				$st_dt,
				$st_hm,
				$end_dt,
				$end_hm,
				$act_usr_cd,
				$act_usr_nm,
				$act_dpt_cd,
				$act_dpt_nm
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
				{$act_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// act_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$act_usr_dpt_p + ".dpt_cd", "st_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"}	// act_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$act_usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// act_usr_dpt_p.dpt_cd
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
	protected ActBulkSetR_MC_A(ConstMetaList<? extends ActBulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActBulkSetR clone() {
		return (ActBulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActBulkSetR createInstance() {
		return (ActBulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActBulkSetR getValues(String... names) {
		return (ActBulkSetR) super.getValues(names);
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


	public mcframe.clientMAUB.MAUBP0320.UsrDptR act_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 2, $act_usr_dpt_p);
	}
	
	public void act_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 2, $act_usr_dpt_p, row);
	}






	public MCRow getInnerRow(String name) {
		if ($st_dt_p.equalsIgnoreCase(name)) {
			return st_dt_p();
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			return end_dt_p();
		}
		if ($act_usr_dpt_p.equalsIgnoreCase(name)) {
			return act_usr_dpt_p();
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
		if ($act_usr_dpt_p.equalsIgnoreCase(name)) {
			act_usr_dpt_p(
				((MCContainerMeta) act_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Start date 開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return st_dt_p().ymd();
	}

	/**
	 * Start date 開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		st_dt_p().ymd(value);
	}

	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public MCDate st_hm() {
		return st_dt_p().hm();
	}

	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		st_dt_p().hm(value);
	}

	/**
	 * End date 終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return end_dt_p().ymd();
	}

	/**
	 * End date 終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		end_dt_p().ymd(value);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_hm() {
		return end_dt_p().hm();
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		end_dt_p().hm(value);
	}

	/**
	 * Result PIC 実績担当者.<p>
	 *
	 */
	public String act_usr_cd() {
		return act_usr_dpt_p().usr_cd();
	}

	/**
	 * Result PIC 実績担当者.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		act_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Result PIC name 実績担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return act_usr_dpt_p().usr_nm();
	}

	/**
	 * Result PIC name 実績担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		act_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Result dept. 実績部門.<p>
	 *
	 */
	public String act_dpt_cd() {
		return act_usr_dpt_p().dpt_cd();
	}

	/**
	 * Result dept. 実績部門.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		act_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return act_usr_dpt_p().dpt_nm();
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		act_usr_dpt_p().dpt_nm(value);
	}

}

