package mcframe.serverMSBE.MSBEL5080;

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
 * ブロック"InptStkRpl_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InptStkRpl_CndR_MC_A extends MCConstRow {

	/**
	 * Delete transport schedule 移送予定削除.<p>
	 *
	 */
	public static final String $xfr_schd_del_flg = "xfr_schd_del_flg";
	/**
	 * Create transport schedule 移送予定作成.<p>
	 *
	 */
	public static final String $xfr_schd_crt_flg = "xfr_schd_crt_flg";
	/**
	 * Delete shortage info. 不足情報削除.<p>
	 *
	 */
	public static final String $inpt_stk_rpl_lst_del_flg = "inpt_stk_rpl_lst_del_flg";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $opn_flg = "opn_flg";
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public static final String $ord_sav_flg = "ord_sav_flg";
	/**
	 * Request 依頼.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $schd_flg = "schd_flg";
	/**
	 * Save mfg. order 製造保存.<p>
	 *
	 */
	public static final String $mfg_sav_flg = "mfg_sav_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $ord_flg = "ord_flg";
	/**
	 * In process 着手中.<p>
	 *
	 */
	public static final String $stt_flg = "stt_flg";
	/**
	 * Scheduled input date FROM 投入予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Scheduled input date TO 投入予定日ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * Scheduled input date and time FROM 投入予定日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $tm_fr = "tm_fr";
	/**
	 * Scheduled input date and time TO 投入予定日時ＴＯ.<p>
	 *
	 */
	public static final String $tm_to = "tm_to";
	/**
	 * Screen execution 画面実行.<p>
	 *
	 */
	public static final String $screen_flg = "screen_flg";
	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";


	public static final MCMeta xfr_schd_del_flg_META = createCommonMeta($xfr_schd_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_schd_crt_flg_META = createCommonMeta($xfr_schd_crt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_stk_rpl_lst_del_flg_META = createCommonMeta($inpt_stk_rpl_lst_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta opn_flg_META = createCommonMeta($opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_sav_flg_META = createCommonMeta($ord_sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_flg_META = createCommonMeta($schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_sav_flg_META = createCommonMeta($mfg_sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_flg_META = createCommonMeta($ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stt_flg_META = createCommonMeta($stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tm_fr_META = createCommonMeta($tm_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta tm_to_META = createCommonMeta($tm_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta screen_flg_META = createCommonMeta($screen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);

	protected static final ConstMetaList<InptStkRpl_CndR> constMetas = new ConstMetaList<InptStkRpl_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xfr_schd_del_flg_META,
			xfr_schd_crt_flg_META,
			inpt_stk_rpl_lst_del_flg_META,
			opn_flg_META,
			ord_sav_flg_META,
			fix_flg_META,
			schd_flg_META,
			mfg_sav_flg_META,
			ord_flg_META,
			stt_flg_META,
			dt_fr_META,
			dt_to_META,
			tm_fr_META,
			tm_to_META,
			screen_flg_META,
			batch_log_no_META
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
	protected InptStkRpl_CndR_MC_A(ConstMetaList<? extends InptStkRpl_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InptStkRpl_CndR clone() {
		return (InptStkRpl_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InptStkRpl_CndR createInstance() {
		return (InptStkRpl_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InptStkRpl_CndR getValues(String... names) {
		return (InptStkRpl_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Delete transport schedule 移送予定削除.<p>
	 *
	 */
	public boolean xfr_schd_del_flg() {
		return getConstBoolean(offset + 0, $xfr_schd_del_flg);
	}

	/**
	 * Delete transport schedule 移送予定削除.<p>
	 *
	 */
	public void xfr_schd_del_flg(boolean value) {
		setConstBoolean(offset + 0, $xfr_schd_del_flg, value);
	}


	/**
	 * Create transport schedule 移送予定作成.<p>
	 *
	 */
	public boolean xfr_schd_crt_flg() {
		return getConstBoolean(offset + 1, $xfr_schd_crt_flg);
	}

	/**
	 * Create transport schedule 移送予定作成.<p>
	 *
	 */
	public void xfr_schd_crt_flg(boolean value) {
		setConstBoolean(offset + 1, $xfr_schd_crt_flg, value);
	}


	/**
	 * Delete shortage info. 不足情報削除.<p>
	 *
	 */
	public boolean inpt_stk_rpl_lst_del_flg() {
		return getConstBoolean(offset + 2, $inpt_stk_rpl_lst_del_flg);
	}

	/**
	 * Delete shortage info. 不足情報削除.<p>
	 *
	 */
	public void inpt_stk_rpl_lst_del_flg(boolean value) {
		setConstBoolean(offset + 2, $inpt_stk_rpl_lst_del_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean opn_flg() {
		return getConstBoolean(offset + 3, $opn_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void opn_flg(boolean value) {
		setConstBoolean(offset + 3, $opn_flg, value);
	}


	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public boolean ord_sav_flg() {
		return getConstBoolean(offset + 4, $ord_sav_flg);
	}

	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public void ord_sav_flg(boolean value) {
		setConstBoolean(offset + 4, $ord_sav_flg, value);
	}


	/**
	 * Request 依頼.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 5, $fix_flg);
	}

	/**
	 * Request 依頼.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 5, $fix_flg, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 6, $schd_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 6, $schd_flg, value);
	}


	/**
	 * Save mfg. order 製造保存.<p>
	 *
	 */
	public boolean mfg_sav_flg() {
		return getConstBoolean(offset + 7, $mfg_sav_flg);
	}

	/**
	 * Save mfg. order 製造保存.<p>
	 *
	 */
	public void mfg_sav_flg(boolean value) {
		setConstBoolean(offset + 7, $mfg_sav_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean ord_flg() {
		return getConstBoolean(offset + 8, $ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void ord_flg(boolean value) {
		setConstBoolean(offset + 8, $ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean stt_flg() {
		return getConstBoolean(offset + 9, $stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void stt_flg(boolean value) {
		setConstBoolean(offset + 9, $stt_flg, value);
	}


	/**
	 * Scheduled input date FROM 投入予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 10, $dt_fr);
	}

	/**
	 * Scheduled input date FROM 投入予定日ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 10, $dt_fr, value);
	}


	/**
	 * Scheduled input date TO 投入予定日ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 11, $dt_to);
	}

	/**
	 * Scheduled input date TO 投入予定日ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 11, $dt_to, value);
	}


	/**
	 * Scheduled input date and time FROM 投入予定日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate tm_fr() {
		return getConstDate(offset + 12, $tm_fr);
	}

	/**
	 * Scheduled input date and time FROM 投入予定日時ＦＲＯＭ.<p>
	 *
	 */
	public void tm_fr(MCDate value) {
		setConstDate(offset + 12, $tm_fr, value);
	}


	/**
	 * Scheduled input date and time TO 投入予定日時ＴＯ.<p>
	 *
	 */
	public MCDate tm_to() {
		return getConstDate(offset + 13, $tm_to);
	}

	/**
	 * Scheduled input date and time TO 投入予定日時ＴＯ.<p>
	 *
	 */
	public void tm_to(MCDate value) {
		setConstDate(offset + 13, $tm_to, value);
	}


	/**
	 * Screen execution 画面実行.<p>
	 *
	 */
	public boolean screen_flg() {
		return getConstBoolean(offset + 14, $screen_flg);
	}

	/**
	 * Screen execution 画面実行.<p>
	 *
	 */
	public void screen_flg(boolean value) {
		setConstBoolean(offset + 14, $screen_flg, value);
	}


	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 15, $batch_log_no);
	}

	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 15, $batch_log_no, value);
	}


	public String getString(String name) {
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($tm_fr.equalsIgnoreCase(name)) {
			return tm_fr();
		}
		if ($tm_to.equalsIgnoreCase(name)) {
			return tm_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($xfr_schd_del_flg.equalsIgnoreCase(name)) {
			return xfr_schd_del_flg();
		}
		if ($xfr_schd_crt_flg.equalsIgnoreCase(name)) {
			return xfr_schd_crt_flg();
		}
		if ($inpt_stk_rpl_lst_del_flg.equalsIgnoreCase(name)) {
			return inpt_stk_rpl_lst_del_flg();
		}
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($ord_sav_flg.equalsIgnoreCase(name)) {
			return ord_sav_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($mfg_sav_flg.equalsIgnoreCase(name)) {
			return mfg_sav_flg();
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			return stt_flg();
		}
		if ($screen_flg.equalsIgnoreCase(name)) {
			return screen_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($tm_fr.equalsIgnoreCase(name)) {
			return tm_fr();
		}
		if ($tm_to.equalsIgnoreCase(name)) {
			return tm_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($xfr_schd_del_flg.equalsIgnoreCase(name)) {
			return xfr_schd_del_flg();
		}
		if ($xfr_schd_crt_flg.equalsIgnoreCase(name)) {
			return xfr_schd_crt_flg();
		}
		if ($inpt_stk_rpl_lst_del_flg.equalsIgnoreCase(name)) {
			return inpt_stk_rpl_lst_del_flg();
		}
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($ord_sav_flg.equalsIgnoreCase(name)) {
			return ord_sav_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($mfg_sav_flg.equalsIgnoreCase(name)) {
			return mfg_sav_flg();
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			return stt_flg();
		}
		if ($screen_flg.equalsIgnoreCase(name)) {
			return screen_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($tm_fr.equalsIgnoreCase(name)) {
			tm_fr(value);
			return;
		}
		if ($tm_to.equalsIgnoreCase(name)) {
			tm_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($xfr_schd_del_flg.equalsIgnoreCase(name)) {
			xfr_schd_del_flg(value);
			return;
		}
		if ($xfr_schd_crt_flg.equalsIgnoreCase(name)) {
			xfr_schd_crt_flg(value);
			return;
		}
		if ($inpt_stk_rpl_lst_del_flg.equalsIgnoreCase(name)) {
			inpt_stk_rpl_lst_del_flg(value);
			return;
		}
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($ord_sav_flg.equalsIgnoreCase(name)) {
			ord_sav_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($mfg_sav_flg.equalsIgnoreCase(name)) {
			mfg_sav_flg(value);
			return;
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			stt_flg(value);
			return;
		}
		if ($screen_flg.equalsIgnoreCase(name)) {
			screen_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($tm_fr.equalsIgnoreCase(name)) {
			tm_fr(value);
			return;
		}
		if ($tm_to.equalsIgnoreCase(name)) {
			tm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($xfr_schd_del_flg.equalsIgnoreCase(name)) {
			xfr_schd_del_flg(value);
			return;
		}
		if ($xfr_schd_crt_flg.equalsIgnoreCase(name)) {
			xfr_schd_crt_flg(value);
			return;
		}
		if ($inpt_stk_rpl_lst_del_flg.equalsIgnoreCase(name)) {
			inpt_stk_rpl_lst_del_flg(value);
			return;
		}
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($ord_sav_flg.equalsIgnoreCase(name)) {
			ord_sav_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($mfg_sav_flg.equalsIgnoreCase(name)) {
			mfg_sav_flg(value);
			return;
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			stt_flg(value);
			return;
		}
		if ($screen_flg.equalsIgnoreCase(name)) {
			screen_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

