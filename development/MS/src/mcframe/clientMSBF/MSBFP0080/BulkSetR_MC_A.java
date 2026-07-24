package mcframe.clientMSBF.MSBFP0080;

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

	/**
	 * Shipping approval date 出荷承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	public static final String $aprv_usr_p = "aprv_usr_p";
	public static final String $aprv_rsn_p = "aprv_rsn_p";

	public static final String $aprv_usr_cd = $aprv_usr_p + ".usr_cd";
	public static final String $aprv_usr_nm = $aprv_usr_p + ".usr_nm";
	public static final String $aprv_dpt_cd = $aprv_usr_p + ".dpt_cd";
	public static final String $aprv_dpt_nm = $aprv_usr_p + ".dpt_nm";
	public static final String $aprv_rsn = $aprv_rsn_p + ".txt";

	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_usr_p_META = createInnerRowMeta($aprv_usr_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta aprv_rsn_p_META = createInnerRowMeta($aprv_rsn_p, mcframe.clientMAUB.MAUBP0220.TxtR.class);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			aprv_dt_META,
			aprv_usr_p_META,
			aprv_rsn_p_META
		},
		new String[][]{
			{
				"aprv_usr_cd",
				"aprv_usr_nm",
				"aprv_dpt_cd",
				"aprv_dpt_nm",
				"aprv_rsn"
			},
			{
				$aprv_usr_cd,
				$aprv_usr_nm,
				$aprv_dpt_cd,
				$aprv_dpt_nm,
				$aprv_rsn
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
				{$aprv_usr_p + ".dpt_cd", "dpt_nm"}	// aprv_usr_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$aprv_usr_p + ".dpt_cd", "aprv_dt;aprv_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"}	// aprv_usr_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$aprv_usr_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// aprv_usr_p.dpt_cd
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



	/**
	 * Shipping approval date 出荷承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 0, $aprv_dt);
	}

	/**
	 * Shipping approval date 出荷承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 0, $aprv_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR aprv_usr_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 1, $aprv_usr_p);
	}
	
	public void aprv_usr_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 1, $aprv_usr_p, row);
	}


	public mcframe.clientMAUB.MAUBP0220.TxtR aprv_rsn_p(){
		return (mcframe.clientMAUB.MAUBP0220.TxtR) getConstInnerRow(offset + 2, $aprv_rsn_p);
	}
	
	public void aprv_rsn_p(mcframe.clientMAUB.MAUBP0220.TxtR row){
		setConstInnerRow(offset + 2, $aprv_rsn_p, row);
	}


	public MCDate getDate(String name) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($aprv_usr_p.equalsIgnoreCase(name)) {
			return aprv_usr_p();
		}
		if ($aprv_rsn_p.equalsIgnoreCase(name)) {
			return aprv_rsn_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($aprv_usr_p.equalsIgnoreCase(name)) {
			aprv_usr_p(
				((MCContainerMeta) aprv_usr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		if ($aprv_rsn_p.equalsIgnoreCase(name)) {
			aprv_rsn_p(
				((MCContainerMeta) aprv_rsn_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0220.TxtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Approver 承認者.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return aprv_usr_p().usr_cd();
	}

	/**
	 * Approver 承認者.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		aprv_usr_p().usr_cd(value);
	}

	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return aprv_usr_p().usr_nm();
	}

	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		aprv_usr_p().usr_nm(value);
	}

	/**
	 * Approval dept. 承認部門.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return aprv_usr_p().dpt_cd();
	}

	/**
	 * Approval dept. 承認部門.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		aprv_usr_p().dpt_cd(value);
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return aprv_usr_p().dpt_nm();
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		aprv_usr_p().dpt_nm(value);
	}

	/**
	 * Reason 理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return aprv_rsn_p().txt();
	}

	/**
	 * Reason 理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		aprv_rsn_p().txt(value);
	}

}

