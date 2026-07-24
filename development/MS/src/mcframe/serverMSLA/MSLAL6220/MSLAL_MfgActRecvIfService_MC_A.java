package mcframe.serverMSLA.MSLAL6220;

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
 * "MSLAL_MfgActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_MfgActRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL6220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd01 aMfgActRecvIf_Upd01;

	protected void initMfgActRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL6220_MfgActRecvIf_Upd01_INFO;
		this.aMfgActRecvIf_Upd01 = ((MSLAL_MfgActRecvIfService)this).new MfgActRecvIf_Upd01();
	}

	public static MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd01 crtMfgActRecvIf_Upd01() {
		MSLAL_MfgActRecvIfService lgc = new MSLAL_MfgActRecvIfService();
		lgc.initMfgActRecvIf_Upd01();
		return lgc.aMfgActRecvIf_Upd01;
	}

	protected void paramMfgActRecvIf_Upd01(MCParam p) {
		if (this.aMfgActRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActRecvIf_Upd01.up0());
	}

	protected void doMfgActRecvIf_Upd01() {
		aMfgActRecvIf_Upd01.call();
	};

	/**
	 * MfgActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createMfgActRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * MfgActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createMfgActRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd02 aMfgActRecvIf_Upd02;

	protected void initMfgActRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL6220_MfgActRecvIf_Upd02_INFO;
		this.aMfgActRecvIf_Upd02 = ((MSLAL_MfgActRecvIfService)this).new MfgActRecvIf_Upd02();
	}

	public static MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd02 crtMfgActRecvIf_Upd02() {
		MSLAL_MfgActRecvIfService lgc = new MSLAL_MfgActRecvIfService();
		lgc.initMfgActRecvIf_Upd02();
		return lgc.aMfgActRecvIf_Upd02;
	}

	protected void paramMfgActRecvIf_Upd02(MCParam p) {
		if (this.aMfgActRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActRecvIf_Upd02.up0());
		p.addUpBlock(aMfgActRecvIf_Upd02.up1());
		p.addDownBlock(aMfgActRecvIf_Upd02.down0());
	}

	protected void doMfgActRecvIf_Upd02() {
		aMfgActRecvIf_Upd02.call();
	};

	/**
	 * MfgActRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createMfgActRecvIf_Upd02_DtlR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * MfgActRecvIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createMfgActRecvIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * MfgActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createMfgActRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * MfgActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createMfgActRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}

	/**
	 * MfgActRecvIf_Upd02_ActLstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR createMfgActRecvIf_Upd02_ActLstR(){
		return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.create();
	}

	/**
	 * MfgActRecvIf_Upd02_ActLstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> createMfgActRecvIf_Upd02_ActLstL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
	}
	protected MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03 aMfgActRecvIf_Upd03;

	protected void initMfgActRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL6220_MfgActRecvIf_Upd03_INFO;
		this.aMfgActRecvIf_Upd03 = ((MSLAL_MfgActRecvIfService)this).new MfgActRecvIf_Upd03();
	}

	public static MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd03 crtMfgActRecvIf_Upd03() {
		MSLAL_MfgActRecvIfService lgc = new MSLAL_MfgActRecvIfService();
		lgc.initMfgActRecvIf_Upd03();
		return lgc.aMfgActRecvIf_Upd03;
	}

	protected void paramMfgActRecvIf_Upd03(MCParam p) {
		if (this.aMfgActRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActRecvIf_Upd03.up0());
		p.addUpBlock(aMfgActRecvIf_Upd03.up1());
		p.addDownBlock(aMfgActRecvIf_Upd03.down0());
	}

	protected void doMfgActRecvIf_Upd03() {
		aMfgActRecvIf_Upd03.call();
	};

	/**
	 * MfgActRecvIf_Upd03_ActLstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR createMfgActRecvIf_Upd03_ActLstR(){
		return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.create();
	}

	/**
	 * MfgActRecvIf_Upd03_ActLstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> createMfgActRecvIf_Upd03_ActLstL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
	}

	/**
	 * MfgActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createMfgActRecvIf_Upd03_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * MfgActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createMfgActRecvIf_Upd03_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd04 aMfgActRecvIf_Upd04;

	protected void initMfgActRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL6220_MfgActRecvIf_Upd04_INFO;
		this.aMfgActRecvIf_Upd04 = ((MSLAL_MfgActRecvIfService)this).new MfgActRecvIf_Upd04();
	}

	public static MSLAL_MfgActRecvIfService.MfgActRecvIf_Upd04 crtMfgActRecvIf_Upd04() {
		MSLAL_MfgActRecvIfService lgc = new MSLAL_MfgActRecvIfService();
		lgc.initMfgActRecvIf_Upd04();
		return lgc.aMfgActRecvIf_Upd04;
	}

	protected void paramMfgActRecvIf_Upd04(MCParam p) {
		if (this.aMfgActRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActRecvIf_Upd04.up0());
		p.addUpBlock(aMfgActRecvIf_Upd04.up1());
		p.addDownBlock(aMfgActRecvIf_Upd04.down0());
	}

	protected void doMfgActRecvIf_Upd04() {
		aMfgActRecvIf_Upd04.call();
	};

	/**
	 * MfgActRecvIf_Upd04_ActLstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR createMfgActRecvIf_Upd04_ActLstR(){
		return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.create();
	}

	/**
	 * MfgActRecvIf_Upd04_ActLstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> createMfgActRecvIf_Upd04_ActLstL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
	}

	/**
	 * MfgActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createMfgActRecvIf_Upd04_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}
	protected MSLAL_MfgActRecvIfService.MfgActRecvIf_Chk01 aMfgActRecvIf_Chk01;

	protected void initMfgActRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL6220_MfgActRecvIf_Chk01_INFO;
		this.aMfgActRecvIf_Chk01 = ((MSLAL_MfgActRecvIfService)this).new MfgActRecvIf_Chk01();
	}

	public static MSLAL_MfgActRecvIfService.MfgActRecvIf_Chk01 crtMfgActRecvIf_Chk01() {
		MSLAL_MfgActRecvIfService lgc = new MSLAL_MfgActRecvIfService();
		lgc.initMfgActRecvIf_Chk01();
		return lgc.aMfgActRecvIf_Chk01;
	}

	protected void paramMfgActRecvIf_Chk01(MCParam p) {
		if (this.aMfgActRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActRecvIf_Chk01.up0());
		p.addDownBlock(aMfgActRecvIf_Chk01.down0());
	}

	protected void doMfgActRecvIf_Chk01() {
		aMfgActRecvIf_Chk01.call();
	};

	/**
	 * MfgActRecvIf_Chk01_ActLstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR createMfgActRecvIf_Chk01_ActLstR(){
		return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.create();
	}

	/**
	 * MfgActRecvIf_Chk01_ActLstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> createMfgActRecvIf_Chk01_ActLstL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
	}
	protected MSLAL_MfgActRecvIfService.MfgActRecvIf_Chk02 aMfgActRecvIf_Chk02;

	protected void initMfgActRecvIf_Chk02() {
		this.info = PDef.MS_MSLAL6220_MfgActRecvIf_Chk02_INFO;
		this.aMfgActRecvIf_Chk02 = ((MSLAL_MfgActRecvIfService)this).new MfgActRecvIf_Chk02();
	}

	public static MSLAL_MfgActRecvIfService.MfgActRecvIf_Chk02 crtMfgActRecvIf_Chk02() {
		MSLAL_MfgActRecvIfService lgc = new MSLAL_MfgActRecvIfService();
		lgc.initMfgActRecvIf_Chk02();
		return lgc.aMfgActRecvIf_Chk02;
	}

	protected void paramMfgActRecvIf_Chk02(MCParam p) {
		if (this.aMfgActRecvIf_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActRecvIf_Chk02.up0());
		p.addDownBlock(aMfgActRecvIf_Chk02.down0());
	}

	protected void doMfgActRecvIf_Chk02() {
		aMfgActRecvIf_Chk02.call();
	};

	/**
	 * MfgActRecvIf_Chk02_ActLstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR createMfgActRecvIf_Chk02_ActLstR(){
		return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR.create();
	}

	/**
	 * MfgActRecvIf_Chk02_ActLstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR> createMfgActRecvIf_Chk02_ActLstL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgActRecvIf_Upd01オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class MfgActRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected MfgActRecvIf_Upd01() {
			
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
			invoke((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createMfgActRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * MfgActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createMfgActRecvIf_Upd01_DtlL(){
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
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * MfgActRecvIf_Upd02オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う。（ＩＦデータ確認、および製造実績受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class MfgActRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActRecvIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		/** [MfgActRecvIf_Upd02_ActLst]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> aMfgActRecvIf_Upd02_ActLst;
		
		
		// コンストラクタ
		protected MfgActRecvIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
			aMfgActRecvIf_Upd02_ActLst = MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);

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
			invoke((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createMfgActRecvIf_Upd02_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * MfgActRecvIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createMfgActRecvIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * MfgActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createMfgActRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * MfgActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createMfgActRecvIf_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		/**
		 * MfgActRecvIf_Upd02_ActLstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR createMfgActRecvIf_Upd02_ActLstR(){
			return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.create();
		}

		/**
		 * MfgActRecvIf_Upd02_ActLstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> createMfgActRecvIf_Upd02_ActLstL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
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
		 * 	<tr><td><br></td><td>not_bkf_upd_flg</td></tr>
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
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>total_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>ok_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>err_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}


		/**
		 * [MfgActRecvIf_Upd02_ActLst]ブロックのコンテナaMfgActRecvIf_Upd02_ActLstLを返します。
		 *
		 * @return MfgActRecvIf_Upd02_ActLstL
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> MfgActRecvIf_Upd02_ActLst() {
			return aMfgActRecvIf_Upd02_ActLst;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * MfgActRecvIf_Upd03オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class MfgActRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected MfgActRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
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
			invoke((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActRecvIf_Upd03_ActLstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR createMfgActRecvIf_Upd03_ActLstR(){
			return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.create();
		}

		/**
		 * MfgActRecvIf_Upd03_ActLstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> createMfgActRecvIf_Upd03_ActLstL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
		}

		/**
		 * MfgActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createMfgActRecvIf_Upd03_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * MfgActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createMfgActRecvIf_Upd03_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>imp_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>if_inpt_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>old_loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>all_oper_act_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_cnt</td></tr>
		 * 	<tr><td><br></td><td>ext_act_cnt</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_char11</td></tr>
		 * 	<tr><td><br></td><td>sub_char12</td></tr>
		 * 	<tr><td><br></td><td>sub_char13</td></tr>
		 * 	<tr><td><br></td><td>sub_char14</td></tr>
		 * 	<tr><td><br></td><td>sub_char15</td></tr>
		 * 	<tr><td><br></td><td>sub_char16</td></tr>
		 * 	<tr><td><br></td><td>sub_char17</td></tr>
		 * 	<tr><td><br></td><td>sub_char18</td></tr>
		 * 	<tr><td><br></td><td>sub_char19</td></tr>
		 * 	<tr><td><br></td><td>sub_char20</td></tr>
		 * 	<tr><td><br></td><td>sub_char21</td></tr>
		 * 	<tr><td><br></td><td>sub_char22</td></tr>
		 * 	<tr><td><br></td><td>sub_char23</td></tr>
		 * 	<tr><td><br></td><td>sub_char24</td></tr>
		 * 	<tr><td><br></td><td>sub_char25</td></tr>
		 * 	<tr><td><br></td><td>sub_char26</td></tr>
		 * 	<tr><td><br></td><td>sub_char27</td></tr>
		 * 	<tr><td><br></td><td>sub_char28</td></tr>
		 * 	<tr><td><br></td><td>sub_char29</td></tr>
		 * 	<tr><td><br></td><td>sub_char30</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_num4</td></tr>
		 * 	<tr><td><br></td><td>sub_num5</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>site_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>wg_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev_lasted</td></tr>
		 * 	<tr><td><br></td><td>oper_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>oper_seq_lasted</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_if_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>chk_add_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_oper_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sno_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_bkf_upd_flg</td></tr>
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
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>total_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>ok_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>err_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * MfgActRecvIf_Upd04オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う。（製造実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	abstract public class MfgActRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> down0;
		
		
		// コンストラクタ
		protected MfgActRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);

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
			invoke((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActRecvIf_Upd04_ActLstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR createMfgActRecvIf_Upd04_ActLstR(){
			return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.create();
		}

		/**
		 * MfgActRecvIf_Upd04_ActLstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> createMfgActRecvIf_Upd04_ActLstL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
		}

		/**
		 * MfgActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createMfgActRecvIf_Upd04_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>imp_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>if_inpt_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>old_loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>all_oper_act_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_cnt</td></tr>
		 * 	<tr><td><br></td><td>ext_act_cnt</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_char11</td></tr>
		 * 	<tr><td><br></td><td>sub_char12</td></tr>
		 * 	<tr><td><br></td><td>sub_char13</td></tr>
		 * 	<tr><td><br></td><td>sub_char14</td></tr>
		 * 	<tr><td><br></td><td>sub_char15</td></tr>
		 * 	<tr><td><br></td><td>sub_char16</td></tr>
		 * 	<tr><td><br></td><td>sub_char17</td></tr>
		 * 	<tr><td><br></td><td>sub_char18</td></tr>
		 * 	<tr><td><br></td><td>sub_char19</td></tr>
		 * 	<tr><td><br></td><td>sub_char20</td></tr>
		 * 	<tr><td><br></td><td>sub_char21</td></tr>
		 * 	<tr><td><br></td><td>sub_char22</td></tr>
		 * 	<tr><td><br></td><td>sub_char23</td></tr>
		 * 	<tr><td><br></td><td>sub_char24</td></tr>
		 * 	<tr><td><br></td><td>sub_char25</td></tr>
		 * 	<tr><td><br></td><td>sub_char26</td></tr>
		 * 	<tr><td><br></td><td>sub_char27</td></tr>
		 * 	<tr><td><br></td><td>sub_char28</td></tr>
		 * 	<tr><td><br></td><td>sub_char29</td></tr>
		 * 	<tr><td><br></td><td>sub_char30</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_num4</td></tr>
		 * 	<tr><td><br></td><td>sub_num5</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>site_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>wg_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev_lasted</td></tr>
		 * 	<tr><td><br></td><td>oper_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>oper_seq_lasted</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_if_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>chk_add_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_oper_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sno_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_bkf_upd_flg</td></tr>
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
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>chk_add_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_oper_del_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * MfgActRecvIf_Chk01オペレーション.<p>
	 *
	 * 製造実績（工程・投入・工数・出来高）受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class MfgActRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> down0;
		
		
		// コンストラクタ
		protected MfgActRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);

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
			invoke((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActRecvIf_Chk01_ActLstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR createMfgActRecvIf_Chk01_ActLstR(){
			return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.create();
		}

		/**
		 * MfgActRecvIf_Chk01_ActLstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> createMfgActRecvIf_Chk01_ActLstL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>imp_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>if_inpt_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>old_loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>all_oper_act_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_cnt</td></tr>
		 * 	<tr><td><br></td><td>ext_act_cnt</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_char11</td></tr>
		 * 	<tr><td><br></td><td>sub_char12</td></tr>
		 * 	<tr><td><br></td><td>sub_char13</td></tr>
		 * 	<tr><td><br></td><td>sub_char14</td></tr>
		 * 	<tr><td><br></td><td>sub_char15</td></tr>
		 * 	<tr><td><br></td><td>sub_char16</td></tr>
		 * 	<tr><td><br></td><td>sub_char17</td></tr>
		 * 	<tr><td><br></td><td>sub_char18</td></tr>
		 * 	<tr><td><br></td><td>sub_char19</td></tr>
		 * 	<tr><td><br></td><td>sub_char20</td></tr>
		 * 	<tr><td><br></td><td>sub_char21</td></tr>
		 * 	<tr><td><br></td><td>sub_char22</td></tr>
		 * 	<tr><td><br></td><td>sub_char23</td></tr>
		 * 	<tr><td><br></td><td>sub_char24</td></tr>
		 * 	<tr><td><br></td><td>sub_char25</td></tr>
		 * 	<tr><td><br></td><td>sub_char26</td></tr>
		 * 	<tr><td><br></td><td>sub_char27</td></tr>
		 * 	<tr><td><br></td><td>sub_char28</td></tr>
		 * 	<tr><td><br></td><td>sub_char29</td></tr>
		 * 	<tr><td><br></td><td>sub_char30</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_num4</td></tr>
		 * 	<tr><td><br></td><td>sub_num5</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>site_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>wg_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev_lasted</td></tr>
		 * 	<tr><td><br></td><td>oper_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>oper_seq_lasted</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_if_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>chk_add_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_oper_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sno_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>imp_flg</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bkf_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>if_inpt_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>old_loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>all_oper_act_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_cnt</td></tr>
		 * 	<tr><td><br></td><td>ext_act_cnt</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_char11</td></tr>
		 * 	<tr><td><br></td><td>sub_char12</td></tr>
		 * 	<tr><td><br></td><td>sub_char13</td></tr>
		 * 	<tr><td><br></td><td>sub_char14</td></tr>
		 * 	<tr><td><br></td><td>sub_char15</td></tr>
		 * 	<tr><td><br></td><td>sub_char16</td></tr>
		 * 	<tr><td><br></td><td>sub_char17</td></tr>
		 * 	<tr><td><br></td><td>sub_char18</td></tr>
		 * 	<tr><td><br></td><td>sub_char19</td></tr>
		 * 	<tr><td><br></td><td>sub_char20</td></tr>
		 * 	<tr><td><br></td><td>sub_char21</td></tr>
		 * 	<tr><td><br></td><td>sub_char22</td></tr>
		 * 	<tr><td><br></td><td>sub_char23</td></tr>
		 * 	<tr><td><br></td><td>sub_char24</td></tr>
		 * 	<tr><td><br></td><td>sub_char25</td></tr>
		 * 	<tr><td><br></td><td>sub_char26</td></tr>
		 * 	<tr><td><br></td><td>sub_char27</td></tr>
		 * 	<tr><td><br></td><td>sub_char28</td></tr>
		 * 	<tr><td><br></td><td>sub_char29</td></tr>
		 * 	<tr><td><br></td><td>sub_char30</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_num4</td></tr>
		 * 	<tr><td><br></td><td>sub_num5</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>site_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>wg_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no_lasted</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev_lasted</td></tr>
		 * 	<tr><td><br></td><td>oper_cd_lasted</td></tr>
		 * 	<tr><td><br></td><td>oper_seq_lasted</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_if_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>chk_add_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_by_oper_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sno_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Upd02_ActLstR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * MfgActRecvIf_Chk02オペレーション.<p>
	 *
	 * 計画外実績登録チェック<br>
	 */
	abstract public class MfgActRecvIf_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActRecvIf_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR> down0;
		
		
		// コンストラクタ
		protected MfgActRecvIf_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR.class);

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
			invoke((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActRecvIf_Chk02_ActLstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR createMfgActRecvIf_Chk02_ActLstR(){
			return mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR.create();
		}

		/**
		 * MfgActRecvIf_Chk02_ActLstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR> createMfgActRecvIf_Chk02_ActLstL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>mfg_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>org_oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>org_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>org_mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>org_yield_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR> up0() {
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
		public MCList<mcframe.serverMSLA.MSLAL6220.MfgActRecvIf_Chk02_ActLstR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_MfgActRecvIfService)MSLAL_MfgActRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}