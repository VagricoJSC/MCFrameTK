package mcframe.serverMBBE.MBBEL0080;

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
import mcframe.serverFXBA.FXBAL0120.*;
import mcframe.commonFX.constant.*;
import mcframe.serverMBBE.MBBEL5010.*;
import mcframe.serverCore.acl.MCACLManager;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import mcframe.commonCore.resource.MCLocaleConst;
import mcframe.commonCore.resource.MCMessageConst;
import static mcframe.commonCore.notice.Core_Msg.FCBHC0024;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_BatchIfDataConfirm"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_BatchIfDataConfirm_MC extends MBBEL_BatchIfDataConfirm_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MBBEL_BatchIfDataConfirm_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			callBatchLogSrch();
		}

		protected void callBatchLogSrch() {
			BatchLog_FW.Srch01 logSrch = BatchLog.crtSrch01();

			for (Srch01_CndR logR : up0()) {
				mcframe.serverFXBA.FXBAL0120.CndR r = mcframe.serverFXBA.FXBAL0120.CndR.create();
				r.batch_log_no(logR.batch_log_no());
				r.log_sub_key1(logR.log_sub_key1());
				r.log_sub_key2(logR.log_sub_key2());
				logSrch.up0().add(r);
			}
			logSrch.exec();
			setAll(down0(), logSrch.down1(), createMap_Srch01_RsltR_BatchLogMsgR());
			setSeq(down0());
		}
	}

	protected void setSeq(MCList<Srch01_RsltR> down) {

		String[] cols = new String[] {
				Srch01_RsltR.$batch_log_no, Srch01_RsltR.$log_sub_key1,
				Srch01_RsltR.$log_sub_key2
		};
		down.sort(Srch01_RsltR.$seq);
		MCList<Srch01_RsltR> logGrp = down.groupBy(cols);
		for (Srch01_RsltR log : logGrp) {
			Comparable<?>[] vals = new Comparable<?>[] {
					log.batch_log_no(), log.log_sub_key1(), log.log_sub_key2()
			};
			MCIndexKey idxkey = down.createIndex(cols);
			MCList<Srch01_RsltR> list = down.subList(idxkey, vals);
			int i = 1;
			for (Srch01_RsltR row : list) {
				row.seq(i);
				i++;
			}
		}
	}

	protected Map_Srch01_RsltR_BatchLogMsgR<Srch01_RsltR, BatchLogMsgR> createMap_Srch01_RsltR_BatchLogMsgR() {
		return new Map_Srch01_RsltR_BatchLogMsgR<Srch01_RsltR, BatchLogMsgR>();
	}

	public class Map_Srch01_RsltR_BatchLogMsgR<D extends Srch01_RsltR, S extends BatchLogMsgR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_RsltR.$batch_log_no, BatchLogMsgR.$batch_log_no);
			addColumnPathMap(Srch01_RsltR.$seq, BatchLogMsgR.$seq);
			addColumnPathMap(Srch01_RsltR.$log_sub_key1, BatchLogMsgR.$log_sub_key1);
			addColumnPathMap(Srch01_RsltR.$log_sub_key2, BatchLogMsgR.$log_sub_key2);
			addColumnPathMap(Srch01_RsltR.$batch_log_typ, BatchLogMsgR.$batch_log_typ);
			addColumnPathMap(Srch01_RsltR.$msg_id, BatchLogMsgR.$msg_id);
			addColumnPathMap(Srch01_RsltR.$msg_lvl, BatchLogMsgR.$msg_lvl);
			addColumnPathMap(Srch01_RsltR.$log_ts, BatchLogMsgR.$log_ts);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MCMessage msg = new MCMessage(src.msg_id(), getPrms(src));
			MCMessageConst msgConst = MCLocaleConst.message(MCSys.user.locale());
			dest.msg_txt(msg.toString(msgConst));
		}

		protected String[] getPrms(S src) {
			String[] strs = new String[39];
			for (int i = 1; i <= 40; i++) {
				String prm = null;
				if (i >= 1 && i <= 9) {
					prm = src.getStringNE("prm0" + i);
				}
				else {
					prm = src.getStringNE("prm" + i);
				}

				if (prm != null) {
					strs[i - 1] = prm;
				}
			}

			return strs;
		}
	}

	/**
	 * 権限がある場合 true を返します。
	 * 権限文字列は次のようになります。
	 * <code>
	 * [画面モジュールID].[画面ID].[テーブル名].[ACタイプ]
	 * </code>
	 * @param moduleid モジュールID
	 * @param screenid　画面ＩＤ
	 * @param tbl テーブル名
	 * @param actype ACタイプ
	 * @return 権限がない場合 false
	 */
	protected boolean checkACL(String moduleid, String screenid, String tbl, String actype) {
		String ac = MCConst.createKey(tbl, actype);
		MCACLManager srvmgr = MCACLManager.createServerManager();
		return srvmgr.authorize(moduleid, screenid, ac, tbl);
	}


	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MBBEL_BatchIfDataConfirm_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
			
		}
		@Override
		protected void doIt() {

			String table = up0().table();
			String moduleid = up0().moduleid();
			String screenid = up0().screenid();
			if (!checkACL(moduleid, screenid, table, "imp")) {
				throw new MCException(FCBHC0024, moduleid, screenid, table);
			}

		
			int rowno = -1;

			IfDataImp_Upd01_DtlR dbr = null;
			MCList<IfDataImp_Upd01_DtlR> dbl = MCList.create(IfDataImp_Upd01_DtlR.class);
			MCList<Upd01_RsltR> rsltL = up1();
			for (Upd01_RsltR rsltR : rsltL) {
				if (rowno != rsltR.rowno().intValue()) {
					if (dbr != null) {
						dbl.add(dbr);
					}
					rowno = rsltR.rowno().intValue();
					dbr = (dbl != null) ? dbl.createRow() : null;
				}
				if (dbr != null) {
					String id = rsltR.id();
					MCDataType type = MCDataType.valueOf(rsltR.type());
					switch (type) {
					case STRING:
						dbr.setString(id, rsltR.STRING());
						break;
					case NUMBER:
						dbr.setNumber(id, rsltR.NUMBER());
						break;
					case BOOLEAN:
						dbr.setBoolean(id, rsltR.BOOLEAN());
						break;
					case DATE:
						dbr.setDate(id, rsltR.DATE());
						break;
					case TIMESTAMP:
						dbr.setTimestamp(id, rsltR.TIMESTAMP());
						break;
					case BINARY:
						dbr.setBinary(id, rsltR.BINARY());
						break;
					default:
						break;
					}
				}
			}
			if (dbr != null) {
				dbl.add(dbr);
			}

			callImpOpe(dbl);
		}

		protected void callImpOpe(MCList<IfDataImp_Upd01_DtlR> dbl) {
			if (isNull(up0().imp_ope())) {
				return;
			}
			IfMBBEL_IfDataImpService_Upd01 o = createImpOperation();
			o.up0().setAll(
				dbl.groupBy(
					IfDataImp_Upd01_DtlR.$data_lno,
					IfDataImp_Upd01_DtlR.$data_no,
					IfDataImp_Upd01_DtlR.$if_proc_typ,
					IfDataImp_Upd01_DtlR.$ext_data_no,
					IfDataImp_Upd01_DtlR.$ext_sys_cd,
					IfDataImp_Upd01_DtlR.$bp_cd
				)
			);
			if(isNull(o.up0().get(0).if_proc_typ())) {
				o.up0().setStringNE(IfDataImp_Upd01_DtlR.$if_proc_typ, up0().if_proc_typ());
			}
			o.exec();
		}

		protected IfMBBEL_IfDataImpService_Upd01 createImpOperation() {
			String[] arr = up0().imp_ope().split("\\."), ret = new String[3];
			if (arr.length == 3) {
				System.arraycopy(arr, 0, ret, 0, arr.length);
			}
			IfMBBEL_IfDataImpService_Upd01
				o = createOperationWD(
					arr[0],		// moduleId
					arr[1],		// logicId
					arr[2],		// operationId
					IfMBBEL_IfDataImpService_Upd01.class);
			return o;
		}
	}

	//FMCB CUSTOM END
}