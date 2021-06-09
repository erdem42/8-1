package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resume;
import kodlamaio.hrms.entities.dtos.ResumeDto;

public interface ResumeService {

	Result add(ResumeDto resumeDto);
	DataResult<List<ResumeDto>> getAll();

	Result saveImage(MultipartFile file,int resumeId);
}
