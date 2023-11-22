package br.edu.atitus.atitusound.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.atitus.atitusound.dtos.MusicDTO;
import br.edu.atitus.atitusound.entities.MusicEntity;
import br.edu.atitus.atitusound.services.MusicService;
import br.edu.atitus.atitusound.services.GenericService;

@RestController
@RequestMapping("/musics")
public class MusicController extends GenericController<MusicEntity, MusicDTO> {

	private final MusicService musicService;

	public MusicController(MusicService musicService) {
		this.musicService = musicService;
	}

	protected MusicEntity convertDTO2Entity(MusicDTO dto) {
		MusicEntity entidade = new MusicEntity();
		BeanUtils.copyProperties(dto, entidade);
		return entidade;
	}

	@Override
	public GenericService<MusicEntity> getService() {
		return musicService;
	}

}
