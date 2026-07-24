package mcframe.serverMSBE.MSBEL5740;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBEL_RcptIvRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_RcptIvRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5740";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_RcptIvRegService.RcptIv_Chk01 aRcptIv_Chk01;

	protected void initRcptIv_Chk01() {
		this.info = PDef.MS_MSBEL5740_RcptIv_Chk01_INFO;
		this.aRcptIv_Chk01 = ((MSBEL_RcptIvRegService)this).new RcptIv_Chk01();
	}

	public static MSBEL_RcptIvRegService.RcptIv_Chk01 crtRcptIv_Chk01() {
		MSBEL_RcptIvRegService lgc = new MSBEL_RcptIvRegService();
		lgc.initRcptIv_Chk01();
		return lgc.aRcptIv_Chk01;
	}

	protected void paramRcptIv_Chk01(MCParam p) {
		if (this.aRcptIv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcptIv_Chk01.up0());
		p.addUpBlock(aRcptIv_Chk01.up1());
		p.addUpBlock(aRcptIv_Chk01.up2());
		p.addDownBlock(aRcptIv_Chk01.down0());
		p.addDownBlock(aRcptIv_Chk01.down1());
	}

	protected void doRcptIv_Chk01() {
		aRcptIv_Chk01.call();
	};

	/**
	 * RcptIv_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR createRcptIv_Chk01_HdrR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.create();
	}

	/**
	 * RcptIv_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> createRcptIv_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
	}

	/**
	 * RcptIv_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR createRcptIv_Chk01_DtlR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.create();
	}

	/**
	 * RcptIv_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> createRcptIv_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
	}

	/**
	 * RcptIv_Chk01_MapブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR createRcptIv_Chk01_MapR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.create();
	}

	/**
	 * RcptIv_Chk01_MapブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> createRcptIv_Chk01_MapL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
	}
	protected MSBEL_RcptIvRegService.RcptIv_Ins01 aRcptIv_Ins01;

	protected void initRcptIv_Ins01() {
		this.info = PDef.MS_MSBEL5740_RcptIv_Ins01_INFO;
		this.aRcptIv_Ins01 = ((MSBEL_RcptIvRegService)this).new RcptIv_Ins01();
	}

	public static MSBEL_RcptIvRegService.RcptIv_Ins01 crtRcptIv_Ins01() {
		MSBEL_RcptIvRegService lgc = new MSBEL_RcptIvRegService();
		lgc.initRcptIv_Ins01();
		return lgc.aRcptIv_Ins01;
	}

	protected void paramRcptIv_Ins01(MCParam p) {
		if (this.aRcptIv_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcptIv_Ins01.up0());
		p.addUpBlock(aRcptIv_Ins01.up1());
		p.addUpBlock(aRcptIv_Ins01.up2());
		p.addDownBlock(aRcptIv_Ins01.down0());
		p.addDownBlock(aRcptIv_Ins01.down1());
		p.addDownBlock(aRcptIv_Ins01.down2());
	}

	protected void doRcptIv_Ins01() {
		aRcptIv_Ins01.call();
	};

	/**
	 * RcptIv_Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR createRcptIv_Ins01_HdrR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.create();
	}

	/**
	 * RcptIv_Ins01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> createRcptIv_Ins01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
	}

	/**
	 * RcptIv_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR createRcptIv_Ins01_DtlR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.create();
	}

	/**
	 * RcptIv_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> createRcptIv_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
	}

	/**
	 * RcptIv_Ins01_MapブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR createRcptIv_Ins01_MapR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.create();
	}

	/**
	 * RcptIv_Ins01_MapブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> createRcptIv_Ins01_MapL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
	}
	protected MSBEL_RcptIvRegService.RcptIv_Upd01 aRcptIv_Upd01;

	protected void initRcptIv_Upd01() {
		this.info = PDef.MS_MSBEL5740_RcptIv_Upd01_INFO;
		this.aRcptIv_Upd01 = ((MSBEL_RcptIvRegService)this).new RcptIv_Upd01();
	}

	public static MSBEL_RcptIvRegService.RcptIv_Upd01 crtRcptIv_Upd01() {
		MSBEL_RcptIvRegService lgc = new MSBEL_RcptIvRegService();
		lgc.initRcptIv_Upd01();
		return lgc.aRcptIv_Upd01;
	}

	protected void paramRcptIv_Upd01(MCParam p) {
		if (this.aRcptIv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcptIv_Upd01.up0());
		p.addUpBlock(aRcptIv_Upd01.up1());
		p.addUpBlock(aRcptIv_Upd01.up2());
		p.addDownBlock(aRcptIv_Upd01.down0());
		p.addDownBlock(aRcptIv_Upd01.down1());
		p.addDownBlock(aRcptIv_Upd01.down2());
	}

	protected void doRcptIv_Upd01() {
		aRcptIv_Upd01.call();
	};

	/**
	 * RcptIv_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR createRcptIv_Upd01_HdrR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.create();
	}

	/**
	 * RcptIv_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> createRcptIv_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
	}

	/**
	 * RcptIv_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR createRcptIv_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.create();
	}

	/**
	 * RcptIv_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> createRcptIv_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
	}

	/**
	 * RcptIv_Upd01_MapブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR createRcptIv_Upd01_MapR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.create();
	}

	/**
	 * RcptIv_Upd01_MapブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> createRcptIv_Upd01_MapL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
	}
	protected MSBEL_RcptIvRegService.RcptIv_Chk02 aRcptIv_Chk02;

	protected void initRcptIv_Chk02() {
		this.info = PDef.MS_MSBEL5740_RcptIv_Chk02_INFO;
		this.aRcptIv_Chk02 = ((MSBEL_RcptIvRegService)this).new RcptIv_Chk02();
	}

	public static MSBEL_RcptIvRegService.RcptIv_Chk02 crtRcptIv_Chk02() {
		MSBEL_RcptIvRegService lgc = new MSBEL_RcptIvRegService();
		lgc.initRcptIv_Chk02();
		return lgc.aRcptIv_Chk02;
	}

	protected void paramRcptIv_Chk02(MCParam p) {
		if (this.aRcptIv_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcptIv_Chk02.up0());
		p.addDownBlock(aRcptIv_Chk02.down0());
	}

	protected void doRcptIv_Chk02() {
		aRcptIv_Chk02.call();
	};

	/**
	 * RcptIv_Chk02_MapブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR createRcptIv_Chk02_MapR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.create();
	}

	/**
	 * RcptIv_Chk02_MapブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> createRcptIv_Chk02_MapL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.class);
	}
	protected MSBEL_RcptIvRegService.RcptIv_Upd02 aRcptIv_Upd02;

	protected void initRcptIv_Upd02() {
		this.info = PDef.MS_MSBEL5740_RcptIv_Upd02_INFO;
		this.aRcptIv_Upd02 = ((MSBEL_RcptIvRegService)this).new RcptIv_Upd02();
	}

	public static MSBEL_RcptIvRegService.RcptIv_Upd02 crtRcptIv_Upd02() {
		MSBEL_RcptIvRegService lgc = new MSBEL_RcptIvRegService();
		lgc.initRcptIv_Upd02();
		return lgc.aRcptIv_Upd02;
	}

	protected void paramRcptIv_Upd02(MCParam p) {
		if (this.aRcptIv_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcptIv_Upd02.up0());
	}

	protected void doRcptIv_Upd02() {
		aRcptIv_Upd02.call();
	};

	/**
	 * RcptIv_Upd02_MapブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR createRcptIv_Upd02_MapR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.create();
	}

	/**
	 * RcptIv_Upd02_MapブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> createRcptIv_Upd02_MapL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.class);
	}
	protected MSBEL_RcptIvRegService.RcptIv_Del01 aRcptIv_Del01;

	protected void initRcptIv_Del01() {
		this.info = PDef.MS_MSBEL5740_RcptIv_Del01_INFO;
		this.aRcptIv_Del01 = ((MSBEL_RcptIvRegService)this).new RcptIv_Del01();
	}

	public static MSBEL_RcptIvRegService.RcptIv_Del01 crtRcptIv_Del01() {
		MSBEL_RcptIvRegService lgc = new MSBEL_RcptIvRegService();
		lgc.initRcptIv_Del01();
		return lgc.aRcptIv_Del01;
	}

	protected void paramRcptIv_Del01(MCParam p) {
		if (this.aRcptIv_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcptIv_Del01.up0());
		p.addUpBlock(aRcptIv_Del01.up1());
		p.addDownBlock(aRcptIv_Del01.down0());
		p.addDownBlock(aRcptIv_Del01.down1());
	}

	protected void doRcptIv_Del01() {
		aRcptIv_Del01.call();
	};

	/**
	 * RcptIv_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR createRcptIv_Del01_HdrR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.create();
	}

	/**
	 * RcptIv_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> createRcptIv_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
	}

	/**
	 * RcptIv_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR createRcptIv_Del01_DtlR(){
		return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.create();
	}

	/**
	 * RcptIv_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> createRcptIv_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
	}
	protected MSBEL_RcptIvRegService.RcptIv_RevUpd01 aRcptIv_RevUpd01;

	protected void initRcptIv_RevUpd01() {
		this.info = PDef.MS_MSBEL5740_RcptIv_RevUpd01_INFO;
		this.aRcptIv_RevUpd01 = ((MSBEL_RcptIvRegService)this).new RcptIv_RevUpd01();
	}

	public static MSBEL_RcptIvRegService.RcptIv_RevUpd01 crtRcptIv_RevUpd01() {
		MSBEL_RcptIvRegService lgc = new MSBEL_RcptIvRegService();
		lgc.initRcptIv_RevUpd01();
		return lgc.aRcptIv_RevUpd01;
	}

	protected void paramRcptIv_RevUpd01(MCParam p) {
		if (this.aRcptIv_RevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcptIv_RevUpd01.up0());
	}

	protected void doRcptIv_RevUpd01() {
		aRcptIv_RevUpd01.call();
	};

	/**
	 * RcptIv_RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createRcptIv_RevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * RcptIv_RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createRcptIv_RevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RcptIv_Chk01オペレーション.<p>
	 *
	 * 更新前のチェック処理を行う。<br>
	 */
	abstract public class RcptIv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcptIv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected RcptIv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * RcptIv_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR createRcptIv_Chk01_HdrR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.create();
		}

		/**
		 * RcptIv_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> createRcptIv_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
		}

		/**
		 * RcptIv_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR createRcptIv_Chk01_DtlR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.create();
		}

		/**
		 * RcptIv_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> createRcptIv_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
		}

		/**
		 * RcptIv_Chk01_MapブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR createRcptIv_Chk01_MapR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.create();
		}

		/**
		 * RcptIv_Chk01_MapブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> createRcptIv_Chk01_MapL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>iv.load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.etd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.eta_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>iv.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.xrate</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>iv.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ivd.po_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno1</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno2</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno3</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno4</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ivd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ivd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ivd.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.slo_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.ref_prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.ref_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this).info;
		}


	}
	/**
	 * RcptIv_Ins01オペレーション.<p>
	 *
	 * 受領インボイス情報を登録する。<br>
	 */
	abstract public class RcptIv_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcptIv_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> down2;
		
		
		// コンストラクタ
		protected RcptIv_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * RcptIv_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR createRcptIv_Ins01_HdrR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.create();
		}

		/**
		 * RcptIv_Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> createRcptIv_Ins01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
		}

		/**
		 * RcptIv_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR createRcptIv_Ins01_DtlR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.create();
		}

		/**
		 * RcptIv_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> createRcptIv_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
		}

		/**
		 * RcptIv_Ins01_MapブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR createRcptIv_Ins01_MapR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.create();
		}

		/**
		 * RcptIv_Ins01_MapブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> createRcptIv_Ins01_MapL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>iv.load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.etd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.eta_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>iv.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.xrate</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>iv.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.po_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno1</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno2</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno3</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno4</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ivd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ivd.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.slo_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.ref_prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.ref_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.trd_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this).info;
		}


	}
	/**
	 * RcptIv_Upd01オペレーション.<p>
	 *
	 * 受領インボイス情報を更新する。<br>
	 */
	abstract public class RcptIv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcptIv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> down2;
		
		
		// コンストラクタ
		protected RcptIv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * RcptIv_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR createRcptIv_Upd01_HdrR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.create();
		}

		/**
		 * RcptIv_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> createRcptIv_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
		}

		/**
		 * RcptIv_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR createRcptIv_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.create();
		}

		/**
		 * RcptIv_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> createRcptIv_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
		}

		/**
		 * RcptIv_Upd01_MapブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR createRcptIv_Upd01_MapR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.create();
		}

		/**
		 * RcptIv_Upd01_MapブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> createRcptIv_Upd01_MapL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.in_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>iv.load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.etd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.eta_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>iv.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>iv.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.xrate</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>iv.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv.purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ivd.po_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ivd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno1</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno2</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno3</td></tr>
		 * 	<tr><td><br></td><td>ivd.sno4</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ivd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ivd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ivd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ivd.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.slo_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ivd.ref_prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.ref_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ivd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.trd_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ivd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ivd.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_MapR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this).info;
		}


	}
	/**
	 * RcptIv_Chk02オペレーション.<p>
	 *
	 * 受領インボイスＮＯ仮登録前のチェック処理を行う<br>
	 */
	abstract public class RcptIv_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcptIv_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> down0;
		
		
		// コンストラクタ
		protected RcptIv_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcptIv_Chk02_MapブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR createRcptIv_Chk02_MapR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.create();
		}

		/**
		 * RcptIv_Chk02_MapブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> createRcptIv_Chk02_MapL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ivmap.base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this).info;
		}


	}
	/**
	 * RcptIv_Upd02オペレーション.<p>
	 *
	 * 受領インボイスＮＯを仮登録する。<br>
	 */
	abstract public class RcptIv_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcptIv_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> up0;
		
		
		// コンストラクタ
		protected RcptIv_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RcptIv_Upd02_MapブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR createRcptIv_Upd02_MapR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.create();
		}

		/**
		 * RcptIv_Upd02_MapブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> createRcptIv_Upd02_MapL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ivmap.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ivmap.base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk02_MapR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this).info;
		}


	}
	/**
	 * RcptIv_Del01オペレーション.<p>
	 *
	 * 受領インボイス情報を取り消す。<br>
	 */
	abstract public class RcptIv_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcptIv_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected RcptIv_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * RcptIv_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR createRcptIv_Del01_HdrR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.create();
		}

		/**
		 * RcptIv_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> createRcptIv_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR.class);
		}

		/**
		 * RcptIv_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR createRcptIv_Del01_DtlR(){
			return mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.create();
		}

		/**
		 * RcptIv_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> createRcptIv_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv.rcpt_iv_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ivd.rcpt_iv_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5740.RcptIv_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this).info;
		}


	}
	/**
	 * RcptIv_RevUpd01オペレーション.<p>
	 *
	 * 受領インボイス改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class RcptIv_RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcptIv_RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected RcptIv_RevUpd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RcptIv_RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createRcptIv_RevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * RcptIv_RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createRcptIv_RevUpd01_DtlL(){
			return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rev_data_src_no</td></tr>
		 * 	<tr><td><br></td><td>rev_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvRegService)MSBEL_RcptIvRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}