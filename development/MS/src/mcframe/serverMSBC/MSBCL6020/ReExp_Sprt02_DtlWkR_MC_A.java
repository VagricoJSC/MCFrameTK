package mcframe.serverMSBC.MSBCL6020;

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
 * ブロック"ReExp_Sprt02_DtlWk"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ReExp_Sprt02_DtlWkR_MC_A extends MCConstRow {

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public static final String $mst_wk_cost = "mst_wk_cost";
	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public static final String $mst_fxd_wk_cost = "mst_fxd_wk_cost";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Explosion result matching 展開結果マッチング.<p>
	 *
	 */
	public static final String $match_flg = "match_flg";
	/**
	 * With result 実績あり.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta mst_wk_cost_META = createCommonMeta($mst_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta mst_fxd_wk_cost_META = createCommonMeta($mst_fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta match_flg_META = createCommonMeta($match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ReExp_Sprt02_DtlWkR> constMetas = new ConstMetaList<ReExp_Sprt02_DtlWkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			oper_peg_no_META,
			wk_schd_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			wk_cost_cd_META,
			mst_wk_cost_META,
			mst_fxd_wk_cost_META,
			oper_cd_META,
			oper_seq_META,
			match_flg_META,
			act_flg_META
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
	protected ReExp_Sprt02_DtlWkR_MC_A(ConstMetaList<? extends ReExp_Sprt02_DtlWkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt02_DtlWkR clone() {
		return (ReExp_Sprt02_DtlWkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt02_DtlWkR createInstance() {
		return (ReExp_Sprt02_DtlWkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ReExp_Sprt02_DtlWkR getValues(String... names) {
		return (ReExp_Sprt02_DtlWkR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 2, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 3, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 3, $wk_schd_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 4, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 4, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 5, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 5, $oper_inst_no, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 6, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 6, $wk_cost_cd, value);
	}


	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public MCNumber mst_wk_cost() {
		return getConstNumber(offset + 7, $mst_wk_cost);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(MCNumber value) {
		setConstNumber(offset + 7, $mst_wk_cost, value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(int value) {
		setConstNumber(offset + 7, $mst_wk_cost, value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(long value) {
		setConstNumber(offset + 7, $mst_wk_cost, value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(float value) {
		setConstNumber(offset + 7, $mst_wk_cost, value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(double value) {
		setConstNumber(offset + 7, $mst_wk_cost, value);
	}


	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public MCNumber mst_fxd_wk_cost() {
		return getConstNumber(offset + 8, $mst_fxd_wk_cost);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 8, $mst_fxd_wk_cost, value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(int value) {
		setConstNumber(offset + 8, $mst_fxd_wk_cost, value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(long value) {
		setConstNumber(offset + 8, $mst_fxd_wk_cost, value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(float value) {
		setConstNumber(offset + 8, $mst_fxd_wk_cost, value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(double value) {
		setConstNumber(offset + 8, $mst_fxd_wk_cost, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 9, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 9, $oper_cd, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 10, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}


	/**
	 * Explosion result matching 展開結果マッチング.<p>
	 *
	 */
	public boolean match_flg() {
		return getConstBoolean(offset + 11, $match_flg);
	}

	/**
	 * Explosion result matching 展開結果マッチング.<p>
	 *
	 */
	public void match_flg(boolean value) {
		setConstBoolean(offset + 11, $match_flg, value);
	}


	/**
	 * With result 実績あり.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 12, $act_flg);
	}

	/**
	 * With result 実績あり.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 12, $act_flg, value);
	}


	public String getString(String name) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			return mst_wk_cost();
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			return mst_fxd_wk_cost();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($match_flg.equalsIgnoreCase(name)) {
			return match_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			return mst_wk_cost();
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			return mst_fxd_wk_cost();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($match_flg.equalsIgnoreCase(name)) {
			return match_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($match_flg.equalsIgnoreCase(name)) {
			match_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($match_flg.equalsIgnoreCase(name)) {
			match_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

