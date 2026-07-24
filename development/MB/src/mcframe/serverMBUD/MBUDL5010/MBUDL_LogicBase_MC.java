package mcframe.serverMBUD.MBUDL5010;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.commonCore.sys.MCFactory;

import static mcframe.serverCore.mcjdbc.MCTransactionManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBUDL_LogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBUDL_LogicBase_MC extends MBUDL_LogicBase_MC_A{
	//FMCB CUSTOM START
	/** 項目属性ＩＤ「GROUP BY 定義」 */
	protected static final String GRP_DEF = "GRP_DEF";
	/** 属性文字列「集計キー項目」  */
	protected static final String GRP_DEF_KEY = "KEY";
	/** 属性文字列「集計項目（SUM）」  */
	protected static final String GRP_DEF_SUM = "SUM";

	/**
	 * 実装仕様書の項目属性定義「GRP_DEF」に従って集計した結果のリストを返します。<br>
	 * 実装仕様書で集計キー項目には「KEY」、集計項目には「SUM」を記述します。<br>
	 * 動的に切り替わる集計キー項目には上り電文のフラグ項目を記述します。<br>
	 * 集計結果をソートする場合には記述した文字列にカンマ区切りでソート順の番号を指定します。<br>
	 * 例）「KEY,1」「bp_flg,2」
	 */
	protected <R extends MCConstRow> MCList<R> groupBy(MCList<R> down, MCRow up) {
		MCConstRow proto = down.createRow();
		Map<String, String> map = proto.getExtMap(GRP_DEF);
		if (map == null) {
			return down;
		}
		List<String> keys = new ArrayList<String>();
		List<String> sums = new ArrayList<String>();
		MCList<MCRow> odrL = MCList.create(MCRow.class);

		for(Map.Entry<String, String> e : map.entrySet()) {
			String[] strs = e.getValue().split("\\,");
			String str = strs[0];
			MCNumber odrNo = null;
			if (strs.length > 1) {
				odrNo = MCNumber.valueOf(strs[1]);
			}

			if (isSame(GRP_DEF_KEY, str)) {
				keys.add(e.getKey());
			}
			else if (isSame(GRP_DEF_SUM, str)) {
				sums.add(e.getKey());
			}
			// 動的集計キー項目
			else {
				if (up.getBooleanNE(str)) {
					keys.add(e.getKey());
				}
				else {
					odrNo = null;
				}
			}
			if (!isNull(odrNo)) {
				MCRow r = MCRow.create();
				r.addNumberColumn("num", odrNo);
				r.addStringColumn("col", e.getKey());
				odrL.add(r);
			}
		}
		MCGroupByPolicy policy = new MCGroupByPolicy();
		policy.addKey(keys.toArray(new String[0]));
		policy.sum(sums.toArray(new String[0]));
		MCList<R> l = down.groupBy(policy);
		if (!odrL.isEmpty()) {
			MCSortPolicy sp = new MCSortPolicy();
			odrL.sort("num", "col");
			for (MCRow r : odrL) {
				sp.add(SortType.ASC, r.getString("col"));
			}
			l.sort(sp);
		}
		return l;
	}

	// -- ユーティリティ（START）

	/**
	 * 更新処理成功時の後処理を行います。
	 * <p>
	 * 
	 * @param l
	 * @param errFlgCol
	 * @param rtnStsTypCol
	 */
	protected void handleSuccess(MCList<?> l, String errFlgCol, String rtnStsTypCol) {
		dbTran().commit();
		for (MCRow r : l) {
			if (!r.getBooleanNE(errFlgCol)) {
				r.setString(rtnStsTypCol, MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	/**
	 * 更新処理成功時の後処理を行います。
	 * <p>
	 * エラーフラグ項目は「err_flg」、結果区分項目は「rtn_sts_typ」固定です。
	 * 
	 * @param l
	 */
	protected void handleSuccess(MCList<?> l) {
		String errFlgCol = "err_flg";
		String rtnStsTypCol = "rtn_sts_typ";
		handleSuccess(l, errFlgCol, rtnStsTypCol);
	}

	/**
	 * 更新処理例外発生時の後処理を行います。
	 * <p>
	 * 
	 * @param e
	 * @param l
	 * @param rtnStsTypCol
	 */
	protected void handleEx(Exception e, MCList<?> l, String rtnStsTypCol) {
		dbTran().rollback();
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException) e;
		} else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (MCRow r : l) {
			r.setString(rtnStsTypCol, MAC_RTN_STS_TYP.ERR.value());
		}
	}

	/**
	 * 更新処理例外発生時の後処理を行います。
	 * <p>
	 * 結果区分項目は「rtn_sts_typ」固定です。
	 * 
	 * @param e
	 * @param l
	 */
	protected void handleEx(Exception e, MCList<?> l) {
		String rtnStsTypCol = "rtn_sts_typ";
		handleEx(e, l, rtnStsTypCol);
	}

	/**
	 * 更新処理例外発生時の後処理を行います。
	 * <p>
	 */
	protected void handleExRow(Exception e, MCSavepoint sp, MCRow r, String errFlgCol, String rtnStsTypCol) {
		// ロールバック（セーブポイント対応）
		if (sp == null) {
			dbTran().rollback();
		}
		else {
			dbTran().rollback(sp);
		}
		// 例外メッセージ後処理
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException) e;
		} else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		// err_flg = ON
		r.setBoolean(errFlgCol, true);
		// rtn_sts_typ = ERR
		r.setString(rtnStsTypCol, MAC_RTN_STS_TYP.ERR.value());
	}
	
	/**
	 * 更新処理例外発生時の後処理を行います。
	 * <p>
	 */
	protected void handleExRow(Exception e, MCSavepoint sp, MCRow r) {
		handleExRow(e, sp, r, "err_flg", "rtn_sts_typ");
	}

	/**
	 * 送受信ＩＦ制御の新規追加オペレーションを実行します。
	 * <p>
	 * 上り電文の各レコードには data_no, ext_sys_cd, if_proc_typ の設定が必要です。
	 * 
	 * @param upL 上り電文
	 */
	protected void callSendRecvIf(MCList<MCRow> upL) {
		String modId = "PF";
		String lgcId = "PFBZL9050";
		String opeId = "Ins01";

		// オペレーション作成
		MCOperation ope = createOperation(modId, lgcId, opeId, MCOperation.class);
		// 上り電文の設定
		MCList<MCRow> up0 = (MCList<MCRow>) ope.up(0);
		for (MCRow upR : upL) {
			MCRow r = up0.createRow();
			r.setValuesByName(upR);
			up0.add(r);
		}
		// 実行
		ope.exec();
	}
	/**
	 * 送受信ＩＦ制御の新規追加オペレーションの上り電文に追加するRowを生成して返します。
	 * <p>
	 * 
	 */
	protected MCRow createSendRecvIfUpR(MCNumber dataNo, String extSysCd, String ifProcTyp) {
		MCRow r = MCRow.create();
		r.setNumberNE("data_no", dataNo);
		r.setStringNE("ext_sys_cd", extSysCd);
		r.setStringNE("if_proc_typ", ifProcTyp);
		return r;
	}
	/**
	 * PFT_SDRV_IFをdata_noでロック、削除します。<p>
	 * 引数のバインドリストの各レコードにはdata_noの設定が必要です。
	 * <p>
	 */
	protected void delPftSdrvIf(MCList<? extends MCDBContainer> bindL) {
		if (!bindL.isEmpty()) {
			// PFT_SDRV_IF_Rコンテナ生成
			Class<?> clazz = MCFactory.getClass(MCDBContainer.class, "mcframe.serverPF.dbc.PFT_SDRV_IF_R");
			MCDBContainer psi = (MCDBContainer)MCFactory.invokeStatic(clazz, "create", new Class[]{String.class}, new Object[]{"T1"});
			
			// 主キーワークテーブルへのinsertおよびメインテーブルのロック
			selectForUpdateNoWaitPkWk(createSqlId(LOGIC_ID, psi, "S01"),
					MCList.create(MCRow.class), psi, bindL);
			
			// 主キーワークテーブルを使用してPFT_SDRV_IFを削除
			MCDBContainer psiWk = psi.getPkWorkDbc("W1");
			MCNumberPermColumn data_no = (MCNumberPermColumn)psi.getColumn$("data_no");
			MCNumberPermColumn data_noWk = (MCNumberPermColumn)psiWk.getColumn$("data_no");
			sql(createSqlId(LOGIC_ID, psi, "D01"))
				.delete(psi)
				.where(
					exists(
						subQuery().select(value("X")).from(psiWk).where(data_noWk.eq(data_no)
						)
					)
				)
				.executeUpdate();

			// ワークテーブル削除
			dbWkDelete(createSqlId(LOGIC_ID, psiWk, "D02"), psi);

			bindL.clear();
		}
	}

	// -- ユーティリティ（END）
	//FMCB CUSTOM END
}