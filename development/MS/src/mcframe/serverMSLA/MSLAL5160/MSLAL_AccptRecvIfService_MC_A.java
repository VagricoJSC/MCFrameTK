package mcframe.serverMSLA.MSLAL5160;

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
 * "MSLAL_AccptRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_AccptRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL5160";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_AccptRecvIfService.AccptRecvIf_Upd01 aAccptRecvIf_Upd01;

	protected void initAccptRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL5160_AccptRecvIf_Upd01_INFO;
		this.aAccptRecvIf_Upd01 = ((MSLAL_AccptRecvIfService)this).new AccptRecvIf_Upd01();
	}

	public static MSLAL_AccptRecvIfService.AccptRecvIf_Upd01 crtAccptRecvIf_Upd01() {
		MSLAL_AccptRecvIfService lgc = new MSLAL_AccptRecvIfService();
		lgc.initAccptRecvIf_Upd01();
		return lgc.aAccptRecvIf_Upd01;
	}

	protected void paramAccptRecvIf_Upd01(MCParam p) {
		if (this.aAccptRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccptRecvIf_Upd01.up0());
	}

	protected void doAccptRecvIf_Upd01() {
		aAccptRecvIf_Upd01.call();
	};

	/**
	 * AccptRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createAccptRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * AccptRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createAccptRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_AccptRecvIfService.AccptRecvIf_Upd02 aAccptRecvIf_Upd02;

	protected void initAccptRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL5160_AccptRecvIf_Upd02_INFO;
		this.aAccptRecvIf_Upd02 = ((MSLAL_AccptRecvIfService)this).new AccptRecvIf_Upd02();
	}

	public static MSLAL_AccptRecvIfService.AccptRecvIf_Upd02 crtAccptRecvIf_Upd02() {
		MSLAL_AccptRecvIfService lgc = new MSLAL_AccptRecvIfService();
		lgc.initAccptRecvIf_Upd02();
		return lgc.aAccptRecvIf_Upd02;
	}

	protected void paramAccptRecvIf_Upd02(MCParam p) {
		if (this.aAccptRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccptRecvIf_Upd02.up0());
		p.addUpBlock(aAccptRecvIf_Upd02.up1());
		p.addDownBlock(aAccptRecvIf_Upd02.down0());
	}

	protected void doAccptRecvIf_Upd02() {
		aAccptRecvIf_Upd02.call();
	};

	/**
	 * AccptRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createAccptRecvIf_Upd01_DtlR_0(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * AccptRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createAccptRecvIf_Upd01_DtlL_0(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * AccptRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAccptRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * AccptRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createAccptRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_AccptRecvIfService.AccptRecvIf_Upd03 aAccptRecvIf_Upd03;

	protected void initAccptRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL5160_AccptRecvIf_Upd03_INFO;
		this.aAccptRecvIf_Upd03 = ((MSLAL_AccptRecvIfService)this).new AccptRecvIf_Upd03();
	}

	public static MSLAL_AccptRecvIfService.AccptRecvIf_Upd03 crtAccptRecvIf_Upd03() {
		MSLAL_AccptRecvIfService lgc = new MSLAL_AccptRecvIfService();
		lgc.initAccptRecvIf_Upd03();
		return lgc.aAccptRecvIf_Upd03;
	}

	protected void paramAccptRecvIf_Upd03(MCParam p) {
		if (this.aAccptRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccptRecvIf_Upd03.up0());
		p.addDownBlock(aAccptRecvIf_Upd03.down0());
	}

	protected void doAccptRecvIf_Upd03() {
		aAccptRecvIf_Upd03.call();
	};

	/**
	 * AccptRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR createAccptRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR.create();
	}

	/**
	 * AccptRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR> createAccptRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR.class);
	}

	/**
	 * AccptRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_RsltR createAccptRecvIf_Upd03_RsltR(){
		return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_RsltR.create();
	}
	protected MSLAL_AccptRecvIfService.AccptRecvIf_Upd04 aAccptRecvIf_Upd04;

	protected void initAccptRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL5160_AccptRecvIf_Upd04_INFO;
		this.aAccptRecvIf_Upd04 = ((MSLAL_AccptRecvIfService)this).new AccptRecvIf_Upd04();
	}

	public static MSLAL_AccptRecvIfService.AccptRecvIf_Upd04 crtAccptRecvIf_Upd04() {
		MSLAL_AccptRecvIfService lgc = new MSLAL_AccptRecvIfService();
		lgc.initAccptRecvIf_Upd04();
		return lgc.aAccptRecvIf_Upd04;
	}

	protected void paramAccptRecvIf_Upd04(MCParam p) {
		if (this.aAccptRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccptRecvIf_Upd04.up0());
		p.addDownBlock(aAccptRecvIf_Upd04.down0());
	}

	protected void doAccptRecvIf_Upd04() {
		aAccptRecvIf_Upd04.call();
	};

	/**
	 * AccptRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR createAccptRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR.create();
	}

	/**
	 * AccptRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR> createAccptRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR.class);
	}
	protected MSLAL_AccptRecvIfService.AccptRecvIf_Chk01 aAccptRecvIf_Chk01;

	protected void initAccptRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL5160_AccptRecvIf_Chk01_INFO;
		this.aAccptRecvIf_Chk01 = ((MSLAL_AccptRecvIfService)this).new AccptRecvIf_Chk01();
	}

	public static MSLAL_AccptRecvIfService.AccptRecvIf_Chk01 crtAccptRecvIf_Chk01() {
		MSLAL_AccptRecvIfService lgc = new MSLAL_AccptRecvIfService();
		lgc.initAccptRecvIf_Chk01();
		return lgc.aAccptRecvIf_Chk01;
	}

	protected void paramAccptRecvIf_Chk01(MCParam p) {
		if (this.aAccptRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccptRecvIf_Chk01.up0());
		p.addDownBlock(aAccptRecvIf_Chk01.down0());
		p.addDownBlock(aAccptRecvIf_Chk01.down1());
		p.addDownBlock(aAccptRecvIf_Chk01.down2());
		p.addDownBlock(aAccptRecvIf_Chk01.down3());
		p.addDownBlock(aAccptRecvIf_Chk01.down4());
	}

	protected void doAccptRecvIf_Chk01() {
		aAccptRecvIf_Chk01.call();
	};

	/**
	 * AccptRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR createAccptRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR.create();
	}

	/**
	 * AccptRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR> createAccptRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR.class);
	}

	/**
	 * AccptRecvIf_Chk01_SlsAct_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR createAccptRecvIf_Chk01_SlsAct_Upd01_HdrR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.create();
	}

	/**
	 * AccptRecvIf_Chk01_SlsAct_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR> createAccptRecvIf_Chk01_SlsAct_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.class);
	}

	/**
	 * AccptRecvIf_Chk01_SlsAct_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR createAccptRecvIf_Chk01_SlsAct_Upd01_DtlR(){
		return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.create();
	}

	/**
	 * AccptRecvIf_Chk01_SlsAct_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR> createAccptRecvIf_Chk01_SlsAct_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.class);
	}

	/**
	 * AccptRecvIf_Chk01_SlsAct_Upd01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR createAccptRecvIf_Chk01_SlsAct_Upd01_IoR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.create();
	}

	/**
	 * AccptRecvIf_Chk01_SlsAct_Upd01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR> createAccptRecvIf_Chk01_SlsAct_Upd01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.class);
	}

	/**
	 * AccptRecvIf_Chk01_PurcActIoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR createAccptRecvIf_Chk01_PurcActIoR(){
		return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR.create();
	}

	/**
	 * AccptRecvIf_Chk01_PurcActIoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR> createAccptRecvIf_Chk01_PurcActIoL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR.class);
	}

	/**
	 * AccptRecvIf_SlsAct_Upd02_IvLブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR createAccptRecvIf_SlsAct_Upd02_IvLR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.create();
	}

	/**
	 * AccptRecvIf_SlsAct_Upd02_IvLブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR> createAccptRecvIf_SlsAct_Upd02_IvLL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.class);
	}

	/**
	 * AccptRecvIf_SlsAct_Upd02_IoLブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR createAccptRecvIf_SlsAct_Upd02_IoLR(){
		return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.create();
	}

	/**
	 * AccptRecvIf_SlsAct_Upd02_IoLブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR> createAccptRecvIf_SlsAct_Upd02_IoLL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.class);
	}

	/**
	 * AccptRecvIf_Chk01_Calc01HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR createAccptRecvIf_Chk01_Calc01HdrR(){
		return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR.create();
	}

	/**
	 * AccptRecvIf_Chk01_Calc01HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR> createAccptRecvIf_Chk01_Calc01HdrL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AccptRecvIf_Upd01オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class AccptRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AccptRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected AccptRecvIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);

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
			invoke((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AccptRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createAccptRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * AccptRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createAccptRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * AccptRecvIf_Upd02オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う。（ＩＦデータ確認、および検収受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class AccptRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AccptRecvIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected AccptRecvIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AccptRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createAccptRecvIf_Upd01_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * AccptRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createAccptRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * AccptRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAccptRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * AccptRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createAccptRecvIf_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exe_unit_lump_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * AccptRecvIf_Upd03オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class AccptRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AccptRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_RsltR down0;
		
		
		// コンストラクタ
		protected AccptRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_RsltR.create();

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
			invoke((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AccptRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR createAccptRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR.create();
		}

		/**
		 * AccptRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR> createAccptRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR.class);
		}

		/**
		 * AccptRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_RsltR createAccptRecvIf_Upd03_RsltR(){
			return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>accpt.data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_RsltR
		 */
		public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd03_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * AccptRecvIf_Upd04オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う。（売上実績サービスを呼び出す本処理）<br>
	 */
	abstract public class AccptRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AccptRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR> down0;
		
		
		// コンストラクタ
		protected AccptRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR.class);

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
			invoke((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AccptRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR createAccptRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR.create();
		}

		/**
		 * AccptRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR> createAccptRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>accpt.data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>accpt.data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Upd04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * AccptRecvIf_Chk01オペレーション.<p>
	 *
	 * 検収受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class AccptRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AccptRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR> down4;
		/** [AccptRecvIf_Chk01_PurcActIo]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR> aAccptRecvIf_Chk01_PurcActIo;
		/** [AccptRecvIf_SlsAct_Upd02_IoL]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR> aAccptRecvIf_SlsAct_Upd02_IoL;
		/** [AccptRecvIf_SlsAct_Upd02_IvL]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR> aAccptRecvIf_SlsAct_Upd02_IvL;
		
		
		// コンストラクタ
		protected AccptRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.class);
			down2 = MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.class);
			down3 = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.class);
			down4 = MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR.class);
			aAccptRecvIf_Chk01_PurcActIo = MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR.class);
			aAccptRecvIf_SlsAct_Upd02_IoL = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.class);
			aAccptRecvIf_SlsAct_Upd02_IvL = MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * AccptRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR createAccptRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR.create();
		}

		/**
		 * AccptRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR> createAccptRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR.class);
		}

		/**
		 * AccptRecvIf_Chk01_SlsAct_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR createAccptRecvIf_Chk01_SlsAct_Upd01_HdrR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.create();
		}

		/**
		 * AccptRecvIf_Chk01_SlsAct_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR> createAccptRecvIf_Chk01_SlsAct_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR.class);
		}

		/**
		 * AccptRecvIf_Chk01_SlsAct_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR createAccptRecvIf_Chk01_SlsAct_Upd01_DtlR(){
			return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.create();
		}

		/**
		 * AccptRecvIf_Chk01_SlsAct_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR> createAccptRecvIf_Chk01_SlsAct_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR.class);
		}

		/**
		 * AccptRecvIf_Chk01_SlsAct_Upd01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR createAccptRecvIf_Chk01_SlsAct_Upd01_IoR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.create();
		}

		/**
		 * AccptRecvIf_Chk01_SlsAct_Upd01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR> createAccptRecvIf_Chk01_SlsAct_Upd01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR.class);
		}

		/**
		 * AccptRecvIf_Chk01_PurcActIoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR createAccptRecvIf_Chk01_PurcActIoR(){
			return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR.create();
		}

		/**
		 * AccptRecvIf_Chk01_PurcActIoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR> createAccptRecvIf_Chk01_PurcActIoL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR.class);
		}

		/**
		 * AccptRecvIf_SlsAct_Upd02_IvLブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR createAccptRecvIf_SlsAct_Upd02_IvLR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.create();
		}

		/**
		 * AccptRecvIf_SlsAct_Upd02_IvLブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR> createAccptRecvIf_SlsAct_Upd02_IvLL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR.class);
		}

		/**
		 * AccptRecvIf_SlsAct_Upd02_IoLブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR createAccptRecvIf_SlsAct_Upd02_IoLR(){
			return mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.create();
		}

		/**
		 * AccptRecvIf_SlsAct_Upd02_IoLブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR> createAccptRecvIf_SlsAct_Upd02_IoLL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR.class);
		}

		/**
		 * AccptRecvIf_Chk01_Calc01HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR createAccptRecvIf_Chk01_Calc01HdrR(){
			return mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR.create();
		}

		/**
		 * AccptRecvIf_Chk01_Calc01HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR> createAccptRecvIf_Chk01_Calc01HdrL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>accpt.data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.accpt_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.iv_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt.inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.tax_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>accpt.tax_rate</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>accpt.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>accpt.lot_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.sno1</td></tr>
		 * 	<tr><td><br></td><td>accpt.sno2</td></tr>
		 * 	<tr><td><br></td><td>accpt.sno3</td></tr>
		 * 	<tr><td><br></td><td>accpt.sno4</td></tr>
		 * 	<tr><td><br></td><td>accpt.upri_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.amt_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.tax_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>accpt.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>accpt.log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>accpt.data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>accpt.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.accpt_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.iv_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt.inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.tax_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>accpt.tax_rate</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>accpt.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>accpt.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>accpt.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>accpt.lot_no</td></tr>
		 * 	<tr><td><br></td><td>accpt.sno1</td></tr>
		 * 	<tr><td><br></td><td>accpt.sno2</td></tr>
		 * 	<tr><td><br></td><td>accpt.sno3</td></tr>
		 * 	<tr><td><br></td><td>accpt.sno4</td></tr>
		 * 	<tr><td><br></td><td>accpt.upri_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.amt_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.tax_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>accpt.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>accpt.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>accpt.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>fix_sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>fix_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>fix_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>fix_slo_no</td></tr>
		 * 	<tr><td><br></td><td>fix_slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>fix_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>fix_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>fix_trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>fix_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>fix_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>fix_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>fix_trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_mult_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ddlvTgtFlg</td></tr>
		 * 	<tr><td><br></td><td>ivDdlvTgtFlg</td></tr>
		 * 	<tr><td><br></td><td>sloInfoTgtFlg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>adjst_tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_adjst_typ</td></tr>
		 * 	<tr><td><br></td><td>adjst_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_service_via_flg</td></tr>
		 * 	<tr><td><br></td><td>slip_split_non_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_service_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_mod_flg</td></tr>
		 * 	<tr><td><br></td><td>no_cred_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_HdrR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_po_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_purc_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_SlsAct_Upd01_DtlR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd01_IoR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>act_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>act_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cmpl_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_Calc01HdrR> down4() {
			return down4;
		}


		/**
		 * [AccptRecvIf_Chk01_PurcActIo]ブロックのコンテナaAccptRecvIf_Chk01_PurcActIoLを返します。
		 *
		 * @return AccptRecvIf_Chk01_PurcActIoL
		 */
		public MCList<mcframe.serverMSLA.MSLAL5160.AccptRecvIf_Chk01_PurcActIoR> AccptRecvIf_Chk01_PurcActIo() {
			return aAccptRecvIf_Chk01_PurcActIo;
		}

		/**
		 * [AccptRecvIf_SlsAct_Upd02_IoL]ブロックのコンテナaAccptRecvIf_SlsAct_Upd02_IoLLを返します。
		 *
		 * @return AccptRecvIf_SlsAct_Upd02_IoLL
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IoLR> AccptRecvIf_SlsAct_Upd02_IoL() {
			return aAccptRecvIf_SlsAct_Upd02_IoL;
		}

		/**
		 * [AccptRecvIf_SlsAct_Upd02_IvL]ブロックのコンテナaAccptRecvIf_SlsAct_Upd02_IvLLを返します。
		 *
		 * @return AccptRecvIf_SlsAct_Upd02_IvLL
		 */
		public MCList<mcframe.serverMSBB.MSBBL6010.SlsAct_Upd02_IvLR> AccptRecvIf_SlsAct_Upd02_IvL() {
			return aAccptRecvIf_SlsAct_Upd02_IvL;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_AccptRecvIfService)MSLAL_AccptRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}