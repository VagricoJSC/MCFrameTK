package mcframe.clientMGUD.MGUDP0010;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import mcframe.clientCore.beans.message.MCDialogButton;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientFXBA.FXBAP0010.FXBAP_Updater;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCParam;

import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import mcframe.clientMAUD.MAUDP0010.MAUDP_Updater;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;

public class MGUDP_FileUpdater_MC<P extends MGUDP_PanelBase, O extends MCCallerPanelBridge> extends MAUDP_Updater<P, O> {
	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MGUDP_FileUpdater_MC(P panel, O operation) {
		super(panel, operation);
	}
	
	protected MCList _fileImpList;
	
	@Override
	protected void initCaller() {
		super.initCaller();
		panel.setInProgressUpdater(this);
	}
	
	/**
	 * 必ず、ファイル入力を行うMCTableを返すように実装してください。<br>
	 * なお、IfListRegPanelインタフェースimplementsしている場合、getListRegTableを返します。
	 */
	@Override
	public MCTable getFileImpTable() {
		if (panel instanceof IfListRegPanel) {
			IfListRegPanel p = (IfListRegPanel)panel;
			return p.getListRegTable();
		}
		return null;
	}
	
	/**
	 * Excelでファイル入出力するかを返します。
	 */
	protected boolean getExcelFlg() {
		String id = panel.getScreenID();
		if (id.startsWith("MGBA")) {
			return getExcelPlnFlg(panel);
		}
		else if (id.startsWith("MGBB")) {
			return getExcelActFlg(panel);
		}
		else if (id.startsWith("MGBG")) {
			return getExcelAlcFlg(panel);
		}
		return true;
	}
	
	@Override
	protected boolean checkForCall() {
		boolean boo = super.checkForCall();

		if (boo) {
			MCTable table = getFileImpTable();
			_fileImpList = table.getList().createInstance();
			if(!panel.doMGFileInAction(_fileImpList, table, getExcelFlg())) {
				return false;
			}
		}
		return boo;
	}

	@Override
	protected void setupUpParam() {
		setUpGUIIndex();
		for (MCContainer c : getUpBlocks()) {
			if (c instanceof MCList) {
				if (c == getFileImpTable().getList()) {
					param().addUpBlock(_fileImpList);
				}
				else {
					param().addUpBlock(panel.exceptEmpty((MCList) c));
				}
			}
			else {
				param().addUpBlock(c);
			}
		}
	}

	/**
	 * ファイルから取り込んだリストにGUIIndexを設定します。
	 */
	protected void setUpGUIIndex() {
		for (int i = 0; i < _fileImpList.size(); i++) {
			_fileImpList.get(i).setGUIIndex(i);
		}
	}

	@Override
	protected boolean checkCheckedRowSize(IfListRegPanel p) {
		return true ;
	}
	
	@Override
	protected boolean isUpBlockStatusNone() {
		return false ;
	}
	
	@Override
	protected boolean execConfirm() {
		// ファイル入力ダイアログの表示で代替する
		return true;
	}
	
	@Override
	protected MCMessageList checkScaleAndLength() {
		// 桁数などのメタチェックはサーバ側で実施する
		return new MCMessageList();
	}
	
	@Override
	protected MCCaller<P, O>.MCCallerCallBack createCallEnd() {
		return new MCCallEnd() {
			@Override
			protected MCCallBackType action() {
				try {
					return super.action();
				}
				finally {
					panel.setInProgressUpdater(null);
				}
			}
		};
	}
	
}

