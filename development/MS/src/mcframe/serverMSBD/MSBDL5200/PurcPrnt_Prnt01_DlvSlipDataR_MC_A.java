package mcframe.serverMSBD.MSBDL5200;

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
 * ブロック"PurcPrnt_Prnt01_DlvSlipData"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcPrnt_Prnt01_DlvSlipDataR_MC_A extends MCConstRow {

	public static final String $hdr = "hdr";
	public static final String $dtl = "dtl";
	public static final String $prov_hdr = "prov_hdr";
	public static final String $prov_dtl = "prov_dtl";
	public static final String $outsrc_bp_prnt_lcl_cd = "outsrc_bp_prnt_lcl_cd";
	public static final String $outsrc_prov_ddlv_flg = "outsrc_prov_ddlv_flg";
	public static final String $outsrc_sundry_itm_flg = "outsrc_sundry_itm_flg";


	public static final MCMeta hdr_META = createInnerRowMeta($hdr, mcframe.commonMSBE.MSBER0500.DlvSlipHdrR.class);
	public static final MCMeta dtl_META = createInnerRowMeta($dtl, mcframe.commonMSBE.MSBER0500.DlvSlipDtlR.class);
	public static final MCMeta prov_hdr_META = createInnerRowMeta($prov_hdr, mcframe.commonMSBE.MSBER0500.DlvSlipHdrR.class);
	public static final MCMeta prov_dtl_META = createInnerRowMeta($prov_dtl, mcframe.commonMSBE.MSBER0500.DlvSlipDtlR.class);
	public static final MCMeta outsrc_bp_prnt_lcl_cd_META = createCommonMeta($outsrc_bp_prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta outsrc_prov_ddlv_flg_META = createCommonMeta($outsrc_prov_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_sundry_itm_flg_META = createCommonMeta($outsrc_sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PurcPrnt_Prnt01_DlvSlipDataR> constMetas = new ConstMetaList<PurcPrnt_Prnt01_DlvSlipDataR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_META,
			dtl_META,
			prov_hdr_META,
			prov_dtl_META,
			outsrc_bp_prnt_lcl_cd_META,
			outsrc_prov_ddlv_flg_META,
			outsrc_sundry_itm_flg_META
		},
		new String[][]{
			{
			},
			{
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
	protected PurcPrnt_Prnt01_DlvSlipDataR_MC_A(ConstMetaList<? extends PurcPrnt_Prnt01_DlvSlipDataR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Prnt01_DlvSlipDataR clone() {
		return (PurcPrnt_Prnt01_DlvSlipDataR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Prnt01_DlvSlipDataR createInstance() {
		return (PurcPrnt_Prnt01_DlvSlipDataR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Prnt01_DlvSlipDataR getValues(String... names) {
		return (PurcPrnt_Prnt01_DlvSlipDataR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.commonMSBE.MSBER0500.DlvSlipHdrR hdr(){
		return (mcframe.commonMSBE.MSBER0500.DlvSlipHdrR) getConstInnerRow(offset + 0, $hdr);
	}
	
	public void hdr(mcframe.commonMSBE.MSBER0500.DlvSlipHdrR row){
		setConstInnerRow(offset + 0, $hdr, row);
	}


	public mcframe.commonMSBE.MSBER0500.DlvSlipDtlR dtl(){
		return (mcframe.commonMSBE.MSBER0500.DlvSlipDtlR) getConstInnerRow(offset + 1, $dtl);
	}
	
	public void dtl(mcframe.commonMSBE.MSBER0500.DlvSlipDtlR row){
		setConstInnerRow(offset + 1, $dtl, row);
	}


	public mcframe.commonMSBE.MSBER0500.DlvSlipHdrR prov_hdr(){
		return (mcframe.commonMSBE.MSBER0500.DlvSlipHdrR) getConstInnerRow(offset + 2, $prov_hdr);
	}
	
	public void prov_hdr(mcframe.commonMSBE.MSBER0500.DlvSlipHdrR row){
		setConstInnerRow(offset + 2, $prov_hdr, row);
	}


	public mcframe.commonMSBE.MSBER0500.DlvSlipDtlR prov_dtl(){
		return (mcframe.commonMSBE.MSBER0500.DlvSlipDtlR) getConstInnerRow(offset + 3, $prov_dtl);
	}
	
	public void prov_dtl(mcframe.commonMSBE.MSBER0500.DlvSlipDtlR row){
		setConstInnerRow(offset + 3, $prov_dtl, row);
	}


	public String outsrc_bp_prnt_lcl_cd() {
		return getConstString(offset + 4, $outsrc_bp_prnt_lcl_cd);
	}

	public void outsrc_bp_prnt_lcl_cd(String value) {
		setConstString(offset + 4, $outsrc_bp_prnt_lcl_cd, value);
	}


	public boolean outsrc_prov_ddlv_flg() {
		return getConstBoolean(offset + 5, $outsrc_prov_ddlv_flg);
	}

	public void outsrc_prov_ddlv_flg(boolean value) {
		setConstBoolean(offset + 5, $outsrc_prov_ddlv_flg, value);
	}


	public boolean outsrc_sundry_itm_flg() {
		return getConstBoolean(offset + 6, $outsrc_sundry_itm_flg);
	}

	public void outsrc_sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 6, $outsrc_sundry_itm_flg, value);
	}


	public String getString(String name) {
		if ($outsrc_bp_prnt_lcl_cd.equalsIgnoreCase(name)) {
			return outsrc_bp_prnt_lcl_cd();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($outsrc_prov_ddlv_flg.equalsIgnoreCase(name)) {
			return outsrc_prov_ddlv_flg();
		}
		if ($outsrc_sundry_itm_flg.equalsIgnoreCase(name)) {
			return outsrc_sundry_itm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($outsrc_bp_prnt_lcl_cd.equalsIgnoreCase(name)) {
			return outsrc_bp_prnt_lcl_cd();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($outsrc_prov_ddlv_flg.equalsIgnoreCase(name)) {
			return outsrc_prov_ddlv_flg();
		}
		if ($outsrc_sundry_itm_flg.equalsIgnoreCase(name)) {
			return outsrc_sundry_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($outsrc_bp_prnt_lcl_cd.equalsIgnoreCase(name)) {
			outsrc_bp_prnt_lcl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($outsrc_prov_ddlv_flg.equalsIgnoreCase(name)) {
			outsrc_prov_ddlv_flg(value);
			return;
		}
		if ($outsrc_sundry_itm_flg.equalsIgnoreCase(name)) {
			outsrc_sundry_itm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($outsrc_bp_prnt_lcl_cd.equalsIgnoreCase(name)) {
			outsrc_bp_prnt_lcl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($outsrc_prov_ddlv_flg.equalsIgnoreCase(name)) {
			outsrc_prov_ddlv_flg(value);
			return;
		}
		if ($outsrc_sundry_itm_flg.equalsIgnoreCase(name)) {
			outsrc_sundry_itm_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($hdr.equalsIgnoreCase(name)) {
			return hdr();
		}
		if ($dtl.equalsIgnoreCase(name)) {
			return dtl();
		}
		if ($prov_hdr.equalsIgnoreCase(name)) {
			return prov_hdr();
		}
		if ($prov_dtl.equalsIgnoreCase(name)) {
			return prov_dtl();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hdr.equalsIgnoreCase(name)) {
			hdr(
				((MCContainerMeta) hdr_META).castInnerRow(mcframe.commonMSBE.MSBER0500.DlvSlipHdrR.class, value)
			);
			return;
		}
		if ($dtl.equalsIgnoreCase(name)) {
			dtl(
				((MCContainerMeta) dtl_META).castInnerRow(mcframe.commonMSBE.MSBER0500.DlvSlipDtlR.class, value)
			);
			return;
		}
		if ($prov_hdr.equalsIgnoreCase(name)) {
			prov_hdr(
				((MCContainerMeta) prov_hdr_META).castInnerRow(mcframe.commonMSBE.MSBER0500.DlvSlipHdrR.class, value)
			);
			return;
		}
		if ($prov_dtl.equalsIgnoreCase(name)) {
			prov_dtl(
				((MCContainerMeta) prov_dtl_META).castInnerRow(mcframe.commonMSBE.MSBER0500.DlvSlipDtlR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


}

