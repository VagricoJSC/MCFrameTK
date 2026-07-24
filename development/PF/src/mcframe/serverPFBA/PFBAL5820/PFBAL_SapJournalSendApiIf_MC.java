package mcframe.serverPFBA.PFBAL5820;

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
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

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
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import mcframe.serverCore.resource.MCConst;
import mcframe.serverPFBA.PFBAL5820.service.*;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
import mcframe.serverPFUD.PFUDL5030.service.IfSoapServiceBase;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBAL_SapJournalSendApiIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBAL_SapJournalSendApiIf_MC extends PFBAL_SapJournalSendApiIf_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * SapJournalSendApiIf_Conv01オペレーション.<p>
	 *
	 */
	public class SapJournalSendApiIf_Conv01 extends PFBAL_SapJournalSendApiIf_MC_A.SapJournalSendApiIf_Conv01
			implements IfSoapServiceBase<JournalEntryBulkCreationRequestIn, JournalEntryCreateRequestBulkMessage, PFBAL_JournalEntryService>{
		
		@Override
		protected void call() {
			setClazz(this);
			super.call();
		}
		
		@Override
		public JournalEntryCreateRequestBulkMessage createMessage(MCList<?> ifL) {
			return new PFBAL_JournalEntryPostBase().createMessage(ifL);
		}
		
		@Override
		public PFBAL_JournalEntryService getService(String ifProcTyp, String extSysCd) {
			return PFBAL_JournalEntryService.createJE2Service(ifProcTyp, extSysCd, JournalEntryBulkCreationRequestIn.class);
		}
		
		@Override
		public JournalEntryBulkCreationRequestIn getPort(PFBAL_JournalEntryService jeService) {
			return (JournalEntryBulkCreationRequestIn) jeService.getBinding();
		}
		
		@Override
		public void sendMessage(JournalEntryBulkCreationRequestIn port, JournalEntryCreateRequestBulkMessage message) {
			port.journalEntryBulkCreationRequestIn(message);
		}

		@Override
		protected void setIfDBC() {
			super.setIfDbc(PFBAL_JournalEntryPostBase.getIfDBC());
		}
		
		@Override
		protected void aftrSendRequest(MCList<?> ifL, MCList<SdrvDtlR> targetUp0L) {
			super.aftrSendRequest(ifL, targetUp0L);
			updIf(ifL);
		}
		
		
		@Override
		protected void setSdrvIfErr(String exceptionMessage) {
			super.setSdrvIfErr(exceptionMessage);

			MCList<?> ifL = _arrifList.now();
			MCIndexKey up0Idx = up0().createIndex(SdrvDtlR.$data_no);

			for (MCList<?> l : ifL.groupList(MBT_JOURNAL_SND_IF_R.$data_no)) {
				SdrvDtlR up0R = up0().getFirst(up0Idx, l.get(0).getNumberNE(MBT_JOURNAL_SND_IF_R.$data_no));
				up0R.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
			}
		}

		@Override
		protected void setDown0(MCList<SdrvDtlR> up0L, boolean isErr) {
			if (isErr) {
				super.setDown0(up0L, isErr);
			}
			else {
				up0L.forEach(r -> {
					if (isNull(r.sdrv_sts_typ())
						|| MAC_SDRV_STS_TYP.isSEND_CONV_OK(r.sdrv_sts_typ())) {
						r.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_OK.value());
					}
				});
			}
			
			down0().setAll(up0L);
		}
	}
	
	/**
	 * SapJournalSendApiIf_Conv02オペレーション.<p>
	 *
	 */
	public class SapJournalSendApiIf_Conv02 extends PFBAL_SapJournalSendApiIf_MC_A.SapJournalSendApiIf_Conv02 
			implements IfSoapServiceBase<JournalEntryCreateRequestConfirmationIn, JournalEntryCreateRequestBulkMessage, PFBAL_JournalEntryService>{
		
		@Override
		protected void call() {
			setClazz(this);
			super.call();
		}
		
		@Override
		public JournalEntryCreateRequestBulkMessage createMessage(MCList<?> ifL) {
			return new PFBAL_JournalEntryPostBase().createMessage(ifL);
		}
		
		@Override
		public PFBAL_JournalEntryService getService(String ifProcTyp, String extSysCd) {
			return PFBAL_JournalEntryService.createJE2Service(ifProcTyp, extSysCd, JournalEntryCreateRequestConfirmationIn.class);
		}
		
		@Override
		public JournalEntryCreateRequestConfirmationIn getPort(PFBAL_JournalEntryService jeService) {
			return (JournalEntryCreateRequestConfirmationIn) jeService.getBinding();
		}
		
		@Override
		public void sendMessage(JournalEntryCreateRequestConfirmationIn port, JournalEntryCreateRequestBulkMessage message) {
			JournalEntryCreateConfirmationBulkMessage res = port.journalEntryCreateRequestConfirmationIn(message);
			handleResponse(res);
		}
		
		protected void handleResponse(JournalEntryCreateConfirmationBulkMessage res) {
			MCList<?> ifL = _arrifList.now();
			MCIndexKey ifLIdx = ifL.createIndex(MBT_JOURNAL_SND_IF_R.$data_no);
			MCIndexKey up0Idx = up0().createIndex(SdrvDtlR.$data_no);
			
			for (JournalEntryCreateConfirmationMessage resMsg : res.getJournalEntryCreateConfirmation()) {
				MCNumber dataNo = getDataNo(resMsg.getMessageHeader());
				
				boolean isErr = false;
				for (LogItem logItm : resMsg.getLog().getItem()) {
					if (!isSuccess(logItm)) {
						StringBuffer msg = new StringBuffer();
						msg.append("TypeID: " + logItm.getTypeID());
						msg.append(System.lineSeparator());
						msg.append("Note: " + logItm.getNote());
						
						ifL.subList(ifLIdx, dataNo).forEach(ifR -> {
							MCMessagePool.add(ifR, null, PFBAL0001, msg);
						});
						
						if (!isErr) {
							isErr = !isWarning(logItm);
						}
					}
				}
				
				SdrvDtlR up0R = up0().getFirst(up0Idx, dataNo);
				if (!isNull(up0R)) {
					up0R.sdrv_sts_typ(
						isErr ? MAC_SDRV_STS_TYP.SEND_ERR.value() : MAC_SDRV_STS_TYP.SEND_OK.value()
					);
				}
			}
		}
		protected MCNumber getDataNo(BusinessDocumentMessageHeader msgHdr) {
				String id = msgHdr.getReferenceID().getValue();
				//id = co_cd + 「_」 + data_no
				//substring(会社CDの長さ＋アンダースコアの1文字分)
				return MCNumber.valueOf(id.substring(getCo().co_cd().length() + 1));
		}
		protected boolean isSuccess(LogItem logItm) {
			// 正常
			// <TypeID>605(RW)</TypeID>
			// <SeverityCode>1</SeverityCode>
			// <Note>Document posted successfully: BKPFF 010000056415102025 0M4DHI4</Note>
			return isSame(logItm.getSeverityCode(), "1");
		}
		protected boolean isWarning(LogItem logItm) {
			// 警告（仕訳は登録される）
			// <TypeID>350(KI)</TypeID>
			// <SeverityCode>2</SeverityCode>
			// <Note>Profitability segment being derived again</Note>
			return isSame(logItm.getSeverityCode(), "2");
		}
		protected boolean isError(LogItem logItm) {
			// エラー
			// <TypeID>248(KI)</TypeID>
			// <SeverityCode>3</SeverityCode>
			// <Note>Account 41000000 requires a true account assignment relevant to cost accounting</Note>
			return isSame(logItm.getSeverityCode(), "3");
		}
		
		@Override
		protected void setSdrvIfErr(String exceptionMessage) {

			super.setSdrvIfErr(exceptionMessage);
			
			MCList<?> ifL = _arrifList.now();
			MCIndexKey up0Idx = up0().createIndex(SdrvDtlR.$data_no);
			
			for (MCList<?> l : ifL.groupList(MBT_JOURNAL_SND_IF_R.$data_no)) {
				SdrvDtlR up0R = up0().getFirst(up0Idx, l.get(0).getNumberNE(MBT_JOURNAL_SND_IF_R.$data_no));
				up0R.sdrv_sts_typ(MAC_SDRV_STS_TYP.SEND_ERR.value());
				up0R.sdrvIf().setStringNE(getTransIdMappingPFCol(), getTransactionId(exceptionMessage));
			}
		}
		
		protected String getTransactionId(String exceptionMessage) {
			Pattern p = Pattern.compile("Transaction ID ([0-9A-Z]{32})");
			Matcher m = p.matcher(exceptionMessage);
			if (m.find()) {
				return m.group(1);
			}

			return null;
		}
		
		@Override
		protected void setIfDBC() {
			super.setIfDbc(PFBAL_JournalEntryPostBase.getIfDBC());
		}
		
		@Override
		protected void setDown0(MCList<SdrvDtlR> up0L, boolean isErr) {
			if (isErr) {
				super.setDown0(up0L, isErr);
			}
			
			down0().setAll(up0L);
		}
		
		@Override
		protected void bfrSendRequest(MCList<?> ifL, MCList<SdrvDtlR> targetUp0L) {
			super.bfrSendRequest(ifL, targetUp0L);

			// トランザクションＩＤをクリアする。設定されるのはSAP側でシステムエラーが発生した場合のみ
			targetUp0L.innerRowList("sdrvIf").setStringNE(getTransIdMappingPFCol(), null);
		}

		@Override
		protected void aftrSendRequest(MCList<?> ifL, MCList<SdrvDtlR> targetUp0L) {
			super.aftrSendRequest(ifL, targetUp0L);
			updIf(ifL);
			updSdrvIf(targetUp0L);
		}
		
		protected void updSdrvIf(MCList<SdrvDtlR> targetUp0L) {
			// トランザクションＩＤを反映する
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(
				t.getColumn$(getTransIdMappingPFCol())
			);
			
			dbUpdateKey("PFBAL5820_PFT_SDRV_IF_U01", targetUp0L.innerRowList("sdrvIf"), bldr);
		}
	}
	
	protected void updIf(MCList<?> ifL) {
		MBT_JOURNAL_SND_IF_R t = MBT_JOURNAL_SND_IF_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSet(
			t.batch_log_no, t.log_sub_key1, t.log_sub_key2
		);
		
		dbUpdateKey("PFBAL5820_MBT_JOURNAL_SND_IF_U01", ifL, bldr);
	}
	
	@Override
	protected ArrayIfList createArrayIfList(MCList<?> ifL) {
		return new ArrayIfList(ifL) {
			@Override
			protected String[] getSendGroupKey() {
				// データＮＯごとにリクエストする
				return new String[]{
					MBT_JOURNAL_SND_IF_R.$data_no
				};
			}
			@Override
			protected String[] getSendGroupSortKey() {
				return new String[]{
					MBT_JOURNAL_SND_IF_R.$data_no,
					MBT_JOURNAL_SND_IF_R.$data_lno
				};
			}
			@Override
			protected int getSendLimitSize() {
				// １リクエストに含めるデータＮＯの数
				return MCConst.app.getInteger("PF.PFBAL5820.send_size", 1);
			}
		};
	}
	
	protected String getTransIdMappingPFCol() {
		return MCConst.app.getString("PF.PFBAL5820.mapping_cols.recv.PFT_SDRV_IF.transaction_id");
	}

	//FMCB CUSTOM END
}