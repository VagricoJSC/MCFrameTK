package mcframe.serverMSBE.MSBEL6500;

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
 * "MSBEL_StkXfrActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_StkXfrActRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL6500";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_StkXfrActRegService.StkXfrAct_Chk01 aStkXfrAct_Chk01;

	protected void initStkXfrAct_Chk01() {
		this.info = PDef.MS_MSBEL6500_StkXfrAct_Chk01_INFO;
		this.aStkXfrAct_Chk01 = ((MSBEL_StkXfrActRegService)this).new StkXfrAct_Chk01();
	}

	public static MSBEL_StkXfrActRegService.StkXfrAct_Chk01 crtStkXfrAct_Chk01() {
		MSBEL_StkXfrActRegService lgc = new MSBEL_StkXfrActRegService();
		lgc.initStkXfrAct_Chk01();
		return lgc.aStkXfrAct_Chk01;
	}

	protected void paramStkXfrAct_Chk01(MCParam p) {
		if (this.aStkXfrAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkXfrAct_Chk01.up0());
		p.addUpBlock(aStkXfrAct_Chk01.up1());
		p.addUpBlock(aStkXfrAct_Chk01.up2());
		p.addDownBlock(aStkXfrAct_Chk01.down0());
		p.addDownBlock(aStkXfrAct_Chk01.down1());
		p.addDownBlock(aStkXfrAct_Chk01.down2());
	}

	protected void doStkXfrAct_Chk01() {
		aStkXfrAct_Chk01.call();
	};

	/**
	 * StkXfrAct_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Chk01_HdrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
	}

	/**
	 * StkXfrAct_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
	}

	/**
	 * StkXfrAct_Chk01_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Chk01_DtlGiR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
	}

	/**
	 * StkXfrAct_Chk01_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Chk01_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
	}

	/**
	 * StkXfrAct_Chk01_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Chk01_DtlGrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
	}

	/**
	 * StkXfrAct_Chk01_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Chk01_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActRegService.StkXfrAct_Chk02 aStkXfrAct_Chk02;

	protected void initStkXfrAct_Chk02() {
		this.info = PDef.MS_MSBEL6500_StkXfrAct_Chk02_INFO;
		this.aStkXfrAct_Chk02 = ((MSBEL_StkXfrActRegService)this).new StkXfrAct_Chk02();
	}

	public static MSBEL_StkXfrActRegService.StkXfrAct_Chk02 crtStkXfrAct_Chk02() {
		MSBEL_StkXfrActRegService lgc = new MSBEL_StkXfrActRegService();
		lgc.initStkXfrAct_Chk02();
		return lgc.aStkXfrAct_Chk02;
	}

	protected void paramStkXfrAct_Chk02(MCParam p) {
		if (this.aStkXfrAct_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkXfrAct_Chk02.up0());
		p.addUpBlock(aStkXfrAct_Chk02.up1());
		p.addUpBlock(aStkXfrAct_Chk02.up2());
		p.addDownBlock(aStkXfrAct_Chk02.down0());
		p.addDownBlock(aStkXfrAct_Chk02.down1());
		p.addDownBlock(aStkXfrAct_Chk02.down2());
	}

	protected void doStkXfrAct_Chk02() {
		aStkXfrAct_Chk02.call();
	};

	/**
	 * StkXfrAct_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Chk02_HdrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
	}

	/**
	 * StkXfrAct_Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Chk02_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
	}

	/**
	 * StkXfrAct_Chk02_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Chk02_DtlGiR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
	}

	/**
	 * StkXfrAct_Chk02_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Chk02_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
	}

	/**
	 * StkXfrAct_Chk02_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Chk02_DtlGrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
	}

	/**
	 * StkXfrAct_Chk02_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Chk02_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActRegService.StkXfrAct_Chk03 aStkXfrAct_Chk03;

	protected void initStkXfrAct_Chk03() {
		this.info = PDef.MS_MSBEL6500_StkXfrAct_Chk03_INFO;
		this.aStkXfrAct_Chk03 = ((MSBEL_StkXfrActRegService)this).new StkXfrAct_Chk03();
	}

	public static MSBEL_StkXfrActRegService.StkXfrAct_Chk03 crtStkXfrAct_Chk03() {
		MSBEL_StkXfrActRegService lgc = new MSBEL_StkXfrActRegService();
		lgc.initStkXfrAct_Chk03();
		return lgc.aStkXfrAct_Chk03;
	}

	protected void paramStkXfrAct_Chk03(MCParam p) {
		if (this.aStkXfrAct_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkXfrAct_Chk03.up0());
		p.addDownBlock(aStkXfrAct_Chk03.down0());
	}

	protected void doStkXfrAct_Chk03() {
		aStkXfrAct_Chk03.call();
	};

	/**
	 * StkXfrAct_Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Chk03_HdrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
	}

	/**
	 * StkXfrAct_Chk03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Chk03_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
	}
	protected MSBEL_StkXfrActRegService.StkXfrAct_Ins01 aStkXfrAct_Ins01;

	protected void initStkXfrAct_Ins01() {
		this.info = PDef.MS_MSBEL6500_StkXfrAct_Ins01_INFO;
		this.aStkXfrAct_Ins01 = ((MSBEL_StkXfrActRegService)this).new StkXfrAct_Ins01();
	}

	public static MSBEL_StkXfrActRegService.StkXfrAct_Ins01 crtStkXfrAct_Ins01() {
		MSBEL_StkXfrActRegService lgc = new MSBEL_StkXfrActRegService();
		lgc.initStkXfrAct_Ins01();
		return lgc.aStkXfrAct_Ins01;
	}

	protected void paramStkXfrAct_Ins01(MCParam p) {
		if (this.aStkXfrAct_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkXfrAct_Ins01.up0());
		p.addUpBlock(aStkXfrAct_Ins01.up1());
		p.addUpBlock(aStkXfrAct_Ins01.up2());
		p.addDownBlock(aStkXfrAct_Ins01.down0());
		p.addDownBlock(aStkXfrAct_Ins01.down1());
		p.addDownBlock(aStkXfrAct_Ins01.down2());
	}

	protected void doStkXfrAct_Ins01() {
		aStkXfrAct_Ins01.call();
	};

	/**
	 * StkXfrAct_Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Ins01_HdrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
	}

	/**
	 * StkXfrAct_Ins01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Ins01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
	}

	/**
	 * StkXfrAct_Ins01_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Ins01_DtlGiR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
	}

	/**
	 * StkXfrAct_Ins01_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Ins01_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
	}

	/**
	 * StkXfrAct_Ins01_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Ins01_DtlGrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
	}

	/**
	 * StkXfrAct_Ins01_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Ins01_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActRegService.StkXfrAct_Upd01 aStkXfrAct_Upd01;

	protected void initStkXfrAct_Upd01() {
		this.info = PDef.MS_MSBEL6500_StkXfrAct_Upd01_INFO;
		this.aStkXfrAct_Upd01 = ((MSBEL_StkXfrActRegService)this).new StkXfrAct_Upd01();
	}

	public static MSBEL_StkXfrActRegService.StkXfrAct_Upd01 crtStkXfrAct_Upd01() {
		MSBEL_StkXfrActRegService lgc = new MSBEL_StkXfrActRegService();
		lgc.initStkXfrAct_Upd01();
		return lgc.aStkXfrAct_Upd01;
	}

	protected void paramStkXfrAct_Upd01(MCParam p) {
		if (this.aStkXfrAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkXfrAct_Upd01.up0());
		p.addUpBlock(aStkXfrAct_Upd01.up1());
		p.addUpBlock(aStkXfrAct_Upd01.up2());
		p.addDownBlock(aStkXfrAct_Upd01.down0());
		p.addDownBlock(aStkXfrAct_Upd01.down1());
		p.addDownBlock(aStkXfrAct_Upd01.down2());
	}

	protected void doStkXfrAct_Upd01() {
		aStkXfrAct_Upd01.call();
	};

	/**
	 * StkXfrAct_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Upd01_HdrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
	}

	/**
	 * StkXfrAct_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
	}

	/**
	 * StkXfrAct_Upd01_DtlGiブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Upd01_DtlGiR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
	}

	/**
	 * StkXfrAct_Upd01_DtlGiブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Upd01_DtlGiL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
	}

	/**
	 * StkXfrAct_Upd01_DtlGrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Upd01_DtlGrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
	}

	/**
	 * StkXfrAct_Upd01_DtlGrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Upd01_DtlGrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
	}
	protected MSBEL_StkXfrActRegService.StkXfrAct_Del01 aStkXfrAct_Del01;

	protected void initStkXfrAct_Del01() {
		this.info = PDef.MS_MSBEL6500_StkXfrAct_Del01_INFO;
		this.aStkXfrAct_Del01 = ((MSBEL_StkXfrActRegService)this).new StkXfrAct_Del01();
	}

	public static MSBEL_StkXfrActRegService.StkXfrAct_Del01 crtStkXfrAct_Del01() {
		MSBEL_StkXfrActRegService lgc = new MSBEL_StkXfrActRegService();
		lgc.initStkXfrAct_Del01();
		return lgc.aStkXfrAct_Del01;
	}

	protected void paramStkXfrAct_Del01(MCParam p) {
		if (this.aStkXfrAct_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkXfrAct_Del01.up0());
		p.addDownBlock(aStkXfrAct_Del01.down0());
	}

	protected void doStkXfrAct_Del01() {
		aStkXfrAct_Del01.call();
	};

	/**
	 * StkXfrAct_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Del01_HdrR(){
		return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
	}

	/**
	 * StkXfrAct_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * StkXfrAct_Chk01オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績する前に、チェックを実行します。<br>
	 */
	abstract public class StkXfrAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkXfrAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down2;
		
		
		// コンストラクタ
		protected StkXfrAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);

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
			invoke((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * StkXfrAct_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Chk01_HdrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
		}

		/**
		 * StkXfrAct_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
		}

		/**
		 * StkXfrAct_Chk01_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Chk01_DtlGiR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
		}

		/**
		 * StkXfrAct_Chk01_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Chk01_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
		}

		/**
		 * StkXfrAct_Chk01_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Chk01_DtlGrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
		}

		/**
		 * StkXfrAct_Chk01_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Chk01_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this).info;
		}


	}
	/**
	 * StkXfrAct_Chk02オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を訂正する前に、チェックを実行します。<br>
	 */
	abstract public class StkXfrAct_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkXfrAct_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down2;
		
		
		// コンストラクタ
		protected StkXfrAct_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);

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
			invoke((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * StkXfrAct_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Chk02_HdrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
		}

		/**
		 * StkXfrAct_Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Chk02_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
		}

		/**
		 * StkXfrAct_Chk02_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Chk02_DtlGiR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
		}

		/**
		 * StkXfrAct_Chk02_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Chk02_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
		}

		/**
		 * StkXfrAct_Chk02_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Chk02_DtlGrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
		}

		/**
		 * StkXfrAct_Chk02_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Chk02_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>io_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this).info;
		}


	}
	/**
	 * StkXfrAct_Chk03オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を取り消しする前に、チェックを実行します。<br>
	 */
	abstract public class StkXfrAct_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkXfrAct_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected StkXfrAct_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);

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
			invoke((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * StkXfrAct_Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Chk03_HdrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
		}

		/**
		 * StkXfrAct_Chk03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Chk03_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this).info;
		}


	}
	/**
	 * StkXfrAct_Ins01オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を登録します。<br>
	 */
	abstract public class StkXfrAct_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkXfrAct_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down2;
		
		
		// コンストラクタ
		protected StkXfrAct_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);

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
			invoke((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * StkXfrAct_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Ins01_HdrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
		}

		/**
		 * StkXfrAct_Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Ins01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
		}

		/**
		 * StkXfrAct_Ins01_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Ins01_DtlGiR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
		}

		/**
		 * StkXfrAct_Ins01_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Ins01_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
		}

		/**
		 * StkXfrAct_Ins01_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Ins01_DtlGrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
		}

		/**
		 * StkXfrAct_Ins01_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Ins01_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this).info;
		}


	}
	/**
	 * StkXfrAct_Upd01オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を訂正します。<br>
	 */
	abstract public class StkXfrAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkXfrAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down2;
		
		
		// コンストラクタ
		protected StkXfrAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);

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
			invoke((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * StkXfrAct_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Upd01_HdrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
		}

		/**
		 * StkXfrAct_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
		}

		/**
		 * StkXfrAct_Upd01_DtlGiブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Upd01_DtlGiR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
		}

		/**
		 * StkXfrAct_Upd01_DtlGiブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Upd01_DtlGiL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
		}

		/**
		 * StkXfrAct_Upd01_DtlGrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR createStkXfrAct_Upd01_DtlGrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.create();
		}

		/**
		 * StkXfrAct_Upd01_DtlGrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> createStkXfrAct_Upd01_DtlGrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.fix_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.lot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr_d.stk_xfr_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_DtlGiR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this).info;
		}


	}
	/**
	 * StkXfrAct_Del01オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を取り消します。<br>
	 */
	abstract public class StkXfrAct_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkXfrAct_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected StkXfrAct_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);

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
			invoke((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * StkXfrAct_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR createStkXfrAct_Del01_HdrR(){
			return mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.create();
		}

		/**
		 * StkXfrAct_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> createStkXfrAct_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>stk_xfr.stk_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6500.StkXfrAct_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkXfrActRegService)MSBEL_StkXfrActRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}